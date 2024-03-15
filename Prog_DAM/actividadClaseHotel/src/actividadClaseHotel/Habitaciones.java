package actividadClaseHotel;

//@Sergio Alvarez
//@Version 2.0

public class Habitaciones {
    private String identificador;
    private int planta;
    private String tipo;
    private double precio;
    private boolean ocupado;
    private boolean tieneVistaExterior;

    /**
     * Constructor que inicializa una nueva habitación con los parámetros proporcionados.
     * 
     * @param identificador : string
     * @param planta : int
     * @param tipo : string
     * @param precio : double
     * @param tieneVistaExterior : boolean
     */
    public Habitaciones(String identificador, int planta, String tipo, double precio, boolean tieneVistaExterior) {
        this.identificador = identificador;
        this.planta = planta;
        this.tipo = tipo;
        this.precio = precio;
        this.ocupado = false;
        this.tieneVistaExterior = tieneVistaExterior;
    }

    /**
     * Obtiene el identificador de la habitación.
     * 
     * @return Identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Establece el identificador de la habitación.
     * 
     * @param identificador : string
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Obtiene el número de planta de la habitación.
     * 
     * @return planta
     */
    public int getPlanta() {
        return planta;
    }

    /**
     * Establece el número de planta de la habitación.
     * 
     * @param planta : int
     */
    public void setPlanta(int planta) {
        this.planta = planta;
    }

    /**
     * Obtiene el tipo de la habitación.
     * 
     * @return Tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de la habitación.
     * 
     * @param tipo : string
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el precio por noche de la habitación.
     * 
     * @return Precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio por noche de la habitación.
     * 
     * @param precio : double
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Verifica si la habitación está ocupada.
     * 
     * @return true si la habitación está ocupada, false si está disponible.
     */
    public boolean getOcupado() {
        return ocupado;
    }

    /**
     * Establece el estado de ocupación de la habitación.
     * 
     * @param ocupado : boolean
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    /**
     * Verifica si la habitación tiene vista exterior.
     * 
     * @return true si la habitación tiene vista exterior, false si no la tiene.
     */
    public boolean getTieneVistaExterior() {
        return tieneVistaExterior;
    }

    /**
     * Establece si la habitación tiene vista exterior.
     * 
     * @param tieneVistaExterior : boolean
     */
    public void setTieneVistaExterior(boolean tieneVistaExterior) {
        this.tieneVistaExterior = tieneVistaExterior;
    }

    /**
     * Devuelve una representación en cadena de la habitación.
     * 
     * @return Cadena que representa la habitación con sus atributos.
     */
    @Override
    public String toString() {
        return "Habitacion [identificador=" + identificador + ", planta=" + planta + ", tipo=" + tipo + ", precio="
                + precio + ", ocupado=" + ocupado + ", tieneVistaExterior=" + tieneVistaExterior + "]";
    }
}
