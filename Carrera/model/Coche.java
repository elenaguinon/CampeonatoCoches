package model;

public class Coche {

    private String marca;
    private String modelo;
    private int kmRecorridos;
    private int puntosTotales;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kmRecorridos = 0;
        this.puntosTotales = 0;
    }

    public void sumarKm(int km) {
        this.kmRecorridos += km;
    }

    public void resetearKm() {
        this.kmRecorridos = 0;
    }

    public void sumarPuntos(int puntos) {
        this.puntosTotales += puntos;
    }

    public String getNombre() {
        return marca + " " + modelo;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }
}
