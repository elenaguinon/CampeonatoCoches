package controller;
import model.Carrera;
import model.Coche;
import java.util.ArrayList;
import java.util.Random;

public class CarreraController {

    public void simularCarrera(Carrera carrera) {
        Random aleatorio = new Random();
        boolean carreraTerminada = false;

        for (Coche coche : carrera.getCoches()) {
            coche.resetearKm();
        }

        while (!carreraTerminada) {
            for (Coche coche : carrera.getCoches()) {
                int avance = aleatorio.nextInt(10) + 1;
                coche.sumarKm(avance);

                if (coche.getKmRecorridos() >= carrera.getKmCarrera()) {
                    carreraTerminada = true;
                }
            }
        }

        ordenarPorKm(carrera.getCoches());
        asignarPuntos(carrera.getCoches());
        mostrarResultados(carrera.getCoches());
    }

    private void ordenarPorKm(ArrayList<Coche> coches) {
        for (int i = 0; i < coches.size() - 1; i++) {
            for (int j = i + 1; j < coches.size(); j++) {

                if (coches.get(j).getKmRecorridos() > coches.get(i).getKmRecorridos()) {
                    Coche temp = coches.get(i);
                    coches.set(i, coches.get(j));
                    coches.set(j, temp);}
            }
        }
    }

    private void asignarPuntos(ArrayList<Coche> coches) {
        if (coches.size() > 0) coches.get(0).sumarPuntos(10);
        if (coches.size() > 1) coches.get(1).sumarPuntos(8);
        if (coches.size() > 2) coches.get(2).sumarPuntos(6);
    }

    private void mostrarResultados(ArrayList<Coche> coches) {
        System.out.println("Resultado de la carrera:");
        for (int i = 0; i < coches.size(); i++) {
            Coche c = coches.get(i);
            System.out.println(
                    (i + 1) + c.getNombre() + "ha recorrido: " + c.getKmRecorridos()+" km");
        }

        System.out.println(" El podio de esta carrera es:");
        if (coches.size() >= 3) {
            System.out.println("1º " + coches.get(0).getNombre());
            System.out.println("2º " + coches.get(1).getNombre());
            System.out.println("3º " + coches.get(2).getNombre());
        }
    }
}
