package tareaClase_01_03_24;

//@Sergio_Alvarez
//Version 16.2

public class Tienda {

    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[6];

        electrodomesticos[0] = new Lavadora(500.0, "negro", 'A', 10);
        electrodomesticos[1] = new Lavadora(300.0, "gris", 'B', 8);
        electrodomesticos[2] = new Lavadora(400.0, "blanco", 'C', 12);

    }
}