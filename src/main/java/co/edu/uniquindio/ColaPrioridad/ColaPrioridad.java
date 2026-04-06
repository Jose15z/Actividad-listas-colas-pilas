package co.edu.uniquindio.ColaPrioridad;

public class ColaPrioridad {
    private NodoPrioridad frente;

    public ColaPrioridad() {
        frente = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void agregar(int dato) {
        NodoPrioridad nuevo = new NodoPrioridad(dato);

        if (estaVacia() || dato < frente.getDato()) {
            nuevo.setSiguiente(frente);
            frente = nuevo;
        } else {
            NodoPrioridad aux = frente;

            while (aux.getSiguiente() != null && aux.getSiguiente().getDato() <= dato) {
                aux = aux.getSiguiente();
            }

            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public int eliminar() {
        if (estaVacia()) {
            System.out.println("La cola de prioridad está vacía");
            return -1;
        }

        int dato = frente.getDato();
        frente = frente.getSiguiente();
        return dato;
    }

    public boolean buscar(int dato) {
        NodoPrioridad aux = frente;

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
            System.out.println("La cola de prioridad está vacía");
            return;
        }

        NodoPrioridad aux = frente;
        while (aux != null) {
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
}
