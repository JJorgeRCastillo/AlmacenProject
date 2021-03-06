/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.vistas;

import com.almacen.entity.UnidadMedida;
import com.almacen.logic.UnidadMedidaBL;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import recursos.OptionValues;
import recursos.TableRowListener;

/**
 *
 * @author JorgePC
 */
public class frmUnidadMedida extends javax.swing.JInternalFrame {

    private int idTabla;
    private List<UnidadMedida> lstUnidadMedida;
    private UnidadMedida objUnidadMedida;

    public frmUnidadMedida() {
        initComponents();
        llenarLista();
        disableControls();
        manageButtons(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSimbolo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUnidadMedida = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("MANTENEDOR UNIDAD MEDIDA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setToolTipText("Datos");

        jLabel1.setText("Descripcion:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Simbolo:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSimbolo, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar)
                    .addComponent(btnNuevo)))
        );

        jtbUnidadMedida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUnidadMedidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUnidadMedida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int ok = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro?", "ELIMINAR", JOptionPane.YES_NO_OPTION);
        if (ok == JOptionPane.OK_OPTION) {
            OptionValues mode = OptionValues.DELETE;
            boolean result = UnidadMedidaBL.getInstance().delete(mode.getValue(), objUnidadMedida);
            if (result) {
                llenarLista();
                JOptionPane.showMessageDialog(this, "Se eliminó correctamente la unidad de medida.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar la unidad de medida.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!isEmpty()) {
            UnidadMedida objUnidadMedida = new UnidadMedida(
                    0, txtDescripcion.getText(),
                    txtSimbolo.getText(), true);
            OptionValues mode = OptionValues.INSERT;
            int result = UnidadMedidaBL.getInstance().insert(mode.getValue(), objUnidadMedida);
            if (result > 0) {
                llenarLista();
                JOptionPane.showMessageDialog(this, "Se registro correctamente la unidad de medida.");
            } else {
                JOptionPane.showMessageDialog(this, "La unidad de medida ya existe.", "ALERTA", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Llenar campos vacíos.", "ALERTA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        manageButtons(1);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        manageButtons(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtbUnidadMedidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUnidadMedidaMouseClicked
        manageButtons(2);
        idTabla = jtbUnidadMedida.getSelectedRow();
        if (idTabla != -1) {
            objUnidadMedida = new UnidadMedida();
            objUnidadMedida = lstUnidadMedida.get(idTabla);
            txtDescripcion.setText(objUnidadMedida.getDescripcion());
            txtSimbolo.setText(objUnidadMedida.getSimbolo());
        }

    }//GEN-LAST:event_jtbUnidadMedidaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!isEmpty()) {
            int ok = JOptionPane.showConfirmDialog(this, "¿Desea actualizar el registro?", "EDITAR", JOptionPane.YES_NO_OPTION);
            if (ok == JOptionPane.OK_OPTION) {
                OptionValues mode = OptionValues.UPDATE;
                objUnidadMedida.setDescripcion(txtDescripcion.getText());
                objUnidadMedida.setSimbolo(txtSimbolo.getText());
                boolean result = UnidadMedidaBL.getInstance().update(mode.getValue(), objUnidadMedida);
                if (result) {
                    llenarLista();
                    JOptionPane.showMessageDialog(this, "Se editó correctamente la unidad de medida.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al editar la unidad de medida.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Llenar campos vacíos.", "ALERTA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbUnidadMedida;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtSimbolo;
    // End of variables declaration//GEN-END:variables

    private void llenarLista() {
        lstUnidadMedida = UnidadMedidaBL.getInstance().listAll();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("DESCRIPCIÓN");
        modelo.addColumn("SÍMBOLO");
        modelo.addColumn("ESTADO");

        for (UnidadMedida um : lstUnidadMedida) {
            modelo.addRow(new Object[]{
                um.getDescripcion(),
                um.getSimbolo(),
                um.isEstado() == true ? "Activo" : "Inactivo"
            });
        }

        jtbUnidadMedida.setModel(modelo);
        jtbUnidadMedida.getSelectionModel().addListSelectionListener(new TableRowListener(jtbUnidadMedida, this));
    }

    private void enableControls() {
        txtDescripcion.setEnabled(true);
        txtSimbolo.setEnabled(true);
    }

    private void disableControls() {
        txtDescripcion.setEnabled(false);
        txtSimbolo.setEnabled(false);
    }

    private void clearControls() {
        txtDescripcion.setText("");
        txtSimbolo.setText("");
    }

    private boolean isEmpty() {
        if (txtDescripcion.getText().equals("") || txtSimbolo.getText().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    private void manageButtons(int caso) {
        switch (caso) {
            case 0:
                btnNuevo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnGuardar.setEnabled(false);
                btnCancelar.setEnabled(false);
                clearControls();
                disableControls();
                break;
            case 1:
                btnGuardar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnNuevo.setEnabled(false);
                clearControls();
                enableControls();
                break;
            case 2:
                btnNuevo.setEnabled(false);
                btnEditar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnGuardar.setEnabled(false); 
                clearControls();
                enableControls();
                break;

        }

    }

}
