package co.edu.uniquindio.Pila;

public class Pila {
    private NodoPila cima;

    public Pila() {
        cima = null;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void agregar(int dato) {
        NodoPila nuevo = new NodoPila(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    public int eliminar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return -1;
        }

        int dato = cima.getDato();
        cima = cima.getSiguiente();
        return dato;
    }

    public boolean buscar(int dato) {
        NodoPila aux = cima;

        while (aux != null) {
            if (aux.getDato() == dato) {
                return true;
            }
            aux = aux.getSiguiente();
        }

        return false;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return;
        }

        NodoPila aux = cima;
        while (aux != null) {
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
}
