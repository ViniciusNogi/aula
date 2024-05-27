//Pacote e Importações:
package com.clinica.view;
import java.util.Scanner;
import com.clinica.model.entity.Consulta;

//Declara a classe ConsultaView
public class ConsultaView {
    private Scanner scanner = new Scanner(System.in);// ////Cria uma instância de Scanner para ler a entrada do usuário a partir do console.

    // Método para exibir o menu de gerenciamento de consultas
    public void exibirMenu() {
        
        while (true) { // //Entra em um loop infinito (while (true)) para continuar exibindo o menu até o usuário escolher a opção "Voltar"
            
            ////Exibe as opções do menu para inserir, atualizar, excluir ou voltar.
            System.out.println("\n--- Gerenciamento de Consultas ---");
            System.out.println("1. Inserir Consulta");
            System.out.println("2. Atualizar Consulta");
            System.out.println("3. Excluir Consulta");
            System.out.println("4. Voltar");

            int escolha = Integer.parseInt(scanner.nextLine()); ////Lê a escolha do usuário, converte para um inteiro e usa um switch para executar o método correspondente.

            //recebe a escolha do usuario e executa 
            switch (escolha) {
                case 1:
                    inserirConsulta();
                    break;
                case 2:
                    atualizarConsulta();
                    break;
                case 3:
                    excluirConsulta();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }

    // Método para inserir uma nova consulta
    private void inserirConsulta() {
        System.out.println("Inserindo nova consulta...");
        // Implemente a lógica para inserir consulta
    }

    // Método para atualizar uma consulta existente
    private void atualizarConsulta() {
        System.out.println("Atualizando consulta...");
        // Implemente a lógica para atualizar consulta
    }

    // Método para excluir uma consulta
    private void excluirConsulta() {
        System.out.println("Excluindo consulta...");
        // Implemente a lógica para excluir consulta
    }
}
