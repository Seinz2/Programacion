package tareaClase_01_03_24;

//@Sergio_Alvarez
//Version 16.2

public class Monitor extends Electrodomestico {

    public static final int RESOLUCION_DEFECTO = 30;

    private int resolucion;

    public Monitor() {
        this(PRECIO_BASE_DEFECTO, COLOR_BLANCO, CONSUMO_ENERGETICO_DEFECTO, PESO_DEFECTO, RESOLUCION_DEFECTO);
    }

    public Monitor(double precioBase, double peso) {
        this(precioBase, COLOR_BLANCO, CONSUMO_ENERGETICO_DEFECTO, peso, RESOLUCION_DEFECTO);
    }

    public Monitor(double precioBase, String color, char consumoEnergetico, double peso, int resolucion) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
    }

    public int getResolucion() {
        return resolucion;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }

}