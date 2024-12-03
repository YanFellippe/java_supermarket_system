/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadastroclientefuncionariodb;

/**
 *
 * @author Yan53961666
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadPessoa = new javax.swing.JMenuItem();
        cadCliente = new javax.swing.JMenuItem();
        cadFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadPessoas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        cadCatAlter = new javax.swing.JMenuItem();
        cadVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastrar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        cadPessoa.setText("Cadastrar Pessoa");
        cadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPessoaActionPerformed(evt);
            }
        });
        jMenu1.add(cadPessoa);

        cadCliente.setText("Cadastrar Cliente");
        cadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadClienteMouseClicked(evt);
            }
        });
        cadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadClienteActionPerformed(evt);
            }
        });
        jMenu1.add(cadCliente);

        cadFuncionario.setText("Cadastrar Atendente");
        cadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(cadFuncionario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Controle de Acesso");

        cadPessoas.setText("Cadastrar Pessoa");
        cadPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPessoasActionPerformed(evt);
            }
        });
        jMenu2.add(cadPessoas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Suprimentos");

        cadCatAlter.setText("Cadastrar Categoria/Alterar");
        cadCatAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCatAlterActionPerformed(evt);
            }
        });
        jMenu3.add(cadCatAlter);

        cadVenda.setText("Cadastro Venda");
        cadVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadVendaActionPerformed(evt);
            }
        });
        jMenu3.add(cadVenda);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFuncionarioActionPerformed
        CadFuncionario cf = new CadFuncionario();
        painel.add(cf);
        cf.setVisible(true);
    }//GEN-LAST:event_cadFuncionarioActionPerformed

    private void cadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadClienteActionPerformed
        CadClientes cc = new  CadClientes();
        painel.add(cc);
        cc.setVisible(true);
    }//GEN-LAST:event_cadClienteActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    private void cadClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadClienteMouseClicked
        
    }//GEN-LAST:event_cadClienteMouseClicked

    private void cadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPessoaActionPerformed
        CadPessoa cp = new CadPessoa();
         painel.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_cadPessoaActionPerformed

    private void cadPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPessoasActionPerformed
        CadastroPessoasForm cpf = new CadastroPessoasForm();
        painel.add(cpf);
        cpf.setVisible(true);
    }//GEN-LAST:event_cadPessoasActionPerformed

    private void cadCatAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCatAlterActionPerformed
        CadCatAlter cca = new CadCatAlter();
        painel.add(cca);
        cca.setVisible(true);
    }//GEN-LAST:event_cadCatAlterActionPerformed

    private void cadVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadVendaActionPerformed
        CadVenda cv = new CadVenda();
        painel.add(cv);
        cv.setVisible(true);
    }//GEN-LAST:event_cadVendaActionPerformed

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
    private javax.swing.JMenuItem cadCatAlter;
    private javax.swing.JMenuItem cadCliente;
    private javax.swing.JMenuItem cadFuncionario;
    private javax.swing.JMenuItem cadPessoa;
    private javax.swing.JMenuItem cadPessoas;
    private javax.swing.JMenuItem cadVenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
