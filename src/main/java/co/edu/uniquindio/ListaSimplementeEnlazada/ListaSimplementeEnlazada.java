
package co.edu.uniquindio.ListaSimplementeEnlazada;

public class ListaSimplementeEnlazada {
    private Nodo cabeza;

    public ListaSimplementeEnlazada() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (estaVacia()) {
            cabeza = nuevo;
            return;
        }

        Nodo aux = cabeza;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }

        aux.siguiente = nuevo;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo aux = cabeza;
        while (aux != null) {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        }
        System.out.println("null");
    }

    public boolean buscar(int dato) {
        Nodo aux = cabeza;

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

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        } else {
            System.out.println("Dato no encontrado.");
        }
    }
}