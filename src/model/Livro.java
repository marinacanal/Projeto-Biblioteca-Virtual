/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adris
 */
public class Livro {
    private String Titulo;
    private String Autor;
    private String NumeroPaginas;
    private String Quantidade;
    private String Categoria;
    private String imagem;
    private int cod_livro;
    
    public Livro(){
        
    }

    
     public Livro(String Titulo,String Autor, String NumeroPaginas,String Quantidade, String Categoria){
        
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
        this.Quantidade = Quantidade;
        this.Categoria = Categoria;
    }
    
    
    public int getCod_livro() {
        return cod_livro;
    }

    public void setCod_livro(int cod_livro) {
        this.cod_livro = cod_livro;
    }

    
    
    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(String NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
}
