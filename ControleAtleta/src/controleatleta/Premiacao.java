package controleatleta;

public class Premiacao {

    private String tituloTorneio;
    private int ano;

    public Premiacao(String tituloTorneio, int ano) {
        this.tituloTorneio = tituloTorneio;
        this.ano = ano;
    }

    public String getTituloTorneio() {
        return tituloTorneio;
    }

    public void setTitulo(String tituloTorneio) {
        this.tituloTorneio = tituloTorneio;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return this.ano + " - " + this.tituloTorneio;
    }
}
