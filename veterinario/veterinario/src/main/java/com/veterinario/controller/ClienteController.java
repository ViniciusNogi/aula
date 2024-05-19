package com.veterinario.controller;

import com.veterinario.model.DAO.IDAO;
import com.veterinario.model.entity.Cliente;

public class ClienteController {

    private final IDAO<Cliente> clienteDAO;

    public ClienteController(IDAO<Cliente> clienteDAO){
        this.clienteDAO = clienteDAO;
    }

    public String cadastrar(Cliente cliente){
        clienteDAO.cadastrar(cliente);
        return "Cliente cadastrado";
    }

}
