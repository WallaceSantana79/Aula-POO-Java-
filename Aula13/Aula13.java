package Aula13;

public class Aula13 {
    public static void main(String [] args) {
        Lobo x = new Lobo(0, 0, 0, null);
        Cachorro c = new Cachorro(0, 0, 0, null);
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
