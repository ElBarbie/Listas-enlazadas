package practicasegundocasodeestudio;

public class NodoListaLibros {
    private Libro dato;
    private NodoListaLibros siguiente;
    
    public NodoListaLibros(){
        this.siguiente=null;
    }

    public Libro getDato() {
        return dato;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }

    public NodoListaLibros getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaLibros siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
