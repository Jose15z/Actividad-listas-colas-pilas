package co.edu.uniquindio.EscenarioMusica;

import co.edu.uniquindio.ListaCircularSimplementeEnlazada.ListaCircularSimplementeEnlazada;

public class ListaReproduccion {
    private ListaCircularSimplementeEnlazada canciones;

    public ListaReproduccion() {
        canciones = new ListaCircularSimplementeEnlazada();
    }

    public void agregarCancion(int cancion) {
        canciones.insertarAlFinal(cancion);
        System.out.println("Canción agregada: " + cancion);
    }

    public void buscarCancion(int cancion) {
        if (canciones.buscar(cancion)) {
            System.out.println("La canción " + cancion + " está en la lista.");
        } else {
            System.out.println("La canción " + cancion + " no está en la lista.");
        }
    }

    public void eliminarCancion(int cancion) {
        canciones.eliminar(cancion);
        System.out.println("Se intentó eliminar la canción: " + cancion);
    }

    public void mostrarLista() {
        System.out.print("Lista de reproducción: ");
        canciones.mostrar();
    }

    public void siguienteCancion() {
        System.out.println("La reproducción continúa de forma circular.");
    }
}