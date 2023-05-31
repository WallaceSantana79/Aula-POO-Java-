package Aula13;

public class Lobo extends Mamífero {

    public Lobo(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuu!");
    }
    
}
