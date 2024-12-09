package ADO3ED;

import java.util.ArrayList;

public class Vertice {
    private String dado;
    private ArrayList<Aresta> arestasEntrada;
    private ArrayList<Aresta> arestasSaida;

    public Vertice(String valor) {
        this.dado = valor;
        this.arestasEntrada = new ArrayList<>();
        this.arestasSaida = new ArrayList<>();
    }

    public String getDado() {
        return dado;
    }

    public ArrayList<Aresta> getArestasEntrada() {
        return arestasEntrada;
    }

    public ArrayList<Aresta> getArestasSaida() {
        return arestasSaida;
    }

    public void adicionarArestaEntrada(Aresta aresta) {
        this.arestasEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Aresta aresta) {
        this.arestasSaida.add(aresta);
    }
}
