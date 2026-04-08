package co.edu.uniquindio;

import co.edu.uniquindio.EscenarioHistorial.HistorialNavegacion;
import co.edu.uniquindio.EscenarioJuego.JuegoTurnos;
import co.edu.uniquindio.EscenarioMusica.ListaReproduccion;
import co.edu.uniquindio.EscenarioPanaderia.SistemaTurnosPanaderia;

public class Main {
    public static void main(String[] args) {

        System.out.println("=========== ESCENARIO 1: PANADERÍA ===========");
        SistemaTurnosPanaderia panaderia = new SistemaTurnosPanaderia();
        panaderia.registrarTurno(1);
        panaderia.registrarTurno(2);
        panaderia.registrarTurno(3);
        panaderia.mostrarTurnos();
        panaderia.buscarTurno(2);
        panaderia.atenderTurno();
        panaderia.mostrarTurnos();

        System.out.println("\n=========== ESCENARIO 2: HISTORIAL ===========");
        HistorialNavegacion historial = new HistorialNavegacion();
        historial.visitarPagina(10);
        historial.visitarPagina(20);
        historial.visitarPagina(30);
        historial.mostrarHistorialAdelante();
        historial.mostrarHistorialAtras();
        historial.buscarPagina(20);
        historial.eliminarPagina(20);
        historial.mostrarHistorialAdelante();

        System.out.println("\n=========== ESCENARIO 3: MÚSICA ===========");
        ListaReproduccion musica = new ListaReproduccion();
        musica.agregarCancion(101);
        musica.agregarCancion(102);
        musica.agregarCancion(103);
        musica.mostrarLista();
        musica.buscarCancion(102);
        musica.eliminarCancion(102);
        musica.mostrarLista();
        musica.siguienteCancion();

        System.out.println("\n=========== ESCENARIO 4: JUEGO ===========");
        JuegoTurnos juego = new JuegoTurnos();
        juego.agregarJugador(1);
        juego.agregarJugador(2);
        juego.agregarJugador(3);
        juego.mostrarJugadores();
        juego.buscarJugador(2);
        juego.eliminarJugador(2);
        juego.mostrarJugadores();
        juego.siguienteTurno();
        juego.turnoAnterior();
    }
}