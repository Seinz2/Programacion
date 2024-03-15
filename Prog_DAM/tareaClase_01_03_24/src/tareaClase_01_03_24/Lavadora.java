package tareaClase_01_03_24;

//@Sergio_Alvarez
//Version 16.2

public class Lavadora extends Electrodomestico {

    public static final int CARGA_DEFECTO = 5;

    private int carga;

    public Lavadora() {
        this(PRECIO_BASE_DEFECTO, COLOR_BLANCO, CONSUMO_ENERGETICO_DEFECTO, CARGA_DEFECTO);
    }

    public Lavadora(double precioBase, String color) {
        this(precioBase, color, CONSUMO_ENERGETICO_DEFECTO, CARGA_DEFECTO);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, int carga) {
        super(precioBase, color, consumoEnergetico, PESO_DEFECTO);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 10) {
            precioFinal += 100;
        }
        return precioFinal;
    }

}
