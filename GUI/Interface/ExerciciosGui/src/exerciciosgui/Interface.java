package exerciciosgui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        LabelNome = new javax.swing.JTextField();
        LabelSobrenome = new javax.swing.JTextField();
        LabelRg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelCpf = new javax.swing.JTextField();
        LabelNascimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JTextField();
        Btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        LabelNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LabelNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelNomeActionPerformed(evt);
            }
        });

        LabelSobrenome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LabelSobrenome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LabelRg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LabelRg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel2.setText("Sobrenome");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel3.setText("RG");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel4.setText("CPF");

        LabelCpf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LabelCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LabelNascimento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LabelNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel5.setText("Nascimento");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel6.setText("E-mail");

        LabelEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LabelEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Btn.setBackground(new java.awt.Color(255, 255, 204));
        Btn.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        Btn.setText("Criar");
        Btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Btn.setBorderPainted(false);
        Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel7.setText("Atributos da Classe Pessoa");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 204));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel8.setText("Cadastro");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "E-mail", "Data", "RG", "CPF"
            }
        ));
        jScrollPane3.setViewportView(Tabela);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(239, 239, 239))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelSobrenome)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LabelNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelEmail))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(LabelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(LabelNome, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(47, 47, 47))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(LabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }

    private void BtnActionPerformed(java.awt.event.ActionEvent evt) {//event_BtnActionPerformed
       
        Pessoa p = new Pessoa("","","","","","");
        
        // Checa se algum dos fields estão em branco, se sim, manda uma mensagem
        if(LabelNome.getText().equals("") || LabelSobrenome.getText().equals("") || LabelRg.getText().equals("") || LabelCpf.getText().equals("") || LabelNascimento.getText().equals("") || LabelEmail.getText().equals("")) {
           JOptionPane.showMessageDialog(this, "Por favor, insira todos os campos.");
        } else {
        // Caso todos os fields forem preenchidos, pode passar os valores para a Pessoa p   
           p.setNome(LabelNome.getText());
           p.setSobrenome(LabelSobrenome.getText());
           p.setEmail(LabelEmail.getText());
           p.setCpf(LabelCpf.getText());
           p.setRg(LabelRg.getText());
           p.setData(LabelNome.getText());
           
        // Faz uma linha receber os dados
           DefaultTableModel tblModel = (DefaultTableModel) Tabela.getModel();
           tblModel.addRow(p.array);
           
        // Depois de terminar, deixa todos os fields em branco novamente
           JOptionPane.showMessageDialog(this, "Pessoa adicionada com sucesso!");
           LabelNome.setText("");
           LabelSobrenome.setText("");
           LabelRg.setText("");
           LabelCpf.setText("");
           LabelNascimento.setText("");
           LabelEmail.setText("");
        }
    }

    public static void main(String args[]) {
        Interface formulario = new Interface();
        formulario.setTitle("Cadastro");
        formulario.setVisible(true);
        formulario.toFront();
    }
   

    // Variables declaration
    private javax.swing.JButton Btn;
    private javax.swing.JTextField LabelCpf;
    private javax.swing.JTextField LabelEmail;
    private javax.swing.JTextField LabelNascimento;
    private javax.swing.JTextField LabelNome;
    private javax.swing.JTextField LabelRg;
    private javax.swing.JTextField LabelSobrenome;
    private javax.swing.JTable Tabela;
}
