package co.edu.uniquindio.ColaPrioridad;

public class NodoPrioridad {
    private int dato;
    private NodoPrioridad siguiente;

    public NodoPrioridad(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoPrioridad getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPrioridad siguiente) {
        this.siguiente = siguiente;
    }
}
