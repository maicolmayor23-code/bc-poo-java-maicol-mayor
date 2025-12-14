# POLIMORFISMO EN TIENDA "DEPORTE TOTAL"

## 1. Sobrecarga

### Métodos sobrecargados

En la clase `Benefits` y sus subclases:
```java
// Aplicar descuento estándar
public double aplicarDescuento(double precioBase);

// Aplicar descuento con porcentaje adicional
public double aplicarDescuento(double precioBase, int porcentaje);

// Aplicar descuento considerando cliente específico
public double aplicarDescuento(Object cliente, double precioBase);
```

### Justificación

Permite aplicar diferentes tipos de descuentos dependiendo del contexto:

- Un cliente inscrito puede recibir un descuento fijo.
- Un beneficio de temporada puede tener condiciones adicionales.
- Se pueden agregar nuevos criterios de descuentos sin cambiar la firma original del método principal.

Tiene sentido en el dominio de una tienda de artículos deportivos, porque los beneficios varían según tipo de cliente, temporada y promociones especiales.

## 2. Sobrescritura (Overriding)

### Métodos sobrescritos con @Override

**RegisteredCustomerBenefit** sobrescribe:
- `aplicarDescuento(double precioOriginal)`
- `mostrarInfo()`

**SeasonalBenefit** sobrescribe:
- `aplicarDescuento(double precioOriginal)`
- `mostrarInfo()`

Método `esAplicable()` también sobrescrito en ambas subclases para controlar si el beneficio aplica.

### Tabla comparativa

| Método | Clase Padre | Subclase 1: RegisteredCustomerBenefit | Subclase 2: SeasonalBenefit |
|--------|-------------|--------------------------------------|----------------------------|
| `aplicarDescuento()` | Devuelve precio original | Aplica descuento adicional fijo | Aplica descuento solo si temporada coincide |
| `mostrarInfo()` | Muestra nombre, descripción, % | Muestra descuento adicional solo | Muestra descuento y temporada; indica si no aplica |
| `esAplicable()` | Devuelve false | Siempre true | True solo si temporada coincide |

## 3. Polimorfismo dinámico

### Ejemplo
```java
ArrayList<Benefits> listaBeneficios = new ArrayList<>();
listaBeneficios.add(new RegisteredCustomerBenefit("Cliente Inscrito", "Beneficio exclusivo", 10, 10));
listaBeneficios.add(new SeasonalBenefit("Temporada Especial", "Beneficio en fechas especiales", 15, "Verano"));

for (Benefits b : listaBeneficios) {
    b.mostrarInfo();             // Llamada dinámica según tipo real
    double precioFinal = b.aplicarDescuento(200000);
    System.out.println("Precio final: $" + precioFinal);
}
```

### Explicación

Cada objeto en la lista es de tipo `Benefits` (clase padre), pero el método que se ejecuta depende del tipo real del objeto (`RegisteredCustomerBenefit` o `SeasonalBenefit`).

Esto permite:
- Tener un único contenedor (`ArrayList<Benefits>`) para distintos tipos de beneficios.
- Llamar métodos sobrescritos sin necesidad de condicionales para cada subclase.
- Demuestra enlace dinámico: la JVM decide en tiempo de ejecución qué implementación usar.

## 4. Beneficios del polimorfismo

### Ventajas:

- **Código más limpio y flexible**: se puede agregar nuevas subclases sin modificar el sistema principal.
- Facilita la gestión de distintos tipos de beneficios y descuentos.
- Permite operar sobre colecciones de la clase padre y aplicar lógica específica según subclase automáticamente.

### Dificultades sin polimorfismo:

- Tendrías que escribir condicionales (`if/else`) para cada tipo de beneficio.
- Cada vez que se agregara un nuevo tipo de beneficio, habría que modificar gran parte del código.
- Se pierde escalabilidad y la elegancia de la programación orientada a objetos.