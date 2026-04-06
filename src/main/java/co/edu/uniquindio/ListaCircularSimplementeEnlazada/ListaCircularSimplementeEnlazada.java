package co.edu.uniquindio.ListaCircularSimplementeEnlazada;

public class ListaCircularSimplementeEnlazada {
    private NodoCircularSimple cabeza;

    public ListaCircularSimplementeEnlazada() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlFinal(int dato) {
        NodoCircularSimple nuevo = new NodoCircularSimple(dato);

        if (estaVacia()) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            return;
        }

        NodoCircularSimple aux = cabeza;
        while (aux.siguiente != cabeza) {
            aux = aux.siguiente;
        }

        aux.siguiente = nuevo;
        nuevo.siguiente = cabeza;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoCircularSimple aux = cabeza;
        do {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        } while (aux != cabeza);

        System.out.println("(regresa a cabeza)");
    }

    public boolean buscar(int dato) {
        if (estaVacia()) {
            return false;
        }

        NodoCircularSimple aux = cabeza;
        do {
            if (aux.dato == dato) {
                return true;
            }
            aux = aux.siguiente;
        } while (aux != cabeza);

        return false;
    }

    public void eliminar(int dato) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoCircularSimple actual = cabeza;
        NodoCircularSimple anterior = null;

        do {
            if (actual.dato == dato) {
                if (actual == cabeza) {
                    if (cabeza.siguiente == cabeza) {
                        cabeza = null;
                    } else {
                        NodoCircularSimple ultimo = cabeza;
                        while (ultimo.siguiente != cabeza) {
                            ultimo = ultimo.siguiente;
                        }
                        cabeza = cabeza.siguiente;
                        ultimo.siguiente = cabeza;
                    }
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                return;
            }

            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("Dato no encontrado.");
    }
}
