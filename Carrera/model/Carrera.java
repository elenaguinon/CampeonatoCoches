package model;

import java.util.ArrayList;

public class Carrera {

    private int kmCarrera;
    private ArrayList<Coche> coches;

    public Carrera(int kmCarrera, ArrayList<Coche> coches) {
        this.kmCarrera = kmCarrera;
        this.coches = coches;
    }

    public int getKmCarrera() {
        return kmCarrera;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }
}
