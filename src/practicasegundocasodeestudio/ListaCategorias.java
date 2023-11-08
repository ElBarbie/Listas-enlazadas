package practicasegundocasodeestudio;

import javax.swing.JOptionPane;

public class ListaCategorias {
    
    private NodoListaCategorias inicio;
    private NodoListaCategorias fin;

    public ListaCategorias() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean vacia(){
        if(inicio == null){
            return true;
        } else {
            return false;
        }
    }
    public void insertarCategoria(){
        Categoria categoria = new Categoria(0,"");
        categoria.setNombCateg(JOptionPane.showInputDialog("Digite la categoria:"));
        categoria.setIdCateg(Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del la categoria:"))); 
        
        NodoListaCategorias nuevo = new NodoListaCategorias();
        nuevo.setDato(categoria);
        
        if(vacia()){
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            
        }else {
            NodoListaCategorias aux = inicio;
            while ((aux.getSiguiente() != null)
                    && (aux.getSiguiente().getDato().getIdCateg()< categoria.getIdCateg())) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }
    
    public void insertarLibro(){
        //Checkear si la categoria existe
        //Si existe conseguir la lista de esa categoria
        //Insertar en esta lista de libro
        String c = JOptionPane.showInputDialog("En cual de las categorias desea ingresar el libro: ");
        if(existe(c)){
        }
        //------------------------------------------------------------------------
        // Si NO existe esa categoria inserte una nueva categoria(regresa al menu)
    }
     
    @Override
    public String toString(){
        NodoListaCategorias aux = inicio;
        String s = "";
        do {
            s += "Categoria: " + aux.getDato().getNombCateg()+ "\n" + "ID: " + aux.getDato().getIdCateg()+ "\n"+"-----------------------------------------------";
            aux = aux.getSiguiente();
        } while (aux != inicio);
        
        return s;
    }
    
    public boolean existe(String nombre){
        boolean existe = false;
        
        if(inicio != null){
            NodoListaCategorias aux = inicio;
            while(aux != fin && aux.getDato().getNombCateg().equalsIgnoreCase(nombre)){
                
            }
        }
        return existe;
    }
}