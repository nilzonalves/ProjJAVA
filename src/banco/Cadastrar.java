package banco;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Cadastrar extends javax.swing.JFrame {

    public Cadastrar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldSobreNome = new javax.swing.JTextField();
        jButtoncadastrar = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 450));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 450));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sobrenome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Idade:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CPF");

        jTextFieldNome.setSelectionColor(new java.awt.Color(255, 0, 0));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeActionPerformed(evt);
            }
        });

        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        jTextFieldSobreNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSobreNomeActionPerformed(evt);
            }
        });

        jButtoncadastrar.setBackground(new java.awt.Color(228, 200, 228));
        jButtoncadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtoncadastrar.setText("Cadastrar");
        jButtoncadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtoncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncadastrarActionPerformed(evt);
            }
        });

        jLabelError.setForeground(new java.awt.Color(255, 0, 51));

        try {
            jTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtoncadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButtoncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncadastrarActionPerformed
        try {
            cadastrar();
        } catch (IOException ex) {
            Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtoncadastrarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        error();
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldSobreNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSobreNomeActionPerformed
        error();
    }//GEN-LAST:event_jTextFieldSobreNomeActionPerformed

    private void jTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeActionPerformed
        error();
    }//GEN-LAST:event_jTextFieldIdadeActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        error();
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        error();
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    public void error(){
        if(jTextFieldNome.getText().trim().equals("")){
            jLabelError.setText("Insira o campo Nome.");
        }else if(jTextFieldSobreNome.getText().trim().equals("")){
            jLabelError.setText("Insira o campo Sobrenome.");
        }else if(jTextFieldIdade.getText().trim().equals("")){
            jLabelError.setText("Insira o campo Idade.");
        }else if(jTextFieldEndereco.getText().trim().equals("")){
            jLabelError.setText("Insira o campo Endereço.");
        }else if(jTextFieldCPF.getText().trim().equals("")){
            jLabelError.setText("Insira o campo CPF.");
        }else{
            try {
                cadastrar();
            } catch (IOException ex) {
                Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void cadastrar() throws IOException{
        
        String name;
        name = JOptionPane.showInputDialog(this, "Informe o nome do arquivo: ");
        
        FileWriter arquivoCliente = new FileWriter("C:\\Users\\Nilzon Alves\\Documents\\NetBeansProjects\\Banco\\"+name+".txt");
        PrintWriter gravarArq = new PrintWriter(arquivoCliente);
        
        gravarArq.printf("Nome: %s %n", jTextFieldNome.getText());
        gravarArq.printf("Sobrenome: %s %n", jTextFieldSobreNome.getText());
        gravarArq.printf("Idade: %s %n", jTextFieldIdade.getText());
        gravarArq.printf("Endereço: %s %n", jTextFieldEndereco.getText());
        gravarArq.printf("CPF: %s %n", jTextFieldCPF.getText());
        
     

        arquivoCliente.close();
        
        
        JOptionPane.showMessageDialog( rootPane ,"Cadastro realizado com sucesso.");
        
        dispose();
    }
    
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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobreNome;
    // End of variables declaration//GEN-END:variables
}
