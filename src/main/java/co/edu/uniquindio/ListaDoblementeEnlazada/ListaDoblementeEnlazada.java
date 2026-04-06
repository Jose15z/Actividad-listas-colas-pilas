package co.edu.uniquindio.ListaDoblementeEnlazada;

public class ListaDoblementeEnlazada {
    private NodoDoble cabeza;

    public ListaDoblementeEnlazada() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlFinal(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);

        if (estaVacia()) {
            cabeza = nuevo;
            return;
        }

        NodoDoble aux = cabeza;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }

        aux.siguiente = nuevo;
        nuevo.anterior = aux;
    }

    public void mostrarAdelante() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoDoble aux = cabeza;
        while (aux != null) {
            System.out.print(aux.dato + " <-> ");
            aux = aux.siguiente;
        }
        System.out.println("null");
    }

    public void mostrarAtras() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoDoble aux = cabeza;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }

        while (aux != null) {
            System.out.print(aux.dato + " <-> ");
            aux = aux.anterior;
        }
        System.out.println("null");
    }

    public boolean buscar(int dato) {
        NodoDoble aux = cabeza;

        while (aux != null) {
            if (aux.dato == dato) {
                return true;
            }
            aux = aux.siguiente;
        }

        return false;
    }

    public void eliminar(int dato) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoDoble actual = cabeza;

        while (actual != null && actual.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Dato no encontrado.");
            return;
        }

        if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            if (cabeza != null) {
                cabeza.anterior = null;
            }
            return;
        }

        if (actual.siguiente != null) {
            actual.siguiente.anterior = actual.anterior;
        }

        if (actual.anterior != null) {
            actual.anterior.siguiente = actual.siguiente;
        }
    }
}
