package com.veterinario.model.entity;

public class Cliente extends AbstractEntity {

    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private int cpf;    
    

    public Cliente(String nome,String endereco,int telefone, String email, int cpf ){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        
        

    }

    public Cliente(int idCliente,String nome,String endereco,int telefone, String email, int cpf ){
        super.setId(idCliente);
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

}