//Pacote e Importações:
//Define que esta classe está no pacote com.clinica.view.
//Importa a classe Scanner para ler a entrada do usuário.
//Importa a classe Animal (presumivelmente para futuras implementações onde será necessário manipular objetos Animal).
package com.clinica.view;
import java.util.Scanner;
import com.clinica.model.entity.Animal;



//Declara a classe AnimalView.
public class AnimalView {

    ////Cria uma instância de Scanner para ler a entrada do usuário a partir do console.
    private Scanner scanner = new Scanner(System.in);

    // Método para exibir o menu de gerenciamento de animais
    //Define o método exibirMenu que exibe um menu de gerenciamento de animais e lê a escolha do usuário
    public void exibirMenu() {
        
        //Entra em um loop infinito (while (true)) para continuar exibindo o menu até o usuário escolher a opção "Voltar"
        while (true) {

            //Exibe as opções do menu para inserir, atualizar, excluir ou voltar.
            System.out.println("\n--- Gerenciamento de Animais ---");
            System.out.println("1. Inserir Animal");
            System.out.println("2. Atualizar Animal");
            System.out.println("3. Excluir Animal");
            System.out.println("4. Voltar");        

            //Lê a escolha do usuário, converte para um inteiro e usa um switch para executar o método correspondente.
            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    inserirAnimal(); //Se a escolha for "1", chama inserirAnimal().
                    break;
                case 2:
                    atualizarAnimal();//Se a escolha for "2", chama atualizarAnimal().
                    break;
                case 3:
                    excluirAnimal();//Se a escolha for "3", chama excluirAnimal().
                    break;
                case 4:
                    return; //Se a escolha for "4", sai do método exibirMenu (e portanto, do loop).
                default:
                    System.out.println("Escolha inválida."); //Para qualquer outra escolha, exibe "Escolha inválida."
            }
        }
    }

    
    
    



    // método para inserir um novo animal
    private void inserirAnimal() {
        System.out.println("Inserindo novo animal...");
    
    
        Animal novoAnimal = new Animal(nome, especie, idade);

        // chama o serviço para inserir o novo animal no banco de dados
        animalService.inserir(novoAnimal);

        System.out.println("Animal inserido com sucesso!");
    }




    //metodo atualizar um animal existente
    private void atualizarAnimal() {
        System.out.println("Atualizando animal...");
        Animal animalAtualizado = new Animal(id, nome, especie, idade);

        //chama o serviço para atualizar o animal no banco de dados
        animalService.atualizar(animalAtualizado);

        System.out.println("Animal atualizado com sucesso!");
    }








    
    //excluir um animal
    private void excluirAnimal() {
        System.out.println("Excluindo animal...");
        
        animalService.excluir(id);

        System.out.println("Animal excluído com sucesso!");
    }
}

