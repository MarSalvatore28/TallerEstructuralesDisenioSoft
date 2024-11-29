package FactoryMethod;

public abstract class Tarea {
    protected String id;
    protected String descripcion;
    protected String estado;
    protected java.time.LocalDateTime fechaCreacion;
    protected java.time.LocalDateTime fechaVencimiento;

    public Tarea(String id, String descripcion, String estado, java.time.LocalDateTime fechaVencimiento) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = java.time.LocalDateTime.now();
        this.fechaVencimiento = fechaVencimiento;
    }

    public abstract void crear(); 


}
