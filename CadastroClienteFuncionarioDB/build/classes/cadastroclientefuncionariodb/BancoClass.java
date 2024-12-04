/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclientefuncionariodb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class BancoClass {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
      private static final String URL = "jdbc:mysql://localhost:3307/sistema_venda";
      private static final String USER = "root";
      private static final String PASS = "senac";
   
   
    public static Connection conexaoBanco() throws SQLException {
        try {
             Class.forName(DRIVER);
             return DriverManager.getConnection(URL,USER, PASS);
         } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Erro no driver",ex);
         } catch (SQLException e){
             throw new RuntimeException("Erro no Banco de Dados BancoClass",e);
         }
    }
    public static void main(String [] args) throws SQLException{
     BancoClass.conexaoBanco();
    }
}