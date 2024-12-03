/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cadastroclientefuncionariodb;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadCliente extends javax.swing.JInternalFrame {

    String situação;
    public CadCliente() {
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
        telefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        situacaoBox = new javax.swing.JComboBox<>();
        btnCadCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        idPessoa = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CADASTRO DO CLIENTE");

        jLabel1.setText("CADASTRO DO CLIENTE");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Saldo:");

        jLabel4.setText("Email:");

        jLabel5.setText("Situação:");

        situacaoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        situacaoBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                situacaoBoxItemStateChanged(evt);
            }
        });

        btnCadCliente.setText("CADASTRAR");
        btnCadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadClienteMouseClicked(evt);
            }
        });
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_cliente", "Telefone", "Saldo", "Email", "Situação", "id_pessoa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel6.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(telefone)
                            .addComponent(email)
                            .addComponent(situacaoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idPessoa))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 492, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(454, 454, 454))))
            .addGroup(layout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(btnCadCliente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(situacaoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnCadCliente)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnCadClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadClienteMouseClicked
        try{
            Connection con = BancoClass.conexaoBanco();
            String sql = "INSERT INTO cliente(telefone, saldo, email, situacao, id_pessoa) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, telefone.getText());
            stmt.setString(2, saldo.getText());
            stmt.setString(3, email.getText());
            stmt.setString(4, situação);
            stmt.setString(5, idPessoa.getText());
            stmt.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            telefone.setText(null);
            saldo.setText(null);
            email.setText(null);
            situacaoBox.setSelectedItem(" ");
            idPessoa.setText(null);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente!");
        }
        try {
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM cliente ORDER BY id_cliente DESC";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
            modeloTabela.setNumRows(0);

            while(rs.next()){
                Object [] dados = {
                    rs.getString("id_cliente"),
                    rs.getString("telefone"),
                    rs.getString("saldo"),
                    rs.getString("email"),
                    rs.getString("situacao"),
                    rs.getString("id_pessoa")};
                modeloTabela.addRow(dados);
            }
            stmt.close();
            rs.close();
            con.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado!");
        }
    }//GEN-LAST:event_btnCadClienteMouseClicked

    private void situacaoBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_situacaoBoxItemStateChanged
        if(situacaoBox.getSelectedItem().equals("Ativo")){
            situação = "A";
        } else{
            situação = "B";
        }
    }//GEN-LAST:event_situacaoBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField saldo;
    private javax.swing.JComboBox<String> situacaoBox;
    private javax.swing.JTable table;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
