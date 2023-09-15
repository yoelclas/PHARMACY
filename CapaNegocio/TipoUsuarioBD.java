/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.TipoUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ygonz
 */
public class TipoUsuarioBD {
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public boolean registrarTipoUsuario(TipoUsuario tu) {

        sql = "INSERT INTO tipousuario(idtipousuario,tuNombre) VALUES(0,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, tu.getTuNombre());

            pst.executeUpdate();
            
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al registrar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarTipoUsuario() {
        DefaultTableModel tabla_temporal;
        String[] cabecera = {"CODIGO", "NOMBRE"};
        String[] registros = new String[2];
        tabla_temporal = new DefaultTableModel(null, cabecera);
        sql = "SELECT idtipousuario,tuNombre FROM tipousuario";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idtipousuario");
                registros[1] = rs.getString("tuNombre");

                tabla_temporal.addRow(registros);
            }
            return tabla_temporal;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al reportar Tipo Usuario...", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean modificarTipoUsuario(TipoUsuario tu) {

        sql = "UPDATE tipousuario SET tuNombre=? WHERE idtipousuario=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, tu.getTuNombre());
            pst.setInt(2, tu.getIdtipousuario());

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public boolean eliminarTipoUsuario(TipoUsuario tu) {
        sql = "DELETE FROM tipousuario WHERE idtipousuario=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, tu.getIdtipousuario());

            pst.executeUpdate();

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al eliminar", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
    
}
