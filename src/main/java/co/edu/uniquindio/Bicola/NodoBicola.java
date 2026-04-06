package co.edu.uniquindio.Bicola;

public class NodoBicola {
    private int dato;
    private NodoBicola siguiente;
    private NodoBicola anterior;

    public NodoBicola(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoBicola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoBicola siguiente) {
        this.siguiente = siguiente;
    }

    public NodoBicola getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoBicola anterior) {
        this.anterior = anterior;
    }
}
