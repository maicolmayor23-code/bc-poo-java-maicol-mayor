package co.edu.sena2;

public class Main2 {
    public static void main(String[] args) {


        Articulos a1 = new Articulos("Balón Profesional", "Fútbol", 10, true);


        System.out.println("\n");
        a1.setPrecio(150000);
        System.out.println("---Articulo 1---");
        a1.informaciongeneral();
        System.out.println("Precio total: $" + a1.preciototal());


        Articulos a2 = new Articulos();
        System.out.println("\n");
        System.out.println("---Articulo 2---");
        a2.setNombre("Raquetas de Tennis");
        a2.setPrecio(500000);
        a2.setEstado(true);
        System.out.println("Ya esta" + (a2.isEstado()? " activa" : "inactiva") + " las " + a2.getNombre() );
        System.out.println("Pecio total: $" + a2.preciototal());
        System.out.println("\n");


        Seller sel2 = new Seller("Juan", "juanf.@gmail.com", 1007337753L, 2000000);

        System.out.println("---Vendedor---");
        sel2.Registrodevendedor();
        System.out.println("\n");

        sel2.ventasArticulo(a1);
        sel2.ventasArticulo(a2);
        System.out.println("\n");

        System.out.println("---Articulos Vendidos---");
        sel2.articulosvendidos();

        System.out.println("\nTotal de artículos vendidos: " + sel2.cantidadTotal());
        System.out.println("\n");

        Stock stc = new Stock(a1,  "2025-07-12", "Hoy");
        stc.vender(1);
        System.out.println("\n");
        stc.mostrarDetalle();
        System.out.println("Stok de " +  a1.getNombre() + " ahora = " + a1.getStock());

    }

}