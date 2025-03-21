/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class ProdutosDAO {
    
    PreparedStatement st;
    ResultSet rs;
    private Conexao conexao;
    private Connection con;
    
   public ProdutosDAO() {
        this.conexao = new Conexao();
        this.con = (Connection) this.conexao.conectar();
    }
    
    public int cadastrarProduto (ProdutosDTO p) {
            int status;
            try {  
                
            st = con.prepareStatement("INSERT INTO produtos VALUES(null,?,?,?)");
            
            st.setString(1, p.getNome());
            st.setInt(2, p.getValor());
            st.setString(3, p.getStatus());
            
            status = st.executeUpdate();
            return status;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        ArrayList<ProdutosDTO> listagem = new ArrayList<>();
          
       
        return listagem;
    }
}

