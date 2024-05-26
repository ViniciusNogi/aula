import java.util.Scanner;
//importa a classe Scanner: que é necessária para ler a entrada do usuário a partir do console



public class ConsultaView { //declaração da classe ConsultaView, classe responsável pela interface de gerenciamento de consultas
    
    
    private Scanner scanner = new Scanner(System.in);//cria um objeto Scanner: Permite a leitura de entradas do usuário pelo console

    public void exibirMenu() { //declara o método exibirMenu: exibe o menu de gerenciamento de consultas e lida com as escolhas do usuário
        while (true) { //inicia um loop infinito: mantém o menu exibido até o usuário escolher sair
           
           //exibe as opções do menu: mostra as ações disponíveis para gerenciamento de consultas
            System.out.println("\n--- Gerenciamento de Consultas ---");
            System.out.println("1. Inserir Consulta");
            System.out.println("2. Atualizar Consulta");
            System.out.println("3. Excluir Consulta");
            System.out.println("4. Voltar");

            int escolha = Integer.parseInt(scanner.nextLine()); //lê a escolha do usuário: Converte a entrada do usuário de uma string para um inteiro e a armazena em escolha

            switch (escolha) { //avalia a escolha do usuário: executa o bloco de código correspondente à escolha
                
                case 1:
                    inserirConsulta();//chama o método inserirConsulta
                    break;
                case 2:
                    atualizarConsulta(); //chama o método atualizarConsulta
                    break;
                case 3:
                    excluirConsulta();//chama o método excluirConsulta
                    break;
                case 4: 
                    return;//sai do método exibirMenu, interrompendo o loop.
                default:
                    System.out.println("Escolha inválida."); //informa que a escolha é inválida
            }
        }
    }



    //declara o método inserirConsulta: exibe uma mensagem e representa onde a lógica de inserção de consulta deve ser implementada
    private void inserirConsulta() {
        System.out.println("Inserindo nova consulta...");
        //lógica para inserir consulta
    }


    //declara o método atualizarConsulta: exibe uma mensagem e representa onde a lógica de atualização de consulta deve ser implementada    
    private void atualizarConsulta() {
        System.out.println("Atualizando consulta...");
        // lógica para atualizar consulta
    }


    //declara o método excluirConsulta: exibe uma mensagem e representa onde a lógica de exclusão de consulta deve ser implementada
    private void excluirConsulta() {
        System.out.println("Excluindo consulta...");
        //lógica para excluir consulta
    }
}



///importação: Importa Scanner para leitura do console.
//classe: Declara a classe ConsultaView.
//variável de Instância: Cria um Scanner para ler a entrada do usuário.
//método exibirMenu: Exibe o menu de gerenciamento de consultas e lida com as escolhas do usuário.
//métodos Auxiliares: inserirConsulta, atualizarConsulta, e excluirConsulta são responsáveis pelas respectivas operações, mas ainda precisam ser implementados.