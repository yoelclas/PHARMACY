/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Turno;
import CapaDatos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ygonz
 */
public class UsuarioBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public DefaultTableModel reportarUsuario() {
        DefaultTableModel tabla_temporal;
        String[] titulos = {"DNI", "NOMBRES", "APELLIDOS", "DIRECCION", "CLAVE", "CELULAR", "TIPO_USUARIO", "TIENDA"};
        String[] registros = new String[8];
        tabla_temporal = new DefaultTableModel(null, titulos);
        sql = "SELECT uDni,uNombre,uApellido,uDireccion,uClave,uCelular,tuNombre,tienda  FROM usuario AS u "
                + "INNER JOIN tipousuario AS tp ON u.idtipousuario=tp.idtipousuario";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("uDni");
                registros[1] = rs.getString("uNombre");
                registros[2] = rs.getString("uApellido");
                registros[3] = rs.getString("uDireccion");
                registros[4] = rs.getString("uClave");
                registros[5] = rs.getString("uCelular");
                registros[6] = rs.getString("tuNombre");
                registros[7] = rs.getString("tienda");
                tabla_temporal.addRow(registros);
            }
            return tabla_temporal;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al reportar Usuarios", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public boolean registrarUsuario(Usuario u) {
        boolean rpta = false;
        sql = "INSERT INTO usuario(uDni,uNombre,uApellido,uDireccion,uClave,uCelular,idtipousuario,tienda) VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, u.getuDni());
            pst.setString(2, u.getuNombre());
            pst.setString(3, u.getuApellido());
            pst.setString(4, u.getuDireccion());
            pst.setString(5, u.getUclave());
            pst.setString(6, u.getuCelular());
            pst.setInt(7, u.getuTipo());
            pst.setString(8, u.getTienda());

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al registrar usuario BD", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
    }

    public boolean modificarUsuario(Usuario u) {
        boolean rpta = false;
        sql = "UPDATE usuario SET uNombre=?,uApellido=?,uDireccion=?,uClave=?,uCelular=?,idtipousuario=?,tienda=?  WHERE uDni=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, u.getuNombre());
            pst.setString(2, u.getuApellido());
            pst.setString(3, u.getuDireccion());
            pst.setString(4, u.getUclave());
            pst.setString(5, u.getuCelular());
            pst.setInt(6, u.getIdtipousuario());
            pst.setString(7, u.getTienda());
            pst.setString(8, u.getuDni());

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return rpta;
        }
        return rpta;
    }

    public boolean eliminarUsuario(String dni) {
        boolean rpta = false;
        sql = "DELETE FROM usuario WHERE uDni=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dni);

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al eliminar un usuario", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;

    }

    public DefaultTableModel buscarUsuario(String apellidos) {
        DefaultTableModel tabla_temporal;
        String[] titulos = {"DNI", "NOMBRES", "APELLIDOS", "DIRECCION", "CLAVE", "CELULAR", "TIPO_USUARIO", "TIENDA"};
        String[] registros = new String[8];
        tabla_temporal = new DefaultTableModel(null, titulos);
        sql = "SELECT uDni,uNombre,uApellido,uDireccion,uClave,uCelular,tuNombre,tienda  FROM usuario AS u "
                + "INNER JOIN tipousuario AS tp ON u.idtipousuario=tp.idtipousuario "
                + "WHERE uApellido LIKE ? OR uNombre LIKE ? LIMIT 0,15";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, "%" + apellidos + "%");
            pst.setString(2, "%" + apellidos + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("uDni");
                registros[1] = rs.getString("uNombre");
                registros[2] = rs.getString("uApellido");
                registros[3] = rs.getString("uDireccion");
                registros[4] = rs.getString("uClave");
                registros[5] = rs.getString("uCelular");
                registros[6] = rs.getString("tuNombre");
                registros[7] = rs.getString("tienda");
                tabla_temporal.addRow(registros);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al buscar Usuarios", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return tabla_temporal;
    }

    public DefaultTableModel buscarUsuarioXdni(String dni) {
        DefaultTableModel tabla_temporal;
        String[] titulos = {"DNI", "NOMBRES", "APELLIDOS", "DIRECCION", "CLAVE", "CELULAR", "TIPO_USUARIO", "TIENDA"};
        String[] registros = new String[8];
        tabla_temporal = new DefaultTableModel(null, titulos);
        sql = "SELECT uDni,uNombre,uApellido,uDireccion,uClave,uCelular,tuNombre,tienda  FROM usuario AS u "
                + "INNER JOIN tipousuario AS tp ON u.idtipousuario=tp.idtipousuario "
                + "WHERE uDni=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dni);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("uDni");
                registros[1] = rs.getString("uNombre");
                registros[2] = rs.getString("uApellido");
                registros[3] = rs.getString("uDireccion");
                registros[4] = rs.getString("uClave");
                registros[5] = rs.getString("uCelular");
                registros[6] = rs.getString("tuNombre");
                registros[7] = rs.getString("tienda");
                tabla_temporal.addRow(registros);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al buscar Usuarios", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return tabla_temporal;
    }

    public List<Usuario> login(String dni, String clave) {
        List<Usuario> lista = new ArrayList<>();
        sql = "SELECT uDni,uNombre,uApellido,uDireccion,uClave,uCelular,idtipousuario,tienda  FROM usuario "
                + "WHERE uDni=? AND uClave=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dni);
            pst.setString(2, clave);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Usuario oUsuario = new Usuario();
                oUsuario.setuDni(rs.getString(1));
                oUsuario.setuNombre(rs.getString(2));
                oUsuario.setuApellido(rs.getString(3));
                oUsuario.setuDireccion(rs.getString(4));
                oUsuario.setUclave(rs.getString(5));
                oUsuario.setuCelular(rs.getString(6));
                oUsuario.setIdtipousuario(rs.getInt(7));
                oUsuario.setTienda(rs.getString(8));
                lista.add(oUsuario);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error en el LOGIN", JOptionPane.ERROR_MESSAGE);

        }
        return lista;
    }
}
