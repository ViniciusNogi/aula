import java.util.Scanner;


public class MainView {
    private Scanner scanner = new Scanner(System.in); //cria uma instancia para ler a entrada do usuario a partir do console
    private AnimalView animalView = new AnimalView(); //cria uma instancia que gerencia a interface de gerenciamento de animais
    private DonoView donoView = new DonoView(); // uma instancia que gerencia a inetrface de gerenciamento de donos
    private FuncionarioView funcionarioView = new FuncionarioView(); //cria uma instancia que gerencia a interface de gerenciamento de funcionarios 
    private ConsultaView consultaView = new ConsultaView(); // gerencia a interface de gerenciamento de consultas
    private ServicoView servicoView = new ServicoView();// gerencia a interface de gerenciamento de serviços





    public void exibirMenuPrincipal() {
        while (true) {
            System.out.println("\n--- Sistema de Clínica Veterinária ---");
            System.out.println("1. Gerenciamento de Animais");
            System.out.println("2. Gerenciamento de Donos");
            System.out.println("3. Gerenciamento de Funcionários");
            System.out.println("4. Gerenciamento de Consultas");
            System.out.println("5. Gerenciamento de Serviços");
            System.out.println("6. Sair");

            int opcoes = Integer.parseInt(scanner.nextLine());

            switch (opcoes) {
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
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.exibirMenuPrincipal();
    }
}
