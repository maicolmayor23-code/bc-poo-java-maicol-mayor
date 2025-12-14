# Jerarquía de Clases – Semana 04
## Programación Orientada a Objetos – Java
**Dominio:** Tienda de Artículos Deportivos *Deporte Total*

---

##  Contexto del Dominio

La tienda **Deporte Total** aplica distintos **beneficios comerciales** a sus clientes y productos, dependiendo de reglas como:

- Si el cliente está inscrito
- Si existe una temporada especial
- Condiciones definidas por el negocio

Para modelar este comportamiento de forma flexible y escalable, se implementa una **jerarquía de clases basada en herencia y polimorfismo**.

---

## Diagrama de Jerarquía

                            Benefits
                                |
                +---------------+--------------+
                |                              |
                |                              |
         RegisteredCustomerBenefit       SeasonalBenefit


---

## Justificación de la Jerarquía

Se eligió esta jerarquía porque todos los beneficios de la tienda comparten
características comunes, pero **no todos se aplican de la misma manera**.

La clase **`Benefits`** representa el concepto general de un beneficio, definiendo:

- Atributos comunes
- Comportamientos generales
- Métodos que pueden ser sobrescritos

Las clases hijas especializan este comportamiento según las reglas del negocio:

- **RegisteredCustomerBenefit**  
  Aplica beneficios exclusivos a clientes inscritos, usando un descuento específico.

- **SeasonalBenefit**  
  Representa beneficios que solo se aplican en determinadas temporadas.

Esta estructura permite:

- Reutilizar código
- Aplicar polimorfismo
- Escalar el sistema sin modificar código existente

Cumpliendo con el principio **Open/Closed** de la Programación Orientada a Objetos.

---

## Atributos Heredados (Clase Padre `Benefits`)

Las clases hijas heredan los siguientes atributos:

- `nombre` (String)  
  Identifica el beneficio.

- `descripcion` (String)  
  Explica el propósito del beneficio.

- `porcentajeDescuento` (double)  
  Representa un descuento base definido en la clase padre.

Cada subclase puede definir **atributos propios**, por ejemplo:

- `descuentoAdicional` en `RegisteredCustomerBenefit`
- `temporada` en `SeasonalBenefit`

---

##  Métodos Sobrescritos

### `esAplicable(Object cliente, Object producto)`

- **Benefits (padre):**  
  Retorna `false` por defecto, indicando que el beneficio no se aplica automáticamente.

- **RegisteredCustomerBenefit:**  
  Retorna `true`, permitiendo aplicar el beneficio a clientes inscritos.

- **SeasonalBenefit:**  
  Retorna `false`, simulando que el beneficio no está activo.

Este método permite decidir dinámicamente si un beneficio debe aplicarse.

---

### `aplicarDescuento(double precioOriginal)`

- **Benefits:**  
  Aplica el descuento base solo si el beneficio es aplicable.

- **RegisteredCustomerBenefit:**  
  Sobrescribe el método para aplicar **únicamente el descuento adicional**, ignorando el descuento base.

Este comportamiento demuestra **polimorfismo**, ya que el mismo método
produce resultados distintos según el tipo real del objeto.

---

### `mostrarInfo()`

- **Benefits:**  
  Muestra la información general del beneficio.

- **Clases hijas:**  
  Sobrescriben el método para personalizar la información mostrada,
  manteniendo la misma firma del método.

---

## Ejemplo de Polimorfismo (Main)

En el programa principal se utiliza un **arreglo polimórfico** de tipo `Benefits`,
el cual permite almacenar distintos tipos de beneficios y tratarlos de forma uniforme.

```java
Benefits[] beneficios = new Benefits[2];
