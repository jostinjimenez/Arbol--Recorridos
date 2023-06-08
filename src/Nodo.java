public class Nodo {
    private Nodo izq;
    private Nodo der;
    private int valor;

    public int getValor() {
        return valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo(int valor){
        this.valor = valor;
    }

    public String toString(){
        return "Nodo: " + this.valor;
    }

}
