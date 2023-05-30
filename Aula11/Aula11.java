package Aula11;

public class Aula11 {
    public static void main(String [] args) {
        Visitante t1 = new Visitante(null, 0, null);

        t1.setNome("Juvenal");
        t1.setIdade(22);
        t1.setSexo("M");
        System.out.println(t1.toString());

        Aluno a1 = new Aluno(null, 0, null, 0, null);
        
        a1.setNome("Cláudio");
        a1.setMatr(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista(null, 0, null, 0, null, 0);
        b1.setMatr(1112);
        b1.setNome("Jubileu");
        b1.setIdade(15);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }   
}
