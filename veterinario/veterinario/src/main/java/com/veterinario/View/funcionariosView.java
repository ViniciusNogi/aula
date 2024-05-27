package com.clinica.view;

//Aqui, estamos importando duas classes para serem usadas no código. Scanner é uma classe Java que permite a leitura de entrada do usuário, enquanto Funcionario é uma classe específica do projeto que  representa um funcionário.
import java.util.Scanner;
import com.clinica.model.entity.Funcionario;

public class FuncionarioView {
    private Scanner scanner = new Scanner(System.in);

    // Método para exibir o menu de gerenciamento de funcionários
    public void exibirMenu() {
        while (true) { ////Início de um loop infinito para manter o menu visível até que o usuário decida sair.
            
            ////Exibe as opções do menu para o usuário.
            System.out.println("\n--- Gerenciamento de Funcionários ---");
            System.out.println("1. Inserir Funcionário");
            System.out.println("2. Atualizar Funcionário");
            System.out.println("3. Excluir Funcionário");
            System.out.println("4. Voltar");

            int escolha = Integer.parseInt(scanner.nextLine()); ////Captura a escolha do usuário a partir do console e converte para um número inteiro.

            switch (escolha) {////Verifica a escolha do usuário e chama o método correspondente para realizar a ação desejada.
                case 1:
                    inserirFuncionario();
                    break;
                case 2:
                    atualizarFuncionario();
                    break;
                case 3:
                    excluirFuncionario();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }

    // Método para inserir um novo funcionário
    private void inserirFuncionario() {
        System.out.println("Inserindo novo funcionário...");
        // lógica para inserir funcionário
    }

    // Método para atualizar um funcionário existente
    private void atualizarFuncionario() {
        System.out.println("Atualizando funcionário...");
        // lógica para atualizar funcionário
    }

    // Método para excluir um funcionário
    private void excluirFuncionario() {
        System.out.println("Excluindo funcionário...");
        //  lógica para excluir funcionário
    }
}
