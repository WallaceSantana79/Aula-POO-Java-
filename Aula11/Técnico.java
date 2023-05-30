package Aula11;

import Aula10.Aluno;

public class Técnico extends Aluno {
    private String registroProfissional;

    public Técnico(String nome, int idade, String sexo, int matr, String curso, String registroProfissional) {
        super(nome, idade, sexo, matr, curso);
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {

    } 
}
