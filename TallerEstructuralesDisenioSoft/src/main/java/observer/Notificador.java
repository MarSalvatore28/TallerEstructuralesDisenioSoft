package observer;

import java.util.ArrayList;
import java.util.List;

public class Notificador {
        private List<CentroNotificaciones> suscriptores = new ArrayList<>();

    public void agregarSuscriptor(CentroNotificaciones suscriptor) {
        suscriptores.add(suscriptor);
    }

    public void eliminarSuscriptor(CentroNotificaciones suscriptor) {
        suscriptores.remove(suscriptor);
    }

    public void notificar(String mensaje) {
        for (CentroNotificaciones suscriptor : suscriptores) {
            suscriptor.enviarNotificacion(mensaje);
        }
    }
}

