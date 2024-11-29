package FactoryMethod;

public class TareaSimpleFactory implements TareaFactory {
    @Override
    public Tarea crearTarea() {
        return new TareaSimple();
    }

}
