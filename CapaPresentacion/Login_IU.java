/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.Asistencia;
import CapaDatos.Turno;
import CapaDatos.Usuario;
import CapaNegocio.AsistenciaBD;
import CapaNegocio.TurnoBD;
import CapaNegocio.UsuarioBD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ygonz
 */
public class Login_IU extends javax.swing.JFrame {

    public static String dni_publico;
    public static String usuario;
    public static String tienda;
    public static int idAsistencia;

    /**
     * Creates new form Login_IU
     */
    public Login_IU() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    private String obtener_Fecha_actual() {

        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int anio = calendario.get(Calendar.YEAR);
        String fecha = anio + "-" + mes + "-" + dia;

        return fecha;

    }

    private String obtener_hora() {

        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        String tiempo = hora + ":" + minutos + ":" + segundos;

        return tiempo;

    }

    private void exito(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "MENSAJE", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void error(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    private void advertencia(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ADVERTENCIA", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        ocultar = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        btnCierre = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVer = new javax.swing.JLabel();
        lblEsconder = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/licencia-de-conducir.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, 30, 40));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 168, -1, -1));

        txtDni.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniFocusLost(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 118, 300, 34));

        btnIngresar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/ingresar.png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        jPanel2.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, 34));

        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        jPanel2.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, 34));

        btnCierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/cerrar-sesion (1).png"))); // NOI18N
        btnCierre.setText("CERRAR");
        btnCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreActionPerformed(evt);
            }
        });
        jPanel2.add(btnCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/usuario.png.96x96.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/candado.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 30, 30));

        lblVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/ver (2).png"))); // NOI18N
        lblVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerMouseClicked(evt);
            }
        });
        jPanel2.add(lblVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, 20));

        lblEsconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/esconder (1).png"))); // NOI18N
        lblEsconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEsconderMouseClicked(evt);
            }
        });
        jPanel2.add(lblEsconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        txtClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClaveFocusLost(evt);
            }
        });
        jPanel2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 170, 300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusGained
        txtDni.setBackground(Color.yellow);
    }//GEN-LAST:event_txtDniFocusGained

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        txtDni.setBackground(Color.white);
    }//GEN-LAST:event_txtDniFocusLost

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtClave.requestFocus();

        }
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtDni.getText().length() >= 8) {
            evt.consume();

        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:

        if (txtDni.getText().length() > 0) {
            if (txtClave.getText().length() > 0) {
                String dni = txtDni.getText().trim();
                String clave = txtClave.getText();
                UsuarioBD oUsuarioBD = new UsuarioBD();
                List<Usuario> lista_usuarios = oUsuarioBD.login(dni, clave);
                if (lista_usuarios.size() > 0) {
                    String nombres = lista_usuarios.get(0).getuNombre();
                    String apellidos = lista_usuarios.get(0).getuApellido();
                    tienda = lista_usuarios.get(0).getTienda();
                    dni_publico = dni;
                    usuario = nombres + " " + apellidos;
                    TurnoBD oTurno = new TurnoBD();
                    String hora_actual = obtener_hora();
                    List<Turno> lista_turno = oTurno.buscarTurno(hora_actual, hora_actual, dni);
                    if (lista_turno.size() > 0) {
                        Menu_Principal oMenu = new Menu_Principal();
                        String fecha = obtener_Fecha_actual();
                        String hora = obtener_hora();
                        Asistencia oAsistencia = new Asistencia();
                        AsistenciaBD oAsistenciaBD = new AsistenciaBD();

                        int tipo = lista_usuarios.get(0).getIdtipousuario();
                        if (tipo == 16) {
                            oMenu.menu_mentenimiento.setEnabled(true);
                            oMenu.menu_compras.setEnabled(true);
                            oMenu.menu_inventario.setEnabled(true);
                            oMenu.btnProducto.setEnabled(true);
                            oMenu.btnCompras.setEnabled(true);
                            oMenu.btnCerrar.setEnabled(true);

                            oMenu.setVisible(true);
                            oMenu.setTitle("TIENDA: " + tienda + "- USUARIO: " + usuario);
                            this.setVisible(false);

                        }

                        if (tipo == 15) {
                            oMenu.menu_ventas.setEnabled(true);
                            oMenu.menu_caja.setEnabled(true);
                            oMenu.btnVentas.setEnabled(true);
                            oMenu.btnIngresos.setEnabled(true);
                            oMenu.btnEgresos.setEnabled(true);
                            oMenu.btnCaja.setEnabled(true);
                            oMenu.btnCerrar.setEnabled(true);

                            List<Asistencia> lista = oAsistenciaBD.buscarAsistenciaUsuario(dni, tienda, fecha);
                            if (lista.size() > 0) {
                                String estado = lista.get(0).getaEstado();
                                if (estado.equals("CERRAD0")) {
                                    advertencia("Ya no puedes entrar al sistema porque ya cerraste caja");
                                } else {
                                    idAsistencia = lista.get(0).getIdasistencia();
                                    oMenu.setVisible(true);
                                    oMenu.setTitle("TIENDA: " + tienda + "- USUARIO: " + usuario);
                                    this.setVisible(false);
                                }
                            } else {
                                oAsistencia.setaFechaE(fecha);
                                oAsistencia.setaHoraE(hora);
                                oAsistencia.setaHoraS("00:00:00");
                                oAsistencia.setuDni(dni);
                                oAsistencia.setaTurno("");
                                oAsistencia.setaEstado("ABIERTO");
                                oAsistencia.setaTienda(tienda);

                                idAsistencia = oAsistenciaBD.registrarAsistencia(oAsistencia);
                                oMenu.setVisible(true);
                                oMenu.setTitle("TIENDA: " + tienda + "- USUARIO: " + usuario);
                                this.setVisible(false);
                            }

                        }

                    } else {
                        advertencia("No puedes entrar al sistema, porque ya no es tu turno");
                    }
                } else {
                    error("No perteneces al sistema");
                }

            } else {
                advertencia("Ingrese su clave");
                txtClave.requestFocus();
            }
        } else {
            advertencia("Ingrese el dni");
            txtDni.requestFocus();
        }


    }//GEN-LAST:event_btnIngresarActionPerformed

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
//        ver.setVisible(true);
//        ocultar.setVisible(false);
//        txtClave.setEchoChar('●');
    }//GEN-LAST:event_ocultarMouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
//        ver.setVisible(false);
//        ocultar.setVisible(true);
//        txtClave.setEchoChar((char) 0);
    }//GEN-LAST:event_verMouseClicked

    private void btnCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCierreActionPerformed

    private void lblVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerMouseClicked
        // TODO add your handling code here:
//        ver.setVisible(false);
//        ocultar.setVisible(true);

        lblVer.setVisible(false);
        lblEsconder.setVisible(true);
        txtClave.setEchoChar((char) 0);
    }//GEN-LAST:event_lblVerMouseClicked

    private void lblEsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsconderMouseClicked
        // TODO add your handling code here:
//        ver.setVisible(true);
//        ocultar.setVisible(false);
        lblVer.setVisible(true);
        lblEsconder.setVisible(false);
        txtClave.setEchoChar('●');
    }//GEN-LAST:event_lblEsconderMouseClicked

    private void txtClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusGained
        // TODO add your handling code here:
        txtClave.setBackground(Color.yellow);
    }//GEN-LAST:event_txtClaveFocusGained

    private void txtClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusLost
        // TODO add your handling code here:
        txtClave.setBackground(Color.white);
    }//GEN-LAST:event_txtClaveFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_IU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCierre;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEsconder;
    private javax.swing.JLabel lblVer;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtDni;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}