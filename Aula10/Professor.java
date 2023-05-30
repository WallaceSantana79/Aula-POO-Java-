package Aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float Salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        Salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }
    public void receberAum(float a) {
        this.setSalario(this.getSalario() + a);
    }
    
}
