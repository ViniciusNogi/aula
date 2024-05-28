package com.clinica.view;

import java.util.Scanner;
import com.clinica.model.entity.Servico;

public class ServicoView {
    private Scanner scanner = new Scanner(System.in);

    // Método para exibir o menu de gerenciamento de serviços
    public void exibirMenu() {
        while (true) {
            System.out.println("\n--- Gerenciamento de Serviços ---");
            System.out.println("1. Inserir Serviço");
            System.out.println("2. Atualizar Serviço");
            System.out.println("3. Excluir Serviço");
            System.out.println("4. Voltar");

            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
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
                    return;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }

    //metodo para inserir um novo serviço
    private void inserirServico() {
        
        //cria uma nova instância de Servico com os dados coletados
        Servico novoServico = new Servico(nome, descricao, preco);
        
        // Chama o serviço para inserir o novo serviço no banco de dados
        servicoService.inserir(novoServico);

        
        System.out.println("Serviço inserido com sucesso!");
    }




    //atualizar um serviço existente
    private void atualizarServico() {
        
        //cria uma instância de Servico com os dados atualizados
        Servico servicoAtualizado = new Servico(id, nome, descricao, preco);
        
        //chama o serviço para atualizar o serviço no banco de dados
        servicoService.atualizar(servicoAtualizado);

        System.out.println("Serviço atualizado com sucesso!");
    }





    //excluir um serviço
    private void excluirServico() {
       
        //chama o serviço para excluir o serviço no banco de dados
       servicoService.excluir(id);

       
       System.out.println("Serviço excluído com sucesso!");
    }
}
