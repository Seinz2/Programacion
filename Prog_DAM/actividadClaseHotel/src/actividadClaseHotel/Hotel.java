package actividadClaseHotel;

//@Sergio Alvarez
//@Version 2.0

public class Hotel {
    // Array que almacena las habitaciones del hotel.
    private Habitaciones[] habitaciones;

    /**
     * Constructor que inicializa el hotel con un array de habitaciones.
     */
    public Hotel() {
        habitaciones = new Habitaciones[10];
    }

    /**
     * Crea una nueva habitación e inserta en la primera posición libre del array.
     *
     * @param identificador : string
     * @param planta : int
     * @param tipo : string
     * @param precio : double
     * @param tieneVistaExterior : boolean
     */
    public void nuevaHabitacion(String identificador, int planta, String tipo, double precio, boolean tieneVistaExterior) {
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] == null) {
                habitaciones[i] = new Habitaciones(identificador, planta, tipo, precio, tieneVistaExterior);
                System.out.println("Habitación creada: " + habitaciones[i]);
                return;
            }
        }
        System.out.println("No hay huecos libres para crear una nueva habitación.");
    }

    /**
     * Elimina una habitación por su identificador si está disponible.
     *
     * @param identificador : string
     */
    public void borrarHabitacion(String identificador) {
        Habitaciones habitacion = buscarHabitacionPorIdentificador(identificador);
        
        if (habitacion != null) {
            if (!habitacion.getOcupado()) {
                habitacion = null;
                System.out.println("Habitación borrada: " + identificador);
            } else {
                System.out.println("No se puede borrar una habitación ocupada.");
            }
        } else {
            System.out.println("No existe ninguna habitación con ese código.");
        }
    }

    /**
     * Dice todas las habitaciones del hotel.
     */
    public void listarHabitaciones() {
        for (Habitaciones habitacion : habitaciones) {
            if (habitacion != null) {
                System.out.println(habitacion);
            }
        }
    }

    /**
     * Dice las habitaciones disponibles del hotel.
     */
    public void listarHabitacionesDisponibles() {
        for (Habitaciones habitacion : habitaciones) {
            if (habitacion != null && !habitacion.getOcupado()) {
                System.out.println(habitacion);
            }
        }
    }

    /**
     * Obtiene el precio de una habitación por su identificador.
     *
     * @param identificador : string
     * @return Precio por noche de la habitación. Si no se encuentra la habitación, devuelve -1.
     */
    public double obtenerPrecioPorIdentificador(String identificador) {
        Habitaciones habitacion = buscarHabitacionPorIdentificador(identificador);
        return (habitacion != null) ? habitacion.getPrecio() : -1;
    }

    /**
     * Realiza una reserva para la habitación indicada si está disponible.
     *
     * @param identificador : string
     */
    public void hacerReserva(String identificador) {
        Habitaciones habitacion = buscarHabitacionPorIdentificador(identificador);
        
        if (habitacion != null) {
            if (!habitacion.getOcupado()) {
                habitacion.setOcupado(true);
                System.out.println("Reserva realizada para la habitación: " + identificador);
            } else {
                System.out.println("La habitación ya está ocupada. No se puede reservar.");
            }
        } else {
            System.out.println("No existe ninguna habitación con ese código.");
        }
    }

    /**
     * Lista las habitaciones que están actualmente reservadas.
     */
    public void listarHabitacionesReservadas() {
        for (Habitaciones habitacion : habitaciones) {
            if (habitacion != null && habitacion.getOcupado()) {
                System.out.println(habitacion);
            }
        }
    }

    /**
     * Busca una habitación por su identificador.
     *
     * @param identificador : string
     * @return La habitación si se encuentra, o null si no existe.
     */
    private Habitaciones buscarHabitacionPorIdentificador(String identificador) {
        for (Habitaciones habitacion : habitaciones) {
            if (habitacion != null && habitacion.getIdentificador().equals(identificador)) {
                return habitacion;
            }
        }
        return null;
    }
}