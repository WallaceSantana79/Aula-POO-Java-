package Aula09;

public class Livro implements Publicacao {
    private String título;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String título, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.título = título;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public String detalhes() {
        return "Livro [título=" + título + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual
                + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade=" + leitor.getIdade() + "\n, sexo=" + leitor.getSexo() +"]";
    }
    @Override
    public void abrir() {
        if (this.isAberto() == true){
            System.out.println("O livro já está aberto\n");
        } else{
            this.setAberto(true);
        }
    }
    @Override
    public void fechar() {
        if (this.isAberto() == false) {
            System.out.println("O livro já está fechado\n");
        }else {
            this.setAberto(false);
        }
    }
    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas()) {
            System.out.println("O número de páginas a ser folheadas ultrapassa o número de páginas existentes no livro, estamos te mandando para a última página do livro\n");
            this.setPagAtual(this.getTotPaginas());
        }else {
            this.setPagAtual(p);
        }
    }
    @Override
    public void avançarPag() {
        if (this.getPagAtual() == this.getTotPaginas()) {
            System.out.println("Não é possível avançar mais, já que você já está na última página\n");
        }else {
            this.setPagAtual(this.getPagAtual() + 1);
        }
        
    }
    @Override
    public void voltarPag() {
        if (this.getPagAtual() == 0){
            System.out.println("Você não pode retornar, pois você se encontra na primeira página do livro\n");
        }else {
            this.setPagAtual(this.getPagAtual() - 1);

        }
    }
    
}