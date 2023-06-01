package Aula14;

public class Vídeo implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    public Vídeo(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) /this.views);
        this.avaliacao = nova;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    @Override
    public void play() {
        if(this.isReproduzindo() == true) {
            System.out.println("Não é possível, o vídeo já está sendo reproduzido");
        }else {
            this.setReproduzindo(true);
            System.out.println("O vídeo começou a ser reproduzido");
        }
    }
    @Override
    public void pause() {
        if(this.isReproduzindo() == false) {
            System.out.println("Não é possível, o vídeo já está pausado");
        }else{
            this.setReproduzindo(false);
            System.out.println("O vídeo está pausado");
        }
    }
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
    @Override
    public String toString() {
        return "Vídeo [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + "]";
    }
    
    
}
