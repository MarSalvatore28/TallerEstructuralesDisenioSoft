package FactoryMethod;

public class TareaSimple extends Tarea {
    public TareaSimple() {
        super("ID_SIMPLE", "Descripción de Tarea Simple", "Pendiente", java.time.LocalDateTime.now().plusDays(3));
    }

    @Override
    public void crear() {
        // Lógica específica para crear tareas simples
    }

}
