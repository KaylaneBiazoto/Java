/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exercicio03;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author r2d2
 */
public class Tabela extends javax.swing.JFrame {

    /**
     * Creates new form Tabela
     */
    public Tabela() {
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

        jPanel1 = new javax.swing.JPanel();
        LabelSobrenome = new javax.swing.JTextField();
        LabelNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelRg = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        LabelCpf = new javax.swing.JFormattedTextField();
        LabelData = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));

        LabelSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelSobrenomeActionPerformed(evt);
            }
        });

        LabelNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Sobrenome");

        jLabel3.setText("RG");

        jLabel4.setText("CPF");

        try {
            LabelRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        LabelRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelRgActionPerformed(evt);
            }
        });

        jLabel5.setText("E-mail");

        LabelEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelEmailActionPerformed(evt);
            }
        });

        jLabel6.setText("Nascimento");

        Btn.setText("Criar");
        Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "RG", "CPF", "Nascimento", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        try {
            LabelCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        LabelCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(Btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelRg, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(LabelData))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(LabelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(LabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(LabelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btn)
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelSobrenomeActionPerformed

    private void LabelNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelNomeActionPerformed

    private void LabelRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelRgActionPerformed

    private void LabelEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelEmailActionPerformed

    private void BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActionPerformed
        
        Pessoa p = new Pessoa("","","","","","");

        // Checa se algum dos fields est??o em branco, se sim, manda uma mensagem
        if(LabelNome.getText().equals("") || LabelSobrenome.getText().equals("") || LabelRg.getText().equals("") || LabelCpf.getText().equals("") || LabelData.getText().equals("") || LabelEmail.getText().equals("")) {
           JOptionPane.showMessageDialog(this, "Por favor, insira todos os campos.");
        } else {
        // Caso todos os fields forem preenchidos, pode passar os valores para a Pessoa p   
           p.setNome(LabelNome.getText());
           p.setSobrenome(LabelSobrenome.getText());
           p.setEmail(LabelEmail.getText());
           p.setCpf(LabelCpf.getText());
           p.setRg(LabelRg.getText());
           p.setData(LabelData.getText());
           
        // Faz uma linha receber os dados
           DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
           Tabela.setModel(modelo);
           String[] linha = {p.getNome(), p.getSobrenome(), p.getRg(), p.getCpf(), p.getData(), p.getEmail()};
           modelo.addRow(linha);
           
        // Depois de terminar, deixa todos os fields em branco novamente
           JOptionPane.showMessageDialog(this, "Pessoa adicionada com sucesso!");
           LabelNome.setText("");
           LabelSobrenome.setText("");
           LabelRg.setText("");
           LabelCpf.setText("");
           LabelData.setText("");
           LabelEmail.setText("");
        }
    }//GEN-LAST:event_BtnActionPerformed

    private void LabelCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelCpfActionPerformed

    public static void main(String args[]) {
        Tabela formulario = new Tabela();
        formulario.setTitle("Cadastro");
        formulario.setVisible(true);
        formulario.toFront();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn;
    private javax.swing.JFormattedTextField LabelCpf;
    private javax.swing.JTextField LabelData;
    private javax.swing.JTextField LabelEmail;
    private javax.swing.JTextField LabelNome;
    private javax.swing.JFormattedTextField LabelRg;
    private javax.swing.JTextField LabelSobrenome;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
