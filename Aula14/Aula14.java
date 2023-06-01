package Aula14;

public class Aula14 {
    public static void main(String [] args) {
        Vídeo v[] = new Vídeo[3];
        v[0] = new Vídeo("Aula 1 de POO");
        v[1] = new Vídeo("Aula 12 de PHP");
        v[2] = new Vídeo("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", 0, "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", 0, "creuzita");

        Visualizacao vs[] = new Visualizacao[5];
        vs[0] = new Visualizacao(g[0], v[2]);
        vs[0].avaliar();
        System.out.println(vs[0].toString());
        
        vs[1] = new Visualizacao(g[0], v[2]);
        vs[0].avaliar(87.0f);
        System.out.println(vs[1].toString());

    }
}
