/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Usuario;

/**
 *
 * @author beatriz.miranda
 */
public class ConexaoBanco {
     Usuario user;
    /**
     * @param args the command line arguments
     */
    
    
    //Conexão com o Banco de Dados
    private final String url = "jdbc:postgresql://localhost/biblioteca";
    private final String us = "postgres";
    private final String password = "senac23";
    private int chave;
    
    private Connection conn;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet rs;

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection open() {
        conn = null;
        try {
            conn = DriverManager.getConnection(url, us, password);
            System.out.println("Parabéns conectado com sucesso");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
    
    public boolean loginUsuario(String email, String senha)throws SQLException {
         open();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT *from Usuario where email =" + "\'" + email + "\'" + "and senha = " + "\'" +senha + "\'");
         
            return rs.next();
        
        
    }
    
        public void close() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserir(String tabela, String valores) {
        try {
    // Abrindo a conexão com o banco
            open();
    // Instanciando o objeto statement (stmt)
            stmt = conn.createStatement();
    // Executando uma instrução SQL.
            stmt.executeUpdate(
                    "INSERT INTO "+ tabela+" VALUES "+valores+"");
    // Fechando a conexão com o banco
            close();
        } catch (SQLException e) {
    // Fechando a conexão com o banco
            close();
            e.printStackTrace();
        }
    }
    public int inserir2(String tabela, String valores) {
        try {
            ResultSet result;
            // Abrindo a conexão com o banco
            open();
            // Instanciando o objeto statement (stmt)
            pstmt = conn.prepareStatement(
                    "INSERT INTO " + tabela + " VALUES " + valores + "", Statement.RETURN_GENERATED_KEYS);
            // Fechando a conexão com o banco
            pstmt.execute();
            result = pstmt.getGeneratedKeys();
            if (result.next() && result != null) {
                //Coluna que representa o campo do time serial começando em 1;
                chave = result.getInt(1);
            } else {
                chave = -1;
            }
            //chave = stmt.getGeneratedKeys().next().getInt(0);
            close();
        } catch (SQLException e) {
            // Fechando a conexão com o banco
            close();
            e.printStackTrace();
        }
        return chave;
    }

    public void alterar(String tabela, String valores) {
        try {
    // Abrindo a conexão com o banco
            open();
    // Instanciando o objeto preparedStatement (pstmt)
            pstmt = conn.prepareStatement(
                    "UPDATE "+ tabela+" SET "+valores+"");
    // Setando o valor ao parâmetro
            //pstmt.setString(1, "MARIA");
            //pstmt.setInt(2, 1);            
    // Fechando a conexão com o banco
            pstmt.execute();
            close();
        } catch (SQLException e) {
    // Fechando a conexão com o banco
            close();
            e.printStackTrace();
        }
    }

    public void excluir(String tabela, String condicao) {
        try {
    // Abrindo a conexão com o banco
            open();
    // Instanciando o objeto preparedStatement (pstmt)
            pstmt = conn.prepareStatement(
                    "DELETE FROM "+tabela+ " " +condicao);   
            pstmt.execute();
    // Fechando a conexão com o banco
            close();
        } catch (SQLException e) {
    // Fechando a conexão com o banco
            close();
            e.printStackTrace();
        }
    }    
    
    public ResultSet buscarDados(String tabela) {
        try {
            open();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+tabela+"");
            return rs;
        } catch (SQLException e) {
            close();
            e.printStackTrace();
        }
        return null;
    }
    
     public ResultSet buscarDadosUser(String email){
        try{
            open();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT *from Usuario where email =" + "\'" + email + "\'");
            return rs;
        }
        catch(SQLException e){
            close();
            e.printStackTrace();
            
            
        }
        return null;
    }
    
    public ResultSet buscarLivro(int idusuario) {
        try{
            open();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT *from livro where usuario_idusuario =" + idusuario );
            return rs;
        }
        catch(SQLException e){
            close();
            e.printStackTrace();
            
        }
        return null;
    }
    
    public ResultSet buscarUs(int idusuario) {
        try{
            open();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT *from usuario where idusuario =" + idusuario );
            return rs;
        }
        catch(SQLException e){
            close();
            e.printStackTrace();
            
        }
        return null;
    }
    
    public ResultSet buscarId() {
        try{
            open();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(" SELECT nome_usuario, nome_livro, autor, nmr_pg, quant_livro, imagem, categoria FROM livro JOIN usuario "
                    + "ON usuario_idusuario = idusuario WHERE idusuario = usuario_idusuario");
            return rs;
        }
        catch(SQLException e){
            close();
            e.printStackTrace();
            
        }
        return null;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        ConexaoBanco app = new ConexaoBanco();
        app.open();
    }
    
}
