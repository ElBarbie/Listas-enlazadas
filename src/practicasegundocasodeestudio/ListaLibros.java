package practicasegundocasodeestudio;

import javax.swing.JOptionPane;

public class ListaLibros {
    private NodoListaLibros inicio;

    public ListaLibros() {
        this.inicio = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void insertar(){
        Libro libro = new Libro(0,"","","");
        libro.setTitulo(JOptionPane.showInputDialog("Digite el titulo del libro:"));
        libro.setAutor(JOptionPane.showInputDialog("Digite el autor del libro:"));
        libro.setEditorial(JOptionPane.showInputDialog("Digite la editorial del libro:"));
        libro.setIdLibro(Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del libro:")));
        
        NodoListaLibros nuevo = new NodoListaLibros();
        nuevo.setDato(libro);
        
        if(vacia()){
            inicio = nuevo;
        } else if (libro.getIdLibro()< inicio.getDato().getIdLibro()){
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else if (inicio.getSiguiente() == null){
            inicio.setSiguiente(nuevo);
        } else {
            NodoListaLibros aux = inicio;
            while ((aux.getSiguiente() != null)
                    && (aux.getSiguiente().getDato().getIdLibro()< libro.getIdLibro())) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }
    
    @Override
    public String toString(){
        NodoListaLibros aux = inicio;
        String s = "";
        do {
            s += "Titulo: " + aux.getDato().getTitulo()+ "\n" + "Autor: " + aux.getDato().getAutor()+ "\n"+"Editorial: " + aux.getDato().getEditorial()+ "\n"+
                "ID: " + aux.getDato().getIdLibro()+ "\n"+"-----------------------------------------------";
                aux = aux.getSiguiente();
        } while (aux != inicio);
        return s;
    }
  
}