package co.edu.sena5;
import co.edu.sena1.DeporteTotal;
import java.util.ArrayList;

public class Main5 {

        public static void main(String[] args) {

            // 1. Crear tienda
            DeporteTotal miTienda = new DeporteTotal("Deporte Total", "Bogotá", 5, 0, true);

            System.out.println("\n");
            miTienda.informacion();

            // 2. Crear sistema de tienda
            SistemaDeTienda sistema = new SistemaDeTienda(miTienda);

            // 3. Crear beneficios de diferentes tipos
            Benefits beneficio1 = new RegisteredCustomerBenefit("Cliente Inscrito", "Beneficio exclusivo para clientes registrados", 10, 10);

            Benefits beneficio2 = new SeasonalBenefit("Temporada Especial", "Beneficio aplicado en fechas especiales", 15, "Verano");

            // 4. Agregar beneficios al sistema (Polimorfismo)
            sistema.agregarBeneficio(beneficio1);
            sistema.agregarBeneficio(beneficio2);

            // 5. Mostrar información de todos los beneficios (Polimorfismo)

            sistema.mostrarBeneficios();

            // 6. Aplicar beneficios a un precio base
            double precioProducto = 200000;
            boolean clienteInscrito = true;
            sistema.aplicarBeneficios(precioProducto, clienteInscrito);

            // 7. Demostración de Sobrecarga
            System.out.println("---DEMOSTRACIÓN DE SOBRECARGA---");

            double precioBase = 200000;

            // Precio normal (sin descuentos)
            System.out.println("Precio normal: $" + precioBase);

            // Aplicar descuento estándar RegisteredCustomerBenefit (10%)
            double precioCon10 = beneficio1.aplicarDescuento(precioBase);
            System.out.println("Precio con 10%: $" + precioCon10);

            // Precio total para cliente inscrito
            System.out.println("Precio total para el cliente inscrito: $" + precioCon10);
            System.out.println("\n");

            // Probar SeasonalBenefit (mensaje si no aplica)
            double precioSeasonal = beneficio2.aplicarDescuento(precioBase);
            System.out.println("No es temporada de Verano, no se aplica descuento.");
            System.out.println("Precio total para SeasonalBenefit: $" + precioSeasonal);
            System.out.println("\n");

            // 8. Demostración de polimorfismo usando ArrayList
            ArrayList<Benefits> listaBeneficios = new ArrayList<>();
            listaBeneficios.add(beneficio1);
            listaBeneficios.add(beneficio2);

            System.out.println("\n---DEMOSTRACIÓN DE POLIMORFISMO EN ARRAYLIST---");
            for (Benefits b : listaBeneficios) {
                System.out.println("Tipo real: " + b.getClass().getSimpleName());
                b.mostrarInfo(); // Dynamic binding
                double precioFinal = b.aplicarDescuento(precioBase);
                System.out.println("Precio base: $" + precioBase);
                System.out.println("Precio final: $" + precioFinal);
                System.out.println("\n");
            }
        }
    }


