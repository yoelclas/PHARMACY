/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Marca;
import CapaDatos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ygonz
 */
public class MarcaBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public DefaultTableModel reportarMarca() {
        DefaultTableModel tabla_temporal;
        String[] titulos = {"CODIGO", "NOMBRE"};
        String[] registros = new String[3];
        tabla_temporal = new DefaultTableModel(null, titulos);
        sql = "SELECT idmarca,maNombre FROM marca";

        try {

            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                registros[0] = rs.getString("idmarca");
                registros[1] = rs.getString("maNombre");

                tabla_temporal.addRow(registros);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al reportar MarcaBD...", JOptionPane.ERROR_MESSAGE);
            return null;

        }

        return tabla_temporal;

    }

    public boolean registrarMarca(Marca m) {
        boolean rpta = false;
        sql = "INSERT INTO marca(idmarca,maNombre) VALUES(null,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, m.getMaNombre());

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al registrar usuario BD", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }

        return rpta;

    }

    public boolean modificarMarca(Marca m) {
        boolean rpta = false;
        sql = "UPDATE marca SET maNombre=? WHERE idmarca=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, m.getMaNombre());
            pst.setInt(2, m.getIdmarca());

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return rpta;
        }
        return rpta;
    }

    public boolean eliminarMarca(String idmarca) {
        boolean rpta = false;
        try {
            sql = "DELETE FROM marca WHERE idmarca=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, idmarca);

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al eliminar Marca BD", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }

        return rpta;
    }

    public DefaultTableModel buscarMarca(String nombre) {
        DefaultTableModel tabla_temporal;
        String[] cabezera = {"CODIGO", "NOMBRE"};
        String[] registros = new String[2];
        tabla_temporal = new DefaultTableModel(null, cabezera);

        sql = "SELECT  idmarca,maNombre FROM marca WHERE maNombre LIKE ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, "%" + nombre + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("idmarca");
                registros[1] = rs.getString("maNombre");

                tabla_temporal.addRow(registros);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al buscar marcaBD", JOptionPane.ERROR_MESSAGE);
        }
        return tabla_temporal;
    }

}
