package com.clinica.view;

//Aqui, estamos importando duas classes para serem usadas no código. Scanner é uma classe Java que permite a leitura de entrada do usuário, enquanto Funcionario é uma classe específica do projeto que  representa um funcionário.
import java.util.Scanner;
import com.clinica.model.entity.Funcionario;

public class FuncionarioView {
    private Scanner scanner = new Scanner(System.in);

    // Método para exibir o menu de gerenciamento de funcionários
    public void exibirMenu() {
        while (true) { ////Início de um loop infinito para manter o menu visível até que o usuário decida sair.
            
            ////Exibe as opções do menu para o usuário.
            System.out.println("\n--- Gerenciamento de Funcionários ---");
            System.out.println("1. Inserir Funcionário");
            System.out.println("2. Atualizar Funcionário");
            System.out.println("3. Excluir Funcionário");
            System.out.println("4. Voltar");

            int escolha = Integer.parseInt(scanner.nextLine()); ////Captura a escolha do usuário a partir do console e converte para um número inteiro.

            switch (escolha) {////Verifica a escolha do usuário e chama o método correspondente para realizar a ação desejada.
                case 1:
                    inserirFuncionario();
                    break;
                case 2:
                    atualizarFuncionario();
                    break;
                case 3:
                    excluirFuncionario();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }





    //inserir um novo funcionário
    private void inserirFuncionario() {
        
        //cria uma nova instância de Funcionario com os dados coletados
        Funcionario novoFuncionario = new Funcionario(nome, cargo, salario);
        
        //chama o serviço para inserir o novo funcionário no banco de dados
        funcionarioService.inserir(novoFuncionario);

        System.out.println("Funcionário inserido com sucesso!");
    }








    //atualizar um funcionário existente
    private void atualizarFuncionario() {
         
        //cria uma instância de Funcionario com os dados atualizados
         Funcionario funcionarioAtualizado = new Funcionario(id, nome, cargo, salario);
        
         //chama o serviço para atualizar o funcionário no banco de dados
        funcionarioService.atualizar(funcionarioAtualizado);

        System.out.println("Funcionário atualizado com sucesso!");
    }









    //excluir um funcionário
    private void excluirFuncionario() {
       
        funcionarioService.excluir(id);

        System.out.println("Funcionário excluído com sucesso!");
    }
}
