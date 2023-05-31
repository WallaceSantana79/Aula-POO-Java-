package Aula12;

public class Cachorro extends Mamífero {

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
        //TODO Auto-generated constructor stub
    }

    public void enterrarOsso() {
        System.out.println("Enterrando Osso");
    }
    public void abanarRabo() {
        System.out.println("Abanando o Rabo");
    }  
}
