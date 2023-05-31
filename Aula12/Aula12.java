package Aula12;

public class Aula12 {
    public static void main(String [] args) {
        Mamífero m = new Mamífero(0, 0, 0, null);
        Réptil r = new Réptil(0, 0, 0, null);
        Peixe p = new Peixe(0, 0, 0, null);
        Ave a = new Ave(0, 0, 0, null);
        Canguru c = new Canguru(0, 0, 0, null);
        Cachorro k = new Cachorro(0, 0, 0, null);
        GoldFish g = new GoldFish(0, 0, 0, null);
        Cobra cb = new Cobra(0, 0, 0, null);
        Tartaruga t = new Tartaruga(0, 0, 0, null);
        Arara ar = new Arara(0, 0, 0, null);




        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("---------------------------------");
        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println("---------------------------------");
        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        System.out.println("---------------------------------");
        r.setPeso(300);
        r.setIdade(500);
        r.setMembros(4);
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("---------------------------------");
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println("---------------------------------");
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho(); 
    }
}
