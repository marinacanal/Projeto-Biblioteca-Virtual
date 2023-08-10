/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adris
 */
public class Usuario {

    private int id;
    private String CPF;
    private String Nome;
    private String Email;
    private String Telefone;
    private String Senha;
    private String DataDeNascimento;

    public Usuario() {
    }

    public Usuario(String CPF, String Nome, String Email, String Telefone, String Senha, String DataDeNascimento) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Email = Email;
        this.Telefone = Telefone;
        this.Senha = Senha;
        this.DataDeNascimento = DataDeNascimento;
        
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
