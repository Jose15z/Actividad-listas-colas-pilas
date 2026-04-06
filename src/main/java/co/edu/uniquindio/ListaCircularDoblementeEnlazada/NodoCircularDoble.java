package co.edu.uniquindio.ListaCircularDoblementeEnlazada;

public class NodoCircularDoble {
    int dato;
    NodoCircularDoble siguiente;
    NodoCircularDoble anterior;

    public NodoCircularDoble(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}

