package com.veterinario.config;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
    private static final String url = "jdbc:postgresql://localhost:5432/veterinario";
    private static final String user = "postgres";
    private static final String password = "admin";

    public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(url, user, password);
    }

    public static void TBCliente (){
        try (Connection conexao = getConnection();
        Statement st = conexao.createStatement()){
            String sql = "CREATE TABLE IF NOT EXISTS cliente" +
                        "(id_cliente INT PRIMARY KEY," +
                        "nome VARCHAR (100) NOT NULL," +
                        "endereco VARCHAR (100) NOT NULL," +
                        "telefone INT NOT NULL," +
                        "email VARCHAR (50) NOT NULL," +
                        "cpf INT NOT NULL)";
            st.executeUpdate(sql);
            System.out.println("Tabela criada com sucesso!");            
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela Cliente " + e.getMessage());   
        }
    }


    public static void TBAnimal(){
        try(Connection conexao = getConnection();
        Statement st = conexao.createStatement()){
            String sql = "CREATE TABLE IF NOT EXISTS animal" +
                        "(id_animal INT PRIMARY KEY," +
                        "nome VARCHAR(100) NOT NULL," +
                        "raca VARCHAR(100) NOT NULL," +
                        "idade INT NOT NULL," +
                        "sexo VARCHAR(10) NOT NULL," +
                        "id_cliente INT," +
                        "CONSTRAINT fk_animalCliente FOREIGN KEY(id_cliente) REFERENCES cliente(id_cliente))";
            st.executeUpdate(sql);
            System.out.println("Tabela criada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela Animal: "+ e.getMessage());
        }
    }
}
