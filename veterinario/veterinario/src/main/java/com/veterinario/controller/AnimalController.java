package com.veterinario.controller;

import com.veterinario.model.DAO.IDAO;
import com.veterinario.model.entity.Animal;

public class AnimalController {

    private final IDAO<Animal> animalDAO;

    public AnimalController(IDAO <Animal> animalDAO){
        this.animalDAO = animalDAO;
    }

    public String cadastrar(Animal animal){
        animalDAO.cadastrar(animal);
        return "Animal cadastrado!";
    }
}
