/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.frameworks.hibernatemaven.tableModels;

import br.com.unipar.frameworks.model.Pet;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author not
 */
public class ListaPetTableModel extends DefaultTableModel {

    public ListaPetTableModel() {
        this.addColumn("Código");
        this.addColumn("Nome do Pet");
        this.addColumn("Nome do Dono");
        this.addColumn("Tamanho");
    }

    public ListaPetTableModel(List<Pet> listPet) {
        this();
        for (Pet c : listPet) {
            this.addRow(new String[]{
                c.getId().toString(),
                c.getNome(),
                c.getCliente().getNome(),
                c.getTamanho()});
        }
    }

    public Pet getSelectedPet(JTable table,
            List<Pet> pets) {
        int rowIndex = table.getSelectedRow();
        if (rowIndex < 0) {
            return null;
        }
        Object idObj = table.getValueAt(rowIndex, 0);
        Long id = Long.valueOf(idObj.toString());
        for (Pet c : pets) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

}
