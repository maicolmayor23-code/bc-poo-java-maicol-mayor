package co.edu.sena1;


public class Main1 {
    public static void main(String[] args) {

        System.out.println("\n");
        DeporteTotal tienda1 = new DeporteTotal("Deporte Total", "Bogotá", 15, 0, true);
        tienda1.informacion();

        Customer spo1 = new Customer("Maicol", "maicol@gmail.com", 3003237733L, 18, true);
        Customer spo2 = new Customer("Jairo", "jairo.2025@gmail.com", 3133735577L, 17,false);

        System.out.println("\n");
        System.out.println("---Customer 1---");
        spo1.registrodeDatos();
        System.out.println(spo1.verificarRegistro());
        System.out.println(tienda1.verificarbeneficios(true));

        System.out.println("\n");
        System.out.println("---Customer 2---");
        spo2.registrodeDatos();
        System.out.println(spo2.verificarRegistro());
        System.out.println(tienda1.verificarbeneficios(false));






    }

}