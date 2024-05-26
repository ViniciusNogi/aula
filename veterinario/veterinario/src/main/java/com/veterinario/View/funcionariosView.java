import java.util.Scanner;
//importa a classe Scanner para ler a entrada do usuário a partir do console

public class FuncionarioView { //declara a classe FuncionarioView
    
    private Scanner scanner = new Scanner(System.in);//cria uma instância de Scanner para ler a entrada do usuário

    public void exibirMenu() { //declara o método exibirMenu, responsável por mostrar o menu de gerenciamento de funcionários
        
        while (true) { //inicia um loop infinito para exibir continuamente o menu até que o usuário escolha sair
            
            //exibe as opções do menu no console
            System.out.println("\n--- Gerenciamento de Funcionários ---");
            System.out.println("1. Inserir Funcionário");
            System.out.println("2. Atualizar Funcionário");
            System.out.println("3. Excluir Funcionário");
            System.out.println("4. Voltar");

            int escolha = Integer.parseInt(scanner.nextLine()); //lê a escolha do usuário como uma linha de texto, converte para inteiro e armazena na variável escolha

            switch (escolha) { //avalia o valor de escolha e executa o bloco de código correspondente
                
                case 1:
                    inserirFuncionario(); //chama o método inserirFuncionario
                    break;
                case 2:
                    atualizarFuncionario(); // chama o método atualizarFuncionario
                    break;
                case 3:
                    excluirFuncionario();//chama o método excluirFuncionario
                    break;
                case 4: // sai do método exibirMenu
                    return;
                default:
                    System.out.println("Escolha inválida."); //imprime "Escolha inválida." se a entrada não corresponder a nenhuma opção
            }
        }
    }


    //método inserirFuncionario
    //imprime uma mensagem indicando a inserção de um novo funcionário. Aqui será implementada a lógica para inserir um funcionário
    private void inserirFuncionario() {
        System.out.println("Inserindo novo funcionário...");
        //lógica para inserir funcionário
    }




    //método atualizarFuncionario
    //imprime uma mensagem indicando a atualização de um funcionário. Aqui será implementada a lógica para atualizar um funcionário
    private void atualizarFuncionario() {
        System.out.println("Atualizando funcionário...");
        //lógica para atualizar funcionário
    }



    //método excluirFuncionario
    //imprime uma mensagem indicando a exclusão de um funcionário. Aqui será implementada a lógica para excluir um funcionário
    private void excluirFuncionario() {
        System.out.println("Excluindo funcionário...");
        //  lógica para excluir funcionário
    }
}


//Importação: Importa a classe Scanner para leitura de entrada do usuário.
//Classe: Declara a classe FuncionarioView.
//Variável de Instância: Cria um Scanner para ler entradas do usuário.
//Método exibirMenu: Exibe o menu de gerenciamento de funcionários e lida com as escolhas do usuário.
//Métodos Auxiliares: inserirFuncionario, atualizarFuncionario, e excluirFuncionario realizam as respectivas operações de gerenciamento de funcionários, mas ainda precisam ser implementados.