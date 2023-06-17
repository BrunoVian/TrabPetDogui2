package br.com.unipar.frameworks.hibernatemaven.frames;

import br.com.unipar.frameworks.hibernatemaven.tableModels.AgendamentoTableModel;
import br.com.unipar.frameworks.hibernatemaven.tableModels.ClienteTableModel;
import br.com.unipar.frameworks.model.Agendamento;
import br.com.unipar.frameworks.model.AgendamentoServico;
import br.com.unipar.frameworks.model.Cliente;
import br.com.unipar.frameworks.model.Servico;
import br.com.unipar.frameworks.model.dao.AgendamentoDAO;
import br.com.unipar.frameworks.model.dao.ClienteDAO;
import br.com.unipar.frameworks.model.dao.ServicoDAO;
import br.com.unipar.frameworks.model.util.EntityManagerUtil;
import br.com.unipar.frameworks.model.util.PetDoguiLog;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class AgendamentoNovo extends javax.swing.JFrame {

    private ServicoDAO daoServico;
    private Agendamento agendamento = new Agendamento();
    private List<Servico> servicosSelecionados;
    PetDoguiLog log = new PetDoguiLog();

    public AgendamentoNovo() {
        EntityManagerUtil.getEntityManagerFactory();

        initComponents();
        atualizaLista();
        atualizaServico();
    }

    private void atualizaServico() {
        daoServico = new ServicoDAO();
        List<Servico> listaServicos = daoServico.findAll();
        for (Servico servico : listaServicos) {
            jComboBoxServicos.addItem(servico.getDescricao());
        }
    }

    private void atualizaLista() {
        AgendamentoDAO dao = new AgendamentoDAO();

        List<Agendamento> listAgendamentos = dao.findAll();
        AgendamentoTableModel model
                = new AgendamentoTableModel(listAgendamentos);
        jTableAgendamentos.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanelCadastro = new javax.swing.JPanel();
        jLabelPet = new javax.swing.JLabel();
        jTextFieldPet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxServicos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JTextField();
        jButtonInserirServico = new javax.swing.JButton();
        jButtonConsultarPet = new javax.swing.JButton();
        jScrollPaneServicos = new javax.swing.JScrollPane();
        jTextAreaServicos = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jButtonAgendar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFormattedData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendamentos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelPet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPet.setText("Pet:");

        jTextFieldPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPetActionPerformed(evt);
            }
        });

        jLabel2.setText("Data:");

        jComboBoxServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicosActionPerformed(evt);
            }
        });

        jLabel3.setText("Serviço:");

        jLabel4.setText("Hora:");

        jButtonInserirServico.setBackground(new java.awt.Color(51, 153, 255));
        jButtonInserirServico.setText("+");
        jButtonInserirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirServicoActionPerformed(evt);
            }
        });

        jButtonConsultarPet.setBackground(new java.awt.Color(51, 153, 255));
        jButtonConsultarPet.setText("+");
        jButtonConsultarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarPetActionPerformed(evt);
            }
        });

        jTextAreaServicos.setColumns(20);
        jTextAreaServicos.setRows(5);
        jScrollPaneServicos.setViewportView(jTextAreaServicos);

        jLabel5.setText("Valor:");

        jButtonAgendar.setBackground(new java.awt.Color(0, 204, 51));
        jButtonAgendar.setText("Agendar");
        jButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Novo Agendamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jFormattedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxServicos, 0, 250, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonInserirServico)
                                    .addComponent(jButtonConsultarPet)))
                            .addComponent(jTextFieldValorTotal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldHora)
                                    .addComponent(jFormattedData)))))
                    .addComponent(jScrollPaneServicos, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPet, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonConsultarPet)
                    .addComponent(jFormattedData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jButtonInserirServico)
                    .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButtonAgendar))
                .addGap(249, 249, 249))
        );

        jTableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableAgendamentos);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Lista de Agendamentos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel6)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarActionPerformed
        String data = jFormattedData.getText();
        String hora = jTextFieldHora.getText();

        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").
                    parse(data + " " + hora + ":00");

            agendamento.setDatahora(date);
            gravarAgendamento();
        } catch (Exception e) {
            //log
            JOptionPane.showMessageDialog(null,
                    "A correta formatação da data é dd/MM/yyyy e hora hh:mm"
                    + "\nERRO: " + e);
        }
    }//GEN-LAST:event_jButtonAgendarActionPerformed

    private void jButtonConsultarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarPetActionPerformed

        try {
            ConsultaPet dialogForm = new ConsultaPet(this, true);
            dialogForm.setVisible(true);
            jTextFieldPet.setText(dialogForm.
                    getPetSelecionado().getNome());

            agendamento.setPet(dialogForm.getPetSelecionado());
            log.infoFrames("Frame Seleção de Pet Aberto");

        } catch (Exception ex) {
            log.erroPersistencia(ex);
        }

    }//GEN-LAST:event_jButtonConsultarPetActionPerformed

    private void jButtonInserirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirServicoActionPerformed

        if (jComboBoxServicos.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione um Serviço", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            Servico servico
                    = daoServico.findByDescricao(
                            jComboBoxServicos.getSelectedItem()
                                    .toString());

            jTextAreaServicos.setText(jTextAreaServicos.getText().isEmpty()
                    ? (servico.getDescricao())
                    : (jTextAreaServicos.getText() + ", " + servico.getDescricao()));

            insereServico(servico);
            atualizaTotal(servico.getValor());
        }

    }//GEN-LAST:event_jButtonInserirServicoActionPerformed

    private void jComboBoxServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServicosActionPerformed

    private void jTextFieldPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPetActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendar;
    private javax.swing.JButton jButtonConsultarPet;
    private javax.swing.JButton jButtonInserirServico;
    private javax.swing.JComboBox<String> jComboBoxServicos;
    private javax.swing.JFormattedTextField jFormattedData;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelPet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneServicos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAgendamentos;
    private javax.swing.JTextArea jTextAreaServicos;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldPet;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables

    private void atualizaTotal(BigDecimal valor) {
        BigDecimal total = agendamento.getValorTotal();

        agendamento.setValorTotal(total.add(valor));
        jTextFieldValorTotal.setText(
                agendamento.getValorTotal().toString());

    }

    private void insereServico(Servico servico) {
        AgendamentoServico agendServ
                = new AgendamentoServico(servico, agendamento,
                        servico.getValor());

        agendamento.getListaServicos().add(agendServ);

    }

    private void gravarAgendamento() {
        AgendamentoDAO dao = new AgendamentoDAO();
        dao.save(agendamento);

        atualizaLista();
    }

}
