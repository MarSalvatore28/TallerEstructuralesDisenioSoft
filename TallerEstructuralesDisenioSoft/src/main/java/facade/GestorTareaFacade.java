/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;
import java.util.ArrayList;
import java.util.List;

import FactoryMethod.Tarea;
import FactoryMethod.TareaComplejaFactory;
import FactoryMethod.TareaFactory;
import FactoryMethod.TareaSimpleFactory;
import observer.CentroNotificaciones;
import observer.Notificador;
import strategy.EstrategiaVisualizacion;

/**
 *
 * @author DHAMAR
 */


public class GestorTareaFacade {
    private TareaFactory tareaFactory;
    private Notificador notificador;
    private EstrategiaVisualizacion estrategiaVisualizacion;
    private List<Tarea> listaTareas;

    public GestorTareaFacade() {
        this.notificador = new Notificador();
        this.listaTareas = new ArrayList<>();
    }

    // Crear una tarea según el tipo (SIMPLE o COMPLEJA)
    public void crearTarea(String tipo) {
        if ("SIMPLE".equalsIgnoreCase(tipo)) {
            tareaFactory = new TareaSimpleFactory();
        } else if ("COMPLEJA".equalsIgnoreCase(tipo)) {
            tareaFactory = new TareaComplejaFactory();
        }

        Tarea tarea = tareaFactory.crearTarea();
        tarea.crear();
        listaTareas.add(tarea);

        // Notificar creación de la tarea
        notificador.notificar("Tarea creada: " + tarea.getDescripcion());
    }

    // Listar todas las tareas actuales
    public List<Tarea> listarTareas() {
        return listaTareas;
    }

    // Eliminar una tarea del sistema
    public void eliminarTarea(Tarea tarea) {
        listaTareas.remove(tarea);
        notificador.notificar("Tarea eliminada: " + tarea.getDescripcion());
    }

    // Establecer una estrategia de visualización
    public void cambiarEstrategiaVisualizacion(EstrategiaVisualizacion estrategia) {
        this.estrategiaVisualizacion = estrategia;
    }

    // Mostrar las tareas utilizando la estrategia definida
    public void mostrarTareas() {
        if (estrategiaVisualizacion != null) {
            estrategiaVisualizacion.mostrarTareas(listaTareas);
        } else {
            System.out.println("No se ha definido una estrategia de visualización.");
        }
    }

    // Suscribir un observador para recibir notificaciones
    public void agregarSuscriptor(CentroNotificaciones suscriptor) {
        notificador.agregarSuscriptor(suscriptor);
    }

    // Eliminar un observador del sistema de notificaciones
    public void eliminarSuscriptor(CentroNotificaciones suscriptor) {
        notificador.eliminarSuscriptor(suscriptor);
    }
}