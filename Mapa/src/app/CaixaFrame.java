/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author anock
 */
public class CaixaFrame extends javax.swing.JFrame {
    
    
    
    
    
     List<Senha>listaSenha;
    int numero;

    
    
    public CaixaFrame() {
        initComponents();
        numero = 1;
        listaSenha = new ArrayList<>();
    }
        
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jBcomum = new javax.swing.JButton();
        jBrapido = new javax.swing.JButton();
        jBprioritario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBcaixa1 = new javax.swing.JButton();
        jBcaixa2 = new javax.swing.JButton();
        jBcaixa3 = new javax.swing.JButton();
        jBcaixa4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Para Clientes:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jBcomum.setText("COMUM");
        jBcomum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcomumActionPerformed(evt);
            }
        });

        jBrapido.setText("RÁPIDO");
        jBrapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrapidoActionPerformed(evt);
            }
        });

        jBprioritario.setText("PRIORITÁRIO");
        jBprioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprioritarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Escolha seu tipo de atendimento");

        jLabel4.setText("Sua senha é :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBcomum, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBrapido, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBprioritario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcomum, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBrapido, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBprioritario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Para caixas :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jBcaixa1.setText("CAIXA 1");
        jBcaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcaixa1ActionPerformed(evt);
            }
        });

        jBcaixa2.setText("CAIXA 2");
        jBcaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcaixa2ActionPerformed(evt);
            }
        });

        jBcaixa3.setText("CAIXA 3");
        jBcaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcaixa3ActionPerformed(evt);
            }
        });

        jBcaixa4.setText("CAIXA 4");
        jBcaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcaixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBcaixa1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jBcaixa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBcaixa2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jBcaixa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcaixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcaixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcaixa4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("P-5");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setText("CIAXA 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcomumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcomumActionPerformed
        Senha senhas = new Senha("C", numero++);

        listaSenha.add(senhas);
        jTextField1.setText(String.valueOf(senhas.getTipo()) + " - " + String.valueOf(senhas.getNumero()));
    }//GEN-LAST:event_jBcomumActionPerformed

    private void jBrapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrapidoActionPerformed
        Senha senhas = new Senha("R", numero++);

        listaSenha.add(senhas);
        jTextField1.setText(String.valueOf(senhas.getTipo()) + " - " + String.valueOf(senhas.getNumero()));  // TODO add your handling code here:
    }//GEN-LAST:event_jBrapidoActionPerformed

    private void jBprioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprioritarioActionPerformed
        Senha senhas = new Senha("P", numero++);

        listaSenha.add(senhas);
        jTextField1.setText(String.valueOf(senhas.getTipo()) + " - " + String.valueOf(senhas.getNumero()));
    }//GEN-LAST:event_jBprioritarioActionPerformed

    
    
    private void jBcaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcaixa1ActionPerformed
        Iterator<Senha> itr = listaSenha.iterator();          // interface interator 
        
        /*
        
        tentei usar essa logica funciona porem depois que acha não da sequancia para 
        continuar buscando os demais, testei de varias formas possivel sem sucesso.
        se puderem me mandar uma resolução para esse problema seria muito importante .
        
        while (itr.hasNext()) {

            Senha pass = itr.next();
        
        if(pass.getTipo.equals("P"))

            jTextField1.setText(String.valueOf(pass.getTipo()) + " - " + String.valueOf(pass.getNumero()) + "  CAIXA  1");

            itr.remove();

            break;
        }

        
        */

        while (itr.hasNext()) {

            Senha pass = itr.next();

            jTextField1.setText(String.valueOf(pass.getTipo()) + " - " + String.valueOf(pass.getNumero()) + "  CAIXA  1");

            itr.remove();

            break;
        }


    }//GEN-LAST:event_jBcaixa1ActionPerformed


    private void jBcaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcaixa2ActionPerformed
        Iterator<Senha> itr = listaSenha.iterator();

        while (itr.hasNext()) {

            Senha pass = itr.next();

            jTextField1.setText(String.valueOf(pass.getTipo()) + " - " + String.valueOf(pass.getNumero()) + "  CAIXA  2");

            itr.remove();

            break;
        }


    }//GEN-LAST:event_jBcaixa2ActionPerformed

    private void jBcaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcaixa3ActionPerformed
     Iterator<Senha> itr = listaSenha.iterator();

        while (itr.hasNext()) {

            Senha pass = itr.next();

            jTextField1.setText(String.valueOf(pass.getTipo()) + " - " + String.valueOf(pass.getNumero()) + "  CAIXA  3");

            itr.remove();

            break;
        }

    }//GEN-LAST:event_jBcaixa3ActionPerformed

    private void jBcaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcaixa4ActionPerformed
        Iterator<Senha> itr = listaSenha.iterator();

        while (itr.hasNext()) {

            Senha pass = itr.next();

            jTextField1.setText(String.valueOf(pass.getTipo()) + " - " + String.valueOf(pass.getNumero()) + "  CAIXA  4");

            itr.remove();

            break;
        }

    }//GEN-LAST:event_jBcaixa4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(CaixaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaixaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaixaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcaixa1;
    private javax.swing.JButton jBcaixa2;
    private javax.swing.JButton jBcaixa3;
    private javax.swing.JButton jBcaixa4;
    private javax.swing.JButton jBcomum;
    private javax.swing.JButton jBprioritario;
    private javax.swing.JButton jBrapido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
