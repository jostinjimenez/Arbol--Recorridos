public class Arbol {
    private Nodo raiz;

    public Arbol(int valor) {
        this.raiz = new Nodo(valor);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public String toString(){
        return "Arbol: " + this.raiz;
    }

    public void insertar(int valor){
        Nodo nuevo = new Nodo(valor);
        if(this.raiz == null){
            this.raiz = nuevo;
        }else{
            Nodo aux = this.raiz;
            Nodo padre;
            while(true){
                padre = aux;
                if(valor < aux.getValor()){
                    aux = aux.getIzq();
                    if(aux == null){
                        padre.setIzq(nuevo);
                        return;
                    }
                }else{
                    aux = aux.getDer();
                    if(aux == null){
                        padre.setDer(nuevo);
                        return;
                    }
                }
            }
        }
    }
    
    public void inOrden(Nodo raiz){
        if(raiz != null){
            inOrden(raiz.getIzq());
            System.out.print(raiz.getValor() + " ");
            inOrden(raiz.getDer());
        }
    }

    public void preOrden(Nodo raiz){
        if(raiz != null){
            System.out.print(raiz.getValor() + " ");
            preOrden(raiz.getIzq());
            preOrden(raiz.getDer());
        }
    }

    public void postOrden(Nodo raiz){
        if(raiz != null){
            postOrden(raiz.getIzq());
            postOrden(raiz.getDer());
            System.out.print(raiz.getValor() + " ");
        }
    }


}
