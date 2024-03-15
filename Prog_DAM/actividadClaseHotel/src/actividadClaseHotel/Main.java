package actividadClaseHotel;

//@Sergio Alvarez
//@Version 2.0

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar el programa del hotel.
 */
public class Main {
    private static final Scanner teclado = new Scanner(System.in);
    
    /**
     * Método principal que inicia la ejecución del programa del hotel.
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        inicializarHabitaciones(hotel);

        hotel.listarHabitaciones();
        System.out.println("\nHabitaciones disponibles:");
        hotel.listarHabitacionesDisponibles();

        obtenerYMostrarPrecio(hotel);

        hacerReserva(hotel);

        System.out.println("\nHabitaciones reservadas:");
        hotel.listarHabitacionesReservadas();
    }

    /**
     * Inicializa las habitaciones del hotel.
     *
     * @param hotel
     */
    private static void inicializarHabitaciones(Hotel hotel) {
        hotel.nuevaHabitacion("S11", 1, "simple", 50.0, true);
        hotel.nuevaHabitacion("D232", 2, "doble", 80.0, false);
        hotel.nuevaHabitacion("M361", 3, "matrimonial", 100.0, true);
        hotel.nuevaHabitacion("E491", 4, "especial", 120.0, false);
    }

    /**
     * Obtiene y muestra el precio de una habitación ingresada por el usuario.
     *
     * @param hotel
     */
    private static void obtenerYMostrarPrecio(Hotel hotel) {
        System.out.print("\nIntroduce el identificador de la habitación para obtener su precio: ");
        String identificadorPrecio = teclado.next();
        double precio = hotel.obtenerPrecioPorIdentificador(identificadorPrecio);
        if (precio != -1) {
            System.out.println("El precio de la habitación " + identificadorPrecio + " es: " + precio);
        } else {
            System.out.println("No existe ninguna habitación con ese código.");
        }
    }

    /**
     * Realiza una reserva para la habitación ingresada por el usuario.
     *
     * @param hotel
     */
    private static void hacerReserva(Hotel hotel) {
        System.out.print("\nIntroduce el identificador de la habitación para hacer una reserva: ");
        String identificadorReserva = teclado.next();
        hotel.hacerReserva(identificadorReserva);
    }
}
