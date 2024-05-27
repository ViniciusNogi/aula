//Este é o pacote ao qual a classe DonoView pertence
package com.clinica.view;

//mportações necessárias. Scanner é utilizado para capturar a entrada do usuário, enquanto Dono é a entidade que representa um dono de animal na aplicação.
import java.util.Scanner;
import com.clinica.model.entity.Dono;

//Declaração da classe DonoView.
public class DonoView {
    private Scanner scanner = new Scanner(System.in); //Declaração e inicialização de um objeto Scanner para capturar entrada do usuário a partir do console.

    // Método para exibir o menu de gerenciamento de donos
    public void exibirMenu() { //Declaração do método exibirMenu(), responsável por mostrar o menu de opções para o gerenciamento de donos.
        while (true) { //Início de um loop infinito para manter o menu visível até que o usuário decida sair.
            
            //Exibe as opções do menu para o usuário.
            System.out.println("\n--- Gerenciamento de Donos ---");
            System.out.println("1. Inserir Dono");
            System.out.println("2. Atualizar Dono");
            System.out.println("3. Excluir Dono");
            System.out.println("4. Voltar");

            //Captura a escolha do usuário a partir do console e converte para um número inteiro.
            int escolha = Integer.parseInt(scanner.nextLine());

            //Verifica a escolha do usuário e chama o método correspondente para realizar a ação desejada.
            switch (escolha) {
                case 1:
                    inserirDono();
                    break;
                case 2:
                    atualizarDono();
                    break;
                case 3:
                    excluirDono();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }


    //Declaração do método inserirDono(), responsável por inserir um novo dono na aplicação.
    // Método para inserir um novo dono
    private void inserirDono() {
        System.out.println("Inserindo novo dono..."); //Exibe uma mensagem para indicar que um novo dono está sendo inserido.
        // Implemente a lógica para inserir dono
    }

    // Método para atualizar um dono existente
    private void atualizarDono() {
        System.out.println("Atualizando dono..."); //Exibe uma mensagem para indicar que um dono está sendo atualizado
        // Implemente a lógica para atualizar dono
    }

    // Método para excluir um dono
    private void excluirDono() {
        System.out.println("Excluindo dono...");//Exibe uma mensagem para indicar que um dono está sendo excluído
        // Implemente a lógica para excluir dono
    }
}
