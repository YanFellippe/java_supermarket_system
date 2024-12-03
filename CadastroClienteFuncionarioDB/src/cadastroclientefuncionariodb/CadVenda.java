/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cadastroclientefuncionariodb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class CadVenda extends javax.swing.JInternalFrame {

    String produtos;
    String funcionarios;
    String clientes;
    String situacaoVenda;
    String id_vendas;
    String totalVendas;
    String calcelado = "N";
    public CadVenda() {
        initComponents();
        try{
        Connection con = BancoClass.conexaoBanco();
        String sql = "SELECT * FROM venda;";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            situacaoVenda = rs.getString("situacao");
            id_vendas = rs.getString("id_venda");
            totalVendas = rs.getString( "valor_total");
        }
        
        if(situacaoVenda.equals("P")){
            String sql2 = "SELECT * FROM tb_item_venda WHERE id_venda = ?;";
            PreparedStatement stmt2 = con.prepareStatement(sql2);
            stmt2.setString(1, id_vendas);
            ResultSet rs2 = stmt2.executeQuery();
            
            DefaultTableModel tabelaModelo = (DefaultTableModel) table.getModel();
            tabelaModelo.setNumRows(0);
            while(rs2.next()){
                Object[] dados = {rs2.getString("codigo"), rs2.getString("produto"), rs2.getString("preco")
                        ,rs2.getString("quantidade"), rs2.getString("total")
                        ,rs2.getString("atendente"), rs2.getString("cliente"), rs2.getString("cancelado")};
                tabelaModelo.addRow(dados);
            }
            stmt2.close();
            rs2.close();
            stmt.close();
            rs.close();
            con.close();
        }
        } catch(SQLException ex) {
            Logger.getLogger(CadVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cupom = new javax.swing.JTextField();
        totVenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id_venda = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        qtd = new javax.swing.JTextField();
        produtoBox = new javax.swing.JComboBox<>();
        funcionarioBox = new javax.swing.JComboBox<>();
        clienteBox = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Venda");

        jLabel1.setText("CUPOM:");

        jLabel2.setText("TOTAL VENDA:");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Preço", "Quantidade", "Total", "Funcionário", "Cliente", "Cancelado"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel3.setText("ID");

        jLabel4.setText("Produto");

        jLabel5.setText("Preço");

        jLabel6.setText("Quantidade");

        jLabel7.setText("Funcionário");

        jLabel8.setText("Nome Cliente");

        produtoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Alimentos", "Sucos", "Refrigerantes", "Itens de Cozinha" }));
        produtoBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                produtoBoxItemStateChanged(evt);
            }
        });

        funcionarioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "@Bárbara", "@Elaine", "@Jubileu", "@Oreia Seca" }));
        funcionarioBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                funcionarioBoxItemStateChanged(evt);
            }
        });

        clienteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Douglas", "Rafael", "Ruan", "Talisson", " " }));
        clienteBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clienteBoxItemStateChanged(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        btnFinalizar.setText("Finalizar");

        btnCancelarVenda.setText("Cancelar Venda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(totVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cupom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(produtoBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(qtd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_venda)
                                    .addComponent(funcionarioBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clienteBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(produtoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(funcionarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(clienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinalizar)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cupom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarVenda))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        try {
            Connection con = BancoClass.conexaoBanco();
            String sql = "INSERT INTO tb_item_venda(produto, preco, quantidade, total, atendente, cliente, cancelado) VALUES (?,?,?,?,?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, produtos);
            stmt.setString(2, preco.getText());
            stmt.setString(3, qtd.getText());
            stmt.setString(4, preco.getText());
            stmt.setString(5, funcionarios);
            stmt.setString(6, clientes);
            stmt.setString(7, calcelado);
            
            String sql2 = "SELECT * FROM tb_item_venda WHERE id_venda = ?;";
            PreparedStatement stmt2 = con.prepareStatement(sql2);
            stmt2.setString(1, id_vendas);
            ResultSet rs2 = stmt2.executeQuery();
            
            DefaultTableModel tabelaModelo = (DefaultTableModel) table.getModel();
            tabelaModelo.setNumRows(0);
            while(rs2.next()){
                Object[] dados = {rs2.getString("codigo"), rs2.getString("produto"), rs2.getString("preco")
                        ,rs2.getString("quantidade"), rs2.getString("total")
                        ,rs2.getString("atendente"), rs2.getString("cliente"), rs2.getString("cancelado")};
                tabelaModelo.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void produtoBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_produtoBoxItemStateChanged
        if(produtoBox.getSelectedItem().equals("Alimentos")){
            produtos = "Alimentos";
        } else if(produtoBox.getSelectedItem().equals("Refrigerantes")){
            produtos = "Refrigerantes";
        } else if(produtoBox.getSelectedItem().equals("Sucos")){
            produtos = "Sucos";
        } else if(produtoBox.getSelectedItem().equals("Itens de Cozinha")){
            produtos = "Itens de Cozinha";
        } else {
            produtos = " ";
        }
    }//GEN-LAST:event_produtoBoxItemStateChanged

    private void funcionarioBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_funcionarioBoxItemStateChanged
        if(funcionarioBox.getSelectedItem().equals("@Bárbara")){
            funcionarios = "@Bárbara";
        } else if(funcionarioBox.getSelectedItem().equals("@Elaine")){
            funcionarios = "@Elaine";
        } else if(funcionarioBox.getSelectedItem().equals("@Jubileu")){
            funcionarios = "@Jubileu";
        } else if(funcionarioBox.getSelectedItem().equals("@Oreia Seca")){
            funcionarios = "@Oreia Seca";
        } else {
            funcionarios = " ";
        }
    }//GEN-LAST:event_funcionarioBoxItemStateChanged

    private void clienteBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clienteBoxItemStateChanged
        if(clienteBox.getSelectedItem().equals("Douglas")){
            clientes = "Douglas";
        } else if(clienteBox.getSelectedItem().equals("Raphael")){
            clientes = "Raphel";
        } else if(clienteBox.getSelectedItem().equals("Ruan")){
            clientes = "Ruan";
        } else if(clienteBox.getSelectedItem().equals("Talisson")){
            clientes = "Talisson";
        } else {
            clientes = " ";
        }
    }//GEN-LAST:event_clienteBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox<String> clienteBox;
    private javax.swing.JTextField cupom;
    private javax.swing.JComboBox<String> funcionarioBox;
    private javax.swing.JTextField id_venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField preco;
    private javax.swing.JComboBox<String> produtoBox;
    private javax.swing.JTextField qtd;
    private javax.swing.JTable table;
    private javax.swing.JTextField totVenda;
    // End of variables declaration//GEN-END:variables
}
