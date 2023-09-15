/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.Turno;
import CapaNegocio.TurnoBD;
import CapaNegocio.UsuarioBD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ygonz
 */
public class Turno_IU extends javax.swing.JInternalFrame {

    int fila_seleccionada = -1;

    /**
     * Creates new form Turno_IU
     */
    public Turno_IU() {
        initComponents();
        reporte();
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

    private void limpiar_tabla_formulario() {
        DefaultTableModel tabla_temporal_turno = (DefaultTableModel) tabla_reporte_turno.getModel();
        tabla_temporal_turno.setRowCount(0);
    }

    private void limpiar() {
        txtDni.setText("");
        txtUsuario.setText("");
        txtHoraInicio.setText("");
        txtHoraFinal.setText("");
        cmbTurno.setSelectedIndex(0);
//        fila_seleccionada = -1;
    }

    private void reporte() {
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            limpiar_tabla_formulario();
            DefaultTableModel tabla_temporal_turno = (DefaultTableModel) tabla_reporte_turno.getModel();

            DefaultTableModel tabla_temporal;
            TurnoBD oTurnoBD = new TurnoBD();
            tabla_temporal = oTurnoBD.reportarTurno();
            int cant = tabla_temporal.getRowCount();
            for (int i = 0; i < cant; i++) {
                int idturno = Integer.parseInt(tabla_temporal.getValueAt(i, 0).toString());
                String descripcion = tabla_temporal.getValueAt(i, 1).toString();
                String inicio = tabla_temporal.getValueAt(i, 2).toString();
                String fin = tabla_temporal.getValueAt(i, 3).toString();
                String uDni = tabla_temporal.getValueAt(i, 4).toString();
                Object[] data = {idturno, descripcion, inicio, fin, uDni};
                tabla_temporal_turno.addRow(data);
            }
            tabla_reporte_turno.setModel(tabla_temporal_turno);

            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            e.printStackTrace();
        }

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
        jLabel3 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtHoraFinal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_turno = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Turno"));

        jLabel3.setText("HORA DE INICIO");

        txtHoraInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraInicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraInicioFocusLost(evt);
            }
        });
        txtHoraInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoraInicioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraInicioKeyTyped(evt);
            }
        });

        jLabel4.setText("HORA FINAL");

        jLabel5.setText("TURNO");

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar turno", "TURNO 1", "TURNO 2", "TURNO 3", "TURNO 4" }));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btn_registrar32X32.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btnEliminar32X32.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtHoraFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraFinalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraFinalFocusLost(evt);
            }
        });
        txtHoraFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraFinalKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar)
                    .addComponent(jLabel3)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_reporte_turno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION", "HORA INICIO", "HORA FINAL", "USUARIO"
            }
        ));
        tabla_reporte_turno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_turnoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabla_reporte_turnoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_turno);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Usuario"));

        jLabel1.setText("DNI");

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

        jLabel2.setText("USUARIO");

        txtUsuario.setEnabled(false);

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addComponent(txtUsuario))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("* El formato de la hora serian: 10:00:00");

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btnCerrar32X32.png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtDni.getText().length() > 0) {
            if (txtHoraInicio.getText().length() > 0) {
                if (txtHoraFinal.getText().length() > 0) {
                    if (!cmbTurno.getSelectedItem().equals("Seleccionar turno")) {

                        Turno oTurno = new Turno();
                        TurnoBD oTurnoBD = new TurnoBD();

                        oTurno.setDescripcion(cmbTurno.getSelectedItem().toString());
                        oTurno.setInicio(txtHoraInicio.getText());
                        oTurno.setFin(txtHoraFinal.getText());
                        oTurno.setuDni(txtDni.getText());

                        boolean rpta = oTurnoBD.registrarTurno(oTurno);

                        if (rpta) {
                            exito("Se registro con exito");
                            reporte();
                            limpiar();
                        } else {
                            error("Tienes problemas al registrar");
                        }

                    } else {
                        advertencia("Seleccionar un turno");
                    }
                } else {
                    advertencia("Ingrese la hora final");
                }
            } else {
                advertencia("Ingrese la hora de inicio");
                txtHoraInicio.requestFocus();
            }
        } else {
            advertencia("Ingrese un dni");
            txtDni.requestFocus();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (fila_seleccionada == 0) {

            int aviso = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de eliminar a la fila " + fila_seleccionada);
            if (aviso == 0) {
                TurnoBD oTurnoBD = new TurnoBD();
                int idturno = Integer.parseInt(tabla_reporte_turno.getValueAt(fila_seleccionada, 0).toString());
                boolean rpta = oTurnoBD.eliminarTurno(idturno);

                if (rpta) {
                    exito("Se elimino con exito");
                    reporte();
                    limpiar();
                } else {
                    error("Tienes problemas al eliminar");
                }

            }
        } else {
            advertencia("Tiene que seleccionar una fila");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tabla_reporte_turnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_turnoMousePressed

        fila_seleccionada = tabla_reporte_turno.getSelectedRow();
    }//GEN-LAST:event_tabla_reporte_turnoMousePressed

    private void tabla_reporte_turnoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_turnoMouseReleased

    }//GEN-LAST:event_tabla_reporte_turnoMouseReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if (txtDni.getText().length() > 0) {

            DefaultTableModel tabla_temporal;
            UsuarioBD oUsuarioBD = new UsuarioBD();
            tabla_temporal = oUsuarioBD.buscarUsuarioXdni(txtDni.getText());
            int cant = tabla_temporal.getRowCount();
            if (cant > 0) {

                String nombre = tabla_temporal.getValueAt(0, 1).toString();
                String apellidos = tabla_temporal.getValueAt(0, 2).toString();
                txtUsuario.setText(apellidos + " " + nombre);

            } else {
                error("No exite este usuario");
            }

        } else {
            advertencia("Tiene que ingresar un dni");
            txtDni.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtHoraInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraInicioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == ':')) {
            evt.consume();

        }

    }//GEN-LAST:event_txtHoraInicioKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtDni.getText().length() >= 8) {
            evt.consume();

        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.requestFocus();

        }
        
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtHoraInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraInicioFocusGained
        // TODO add your handling code here:
        txtHoraInicio.setBackground(Color.yellow);
    }//GEN-LAST:event_txtHoraInicioFocusGained

    private void txtHoraInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraInicioKeyPressed
        // TODO add your handling code here:
        
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoraFinal.requestFocus();

        }
    }//GEN-LAST:event_txtHoraInicioKeyPressed

    private void txtDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusGained
        // TODO add your handling code here:
        txtDni.setBackground(Color.yellow);
    }//GEN-LAST:event_txtDniFocusGained

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        // TODO add your handling code here:
        
        txtDni.setBackground(Color.white);
    }//GEN-LAST:event_txtDniFocusLost

    private void txtHoraInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraInicioFocusLost
        // TODO add your handling code here:
         txtHoraInicio.setBackground(Color.white);
    }//GEN-LAST:event_txtHoraInicioFocusLost

    private void txtHoraFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraFinalKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == ':')) {
            evt.consume();

        }
    }//GEN-LAST:event_txtHoraFinalKeyTyped

    private void txtHoraFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFinalFocusGained
        // TODO add your handling code here:
         txtHoraFinal.setBackground(Color.yellow);
    }//GEN-LAST:event_txtHoraFinalFocusGained

    private void txtHoraFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFinalFocusLost
        // TODO add your handling code here:
         txtHoraFinal.setBackground(Color.white);
    }//GEN-LAST:event_txtHoraFinalFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_turno;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
