package observer;

public class SMS implements CentroNotificaciones {
    private int numero;

    public SMS(int numero) {
        this.numero = numero;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        // Lógica para enviar notificación por SMS
    }
}
