/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoon3;

/**
 *
 * @author PICHAU
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PICHAU
 */
public class Conexao {
    
        private static final String url = "jdbc:mysql://javasql-bank.cfeacwo4mbj8.us-east-1.rds.amazonaws.com/banco";
        private static final String user = "user";
        private static final String password = "user";
        
        private static Connection conn;
    
    /**
     *
     * @return
     */
    public static Connection getConexao(){
                
                try {
                    if (conn == null)
                        {
                                conn = DriverManager.getConnection(url, user, password);
                                return conn;

                        }
                    else
                        {
                            return conn;
                        }

                    } 
                catch (SQLException ex) 
                    {
                        System.out.println("Erro" + ex);
                        return null;
                    }


            }

 
    
}