package co.edu.uniquindio;

import co.edu.uniquindio.Bicola.Bicola;
import co.edu.uniquindio.Cola.Cola;
import co.edu.uniquindio.ColaPrioridad.ColaPrioridad;
import co.edu.uniquindio.ListaCircularSimplementeEnlazada.ListaCircularSimplementeEnlazada;
import co.edu.uniquindio.ListaDoblementeEnlazada.ListaDoblementeEnlazada;
import co.edu.uniquindio.ListaSimplementeEnlazada.ListaSimplementeEnlazada;
import co.edu.uniquindio.Pila.Pila;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== COLA ==========");
        Cola cola = new Cola();
        cola.agregar(10);
        cola.agregar(20);
        cola.agregar(30);
        cola.mostrar();
        System.out.println("Buscar 20: " + cola.buscar(20));
        System.out.println("Eliminar: " + cola.eliminar());
        cola.mostrar();

        System.out.println("\n========== BICOLA ==========");
        Bicola bicola = new Bicola();
        bicola.agregar(100);
        bicola.agregar(200);
        bicola.agregarFrente(50);
        bicola.mostrar();
        System.out.println("Buscar 100: " + bicola.buscar(100));
        System.out.println("Eliminar del frente: " + bicola.eliminar());
        System.out.println("Eliminar del final: " + bicola.eliminarFinal());
        bicola.mostrar();

        System.out.println("\n========== COLA DE PRIORIDAD ==========");
        ColaPrioridad colaPrioridad = new ColaPrioridad();
        colaPrioridad.agregar(30);
        colaPrioridad.agregar(10);
        colaPrioridad.agregar(20);
        colaPrioridad.agregar(5);
        colaPrioridad.mostrar();
        System.out.println("Buscar 20: " + colaPrioridad.buscar(20));
        System.out.println("Eliminar: " + colaPrioridad.eliminar());
        colaPrioridad.mostrar();

        System.out.println("\n========== PILA ==========");
        Pila pila = new Pila();
        pila.agregar(1);
        pila.agregar(2);
        pila.agregar(3);
        pila.mostrar();
        System.out.println("Buscar 2: " + pila.buscar(2));
        System.out.println("Eliminar: " + pila.eliminar());
        pila.mostrar();

        System.out.println("\n========== LISTA SIMPLEMENTE ENLAZADA ==========");
        ListaSimplementeEnlazada listaSimple = new ListaSimplementeEnlazada();
        listaSimple.insertarAlFinal(10);
        listaSimple.insertarAlFinal(20);
        listaSimple.insertarAlFinal(30);
        listaSimple.mostrar();
        System.out.println("Buscar 20: " + listaSimple.buscar(20));
        listaSimple.eliminar(20);
        listaSimple.mostrar();

        System.out.println("\n========== LISTA DOBLEMENTE ENLAZADA ==========");
        ListaDoblementeEnlazada listaDoble = new ListaDoblementeEnlazada();
        listaDoble.insertarAlFinal(5);
        listaDoble.insertarAlFinal(15);
        listaDoble.insertarAlFinal(25);

        System.out.println("Mostrar hacia adelante:");
        listaDoble.mostrarAdelante();

        System.out.println("Mostrar hacia atrás:");
        listaDoble.mostrarAtras();

        System.out.println("Buscar 15: " + listaDoble.buscar(15));
        listaDoble.eliminar(15);

        System.out.println("Después de eliminar 15:");
        listaDoble.mostrarAdelante();

        System.out.println("\n========== LISTA CIRCULAR SIMPLEMENTE ENLAZADA ==========");
        ListaCircularSimplementeEnlazada listaCircular = new ListaCircularSimplementeEnlazada();
        listaCircular.insertarAlFinal(7);
        listaCircular.insertarAlFinal(14);
        listaCircular.insertarAlFinal(21);
        listaCircular.mostrar();
        System.out.println("Buscar 14: " + listaCircular.buscar(14));
        listaCircular.eliminar(14);
        listaCircular.mostrar();
    }
}