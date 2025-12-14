package co.edu.sena3;

public class Customer {
    private String nombre; // Atributos privados
    private String email;
    private long telefono;
    private int edad;
    private boolean registro;


    // Constructor completo: recibe todos los atributos con validación
    public Customer(String nombre, String email, long telefono, int edad, boolean registro) {
        setNombre(nombre); // valida que no sea nulo ni vacío
        setEmail(email); // valida que no sea nulo ni vacío
        setTelefono(telefono); // valida formato y rango
        setEdad(edad); // valida rango 1-120
        this.registro = registro;
    }


    // Constructor básico: solo recibe nombre, llama al completo con valores por defecto
    public Customer(String nombre) {
        this(nombre, "correo@correo.com", 3003237733L, 18, true);
    }


    // Métodos públicos
    public void registrodeDatos() { // Muestra todos los atributos del cliente
        System.out.println("Cliente: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + (registro ? "Inscrito" : "No Inscrito"));
    }


    public String verificarRegistro() { // Devuelve mensaje según estado de registro
        return registro ? "El cliente " + nombre + " está registrado." : "El cliente " + nombre + " no está registrado.";
    }


    public void activarRegistro() {
        cambiarEstadoRegistro(true); // Metodo auxiliar privado
    }


    public void desactivarRegistro() {
        cambiarEstadoRegistro(false); // Metodo auxiliar privado
    }


    public boolean puedeRealizarCompra() {
        return registro; // Solo puede comprar si está registrado
    }


// Métodos auxiliares privados


    private void cambiarEstadoRegistro(boolean estado) {
        this.registro = estado;
        System.out.println("El registro de " + nombre + " ahora está " + (estado ? "activo" : "desactivado") + ".");
    }


    private boolean nombreValido(String nombre) {
        return nombre != null && !nombre.trim().isEmpty(); // Valida que el nombre no sea nulo ni vacío
    }


    private boolean telefonoValido(long telefono) {
        return telefono > 1000000000L && telefono < 9999999999L; // Valida que el teléfono tenga un rango realista de 10 dígitos
    }


    // Getters y Setters con validaciones
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        if (nombreValido(nombre)) this.nombre = nombre;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty()) this.email = email;
    }


    public long getTelefono() {
        return telefono;
    }


    public void setTelefono(long telefono) {
        if (telefonoValido(telefono)) this.telefono = telefono;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        if (edad > 0 && edad < 120) this.edad = edad;
    }


    public boolean isRegistro() {
        return registro;
    }


    public void setRegistro(boolean registro) {
        this.registro = registro;
    }
}