/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cadastroclientefuncionariodb;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class CadastroPessoasForm extends javax.swing.JInternalFrame {

    String situacao;
    public CadastroPessoasForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        confirmSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boxSituacao = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Usuário:");

        jLabel2.setText("Senha:");

        jLabel3.setText("Confirmar Senha:");

        btnCadastrar.setText("CADASTRAR USUARIO");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        jLabel4.setText("Situação:");

        boxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ativo", "Bloqueado" }));
        boxSituacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxSituacaoItemStateChanged(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuário", "Senha", "Situação"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario)
                            .addComponent(senha)
                            .addComponent(confirmSenha)
                            .addComponent(boxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(242, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(boxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnCadastrar)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked

        if(senha.getText().equals(confirmSenha.getText())){
            try {
                Connection con = BancoClass.conexaoBanco();
                String sql = "INSERT INTO login (usuario, senha, situacao) VALUES (?, UPPER(MD5(?)), 'A');";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, usuario.getText());
                stmt.setString(2, senha.getText());
                stmt.execute();

                stmt.close();
                con.close();
                
                usuario.setText(null);
                senha.setText(null);
                confirmSenha.setText(null);
                boxSituacao.setSelectedItem(" ");

            } catch (SQLException ex) {
                Logger.getLogger(CadastroForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Senhas diferentes!");
        }
         try {
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM login ORDER BY id_login DESC";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
                DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
                modeloTabela.setNumRows(0);
                
                while(rs.next()){
                    Object [] dados = {
                        rs.getString("id_login"), 
                        rs.getString("usuario"), 
                        rs.getString("senha"), 
                        rs.getString("situacao")};
                    modeloTabela.addRow(dados);
                }
               stmt.close();
               rs.close();
               con.close();
        } catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Pessoa não cadastrada!");
        }
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void boxSituacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxSituacaoItemStateChanged
        if(boxSituacao.getSelectedItem().equals("Ativo")){
           situacao = "A";
        } else{
           situacao = "B";
       }
    }//GEN-LAST:event_boxSituacaoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSituacao;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField confirmSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField senha;
    private javax.swing.JTable table;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
