package co.edu.uniquindio.EscenarioPanaderia;

import co.edu.uniquindio.Cola.Cola;

public class SistemaTurnosPanaderia {
    private Cola colaTurnos;

    public SistemaTurnosPanaderia() {
        colaTurnos = new Cola();
    }

    public void registrarTurno(int turno) {
        colaTurnos.agregar(turno);
        System.out.println("Turno registrado: " + turno);
    }

    public void atenderTurno() {
        int turnoAtendido = colaTurnos.eliminar();
        if (turnoAtendido != -1) {
            System.out.println("Turno atendido: " + turnoAtendido);
        }
    }

    public void buscarTurno(int turno) {
        if (colaTurnos.buscar(turno)) {
            System.out.println("El turno " + turno + " está en espera.");
        } else {
            System.out.println("El turno " + turno + " no está en espera.");
        }
    }

    public void mostrarTurnos() {
        System.out.print("Turnos en cola: ");
        colaTurnos.mostrar();
    }
}