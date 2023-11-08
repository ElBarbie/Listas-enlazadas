package practicasegundocasodeestudio;

import java.util.Objects;

public class Categoria {
    private int idCateg;
    private String nombCateg;
    private ListaLibros libros;
    
    public Categoria(int idCateg, String nombCateg) {
        this.idCateg = idCateg;
        this.nombCateg = nombCateg;
        this.libros = new ListaLibros();
    }

    public ListaLibros getLibros() {
        return libros;
    }

    public void setLibros(ListaLibros libros) {
        this.libros = libros;
    }

    public int getIdCateg() {
        return idCateg;
    }

    public void setIdCateg(int idCateg) {
        this.idCateg = idCateg;
    }

    public String getNombCateg() {
        return nombCateg;
    }

    public void setNombCateg(String nombCateg) {
        this.nombCateg = nombCateg;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.idCateg != other.idCateg) {
            return false;
        }
        return Objects.equals(this.nombCateg, other.nombCateg);
    }
    
    
}