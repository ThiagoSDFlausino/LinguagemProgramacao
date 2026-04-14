package lista_ex.ex2;

import java.util.ArrayList;

public class Rev {

    public static void main(String[] args) {
        Tarefa oTarefa1 = new Tarefa("Implementar login", false);
        Tarefa oTarefa2 = new Tarefa("Criar banco de dados", true);
        Tarefa oTarefa3 = new Tarefa("Implementar Cadastro", false);

        ArrayList<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(oTarefa1);
        tarefas.add(oTarefa2);
        tarefas.add(oTarefa3);

        Projeto oProjeto1 = new Projeto("Sistema de Gerenciamento", tarefas);
        ArrayList<Projeto> projetos = new ArrayList<>();
        projetos.add(oProjeto1);


        Funcionario oFuncionario = new Funcionario("João", 3000, projetos);

        System.out.println("Nome: " + oFuncionario.getNome());
        System.out.println("Salário: " + oFuncionario.getSalario());

        if (oFuncionario instanceof Desenvolvedor) {
            System.out.println("===== DESENVOLVEDOR =====");
            System.out.println("Linguagem principal: " + ((Desenvolvedor) oFuncionario).getLinguagemPrincipal());
        } else {
            System.out.println("===== GERENTE =====");
            System.out.println("Departamento: " + ((Gerente) oFuncionario).getDepartamento());
        }

        System.out.println("===== PROJETOS ====");
        for (int i = 0; i < oFuncionario.getProjetos().size(); i++) {
            System.out.println("\t Nome: " + oFuncionario.getProjetos().get(i).getNome());

            System.out.println("\t ===== TAREFA ====");
            for (int j = 0; j < oFuncionario.getProjetos().get(i).getTarefas().size(); j++) {
                System.out.println("\t\t Descrição: " + oFuncionario.getProjetos().get(i).getTarefas().get(j).getDescricao());
                String concluida = ((oFuncionario.getProjetos().get(i).getTarefas().get(j).isConcluida() == true) ? "Sim" : "Não");
                System.out.println("\t\t Concluída: " + concluida);
            }
        }

        System.out.println("Bônus: " + oFuncionario.calculaBonus());
    }
}