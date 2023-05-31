package Aula12;

public class Canguru extends Mamífero {

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
        //TODO Auto-generated constructor stub
    }
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    public void locomover() {
        System.out.println("Saltando");
    }
}
