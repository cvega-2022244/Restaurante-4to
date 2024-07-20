/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.javiervega.vista;

/**
 *
 * @author santiago
 */
public class VistaHacerUnPedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaHacerUnaOrden
     */
    public VistaHacerUnPedido() {
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

        panelDeEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblIngresaElNombreDelPlatillo = new javax.swing.JLabel();
        txtIngresaElNombreDelPlatillo = new javax.swing.JTextField();
        lblCuantasUnidadesDeseas = new javax.swing.JLabel();
        txtCuantasUnidadesDeseas = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonPedidoRealizado = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setText("Que Deseas Ordenar Hoy??");

        lblIngresaElNombreDelPlatillo.setText("Ingresa el Nombre Del Platillo");

        lblCuantasUnidadesDeseas.setText("Cuantas Unidades O Porciones Deseas??");

        botonPedidoRealizado.setText("Ordenar  : )");

        panelDeEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelDeEscritorio.setLayer(lblIngresaElNombreDelPlatillo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelDeEscritorio.setLayer(txtIngresaElNombreDelPlatillo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelDeEscritorio.setLayer(lblCuantasUnidadesDeseas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelDeEscritorio.setLayer(txtCuantasUnidadesDeseas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelDeEscritorio.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelDeEscritorio.setLayer(botonPedidoRealizado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelDeEscritorioLayout = new javax.swing.GroupLayout(panelDeEscritorio);
        panelDeEscritorio.setLayout(panelDeEscritorioLayout);
        panelDeEscritorioLayout.setHorizontalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeEscritorioLayout.createSequentialGroup()
                .addGroup(panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeEscritorioLayout.createSequentialGroup()
                        .addGroup(panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDeEscritorioLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblIngresaElNombreDelPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIngresaElNombreDelPlatillo)
                                    .addComponent(lblCuantasUnidadesDeseas, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCuantasUnidadesDeseas, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)))
                            .addGroup(panelDeEscritorioLayout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 200, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(panelDeEscritorioLayout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(botonPedidoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDeEscritorioLayout.setVerticalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeEscritorioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblIngresaElNombreDelPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIngresaElNombreDelPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblCuantasUnidadesDeseas)
                .addGap(28, 28, 28)
                .addComponent(txtCuantasUnidadesDeseas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonPedidoRealizado)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(panelDeEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPedidoRealizado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCuantasUnidadesDeseas;
    private javax.swing.JLabel lblIngresaElNombreDelPlatillo;
    private javax.swing.JDesktopPane panelDeEscritorio;
    private javax.swing.JTextField txtCuantasUnidadesDeseas;
    private javax.swing.JTextField txtIngresaElNombreDelPlatillo;
    // End of variables declaration//GEN-END:variables
}