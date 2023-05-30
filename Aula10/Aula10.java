package Aula10;

public class Aula10 {
    public static void main(String [] args) {
        Pessoa p1 = new Pessoa(null, 0, null);
        Aluno p2 = new Aluno(null, 0, null, 0, null);
        Professor p3 = new Professor(null, 0, null, null, 0);
        Funcionario p4 = new Funcionario(null, 0, null, null, null);

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        p1.setIdade(32);
        p2.setIdade(18);
        p3.setIdade(27);
        p4.setIdade(45);

        p2.setCurso("Curso");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
