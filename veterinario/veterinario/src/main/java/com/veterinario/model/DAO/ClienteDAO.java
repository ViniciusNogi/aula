package com.veterinario.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.veterinario.config.DBConfig;
import com.veterinario.model.entity.Cliente;

public class ClienteDAO implements IDAO<Cliente>{
    
    @Override
    public void cadastrar(Cliente entidade) {
       try (Connection conexao = DBConfig.getConnection();
            PreparedStatement ps = conexao.prepareStatement(
            "INSERT INTO cliente(id_cliente, nome, endereco, telefone, email, cpf) values" +
            "(?, ?, ?, ?, ?, ?)")){
            ps.setInt(1, entidade.getId());
            ps.setString(2, entidade.getNome());
            ps.setString(3, entidade.getEndereco());
            ps.setInt(4, entidade.getTelefone());
            ps.setString(5, entidade.getEmail());
            ps.setInt(6, entidade.getCpf());
       } catch (SQLException e) {
            System.err.println("Erro ao cadastrar cliente: "+ e.getMessage());
       }
    }

    @Override
    public void atualizar(Cliente entidade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void excluir(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public Cliente buscar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> listaCliente =new ArrayList<>();
        try (Connection conexao = DBConfig.getConnection();
            PreparedStatement ps = conexao.prepareStatement("SELECT * FROM Animal");
            ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            Cliente cliente = new Cliente(0, null, null, 0, null, 0);
            cliente.setId(rs.getInt("id_animal"));
            cliente.setNome(rs.getString("nome"));
            cliente.setEndereco(rs.getString("Endereco"));
            cliente.setTelefone(rs.getInt("telefone"));
            cliente.setEmail(rs.getString("email"));
            cliente.setCpf(rs.getInt("cpf"));
            listaCliente.add(cliente);
        }
        } catch (SQLException e) {
            System.err.println("Erro ao listar Cliente: "+ e.getMessage());
        }
        return listaCliente;
    }

}

