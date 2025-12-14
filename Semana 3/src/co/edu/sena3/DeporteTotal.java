package co.edu.sena3;

public class DeporteTotal {
    private String nombre; // Atributos privados
    private String ubicacion;
    private int totalVendedores;
    private boolean tiendaAbierta;


    // Constructor completo: recibe todos los atributos con validaciones
    public DeporteTotal(String nombre, String ubicacion, int totalVendedores, boolean tiendaAbierta) {
        setNombre(nombre); // valida que no sea nulo ni vacío
        setUbicacion(ubicacion); // valida que no sea nulo ni vacío
        setTotalVendedores(totalVendedores); // valida >= 0
        this.tiendaAbierta = tiendaAbierta;
    }


    // Constructor básico: solo recibe nombre, llama al completo con valores por defecto
    public DeporteTotal(String nombre) {
        this(nombre, "Ubicación Desconocida", 1, false);
    }


    // Métodos públicos
    public void informacion() { // Muestra todos los atributos de la tienda
        System.out.println("=== Tienda ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Cantidad de Vendedores: " + totalVendedores);
        System.out.println("Estado de la tienda: " + (tiendaAbierta ? "ABIERTA" : "CERRADA"));
    }


    public String verificarBeneficios(boolean clienteInscrito) { // Devuelve mensaje según inscripción del cliente
        return clienteInscrito ? "Entonces este cliente puede recibir beneficios de la tienda, porque está inscrito." : "Entonces este cliente NO puede recibir beneficios de la tienda, ya que no está inscrito.";
    }


    // Métodos auxiliares privados
    private boolean textoValido(String texto) { // Valida que el texto no sea nulo ni vacío
        return texto != null && !texto.trim().isEmpty();
    }


    // Getters y Setters con validaciones
    public String getNombre() { return nombre; }


    public void setNombre(String nombre) {
        if (textoValido(nombre)) this.nombre = nombre;
    }


    public String getUbicacion() { return ubicacion; }


    public void setUbicacion(String ubicacion) {
        if (textoValido(ubicacion)) this.ubicacion = ubicacion;
    }


    public int getTotalVendedores() { return totalVendedores; }


    public void setTotalVendedores(int totalVendedores) {
        if (totalVendedores >= 0) this.totalVendedores = totalVendedores;
    }


    public boolean isTiendaAbierta() { return tiendaAbierta; }


    public void setTiendaAbierta(boolean tiendaAbierta) { this.tiendaAbierta = tiendaAbierta; }
}
