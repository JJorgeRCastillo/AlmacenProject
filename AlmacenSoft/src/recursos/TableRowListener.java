/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import com.almacen.entity.UnidadMedida;
import com.almacen.vistas.frmUnidadMedida;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author JorgePC
 */
public class TableRowListener implements ListSelectionListener {

    private JTable tableModel;
    private JInternalFrame form;

    public TableRowListener(JTable tableModel, JInternalFrame form) {

        this.tableModel = tableModel;
        this.form = form;

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (this.tableModel.getSelectedRow() > -1) {

        } else {
             
        }
    }

}
