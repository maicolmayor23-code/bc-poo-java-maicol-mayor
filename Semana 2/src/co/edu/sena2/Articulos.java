package co.edu.sena2;

public class Articulos {
    private String nombre;
    private String categoria;
    private int stock;
    private double precio;
    private boolean estado;

    public Articulos() {

    }

    public Articulos(String nombre, String categoria, int stock,  boolean estado) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
        this.estado = estado;
    }

    public void informaciongeneral() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Categoria:" + categoria);
        System.out.println("Stock:" + stock);
        System.out.println("Precio de Fabrica= $" + precio);
        System.out.println("Disponibilidad: " + (estado ? "ACTIVO" : "INACTIVO"));

    }

    public double preciototal() {
        double iva = 0.02;
        return (precio) * (1 + iva);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

