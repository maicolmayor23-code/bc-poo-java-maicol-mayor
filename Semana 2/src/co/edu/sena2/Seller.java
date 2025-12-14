package co.edu.sena2;

import java.util.ArrayList;

public class Seller {
    private String nombre;
    private String email;
    private long documendo;
    private double sueldo;
    private ArrayList<Articulos> articulosVendidos;


public Seller () {

}

    public Seller(String nombre, String email, long documendo, double sueldo) {
        this.nombre = nombre;
        this.email = email;
        this.documendo = documendo;
        this.sueldo = sueldo;
        this.articulosVendidos  = new ArrayList<>();
    }

    public void Registrodevendedor() {
        System.out.println("Vendedor:" + nombre);
        System.out.println("Email:" + email);
        System.out.println("identificacion:" + documendo);
        System.out.println("Sueldo Fijo: $" + sueldo);
    }

    public void ventasArticulo(Articulos a) {
        articulosVendidos.add(a);
        System.out.println(nombre + " vendió: " + a.getNombre());
    }

    public int cantidadTotal () {
    return articulosVendidos.size();
    }

    public void articulosvendidos () {
        System.out.println("Articulos vendidos por " + nombre + ":");
        if (articulosVendidos.isEmpty()) {
            System.out.println("- Ninguno");
        }
        else {
            for (Articulos a : articulosVendidos) {
                System.out.println(" - " + a.getNombre() + " | Precio total: $" + a.preciototal());
            }
        }
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

    public long getDocumendo() {
        return documendo;
    }

    public void setDocumendo(long documendo) {
        this.documendo = documendo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Articulos> getArticulosVendidos() {
        return articulosVendidos;
    }

    public void setArticulosVendidos(ArrayList<Articulos> articulosVendidos) {
        this.articulosVendidos = articulosVendidos;
    }
}
