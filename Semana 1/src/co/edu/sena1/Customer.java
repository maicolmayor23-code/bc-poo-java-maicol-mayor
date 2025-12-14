package co.edu.sena1;

public class Customer {
    private String nombre;
    private String email;
    private long telefono;
    private int edad;
    private boolean registro;


    public Customer() {
    }

    public Customer(String nombre, String email, long telefono, int edad, boolean registro) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email= email;
        this.edad = edad;
        this.registro = registro;
    }

    public void registrodeDatos() {
        System.out.println("Cliente: " + nombre);
        System.out.println("email: " + email);
        System.out.println("Telefono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.println("Estado= " + (registro ? "Inscrito" : "No Inscrito"));
    }

    public String verificarRegistro() {
        if (registro) {
            return "El cliente " + nombre + " esta registrado.";
        } else {
            return "El cliente " + nombre + " no esta registrado.";
        }

    }

    public void activarRegistro() {
        this.registro = true;
        System.out.println("El registro de " + nombre + " ahora está activa.");
    }

    public void desactivarRegistro() {
        this.registro = false;
        System.out.println("El registro de " + nombre + " fue desactivado.");
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }
}