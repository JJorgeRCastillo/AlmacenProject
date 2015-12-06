/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.vistas;

import recursos.Util;

/**
 *
 * @author JorgePC
 */
public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        dskContenedor = new javax.swing.JDesktopPane();
        mbrGeneral = new javax.swing.JMenuBar();
        menMantenedores = new javax.swing.JMenu();
        sbmCategoria = new javax.swing.JMenuItem();
        sbmProveedor = new javax.swing.JMenuItem();
        sbmUsuario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        sbmUnidadMedida = new javax.swing.JMenuItem();
        sbmTipoFicha = new javax.swing.JMenuItem();
        menProcesos = new javax.swing.JMenu();
        sbmDocEntrada = new javax.swing.JMenuItem();
        sbmDocSalida = new javax.swing.JMenuItem();
        menMovimientos = new javax.swing.JMenu();
        sbmKardex = new javax.swing.JMenuItem();
        menConsultas = new javax.swing.JMenu();
        sbmPorStock = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE ALMACÉN V.1.0");

        javax.swing.GroupLayout dskContenedorLayout = new javax.swing.GroupLayout(dskContenedor);
        dskContenedor.setLayout(dskContenedorLayout);
        dskContenedorLayout.setHorizontalGroup(
            dskContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );
        dskContenedorLayout.setVerticalGroup(
            dskContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        menMantenedores.setText("Mantenedores");

        sbmCategoria.setText("Producto");
        sbmCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmCategoriaActionPerformed(evt);
            }
        });
        menMantenedores.add(sbmCategoria);

        sbmProveedor.setText("Proveedor");
        sbmProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmProveedorActionPerformed(evt);
            }
        });
        menMantenedores.add(sbmProveedor);

        sbmUsuario.setText("Usuario");
        sbmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmUsuarioActionPerformed(evt);
            }
        });
        menMantenedores.add(sbmUsuario);

        jMenuItem2.setText("Categoria");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menMantenedores.add(jMenuItem2);

        sbmUnidadMedida.setText("Unidad Medida");
        sbmUnidadMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmUnidadMedidaActionPerformed(evt);
            }
        });
        menMantenedores.add(sbmUnidadMedida);

        sbmTipoFicha.setText("Tipo Ficha");
        sbmTipoFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmTipoFichaActionPerformed(evt);
            }
        });
        menMantenedores.add(sbmTipoFicha);

        mbrGeneral.add(menMantenedores);

        menProcesos.setText("Documentos");

        sbmDocEntrada.setText("Documento Entrada");
        sbmDocEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmDocEntradaActionPerformed(evt);
            }
        });
        menProcesos.add(sbmDocEntrada);

        sbmDocSalida.setText("Documento Salida");
        menProcesos.add(sbmDocSalida);

        mbrGeneral.add(menProcesos);

        menMovimientos.setText("Movimientos");

        sbmKardex.setText("Kardex");
        menMovimientos.add(sbmKardex);

        mbrGeneral.add(menMovimientos);

        menConsultas.setText("Consultas");

        sbmPorStock.setText("Por Stock");
        menConsultas.add(sbmPorStock);

        mbrGeneral.add(menConsultas);

        setJMenuBar(mbrGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskContenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskContenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbmCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmCategoriaActionPerformed
        frmProducto ventana = new frmProducto();
        if (!Util.getInstance().isJInternalFrameOpen(ventana, dskContenedor)) {
            dskContenedor.add(ventana);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_sbmCategoriaActionPerformed

    private void sbmProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmProveedorActionPerformed
        frmProveedor ventana = new frmProveedor();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_sbmProveedorActionPerformed

    private void sbmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbmUsuarioActionPerformed

    private void sbmDocEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmDocEntradaActionPerformed

    }//GEN-LAST:event_sbmDocEntradaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmCategoria ventana = new frmCategoria();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void sbmUnidadMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmUnidadMedidaActionPerformed
        frmUnidadMedida ventana = new frmUnidadMedida();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_sbmUnidadMedidaActionPerformed

    private void sbmTipoFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmTipoFichaActionPerformed
        frmTipoFicha ventana = new frmTipoFicha();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_sbmTipoFichaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskContenedor;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar mbrGeneral;
    private javax.swing.JMenu menConsultas;
    private javax.swing.JMenu menMantenedores;
    private javax.swing.JMenu menMovimientos;
    private javax.swing.JMenu menProcesos;
    private javax.swing.JMenuItem sbmCategoria;
    private javax.swing.JMenuItem sbmDocEntrada;
    private javax.swing.JMenuItem sbmDocSalida;
    private javax.swing.JMenuItem sbmKardex;
    private javax.swing.JMenuItem sbmPorStock;
    private javax.swing.JMenuItem sbmProveedor;
    private javax.swing.JMenuItem sbmTipoFicha;
    private javax.swing.JMenuItem sbmUnidadMedida;
    private javax.swing.JMenuItem sbmUsuario;
    // End of variables declaration//GEN-END:variables
}
