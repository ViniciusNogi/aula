import java.util.Scanner;
//importa a classe Scanner: necessária para ler a entrada do usuário a partir do console



public class ServicoView { //declara a classe ServicoView: A classe responsável pela interface de gerenciamento de serviços.
    private Scanner scanner = new Scanner(System.in); //cria um objeto Scanner: Permite a leitura de entradas do usuário pelo console

    public void exibirMenu() { //declara o método exibirMenu: Exibe o menu de gerenciamento de serviços e lida com as escolhas do usuário
        while (true) {//inicia um loop infinito: Mantém o menu exibido até o usuário escolher sair
            
            //exibe as opções do menu: Mostra as ações disponíveis para gerenciamento de serviços
            System.out.println("\n--- Gerenciamento de Serviços ---");
            System.out.println("1. Inserir Serviço");
            System.out.println("2. Atualizar Serviço");
            System.out.println("3. Excluir Serviço");
            System.out.println("4. Voltar");


            
            int escolha = Integer.parseInt(scanner.nextLine()); //lê a escolha do usuário: Converte a entrada do usuário de uma string para um inteiro e a armazena em escolha



            switch (escolha) { //avalia a escolha do usuário: Executa o bloco de código correspondente à escolha
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
                    return; //sai do método exibirMenu, interrompendo o loop
                default:
                    System.out.println("Escolha inválida."); //informa que a escolha é inválida
            }
        }
    }


    //declara o método inserirServico: Exibe uma mensagem e representa onde a lógica de inserção de serviço deve ser implementada
    private void inserirServico() {
        System.out.println("Inserindo novo serviço...");
        // lógica para inserir serviço
    }




    //declara o método atualizarServico: exibe uma mensagem e representa onde a lógica de atualização de serviço deve ser implementada
    private void atualizarServico() {
        System.out.println("Atualizando serviço...");
        // lógica para atualizar serviço
    }



    //declara o método excluirServico: Exibe uma mensagem e representa onde a lógica de exclusão de serviço deve ser implementada
    private void excluirServico() {
        System.out.println("Excluindo serviço...");
        //lógica para excluir serviço
    }
}


//importação: importa Scanner para leitura do console
//classe: declara a classe ServicoView
//variável de instância: cria um Scanner para ler a entrada do usuário
//método exibirMenu: exibe o menu de gerenciamento de serviços e lida com as escolhas do usuário
//métodos auxiliares: inserirServico, atualizarServico, e excluirServico são responsáveis pelas respectivas operações, mas ainda precisam ser implementados