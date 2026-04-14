package lista_ex.ex2;

import java.util.ArrayList;

abstract public class Funcionario {
    protected String nome;
    protected double salario;
    protected ArrayList<Projeto> projetos;

    public Funcionario(String nome, double salario, ArrayList<Projeto> projetos) {
        this.nome = nome;
        this.salario = salario;
        this.projetos = projetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    abstract public double calculaBonus();
}
