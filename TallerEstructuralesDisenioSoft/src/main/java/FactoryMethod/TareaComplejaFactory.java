package FactoryMethod;

public class TareaComplejaFactory implements TareaFactory  {
    @Override
    public Tarea crearTarea() {
        return new TareaCompleja();
    }

}
