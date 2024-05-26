import java.util.Scanner;
//importa a classe Scanner da biblioteca Java ---- O Scanner é usado para ler a entrada do usuário a partir do console


////declaração da Classe DonoView
public class DonoView {
    //declara uma classe pública chamada DonoView. --- public indica que a classe pode ser acessada de outras classes


    private Scanner scanner = new Scanner(System.in);
    //cria uma instância da classe Scanner que lê a entrada do usuário a partir do console (System.in)---- private indica que essa variável só pode ser acessada dentro da própria classe DonoView

    public void exibirMenu() {
        //declara um método público chamado exibirMenu que não retorna nada (void). método é responsável por exibir o menu de gerenciamento de donos e lidar com as entradas do usuário
        while (true) {
            //inicia um loop infinito ---loop continuará executando até que seja explicitamente interrompido por um return ou break
            
            System.out.println("\n--- Gerenciamento de Donos ---");
            System.out.println("1. Inserir Dono");
            System.out.println("2. Atualizar Dono");
            System.out.println("3. Excluir Dono");
            System.out.println("4. Voltar");
            //exibição do Menu
            //System.out.println(...): imprime mensagens no console para exibir o menu de gerenciamento de donos com quatro opções: Inserir Dono, Atualizar Dono, Excluir Dono e Voltar

            int escolha = Integer.parseInt(scanner.nextLine());
            //leitura da Escolha do usuário
            //lê a entrada do usuário como uma linha de texto, converte essa entrada para um inteiro e a armazena na variável escolha



            //estrutura de decisão (Switch)
            switch (escolha) {
                //avalia o valor da variável escolha e executa o bloco de código correspondente ao caso


                case 1:
                    inserirDono();
                    break;
                    //se escolha for 1, chama o método inserirDono e depois usa break para sair do switch
                case 2:
                    atualizarDono();
                    break;
                    //se escolha for 2, chama o método atualizarDono e depois usa break para sair do switch
                case 3:
                    excluirDono();
                    break;
                    //se escolha for 3, chama o método excluirDono e depois usa break para sair do switch.
                case 4:
                    return;
                    //se escolha for 4, usa return para sair do método exibirMenu, interrompendo o loop e voltando ao menu principal
                default:
                    System.out.println("Escolha inválida."); //se escolha não corresponder a nenhum dos casos anteriores, imprime "Escolha inválida." no console
            }
        }
    }



    //método inserirDono
    private void inserirDono() { //declara um método privado chamado inserirDono que não retorna nada (void). Este método é responsável por inserir um novo dono no sistema. A palavra-chave private indica que esse método só pode ser chamado dentro da própria classe DonoView
        System.out.println("Inserindo novo dono..."); //imprime a mensagem "Inserindo novo dono..." no console
        //lógica para inserir dono
        //mesma coisa, array vazio que armazena no banco de dados
    }



    //método atualizarDono
    private void atualizarDono() {  // declara um método privado chamado atualizarDono que não retorna nada (void). Este método é responsável por atualizar as informações de um dono existente no sistema
        System.out.println("Atualizando dono..."); //imprime a mensagem "Atualizando dono..." no console
        // lógica para atualizar dono
        
    }





    //método excluirDono
 private void excluirDono() { //// declara um método privado chamado excluirDono que não retorna nada (void). Este método é responsável por excluir um dono do sistema
        System.out.println("Excluindo dono..."); //imprime a mensagem "Excluindo dono..." no console
        //lógica para excluir dono
        //mesma coisa, array que guarda os donos e chama-lo em um novo array sem o index escolhido
    }
}

//Scanner: Usado para ler a entrada do usuário.
//exibirMenu(): Método principal que exibe o menu de gerenciamento de donos e lida com a escolha do usuário.
//inserirDono(), atualizarDono(), excluirDono(): Métodos privados que representam as operações de inserção, atualização e exclusão de donos, respectivamente
