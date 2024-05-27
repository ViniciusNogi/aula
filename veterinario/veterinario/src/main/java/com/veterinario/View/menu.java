package com.clinica.view; //Este é o pacote ao qual a classe MainView pertence.

import java.util.Scanner; //Importa a classe Scanner para possibilitar a leitura de entrada do usuário a partir do console.

public class MainView { //Declaração da classe MainView.
    
    private Scanner scanner = new Scanner(System.in); //Declara e inicializa um objeto Scanner para capturar entrada do usuário a partir do console
    
    //Declara e inicializa objetos das classes AnimalView, DonoView, FuncionarioView, ConsultaView e ServicoView, que são responsáveis por gerenciar as diferentes partes da aplicação
    private AnimalView animalView = new AnimalView();
    private DonoView donoView = new DonoView();
    private FuncionarioView funcionarioView = new FuncionarioView();
    private ConsultaView consultaView = new ConsultaView();
    private ServicoView servicoView = new ServicoView();

    // Método para exibir o menu principal
    public void exibirMenuPrincipal() {
        while (true) { //Inicia um loop infinito para manter o menu principal visível até que o usuário decida sair.
            
            //Exibe as opções do menu principal para o usuário.
            System.out.println("\n--- Sistema de Clínica Veterinária ---");
            System.out.println("1. Gerenciamento de Animais");
            System.out.println("2. Gerenciamento de Donos");
            System.out.println("3. Gerenciamento de Funcionários");
            System.out.println("4. Gerenciamento de Consultas");
            System.out.println("5. Gerenciamento de Serviços");
            System.out.println("6. Sair");

            int escolha = Integer.parseInt(scanner.nextLine());//Captura a escolha do usuário a partir do console e converte para um número inteiro

            
            //Verifica a escolha do usuário e chama o método correspondente na classe apropriada para exibir o menu correspondente ou sair do sistema
            switch (escolha) {
                case 1:
                    animalView.exibirMenu();
                    break;
                case 2:
                    donoView.exibirMenu();
                    break;
                case 3:
                    funcionarioView.exibirMenu();
                    break;
                case 4:
                    consultaView.exibirMenu();
                    break;
                case 5:
                    servicoView.exibirMenu();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }
 
    //Método main responsável por iniciar a execução da aplicação, criando uma instância da classe MainView e chamando o método exibirMenuPrincipal() para iniciar o menu principal.
    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.exibirMenuPrincipal();
    }
}
