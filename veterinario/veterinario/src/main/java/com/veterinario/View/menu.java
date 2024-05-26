import java.util.Scanner;


public class MainView {
    private Scanner scanner = new Scanner(System.in); //cria uma instancia para ler a entrada do usuario a partir do console
    private AnimalView animalView = new AnimalView(); //cria uma instancia que gerencia a interface de gerenciamento de animais
    private DonoView donoView = new DonoView(); // uma instancia que gerencia a inetrface de gerenciamento de donos
    private FuncionarioView funcionarioView = new FuncionarioView(); //cria uma instancia que gerencia a interface de gerenciamento de funcionarios 
    private ConsultaView consultaView = new ConsultaView(); // gerencia a interface de gerenciamento de consultas
    private ServicoView servicoView = new ServicoView();// gerencia a interface de gerenciamento de serviços




//declara um método público exibirMenuPrincipal que n retorna nada (void)
    public void exibirMenuPrincipal() {


        //while inicia um loop infinito para exibir repetidamente o menu principal até que o usuário escolha sair
        
        while (true) {
           
            // System.out.println(...): Exibe o menu principal com as opções de gerenciamento (animais, donos, funcionários, consultas, serviços, e sair)
            
           System.out.println("\n--- Sistema de Clínica Veterinária ---");
            System.out.println("1. Gerenciamento de Animais");
            System.out.println("2. Gerenciamento de Donos");
            System.out.println("3. Gerenciamento de Funcionários");
            System.out.println("4. Gerenciamento de Consultas");
            System.out.println("5. Gerenciamento de Serviços");
            System.out.println("6. Sair");

            // le a escolha do usuário como uma linha de texto, a converte para um inteiro e armazena em opcoes
            int opcoes = Integer.parseInt(scanner.nextLine());

            //avalia o valor de opcoes e executa o bloco de código de acorda co escolha feita pelo usuario
            switch (opcoes) {
                // chama o método exibirMenu da instância animalView, que exibe o menu de gerenciamento de animais
                case 1:
                    animalView.exibirMenu();
                    break;
                //chama o método exibirMenu da instância odonoView, que exibe o menu de gerenciamento de donos
                    case 2:
                    donoView.exibirMenu();
                    break;

                    //chama o método exibirMenu da instância funcionarioView, que exibe o menu de gerenciamento de funcionários
                case 3:
                    funcionarioView.exibirMenu();
                    break;

                    //chama o método exibirMenu da instância consultaView, que exibe o menu de gerenciamento de consultas
                case 4:
                    consultaView.exibirMenu();
                    break;

                 //   chama o método exibirMenu da instância servicoView, que exibe o menu de gerenciamento de serviços
                case 5:
                    servicoView.exibirMenu();
                    break;

                    //Exibe uma mensagem de saída e termina o loop e o método

                case 6:
                    System.out.println("Saindo do sistema...");
                    return;
                    
                    //exibe uma mensagem de erro se a escolha do usuário não for válida.
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    //declara o método main, que é o ponto de entrada da aplicação
    public static void main(String[] args) {
        //cria uma instância da classe MainView
        MainView mainView = new MainView();
        //Chama o método exibirMenuPrincipal da instância mainView para iniciar a interação com o usuário
        mainView.exibirMenuPrincipal();
    }
}
