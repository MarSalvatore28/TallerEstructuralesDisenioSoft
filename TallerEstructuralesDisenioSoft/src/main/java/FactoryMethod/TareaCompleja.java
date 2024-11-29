package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea {
    private List<Tarea> subTareas;

    public TareaCompleja() {
        super("ID_COMPLEJA", "Descripción de Tarea Compleja", "Pendiente", java.time.LocalDateTime.now().plusDays(7));
        this.subTareas = new ArrayList<>();
    }

    @Override
    public void crear() {
        // Lógica específica para crear tareas complejas
    }

    public void agregarSubTarea(Tarea tarea) {
        subTareas.add(tarea);
    }


}
