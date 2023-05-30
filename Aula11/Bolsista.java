package Aula11;

import Aula10.Aluno;

public class Bolsista extends Aluno {
    private float bolsa;

    public Bolsista(String nome, int idade, String sexo, int matr, String curso, float bolsa) {
        super(nome, idade, sexo, matr, curso);
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());

    }
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");

    }
    
}
