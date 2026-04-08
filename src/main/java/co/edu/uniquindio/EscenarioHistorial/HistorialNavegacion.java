package co.edu.uniquindio.EscenarioHistorial;

import co.edu.uniquindio.ListaDoblementeEnlazada.ListaDoblementeEnlazada;

public class HistorialNavegacion {
    private ListaDoblementeEnlazada historial;

    public HistorialNavegacion() {
        historial = new ListaDoblementeEnlazada();
    }

    public void visitarPagina(int pagina) {
        historial.insertarAlFinal(pagina);
        System.out.println("Página visitada: " + pagina);
    }

    public void buscarPagina(int pagina) {
        if (historial.buscar(pagina)) {
            System.out.println("La página " + pagina + " está en el historial.");
        } else {
            System.out.println("La página " + pagina + " no está en el historial.");
        }
    }

    public void eliminarPagina(int pagina) {
        historial.eliminar(pagina);
        System.out.println("Se intentó eliminar la página: " + pagina);
    }

    public void mostrarHistorialAdelante() {
        System.out.print("Historial hacia adelante: ");
        historial.mostrarAdelante();
    }

    public void mostrarHistorialAtras() {
        System.out.print("Historial hacia atrás: ");
        historial.mostrarAtras();
    }
}