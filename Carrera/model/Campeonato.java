package model;
import java.util.ArrayList;

public class Campeonato {

    private ArrayList<Carrera> carreras;

    public Campeonato() {
        carreras = new ArrayList<>();
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }
}
