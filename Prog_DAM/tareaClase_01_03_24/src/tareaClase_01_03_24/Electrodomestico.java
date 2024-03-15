package tareaClase_01_03_24;

//@Sergio_Alvarez
//Version 16.2

public class Electrodomestico {

    public static final String COLOR_BLANCO = "blanco";
    public static final String COLOR_NEGRO = "negro";
    public static final String COLOR_GRIS = "gris";

    public static final char CONSUMO_ENERGETICO_DEFECTO = 'F';

    public static final double PRECIO_BASE_DEFECTO = 200.0;
    public static final double PESO_DEFECTO = 8.0;

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this(PRECIO_BASE_DEFECTO, COLOR_BLANCO, CONSUMO_ENERGETICO_DEFECTO, PESO_DEFECTO);
    }

    public Electrodomestico(double precioBase, String color) {
        this(precioBase, color, comprobarConsumoEnergetico(CONSUMO_ENERGETICO_DEFECTO), PESO_DEFECTO);
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color.toLowerCase();
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private static char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return CONSUMO_ENERGETICO_DEFECTO;
        }
    }

    public double precioFinal() {
        double aumentoPrecio = 0;
        switch (consumoEnergetico) {
            case 'A':
                aumentoPrecio += 100;
                break;
            case 'B':
                aumentoPrecio += 80;
                break;
            case 'C':
                aumentoPrecio += 60;
                break;
            case 'D':
                aumentoPrecio += 40;
                break;
        }

        if (peso >= 0 && peso <= 19) {
            aumentoPrecio += 10;
        } else if (peso >= 20 && peso <= 49) {
            aumentoPrecio += 50;
        } else if (peso >= 50 && peso <= 79) {
            aumentoPrecio += 80;
        } else if (peso >= 80) {
            aumentoPrecio += 100;
        }

        return precioBase + aumentoPrecio;
    }

}
