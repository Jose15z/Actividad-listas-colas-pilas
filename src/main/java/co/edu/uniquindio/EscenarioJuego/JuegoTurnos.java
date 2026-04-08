package co.edu.uniquindio.EscenarioJuego;

import co.edu.uniquindio.ListaCircularDoblementeEnlazada.ListaCircularDoblementeEnlazada;

public class JuegoTurnos {
    private ListaCircularDoblementeEnlazada jugadores;

    public JuegoTurnos() {
        jugadores = new ListaCircularDoblementeEnlazada();
    }

    public void agregarJugador(int jugador) {
        jugadores.insertarAlFinal(jugador);
        System.out.println("Jugador agregado: " + jugador);
    }

    public void buscarJugador(int jugador) {
        if (jugadores.buscar(jugador)) {
            System.out.println("El jugador " + jugador + " está en la partida.");
        } else {
            System.out.println("El jugador " + jugador + " no está en la partida.");
        }
    }

    public void eliminarJugador(int jugador) {
        jugadores.eliminar(jugador);
        System.out.println("Se intentó eliminar al jugador: " + jugador);
    }

    public void mostrarJugadores() {
        System.out.print("Jugadores en turno: ");
        jugadores.mostrarAdelante();
    }

    public void siguienteTurno() {
        System.out.println("El turno pasa al siguiente jugador.");
    }

    public void turnoAnterior() {
        System.out.println("Se consulta el turno anterior.");
    }
}