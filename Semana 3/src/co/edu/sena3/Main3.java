package co.edu.sena3;

public class Main3 {
    public static void main(String[] args) {



        DeporteTotal tienda1 = new DeporteTotal("Deporte Total", "Bogotá", 15, true);
        tienda1.informacion();


        Customer cliente1 = new Customer("Maicol", "maicol@mail.com", 3003237733L, 18, true);
        Customer cliente2 = new Customer("Jairo", "jairo@mail.com", 3133735577L, 17, false);



        System.out.println("\n---Cliente 1 y tienda---");
        cliente1.registrodeDatos();
        System.out.println(cliente1.verificarRegistro());
        System.out.println(tienda1.verificarBeneficios(cliente1.isRegistro()));


        System.out.println("\n---Cliente 2 y tienda---");
        cliente2.registrodeDatos();
        System.out.println(cliente2.verificarRegistro());
        System.out.println(tienda1.verificarBeneficios(cliente2.isRegistro()));
    }
}
