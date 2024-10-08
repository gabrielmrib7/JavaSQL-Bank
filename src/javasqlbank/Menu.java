/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalhopoon3;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PICHAU
 */
public class Menu extends javax.swing.JFrame {
    
    int index;
    /**
     * Creates new form Menu
     * @param rs
     */
    ResultSet resultglobal;
    
    int xMouse;
    int yMouse;
    
    String nome;
    String cpf;
    int numeroconta;
    int senha;
    double saldo;
    
    
    public Menu(ResultSet rs) {
        initComponents();
        centralizarComponente();
        
        ResultSet result = rs;
        resultglobal = result;
        try {
            
            
            nome = result.getString("nome");
            cpf = result.getString("cpf");
            numeroconta = result.getInt("numeroconta");
            saldo = result.getDouble("saldo");
            senha = result.getInt("senha");
            txtSaldo.setText("R$ " + String.valueOf(saldo));
            txtNome.setText("Olá,   "+ nome);
            txtConta.setText("Nº Conta: " + String.valueOf(numeroconta));
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void centralizarComponente() { Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension dw = getSize();
    setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JLabel();
        btMenuSair = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btDepositar = new javax.swing.JButton();
        btSacar = new javax.swing.JButton();
        txtConta = new javax.swing.JLabel();
        btTransferir = new javax.swing.JButton();
        btInformacoes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(720, 720));
        setSize(new java.awt.Dimension(720, 720));
        getContentPane().setLayout(null);

        txtNome.setFont(new java.awt.Font("Impact", 0, 27)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNome.setText("0");
        txtNome.setAutoscrolls(true);
        getContentPane().add(txtNome);
        txtNome.setBounds(250, 100, 300, 40);

        txtSaldo.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldo.setText("0");
        txtSaldo.setAutoscrolls(true);
        getContentPane().add(txtSaldo);
        txtSaldo.setBounds(120, 250, 460, 90);

        btMenuSair.setBorderPainted(false);
        btMenuSair.setContentAreaFilled(false);
        btMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuSairActionPerformed(evt);
            }
        });
        getContentPane().add(btMenuSair);
        btMenuSair.setBounds(670, 0, 50, 30);

        jTabbedPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseDragged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });
        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 720, 30);

        btDepositar.setBorderPainted(false);
        btDepositar.setContentAreaFilled(false);
        btDepositar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositarActionPerformed(evt);
            }
        });
        getContentPane().add(btDepositar);
        btDepositar.setBounds(210, 500, 280, 50);

        btSacar.setBorderPainted(false);
        btSacar.setContentAreaFilled(false);
        btSacar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSacarActionPerformed(evt);
            }
        });
        getContentPane().add(btSacar);
        btSacar.setBounds(210, 420, 280, 50);

        txtConta.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        txtConta.setForeground(new java.awt.Color(255, 255, 255));
        txtConta.setText("conta");
        getContentPane().add(txtConta);
        txtConta.setBounds(250, 140, 140, 23);

        btTransferir.setBorderPainted(false);
        btTransferir.setContentAreaFilled(false);
        btTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransferirActionPerformed(evt);
            }
        });
        getContentPane().add(btTransferir);
        btTransferir.setBounds(210, 580, 280, 60);

        btInformacoes.setBorderPainted(false);
        btInformacoes.setContentAreaFilled(false);
        btInformacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInformacoesActionPerformed(evt);
            }
        });
        getContentPane().add(btInformacoes);
        btInformacoes.setBounds(550, 60, 60, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoon3/Resources/menu720.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSacarActionPerformed
        // TODO add your handling code here:
        
        
    
       double saque = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Quanto voce quer sacar?", "Saque", HEIGHT));
       if(saque <= saldo)
       {
       boolean checar = Agencia.Sacar(saque, numeroconta, saldo);
       
       if(checar == true)
       {
       JOptionPane.showMessageDialog(rootPane, "Saque Concluido!", "Saque", 1);
       }
        else
        {
         JOptionPane.showMessageDialog(rootPane, "Erro!", "Erro", 1);
        }
       }
       else
       {
           JOptionPane.showMessageDialog(rootPane, "Saldo Insuficiente", "Erro", 1);
       }
 
      
    }//GEN-LAST:event_btSacarActionPerformed

    
    
    private void btDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositarActionPerformed
        // TODO add your handling code here:
        double deposito = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Quanto voce quer depositar?", "Deposito", HEIGHT));
        if(deposito >= 0)
        {
        boolean checar = Agencia.Depositar(deposito, numeroconta, saldo);
        if(checar == true)
        {
        JOptionPane.showMessageDialog(rootPane, "Deposito Concluido!", "Deposito", 1);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Erro!", "Erro", 1);
        }
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane, "Não tem como depositar um saldo negativo!", "Erro", 1);
        }

    }//GEN-LAST:event_btDepositarActionPerformed

    private void btTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransferirActionPerformed
        // TODO add your handling code here:
        Transferencia form4 = new Transferencia(resultglobal);
        form4.setVisible(true);
 
        
    }//GEN-LAST:event_btTransferirActionPerformed

    private void btMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuSairActionPerformed
        // TODO add your handling code here:
        Main form1 = new Main(); 
        form1.setVisible(true); 
        dispose();
    }//GEN-LAST:event_btMenuSairActionPerformed

    private void btInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInformacoesActionPerformed
         
        resultglobal = Agencia.logar(numeroconta, senha);
        
        try {
            
            if(resultglobal.next()){
            nome = resultglobal.getString("nome");
            cpf = resultglobal.getString("cpf");
            numeroconta = resultglobal.getInt("numeroconta");
            saldo = resultglobal.getDouble("saldo");
            senha = resultglobal.getInt("senha");
            } 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        txtSaldo.setText("R$ " + String.valueOf(saldo));
   
        
        
    }//GEN-LAST:event_btInformacoesActionPerformed

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void jTabbedPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseDragged
        // TODO add your handling code here:
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_jTabbedPane1MouseDragged

    /**
     * @param args the command line arguments
     * @param rs
     */
    public static void main(String args[], ResultSet rs) {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(rs).setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btInformacoes;
    private javax.swing.JButton btMenuSair;
    private javax.swing.JButton btSacar;
    private javax.swing.JButton btTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtConta;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSaldo;
    // End of variables declaration//GEN-END:variables
}
