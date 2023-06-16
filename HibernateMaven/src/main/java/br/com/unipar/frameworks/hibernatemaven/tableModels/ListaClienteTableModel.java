/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.frameworks.hibernatemaven.tableModels;

import br.com.unipar.frameworks.model.Cliente;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author not
 */
public class ListaClienteTableModel extends DefaultTableModel {

    public ListaClienteTableModel() {
        this.addColumn("Código");
        this.addColumn("Nome");
        this.addColumn("CPF");
        this.addColumn("Email");
        //this.addColumn("Endereco");
    }
    
    public ListaClienteTableModel(List<Cliente> listClientes) {
        this();
        for (Cliente c : listClientes) {
            this.addRow(new String[]{
                c.getIdCliente().toString(),
                c.getNome(),
                c.getCpf(),
                c.getEmail(),
                //c.getEnderecos().toString()
            });
        }
    }

    public Cliente getSelectedAgendamento(JTable table, 
            List<Cliente> clientes) {
        int rowIndex = table.getSelectedRow();
        if (rowIndex < 0) {
            return null;
        }
        Object idObj = table.getValueAt(rowIndex, 0);
        Long id = Long.valueOf(idObj.toString());
        for (Cliente c : clientes) {
            if (c.getIdCliente().equals(id)) {
                return c; 
            }
        }
        return null;
    }
}