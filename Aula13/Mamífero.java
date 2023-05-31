package Aula13;

public class Mamífero extends Animal {
    protected String corPelo;

    public Mamífero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
       System.out.println("Som de Mamífero");
        
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
