package co.edu.uniquindio.Bicola;

public class Bicola {
    private NodoBicola frente;
    private NodoBicola fin;

    public Bicola() {
        frente = null;
        fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void agregar(int dato) {
        NodoBicola nuevo = new NodoBicola(dato);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }

    public void agregarFrente(int dato) {
        NodoBicola nuevo = new NodoBicola(dato);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(frente);
            frente.setAnterior(nuevo);
            frente = nuevo;
        }
    }
    
    public int eliminar() {
        if (estaVacia()) {
            System.out.println("La bicola está vacía");
            return -1;
        }

        int dato = frente.getDato();

        if (frente == fin) {
            frente = null;
            fin = null;
        } else {
            frente = frente.getSiguiente();
            frente.setAnterior(null);
        }

        return dato;
    }

    public int eliminarFinal() {
        if (estaVacia()) {
            System.out.println("La bicola está vacía");
            return -1;
        }

        int dato = fin.getDato();

        if (frente == fin) {
            frente = null;
            fin = null;
        } else {
            fin = fin.getAnterior();
            fin.setSiguiente(null);
        }

        return dato;
    }

    public boolean buscar(int dato) {
        NodoBicola aux = frente;

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
            System.out.println("La bicola está vacía");
            return;
        }

        NodoBicola aux = frente;
        while (aux != null) {
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
}
