package lista_ex.ex2;

import java.util.ArrayList;

public class Projeto {
    private String nome;
    private ArrayList<Tarefa> tarefas;

    public Projeto() {
    }

    public Projeto(String nome, ArrayList<Tarefa> tarefas) {
        this.nome = nome;
        this.tarefas = tarefas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }
}
