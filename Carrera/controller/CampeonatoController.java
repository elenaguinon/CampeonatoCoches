package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;
import java.util.ArrayList;
public class CampeonatoController {

    private CarreraController carreraController;

    public CampeonatoController() {
        carreraController = new CarreraController();
    }

    public void correrCampeonato(Campeonato campeonato) {
        int numeroCarrera = 1;

        for (Carrera carrera : campeonato.getCarreras()) {
            System.out.println("Carrera " + numeroCarrera);
            carreraController.simularCarrera(carrera);
            mostrarClasificacion(carrera.getCoches());
            numeroCarrera++;}

        mostrarClasificacionFinal(campeonato.getCarreras().get(0).getCoches());
    }

    private void mostrarClasificacion(ArrayList<Coche> coches) {
        ordenarPorPuntos(coches);

        System.out.println("Clasificación:");
        for (Coche c : coches) {
            System.out.println(c.getNombre() + " - Puntos: " + c.getPuntosTotales());
        }

        System.out.println("Líder: " + coches.get(0).getNombre());}

    private void mostrarClasificacionFinal(ArrayList<Coche> coches) {
        ordenarPorPuntos(coches);

        System.out.println("Clasificación final");
        for (Coche c : coches) {
            System.out.println(c.getNombre() + " - Puntos: " + c.getPuntosTotales());
        }

        System.out.println("¡Enhorabuena al campeón! " + coches.get(0).getNombre());
    }

    private void ordenarPorPuntos(ArrayList<Coche> coches) {
        for (int i = 0; i < coches.size() - 1; i++) {
            for (int j = i + 1; j < coches.size(); j++) {

                if (coches.get(j).getPuntosTotales() > coches.get(i).getPuntosTotales()) {
                    Coche temp = coches.get(i);
                    coches.set(i, coches.get(j));
                    coches.set(j, temp);
                }
            }
        }

    }
}
