package controleatleta.control;

import controleatleta.model.Tenista;
import java.util.ArrayList;

public class ControleTenista {

    private ArrayList<Tenista> listaTenistas;

    public ControleTenista() {
        this.listaTenistas = new ArrayList<Tenista>();
    }
    
    public ArrayList<Tenista> getListaTenistas() {
        return listaTenistas;
    }
    
    public void adicionar(Tenista umTenista) {
        listaTenistas.add(umTenista);
    }
    
    public void remover(Tenista umTenista) {
        listaTenistas.remove(umTenista);
    }
    
    public Tenista pesquisar(String nome) {
        for (Tenista b: listaTenistas) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}
