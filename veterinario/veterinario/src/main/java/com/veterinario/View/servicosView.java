package com.clinica.view;

import java.util.Scanner;
import com.clinica.model.entity.Servico;

public class ServicoView {
    private Scanner scanner = new Scanner(System.in);

    // Método para exibir o menu de gerenciamento de serviços
    public void exibirMenu() {
        while (true) {
            System.out.println("\n--- Gerenciamento de Serviços ---");
            System.out.println("1. Inserir Serviço");
            System.out.println("2. Atualizar Serviço");
            System.out.println("3. Excluir Serviço");
            System.out.println("4. Voltar");

            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    inserirServico();
                    break;
                case 2:
                    atualizarServico();
                    break;
                case 3:
                    excluirServico();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }

    // Método para inserir um novo serviço
    private void inserirServico() {
        System.out.println("Inserindo novo serviço...");
        // Implemente a lógica para inserir serviço
    }

    // Método para atualizar um serviço existente
    private void atualizarServico() {
        System.out.println("Atualizando serviço...");
        // Implemente a lógica para atualizar serviço
    }

    // Método para excluir um serviço
    private void excluirServico() {
        System.out.println("Excluindo serviço...");
        // Implemente a lógica para excluir serviço
    }
}
