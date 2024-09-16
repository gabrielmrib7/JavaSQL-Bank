/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoon3;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author PICHAU
 */
public class Agencia {
    


    public static void main() {

 
    }


    
    public static ResultSet logar(int login, int senha)
    {
        String sql = "SELECT * from banco.`vw.contas_bancarias` WHERE numeroconta = ? AND senha = ?";
        PreparedStatement ps = null;
        try {
             ps = Conexao.getConexao().prepareStatement(sql);
             ps.setInt(1, login);
             ps.setInt(2, senha);
             ResultSet rs = ps.executeQuery();
             return rs;
        } catch (SQLException ex) {
            System.out.println("Erro" + ex);
            return null;
        }
    }
    
    public static boolean Depositar(double deposito, int nc, double saldo)
    {
        double valortotal;
        
        
         String sql = "UPDATE conta SET saldo = ? WHERE numeroc = ?";
        PreparedStatement ps = null;
        try {
             valortotal = saldo + deposito;
             ps = Conexao.getConexao().prepareStatement(sql);
             ps.setDouble(1, valortotal);
             ps.setInt(2, nc);
             ps.execute();
             ps.close();
             return true;
             
             
        } catch (SQLException ex) {
            System.out.println("Erro" + ex);
            return false;
            
        }
    }
    
    public static boolean Sacar(double saque, int nc, double saldo)
    {
        double valortotal;
        
        
         String sql = "UPDATE conta SET saldo = ? WHERE numeroc = ?";
        PreparedStatement ps = null;
        try {
             valortotal = saldo - saque;
             ps = Conexao.getConexao().prepareStatement(sql);
             ps.setDouble(1, valortotal);
             ps.setInt(2, nc);
             ps.execute();
             ps.close();
             return true;
             
             
        } catch (SQLException ex) {
            System.out.println("Erro" + ex);
            return false;
            
        }
    }
    
    
    public static ResultSet getInfo(int numeroconta)
    {
        String sql = "SELECT * FROM banco.`vw.contas_bancarias` where numeroconta = ?";
        PreparedStatement ps = null;
        try {
             ps = Conexao.getConexao().prepareStatement(sql);
             ps.setInt(1, numeroconta);
             ResultSet rs = ps.executeQuery();
             return rs;
        } catch (SQLException ex) {
            System.out.println("Erro" + ex);
            return null;
        }
    
    }
    
    
    
    public static void criarConta(int p, double s) {

            
            String sql = "INSERT INTO conta (senha, saldo) values (?, ?)";
            
            PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            
           
            ps.setInt(1, p);
            ps.setDouble(2, s);
            
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Erro" + ex);
        }
            
            System.out.println("Conta Adicionada");
            
            
            
    }
    public static void criarCliente(String n, String c) {

        
        String sql = "INSERT INTO cliente (nome, cpf) values (?, ?)";
        
            
            PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
           
            ps.setString(1, n);
            ps.setString(2, c);
      
            
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir cliente" + ex);
        }
        
    }
        
   
}
