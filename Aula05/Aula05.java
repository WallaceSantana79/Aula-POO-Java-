package Aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco b1 = new ContaBanco(0, false);
        b1.setNumConta(1111);
        b1.setDono("Jubileu");
        b1.abrirConta("CC");


        b1.estadoAtual();
    }
    
}
