package br.com.agenda.aplicacao;

import java.util.Date;
import java.util.Scanner;
import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ContatoDAO contatoDao = new ContatoDAO();

        while (true) {
            System.out.println("=== AGENDA ===");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Atualizar Contato");
            System.out.println("3. Listar Contatos");
            System.out.println("4. Deletar Contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            if (opcao == 1) {
                // Adicionar Contato
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();  

                Contato novoContato = new Contato();
                novoContato.setNome(nome);
                novoContato.setIdade(idade);
                novoContato.setDataCadastro(new Date());

                contatoDao.save(novoContato); // Salvar no banco
                System.out.println("Contato adicionado com sucesso!\n");

            } else if (opcao == 2) {
                // Atualizar Contato
                System.out.print("Digite o ID do contato a ser atualizado: ");
                int id = scanner.nextInt();
                scanner.nextLine();  

                Contato contatoExistente = contatoDao.getContatoById(id);
                if (contatoExistente != null) {
                    System.out.print("Digite o novo nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a nova idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();  

                    contatoExistente.setNome(nome);
                    contatoExistente.setIdade(idade);
                    contatoExistente.setDataCadastro(new Date());

                    contatoDao.update(contatoExistente); // Atualizar no banco
                    System.out.println("Contato atualizado com sucesso!\n");
                } else {
                    System.out.println("Contato não encontrado!\n");
                }

            } else if (opcao == 3) {
                // Listar Contatos
                System.out.println("=== Lista de Contatos ===");
                for (Contato c : contatoDao.getContatos()) {
                    System.out.println("ID: " + c.getId() + " | Nome: " + c.getNome() + " | Idade: " + c.getIdade() + " | Data: " + c.getDataCadastro());
                }
                System.out.println();

            } else if (opcao == 4) {
                // Deletar Contato
                System.out.print("Digite o ID do contato a ser deletado: ");
                int id = scanner.nextInt();
                scanner.nextLine();  

                if (contatoDao.deleteByID(id)) {
                    System.out.println("Contato deletado com sucesso!\n");
                } else {
                    System.out.println("Contato não encontrado!\n");
                }
            } else if (opcao == 0) {
                // Sair
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida! Tente novamente.\n");
            }
        }

        scanner.close(); 
    }
}
