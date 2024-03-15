package examen14_03_2024;

public class Producto {

    private int codigo;
    private String descripcion;
    private double precio;
    private int existencias;

    
    public Producto(int codigo, String descripcion, double precio, int existencias) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

}