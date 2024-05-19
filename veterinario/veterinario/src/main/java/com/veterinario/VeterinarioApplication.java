package com.veterinario;

import java.sql.SQLException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.veterinario.config.DBConfig;
import com.veterinario.controller.AnimalController;
import com.veterinario.controller.ClienteController;
import com.veterinario.model.DAO.AnimalDAO;
import com.veterinario.model.DAO.ClienteDAO;
import com.veterinario.model.entity.Animal;
import com.veterinario.model.entity.Cliente;

@SpringBootApplication
public class VeterinarioApplication implements CommandLineRunner{

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(VeterinarioApplication.class, args);

		
	}

	@Override
	public void run(String... args) throws Exception {
		
		DBConfig.getConnection();
		DBConfig.TBCliente();
		DBConfig.TBAnimal();

		//Animal animal = new Animal("Dog", "ET", 132, "indefinido");
		Animal animal = new Animal(1, "Dog", "ET", 132, "indefinido", 1);
		AnimalDAO animalDAO = new AnimalDAO();	
		AnimalController ac = new AnimalController(animalDAO);
		String mensagem = ac.cadastrar(animal);
		System.out.println(mensagem);

		//Cliente cliente = new Cliente("Bob", "Rua: na ponte que partiu", 12341234, "bobmarley@gmail.com", 1234567891);
		//Cliente cliente = new Cliente(1, "Bob", "rua sei la", 12341234, mensagem, 1231231231);
		//ClienteDAO clienteDAO = new ClienteDAO();
		//ClienteController cc = new ClienteController(clienteDAO);
		//String mensagem1 = cc.cadastrar(cliente);
		//System.out.println(mensagem1);

	}

}
