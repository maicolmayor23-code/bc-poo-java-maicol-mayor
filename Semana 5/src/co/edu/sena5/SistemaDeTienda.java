package co.edu.sena5;

import java.util.ArrayList;
import co.edu.sena1.DeporteTotal;

public class SistemaDeTienda {

    private DeporteTotal tienda;
    private ArrayList<Benefits> beneficios;

    public SistemaDeTienda(DeporteTotal tienda) {
        this.tienda = tienda;
        this.beneficios = new ArrayList<>();
    }

    // METODO POLIMÓRFICO: agrega la clase padre, y cualquier beneficio
    public void agregarBeneficio(Benefits beneficio) {
        beneficios.add(beneficio);
        System.out.println("Beneficios que tendrá la tienda " + tienda.getNombre() + " para: " + beneficio.getNombre());
    }

    // METODO POLIMÓRFICO: aplicar todos los beneficios al precio de un producto
    public void aplicarBeneficios(double precioBase, boolean clienteInscrito) {
        System.out.println("--- Aplicando beneficios en " + tienda.getNombre() + "---");
        System.out.println(tienda.verificarbeneficios(clienteInscrito));

        for (Benefits b : beneficios) {
            double precioFinal = b.aplicarDescuento(precioBase); // polimorfismo dinámico
            System.out.println("Beneficio: " + b.getNombre());
            System.out.println("Precio base: $" + precioBase);
            System.out.println("Precio final con beneficio: $" + precioFinal);
            System.out.println("\n");
        }
    }

    // METODO POLIMÓRFICO: mostrar la info de todos los beneficios
    public void mostrarBeneficios() {
        System.out.println("\n---Beneficios disponibles en " + tienda.getNombre() + "---");
        for (Benefits b : beneficios) {
            b.mostrarInfo(); // polimorfismo
            System.out.println("\n");
        }
    }
}
