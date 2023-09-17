/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author labor
 */
public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/CapaPresentacionImagen/fondo.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        jToolBar1 = new javax.swing.JToolBar();
        btnProducto = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnCompras = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnIngresos = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnEgresos = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnVentas = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnCaja = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_item_TipoUsuario = new javax.swing.JMenuItem();
        menu_item_Usuario = new javax.swing.JMenuItem();
        menu_item_Turno = new javax.swing.JMenuItem();
        menu_item_Marca = new javax.swing.JMenuItem();
        menu_item_categoria = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_deuda = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menu_salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnProducto.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btn_productoss.png"))); // NOI18N
        btnProducto.setText("PRODUCTOS");
        btnProducto.setFocusable(false);
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnProducto);
        jToolBar1.add(jSeparator4);

        btnCompras.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btn_compras.png"))); // NOI18N
        btnCompras.setText("COMPRAS");
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCompras);
        jToolBar1.add(jSeparator6);

        btnIngresos.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        btnIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btn_ingreso.png"))); // NOI18N
        btnIngresos.setText("INGRESOS");
        btnIngresos.setFocusable(false);
        btnIngresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnIngresos);
        jToolBar1.add(jSeparator7);

        btnEgresos.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        btnEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btn_egreso.png"))); // NOI18N
        btnEgresos.setText("EGRESOS");
        btnEgresos.setFocusable(false);
        btnEgresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEgresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEgresos);
        jToolBar1.add(jSeparator8);

        btnVentas.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btn_ventas.png"))); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVentas);
        jToolBar1.add(jSeparator9);

        btnCaja.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btn_caja.png"))); // NOI18N
        btnCaja.setText("CAJA");
        btnCaja.setFocusable(false);
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCaja);
        jToolBar1.add(jSeparator1);

        jButton1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagen/btn_Salir.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jMenu1.setText("Mantenimiento");
        jMenu1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        menu_item_TipoUsuario.setText("Tipo Usuario");
        menu_item_TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_TipoUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_TipoUsuario);

        menu_item_Usuario.setText("Usuario");
        menu_item_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_UsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_Usuario);

        menu_item_Turno.setText("Turno");
        menu_item_Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_TurnoActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_Turno);

        menu_item_Marca.setText("Laboratorio");
        menu_item_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_MarcaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_Marca);

        menu_item_categoria.setText("Categoria");
        menu_item_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_categoriaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_categoria);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Compras");
        jMenu2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu2);

        menu_deuda.setText("Inventario");
        menu_deuda.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jMenuBar1.add(menu_deuda);

        jMenu3.setText("Ventas");
        jMenu3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu3);

        menu_salir.setText("Caja");
        menu_salir.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jMenuBar1.add(menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed

    }//GEN-LAST:event_btnProductoActionPerformed

    private void menu_item_TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_TipoUsuarioActionPerformed
        // TODO add your handling code here:
        TipoUsuario_IU frame = new TipoUsuario_IU();
        escritorio.add(frame);
        Dimension a = escritorio.getSize();
        Dimension b = frame.getSize();
        frame.setLocation((a.width - b.width) / 2, (a.height - b.height) / 2);
        frame.show();
    }//GEN-LAST:event_menu_item_TipoUsuarioActionPerformed

    private void menu_item_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_UsuarioActionPerformed
        Usuario_IU frame = new Usuario_IU();
        escritorio.add(frame);
        Dimension a = escritorio.getSize();
        Dimension b = frame.getSize();
        frame.setLocation((a.width - b.width) / 2, (a.height - b.height) / 2);
        frame.show();
    }//GEN-LAST:event_menu_item_UsuarioActionPerformed

    private void menu_item_TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_TurnoActionPerformed
        // TODO add your handling code here:
        Turno_IU frame = new Turno_IU();
        escritorio.add(frame);
        Dimension a = escritorio.getSize();
        Dimension b = frame.getSize();
        frame.setLocation((a.width - b.width) / 2, (a.height - b.height) / 2);
        frame.show();
    }//GEN-LAST:event_menu_item_TurnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menu_item_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_MarcaActionPerformed
        // TODO add your handling code here:
        Marca_IU frame = new Marca_IU();
        escritorio.add(frame);
        Dimension a = escritorio.getSize();
        Dimension b = frame.getSize();
        frame.setLocation((a.width - b.width) / 2, (a.height - b.height) / 2);
        frame.show();
    }//GEN-LAST:event_menu_item_MarcaActionPerformed

    private void menu_item_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_categoriaActionPerformed
        // TODO add your handling code here:
        Categoria_IU frame = new Categoria_IU();
        escritorio.add(frame);
        Dimension a = escritorio.getSize();
        Dimension b = frame.getSize();
        frame.setLocation((a.width - b.width) / 2, (a.height - b.height) / 2);
        frame.show();
    }//GEN-LAST:event_menu_item_categoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnEgresos;
    private javax.swing.JButton btnIngresos;
    public javax.swing.JButton btnProducto;
    private javax.swing.JButton btnVentas;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JMenu menu_deuda;
    private javax.swing.JMenuItem menu_item_Marca;
    private javax.swing.JMenuItem menu_item_TipoUsuario;
    private javax.swing.JMenuItem menu_item_Turno;
    private javax.swing.JMenuItem menu_item_Usuario;
    private javax.swing.JMenuItem menu_item_categoria;
    public javax.swing.JMenu menu_salir;
    // End of variables declaration//GEN-END:variables
}
