/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.javiervega.vista;

import javax.swing.JInternalFrame;
/**
 *
 * @author santiago
 */
public class Menu extends javax.swing.JFrame {

    private static VistaDatosJefe instanciaRestauranteMenu = null;
    private static VistaHacerUnPedido instanciaOrdenar = null;
    /**
     * Creates new form Bienvenido
     */
    public Menu() {
        LookAndFeel();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private synchronized JInternalFrame getInstanciaRestauranteMenu(){
        if(instanciaRestauranteMenu == null){
            instanciaRestauranteMenu = new VistaDatosJefe();
            panelDeEscritorio.add(instanciaRestauranteMenu);
        }else if(instanciaRestauranteMenu.isVisible()== false)
            instanciaRestauranteMenu.setVisible(true);
        instanciaRestauranteMenu.show();
        return instanciaRestauranteMenu;
    }
        private synchronized JInternalFrame getInstanciaOrdenar(){
        if(instanciaOrdenar == null){
            instanciaOrdenar = new VistaHacerUnPedido();
            panelDeEscritorio.add(instanciaOrdenar);
        }else if(instanciaOrdenar.isVisible() == false)
            instanciaOrdenar.setVisible(true);
        instanciaOrdenar.show();
        return instanciaOrdenar;
    }
    public static void LookAndFeel(){
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        panelDeEscritorio = new javax.swing.JDesktopPane();
        barraDeMenu = new javax.swing.JMenuBar();
        menuRestaurante = new javax.swing.JMenu();
        menuItemNuestroMenu = new javax.swing.JMenuItem();
        menuItemDeseasOrdenar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Javier-Vega");

        javax.swing.GroupLayout panelDeEscritorioLayout = new javax.swing.GroupLayout(panelDeEscritorio);
        panelDeEscritorio.setLayout(panelDeEscritorioLayout);
        panelDeEscritorioLayout.setHorizontalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        panelDeEscritorioLayout.setVerticalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        menuRestaurante.setText("Menu");

        menuItemNuestroMenu.setText("Datos Dej Gerente");
        menuItemNuestroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuestroMenuActionPerformed(evt);
            }
        });
        menuRestaurante.add(menuItemNuestroMenu);

        menuItemDeseasOrdenar.setText("Desea Ordenar??");
        menuItemDeseasOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDeseasOrdenarActionPerformed(evt);
            }
        });
        menuRestaurante.add(menuItemDeseasOrdenar);

        barraDeMenu.add(menuRestaurante);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeEscritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemNuestroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuestroMenuActionPerformed
        // TODO add your handling code here:
        getInstanciaRestauranteMenu();
    }//GEN-LAST:event_menuItemNuestroMenuActionPerformed

    private void menuItemDeseasOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDeseasOrdenarActionPerformed
        // TODO add your handling code here:
        getInstanciaOrdenar();
    }//GEN-LAST:event_menuItemDeseasOrdenarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JMenuItem menuItemDeseasOrdenar;
    private javax.swing.JMenuItem menuItemNuestroMenu;
    private javax.swing.JMenu menuRestaurante;
    private javax.swing.JDesktopPane panelDeEscritorio;
    // End of variables declaration//GEN-END:variables
}