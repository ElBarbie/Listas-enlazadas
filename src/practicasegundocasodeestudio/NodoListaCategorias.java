package practicasegundocasodeestudio;

public class NodoListaCategorias {
    private Categoria dato;
    private NodoListaCategorias siguiente;

    public NodoListaCategorias() {
        this.dato = null;
    }

    public Categoria getDato() {
        return dato;
    }

    public void setDato(Categoria dato) {
        this.dato = dato;
    }

    public NodoListaCategorias getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCategorias siguiente) {
        this.siguiente = siguiente;
    }
}
