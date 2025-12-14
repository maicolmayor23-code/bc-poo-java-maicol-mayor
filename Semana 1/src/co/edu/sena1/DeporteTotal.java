package co.edu.sena1;

public class DeporteTotal {
    private String nombre;
    private String ubicacion;
    private int totalVendedores;
    private boolean tiendaAbierta;

    public DeporteTotal() {

    }

    public DeporteTotal(String nombre, String ubicacion, int totalVendedores, double ingresosTotales, boolean tiendaAbierta) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.totalVendedores = totalVendedores;
        this.tiendaAbierta = tiendaAbierta;
    }

    public void informacion() {
        System.out.println("---Tienda---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion en: " + ubicacion);
        System.out.println("Cantidad de Vendedores: " + totalVendedores);
        System.out.println("La tienda esta: " + (tiendaAbierta ? "ABIERTA" : "CERRADA"));
    }

    public String verificarbeneficios (boolean clienteInscrito) {
        if (clienteInscrito) {
            return "Entonces este cliente puede recibir beneficios de la tienda, por que si esta inscrito.";
        } else {
            return "Entonces este cliente NO puede recibir beneficios, ya que no está inscrito.";
        }
    }

        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public String getUbicacion () {
            return ubicacion;
        }

        public void setUbicacion (String ubicacion){
            this.ubicacion = ubicacion;
        }

        public int getTotalVendedores () {
            return totalVendedores;
        }

        public void setTotalVendedores ( int totalVendedores){
            this.totalVendedores = totalVendedores;
        }

        public boolean isTiendaAbierta () {
            return tiendaAbierta;
        }

        public void setTiendaAbierta ( boolean tiendaAbierta){
            this.tiendaAbierta = tiendaAbierta;
        }
    }
