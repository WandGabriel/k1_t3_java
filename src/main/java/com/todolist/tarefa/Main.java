package com.todolist.tarefa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        List<Tarefa> tarefaList = new ArrayList<>();
        Date date = new Date();

        int obterEscolhaUsuario;

        do{
            menuInicial();
            obterEscolhaUsuario = escolhaOpcaoParaMenu(sc);
            switch (obterEscolhaUsuario) {
                case 1:
                    menuListagemKanban();
                    obterEscolhaUsuario = escolhaOpcaoParaMenu(sc);
                    switch (obterEscolhaUsuario){
                        case 1:
                            for (Tarefa listarTodos:tarefaList){
                                System.out.println(listarTodos);
                            }
                            break;
                        case 2:
                            List<String> listaCategoria = new ArrayList<>();
                            for(Tarefa tarefa:tarefaList){
                                if(!listaCategoria.contains(tarefa.getCategoria())){
                                    listaCategoria.add(tarefa.getCategoria());
                                }
                            }
                            for(int i=0; i<listaCategoria.size();i++){
                                System.out.println("Categoria: "+listaCategoria.get(i));
                                for(Tarefa tarefa:tarefaList){
                                    if(listaCategoria.get(i).contains(tarefa.getCategoria())){
                                        System.out.println(tarefa);
                                    }
                                }
                            }
                            break;
                        case 3:
                            for (int i=1; i<=5; i++){
                                System.out.println("Prioridade: "+i);
                                for (Tarefa tarefa:tarefaList){
                                    if(tarefa.getPrioridade().equals(i)){
                                        System.out.println(tarefa);
                                    }
                                }
                            }
                            break;
                        case 4:
                            List<String> listaStatus = new ArrayList<>();
                            for(Tarefa tarefa:tarefaList){
                                if(!listaStatus.contains(tarefa.getCategoria())){
                                    listaStatus.add(tarefa.getCategoria());
                                }
                            }
                            for(int i=0; i<listaStatus.size();i++){
                                System.out.println("Status: "+listaStatus.get(i));
                                for(Tarefa tarefa:tarefaList){
                                    if(listaStatus.get(i).contains(tarefa.getCategoria())){
                                        System.out.println(tarefa);
                                    }
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("---------------------");
                    System.out.print("Nome: ");
                    String nomeTarefa = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descricaoTarefa = sc.nextLine();
                    System.out.print("Data de entrega [dd/mm/yyyy]: ");
                    String dataEntrega = sc.nextLine();
                    System.out.print("Prioridade [1-5]: ");
                    int prioridade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();
                    System.out.print("Status [Todo,Doing,Done]: ");
                    String status = sc.nextLine();
                    tarefaList.add(new Tarefa(nomeTarefa,descricaoTarefa,dataEntrega,prioridade,categoria,status));
                    System.out.println("Tarefa criada com sucesso.");
                    Thread.sleep(1000);
                    break;
                case 3:
                    if(tarefaList.size() == 0){
                        System.out.println("Não existe tarefas para ser excluída.");
                    } else {
                        for(int i=0;i< tarefaList.size();i++){
                            System.out.println(i+1+" - "+tarefaList);
                        }
                        System.out.println("Digite a tarefa para ser excluída: ");
                        obterEscolhaUsuario = sc.nextInt();
                        tarefaList.remove(obterEscolhaUsuario-1);
                        System.out.println("A tarefa, foi removida com sucesso.");
                        Thread.sleep(500);
                    }
                    break;
            }
        } while (obterEscolhaUsuario!=0);
    }

    public static void menuInicial(){
        System.out.println("-------------------------");
        System.out.println("          KANBAN         ");
        System.out.println("-------------------------");
        System.out.println("[1] - Visualizar Kanban");
        System.out.println("[2] - Criar Tarefa");
        System.out.println("[3] - Excluir Tarefa");
        System.out.println("[0] - Fechar o programa");
        System.out.println("-----------------------");
    }

    public static int escolhaOpcaoParaMenu(Scanner scan){
        System.out.print("Opção desejada: ");
        int obterEscolhaUsuario = scan.nextInt();
        scan.nextLine();
        return obterEscolhaUsuario;
    }

    public static void menuListagemKanban(){
        System.out.println("[1] - LISTAR TODOS");
        System.out.println("[2] - LISTAR POR CATEGORIA");
        System.out.println("[3] - LISTAR POR PRIORIDADE");
        System.out.println("[4] - LISTAR POR STATUS");
    }
}
