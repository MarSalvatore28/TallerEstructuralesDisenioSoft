package observer;

public class Email implements CentroNotificaciones {
    private String correoDestino;

    public Email(String correoDestino) {
        this.correoDestino = correoDestino;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        // Lógica para enviar notificación por correo electrónico
    }
}


