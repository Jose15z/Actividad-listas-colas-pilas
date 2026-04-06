package co.edu.uniquindio.Cola;

public class Cola {
    private NodoCola frente;
    private NodoCola fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }


    public void agregar(int dato) {
        NodoCola nuevo = new NodoCola(dato);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

 
    public int eliminar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }

        int dato = frente.getDato();
        frente = frente.getSiguiente();

        if (frente == null) {
            fin = null;
        }

        return dato;
    }

    public boolean buscar(int dato) {
        NodoCola aux = frente;

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
            System.out.println("La cola está vacía");
            return;
        }

        NodoCola aux = frente;
        while (aux != null) {
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
}