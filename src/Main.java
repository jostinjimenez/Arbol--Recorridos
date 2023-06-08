
public class Main {
    public static void main(String[] args) {

        Arbol arbol = new Arbol(4);

        arbol.insertar(2);
        arbol.insertar(1);
        arbol.insertar(3);
        arbol.insertar(8);
        arbol.insertar(9);

        System.out.print("InOrden: ");
        arbol.inOrden(arbol.getRaiz());
        System.out.println();
        System.out.print("PreOrden: ");
        arbol.preOrden(arbol.getRaiz());
        System.out.println();
        System.out.print("PostOrden: ");
        arbol.postOrden(arbol.getRaiz());
        System.out.println();
    }
}