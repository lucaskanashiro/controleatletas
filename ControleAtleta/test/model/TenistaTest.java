package model;

import controleatleta.model.Tenista;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TenistaTest {
    
    public static Tenista tenista;
    
    public TenistaTest() {
    }
 
    @Before
    public void setUp() {
        tenista = new Tenista("teste");
        tenista.setTotalDerrotas(3);
        tenista.setTotalVitorias(5);
        tenista.setTotalPartidas(8);
        tenista.setEmpunhadura(3);
        tenista.setEnvergadura(2.5);
        tenista.setMaoPreferida('D');
        tenista.setPosicaoRanking(178);
        tenista.setPrincipalGolpe(5);
        tenista.setVelocidadeMediaSaque(99);
        tenista.setTipoQuadraPreferida('S');
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void getNomeTest(){
        String nome = tenista.getNome();
        assertEquals("teste", nome);
    }
    
    @Test
    public void getTotalDerrotasTest(){
        assertEquals(3, tenista.getTotalDerrotas());
    }
    
    @Test
    public void getTotalVitoriasTest(){
        assertEquals(5, tenista.getTotalVitorias());
    }
    
    @Test
    public void getTotalPartidasTest(){
        assertEquals(8, tenista.getTotalPartidas());
    }
    
    @Test
    public void getEmpunhaduraTest(){
        assertEquals(3, tenista.getEmpunhadura());
    }
    
    @Test
    public void getEnvergaduraTest(){
        assertEquals(2.5, tenista.getEnvergadura(), 0.0);
    }
    
    @Test
    public void getMaoPreferidaTest(){
        assertEquals('D', tenista.getMaoPreferida());
    }
    
    @Test
    public void getPosicaoRankingTest(){
        assertEquals(178, tenista.getPosicaoRanking());
    }
    
    @Test
    public void getPrincipalGolpeTest(){
        assertEquals(5, tenista.getPrincipalGolpe());
    }
    
    @Test
    public void getVelocidadeMediaSaqueTest(){
        assertEquals(99, tenista.getVelocidadeMediaSaque(), 0);
    }
    
    @Test
    public void getTipoQuadraPreferidaTest(){
        assertEquals('S', tenista.getTipoQuadraPreferida());
    }
}