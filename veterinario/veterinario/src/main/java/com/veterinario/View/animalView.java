//importa a classe Scanner da biblioteca Java ---Scanner é usado para ler a entrada do usuário a partir do console
import java.util.Scanner;

public class AnimalView {
    //declara uma classe pUblica chamada AnimalView. ---public indica que a classe pode ser acessada de outras classes
    
    
    private Scanner scanner = new Scanner(System.in);
    //declaração de variável de instância ---- ?????
    //cria uma instancia da classe Scanner que lê a entrada do usuário a partir do console (System.in). ---private indica que essa variável só pode ser acessada dentro da própria classe AnimalView

    public void exibirMenu() {
        //metodo exibirMenu
        //declara um método publico chamado exibirMenu q n retorna nada (void) esse método e responsavel por exibir o menu de gerenciamento de animais e lidar com as escolha do usuario

        while (true) {
            //inicia um loop infinito --- *loop continuara executando ate que seja interrompido por um return ou break
            
            System.out.println("\n--- Gerenciamento de Animais ---"); //\n???
            System.out.println("1. Inserir Animal");
            System.out.println("2. Atualizar Animal");
            System.out.println("3. Excluir Animal");
            System.out.println("4. Voltar");
            //exibição do Menu
            //System.out.println(...): imprime mensagens no console para exibir o menu de gerenciamento de animais com quatro opções: Inserir Animal, Atualizar Animal, Excluir Animal e Voltar

            int escolha = Integer.parseInt(scanner.nextLine());
            //leitura da Escolha do usuário
            //lê a entrada do usuário como uma linha de texto, converte essa entrada para um inteiro e a armazena na variável *escolha
            
            switch (escolha) {
                //estrutura de decisão (Switch)
                // avalia o valor da variável escolha e executa o bloco de código correspondente ao caso
                
                
                case 1:
                    inserirAnimal();
                    break;
                    //se escolha for 1, chama o método inserirAnimal e depois usa break para sair do switch
                case 2:
                    atualizarAnimal();
                    break;
                    //se escolha for 2, chama o método atualizarAnimal e depois usa break para sair do switch
                case 3:
                    excluirAnimal();
                    break;
                    //se escolha for 3, chama o método excluirAnimal e depois usa break para sair do switch
                case 4:
                    return;
                    //escolha for 4, usa return para sair do método exibirMenu, interrompendo o loop e voltando ao menu principal
                default:
                    System.out.println("Escolha inválida.");
            } //escolha não corresponder a nenhum dos casos anteriores, imprime "Escolha inválida." no console
        }
    }




    //método inserirAnimal
    private void inserirAnimal() {
        //declara um método privado chamado inserirAnimal que não retorna nada (void). método é responsável por inserir um novo animal no sistema. ---private indica que esse método só pode ser chamado dentro da própria classe AnimalView.
        System.out.println("Inserindo novo animal..."); //imprime a mensagem "Inserindo novo animal..." no console.
        // lógica para inserir animal
        //possivel array vazio q armazena no bancode dados
    }




    //método atualizarAnimal
    private void atualizarAnimal() {
        //declara um método privado chamado atualizarAnimal que não retorna nada (void). método é responsável por atualizar as informações de um animal existente no sistema
        System.out.println("Atualizando animal..."); //mensagem "Atualizando animal..." no console
        //lógica para atualizar animal
        //propvavel if
    }





//método excluirAnimal
    private void excluirAnimal() {
        //declara um método privado chamado excluirAnimal que não retorna nada. método é responsável por excluir um animal do sistema
        System.out.println("Excluindo animal..."); //mensagem "Excluindo animal..." no console
        //lógica para excluir animal
        //array q contem os animais tranformando paraumarray novo sem o index excluido
    }
}



//Scanner é usado para ler a entrada do usuário
//exibirMenu() é o metodo principal que exibe o menu de gerenciamento de animais e lida com a escolha do usuário
//inserirAnimal(), atualizarAnimal(), excluirAnimal() são os métodos privados que representam as operações de inserção, atualização e exclusão de animais, respectivamente
//METODOS EM JAVA SÃO REFERENCIA AO QUE SERIA FUNÇÃO EM JAVASCRIPT MAS PARECIDO COM REACT
//private???? public??????
//void n retorna nada?