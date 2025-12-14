package co.edu.sena2;

public class Stock {
    private Articulos articulo;   // Relación con Articulos
    private String fechaRegistro;
    private String fechaActualizada;

    public Stock(Articulos articulo, String fechaRegistro, String fechaActualizada) {
        this.articulo = articulo;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizada = fechaActualizada;
    }

    public void mostrarDetalle() {
        System.out.println("=== INVENTARIO ===");
        System.out.println("Fecha registro: " + fechaRegistro);
        System.out.println("Fecha Actualizada: " + fechaActualizada);

    }

    public void vender(int cantidad) {
        if (articulo.isEstado() && cantidad <= articulo.getStock()) {
            articulo.setStock(articulo.getStock() - cantidad);
            System.out.println("Venta realizada");
        } else {
            System.out.println("No se puede realizar la venta");
        }
    }

    public Articulos getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulos articulo) {
        this.articulo = articulo;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getfechaActualizada() {
        return fechaActualizada;
    }

    public void setfechaActualizada(String responsable) {
        this.fechaActualizada = responsable;
    }
}

