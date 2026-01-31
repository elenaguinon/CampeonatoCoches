package main;
import controller.CampeonatoController;
import model.Campeonato;
import model.Carrera;
import model.Coche;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Coche> coches = new ArrayList<>();

        System.out.print("¿Cuántos coches correrán el campeonato?: ");
        int numCoches = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCoches; i++) {
            System.out.print("Marca del coche " + (i + 1) + ": ");
            String marca = sc.nextLine();

            System.out.print("Modelo del coche " + (i + 1) + ": ");
            String modelo = sc.nextLine();

            coches.add(new Coche(marca, modelo));
        }

        Campeonato campeonato = new Campeonato();

        System.out.print("Indica el número de carreras que tiene el campeonato: ");
        int numCarreras = sc.nextInt();

        for (int i = 0; i < numCarreras; i++) {
            System.out.print("Km de la carrera " + (i + 1) + ": ");
            int kmCarrera = sc.nextInt();

            campeonato.agregarCarrera(new Carrera(kmCarrera, coches));
        }

        CampeonatoController controller = new CampeonatoController();
        controller.correrCampeonato(campeonato);
    }
}
