package com.veterinario.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.veterinario.config.DBConfig;
import com.veterinario.model.entity.Animal;

public class AnimalDAO implements IDAO<Animal> {

    @Override
    public void cadastrar(Animal entidade) {
       try (Connection conexao = DBConfig.getConnection();
            PreparedStatement ps = conexao.prepareStatement(
            "INSERT INTO animal(id_animal, nome, raca, idade, sexo, id_cliente) values" +
            "(?, ?, ?, ?, ?, ?)")){
            ps.setInt(1, entidade.getId());
            ps.setString(2, entidade.getNome());
            ps.setString(3, entidade.getRaca());
            ps.setInt(4, entidade.getIdade());
            ps.setString(5, entidade.getSexo());
            ps.setInt(6, entidade.getId());
       } catch (SQLException e) {
            System.err.println("Erro ao cadastrar animal: "+ e.getMessage());
       }
    }

    @Override
    public void atualizar(Animal entidade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void excluir(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public Animal buscar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public List<Animal> listar() {
        List<Animal> listaAnimal =new ArrayList<>();
        try (Connection conexao = DBConfig.getConnection();
            PreparedStatement ps = conexao.prepareStatement("SELECT * FROM Animal");
            ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            Animal animal = new Animal(0, null, null, 0, null, 0);
            animal.setId(rs.getInt("id_animal"));
            animal.setNome(rs.getString("nome"));
            animal.setRaca(rs.getString("raca"));
            animal.setIdade(rs.getInt("idade"));
            animal.setSexo(rs.getString("sexo"));
            animal.setId(rs.getInt("id_cliente"));
            listaAnimal.add(animal);
        }
        } catch (SQLException e) {
            System.err.println("Erro ao listar animais: "+ e.getMessage());
        }
        return listaAnimal;
    }

}
