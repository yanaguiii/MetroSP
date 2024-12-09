package ADO3ED;

public class Aresta {
    private int peso;
    private Vertice inicio;
    private Vertice fim;
    private String linha;

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public Aresta(int peso, Vertice inicio, Vertice fim, String linha) {
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
        this.linha = linha;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public Vertice getInicio() {
        return inicio;
    }
    public void setInicio(Vertice inicio) {
        this.inicio = inicio;
    }
    public Vertice getFim() {
        return fim;
    }
    public void setFim(Vertice fim) {
        this.fim = fim;
    }
}
