package lista_ex.ex2;

import java.util.ArrayList;

public class Gerente_Teste extends Funcionario {
    private String departamento;

    public Gerente_Teste(String departamento, String nome, double salario, ArrayList<Projeto> projetos) {
        super(nome, salario, projetos);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calculaBonus() {
        return this.salario * 0.2;
    }
}
