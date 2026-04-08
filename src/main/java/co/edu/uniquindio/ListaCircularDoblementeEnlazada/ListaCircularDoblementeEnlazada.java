package co.edu.uniquindio.ListaCircularDoblementeEnlazada;

public class ListaCircularDoblementeEnlazada {
    private NodoCircularDoble cabeza;

    public ListaCircularDoblementeEnlazada() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlFinal(int dato) {
        NodoCircularDoble nuevo = new NodoCircularDoble(dato);

        if (estaVacia()) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            return;
        }

        NodoCircularDoble ultimo = cabeza.anterior;

        ultimo.siguiente = nuevo;
        nuevo.anterior = ultimo;
        nuevo.siguiente = cabeza;
        cabeza.anterior = nuevo;
    }
    
    public void mostrarAdelante() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoCircularDoble aux = cabeza;
        do {
            System.out.print(aux.dato + " <-> ");
            aux = aux.siguiente;
        } while (aux != cabeza);

        System.out.println("(regresa a cabeza)");
    }

    public void mostrarAtras() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoCircularDoble aux = cabeza.anterior;
        NodoCircularDoble fin = aux;

        do {
            System.out.print(aux.dato + " <-> ");
            aux = aux.anterior;
        } while (aux != fin);

        System.out.println("(regresa al final)");
    }

    public boolean buscar(int dato) {
        if (estaVacia()) {
            return false;
        }

        NodoCircularDoble aux = cabeza;
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

        NodoCircularDoble actual = cabeza;

        do {
            if (actual.dato == dato) {
                if (actual.siguiente == actual) {
                    cabeza = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;

                    if (actual == cabeza) {
                        cabeza = actual.siguiente;
                    }
                }
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("Dato no encontrado.");
    }
}
