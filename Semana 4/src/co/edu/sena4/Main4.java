package co.edu.sena4;

public class Main4 {
    public static void main(String[] args) {

        // Precio base simulado de un producto
        double precioBase = 200000;

        // Arreglo polimórfico
        Benefits[] beneficios = new Benefits[2];

        beneficios[0] = new RegisteredCustomerBenefit("Cliente Inscrito", "Beneficio exclusivo para clientes registrados", 10, 10);

        beneficios[1] = new SeasonalBenefit("Temporada Especial", "Beneficio aplicado en fechas especiales", 15, "Verano");

        // Ejecución de todos los métodos
        for (Benefits beneficio : beneficios) {

            // Mostrar información (polimorfismo)
            beneficio.mostrarInfo();

            // Verificar aplicabilidad (metodo heredado)
            System.out.println("¿Es aplicable?: "
                    + beneficio.esAplicable(null, null));

            // Aplicar descuento (polimorfismo)
            double precioFinal = beneficio.aplicarDescuento(precioBase);
            System.out.println("Precio base: $" + precioBase);
            System.out.println("Precio final$ " + precioFinal);

            System.out.println("-----------------------------------");
        }
    }
}