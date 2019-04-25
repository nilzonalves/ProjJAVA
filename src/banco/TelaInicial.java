package banco;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaInicial extends javax.swing.JFrame {

    private String valor;
    private double saldo;

    public TelaInicial() {
        initComponents();  
        exibirDados();
        jLabel1.setText("Saldo Atual: " + this.saldo);
    }

    public void setValor(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return this.valor;
    }
    
    public void setSaldo(double saldo){
        this.saldo += saldo;
        //atualizando Label de Saldo.        
        jLabel1.setText("Saldo Atual: " + this.saldo);
        if(this.saldo > 0){
            jPanelSaldoAtual.setBackground(new Color(51,51,255));
        }else{
            jPanelSaldoAtual.setBackground(new Color(255,0,51));
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelSaldo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelDepositar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelSacar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelSaldoAtual = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNome = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Inicial");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(550, 450));
        setPreferredSize(new java.awt.Dimension(550, 450));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banco/imagens/bank_78392 (1).png"))); // NOI18N

        jPanelSaldo.setBackground(new java.awt.Color(102, 0, 102));
        jPanelSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSaldoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelSaldoMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("SALDO");

        javax.swing.GroupLayout jPanelSaldoLayout = new javax.swing.GroupLayout(jPanelSaldo);
        jPanelSaldo.setLayout(jPanelSaldoLayout);
        jPanelSaldoLayout.setHorizontalGroup(
            jPanelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaldoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSaldoLayout.setVerticalGroup(
            jPanelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSaldoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelDepositar.setBackground(new java.awt.Color(102, 0, 102));
        jPanelDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelDepositarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelDepositarMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("DEPOSITAR");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelDepositarLayout = new javax.swing.GroupLayout(jPanelDepositar);
        jPanelDepositar.setLayout(jPanelDepositarLayout);
        jPanelDepositarLayout.setHorizontalGroup(
            jPanelDepositarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepositarLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDepositarLayout.setVerticalGroup(
            jPanelDepositarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepositarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelSacar.setBackground(new java.awt.Color(102, 0, 102));
        jPanelSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSacarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelSacarMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("SACAR");

        javax.swing.GroupLayout jPanelSacarLayout = new javax.swing.GroupLayout(jPanelSacar);
        jPanelSacar.setLayout(jPanelSacarLayout);
        jPanelSacarLayout.setHorizontalGroup(
            jPanelSacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSacarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSacarLayout.setVerticalGroup(
            jPanelSacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSacarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addComponent(jPanelSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelSacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 264, 450);

        jPanelSaldoAtual.setBackground(new java.awt.Color(204, 204, 204));
        jPanelSaldoAtual.setPreferredSize(new java.awt.Dimension(280, 94));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Saldo Atual:      ");

        javax.swing.GroupLayout jPanelSaldoAtualLayout = new javax.swing.GroupLayout(jPanelSaldoAtual);
        jPanelSaldoAtual.setLayout(jPanelSaldoAtualLayout);
        jPanelSaldoAtualLayout.setHorizontalGroup(
            jPanelSaldoAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaldoAtualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanelSaldoAtualLayout.setVerticalGroup(
            jPanelSaldoAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaldoAtualLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelSaldoAtual);
        jPanelSaldoAtual.setBounds(264, 0, 287, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Dados do Cliente");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 110, 100, 15);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(270, 70, 270, 40);
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(270, 150, 200, 30);
        getContentPane().add(jLabelSobrenome);
        jLabelSobrenome.setBounds(270, 190, 200, 30);
        getContentPane().add(jLabelEndereco);
        jLabelEndereco.setBounds(270, 230, 280, 30);
        getContentPane().add(jLabelIdade);
        jLabelIdade.setBounds(270, 270, 200, 30);
        getContentPane().add(jLabelCPF);
        jLabelCPF.setBounds(270, 310, 200, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Login tela = new Login();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jPanelSaldoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaldoMousePressed
        JOptionPane.showMessageDialog(this, "Seu saldo atual é: " + this.saldo + " reais");
    }//GEN-LAST:event_jPanelSaldoMousePressed

    private void jPanelDepositarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDepositarMousePressed
        valor = JOptionPane.showInputDialog(this, "Informe o valor para Depositar: ");
        this.setSaldo(Double.parseDouble(valor)); 
    }//GEN-LAST:event_jPanelDepositarMousePressed

    private void jPanelSacarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSacarMousePressed
        valor = JOptionPane.showInputDialog(this, "Informe o valor para sacar: ");
        this.setSaldo(-Double.parseDouble(valor)); 
    }//GEN-LAST:event_jPanelSacarMousePressed

    private void jPanelSaldoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaldoMouseEntered
        setColor(jPanelSaldo);
        resetColor(jPanelDepositar);
        resetColor(jPanelSacar);
    }//GEN-LAST:event_jPanelSaldoMouseEntered

    private void jPanelDepositarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDepositarMouseEntered
        setColor(jPanelDepositar);
        resetColor(jPanelSaldo);
        resetColor(jPanelSacar);
    }//GEN-LAST:event_jPanelDepositarMouseEntered

    private void jPanelSacarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSacarMouseEntered
        setColor(jPanelSacar);
        resetColor(jPanelSaldo);
        resetColor(jPanelDepositar);
    }//GEN-LAST:event_jPanelSacarMouseEntered
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(204,102,255));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(102,0,102));
    }
    
    public void exibirDados(){

        String nomeArq = "cliente.txt";
        try{
            FileReader arq = new FileReader(nomeArq);
            BufferedReader lerArq = new BufferedReader(arq);
            
            String linha = lerArq.readLine();//le a primeira linha
            //a variavel "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto.
            int i = 0;
                String texto = null;
                while(linha != null){
                    texto = linha;
                    linha = lerArq.readLine();
                    
                    if(i == 0){
                        jLabelNome.setText(texto);
                    }else if( i == 1){
                        jLabelSobrenome.setText(texto);
                    }else if(i == 2){
                        jLabelEndereco.setText(texto);
                    }else if(i == 3){
                        jLabelIdade.setText(texto);
                    }else if(i == 4){
                        jLabelCPF.setText(texto);
                    }
                    i++;
                    
                }                 
                
                arq.close();            
                    
        }catch(IOException e){
            System.out.printf("Erro na abertura do arquivo %s. \n");
            e.getMessage();
                    
        }
        
        System.out.println();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDepositar;
    private javax.swing.JPanel jPanelSacar;
    private javax.swing.JPanel jPanelSaldo;
    private javax.swing.JPanel jPanelSaldoAtual;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
