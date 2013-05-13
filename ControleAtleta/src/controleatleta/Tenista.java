package controleatleta;

import java.util.ArrayList;

public class Tenista extends Atleta {
    
    private int principalGolpe; //0=backhand, 1=drive, 2=dropshot, 3=forehand, 4=lob, 5=overhead, 6=passing shot, 7=slice, 8=smash, 9=topspin
    private ArrayList<Premiacao> premiacoes;
    private Double envergadura;
    private char tipoQuadraPreferida; // S=saibro, P=piso duro, G=grama
    private int totalVitorias;
    private int totalDerrotas;
    private int totalPartidas;
    private float velocidadeMediaSaque;
    private char maoPreferida; // D=destro,C=canhoto
    private int posicaoRanking;
    private int empunhadura; // 0=L0, 1=L1, 2=L2, 3=L3, 4=L4, 5=L5

    public Tenista(String nome){
        super(nome);
    }
    
    public int getTotalPartidas() {
        return totalPartidas;
    }

    public void setTotalPartidas(int totalPartidas) {
        this.totalPartidas = totalPartidas;
    }
    
    public int getEmpunhadura() {
        return empunhadura;
    }

    public void setEmpunhadura(int empunhadura) {
        this.empunhadura = empunhadura;
    }
    
    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public Double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(Double envergadura) {
        this.envergadura = envergadura;
    }

    public char getTipoQuadraPreferida() {
        return tipoQuadraPreferida;
    }

    public void setTipoQuadraPreferida(char tipoQuadraPreferida) {
        this.tipoQuadraPreferida = tipoQuadraPreferida;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        this.totalVitorias = totalVitorias;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int totalDerrotas) {
        this.totalDerrotas = totalDerrotas;
    }

    public float getVelocidadeMediaSaque() {
        return velocidadeMediaSaque;
    }

    public void setVelocidadeMediaSaque(float velocidadeMediaSaque) {
        this.velocidadeMediaSaque = velocidadeMediaSaque;
    }

    public char getMaoPreferida() {
        return maoPreferida;
    }

    public void setMaoPreferida(char maoPreferida) {
        this.maoPreferida = maoPreferida;
    }

    public int getPosicaoRanking() {
        return posicaoRanking;
    }

    public void setPosicaoRanking(int posicaoRanking) {
        this.posicaoRanking = posicaoRanking;
    }

    public void setPrincipalGolpe(int principalGolpe) {
        this.principalGolpe = principalGolpe;
    }

    public int getPrincipalGolpe() {
        return principalGolpe;
    }
    
    
}