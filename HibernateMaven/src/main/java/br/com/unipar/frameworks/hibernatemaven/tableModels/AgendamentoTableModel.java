package br.com.unipar.frameworks.hibernatemaven.tableModels;

import br.com.unipar.frameworks.model.Agendamento;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AgendamentoTableModel extends DefaultTableModel {

    public AgendamentoTableModel() {
        this.addColumn("Código");
        this.addColumn("Pet");
        this.addColumn("Data/Hora");
        this.addColumn("Serviços");
    }
    
    public AgendamentoTableModel(List<Agendamento> listAgendamentos) {
        this();
        for (Agendamento c : listAgendamentos) {
            this.addRow(new String[]{
                c.getId().toString(), 
                c.getPet().getNome(),
                c.getDatahora().toString(),
                c.toStringListaServicos()});
        }
    }

    public Agendamento getSelectedAgendamento(JTable table, 
            List<Agendamento> agendamentos) {
        int rowIndex = table.getSelectedRow();
        if (rowIndex < 0) {
            return null;
        }
        Object idObj = table.getValueAt(rowIndex, 0);
        Long id = Long.valueOf(idObj.toString());
        for (Agendamento c : agendamentos) {
            if (c.getId().equals(id)) {
                return c; 
            }
        }
        return null;
    }
}
