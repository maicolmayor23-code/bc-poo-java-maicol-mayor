# Semana 02 - Gestión de Artículos y Vendedores

## 📝 Descripción

En esta semana se implementaron nuevas clases para manejar **artículos**, **vendedores** y el **stock** de la tienda **"Deporte Total"**.  
Se desarrolló un programa de demostración (`Main.java`) que permite registrar artículos, venderlos a través de vendedores y actualizar el inventario.  
Además, se calcula el precio total de cada artículo incluyendo IVA.

---

## 🎯 Objetivos Cumplidos

- [x] Implementar clase principal del dominio (`Articulos`)
- [x] Implementar clase secundaria relacionada (`Seller`)
- [x] Implementar clase de gestión de inventario (`Stock`)
- [x] Crear programa de demostración (`Main.java`)

---

## 📂 Archivos Entregados

- [`Articulos.java`](./src/co/edu/sena2/Articulos.java)  
  Clase que representa los artículos de la tienda, con atributos como nombre, categoría, stock, precio y estado.  
  Incluye métodos para mostrar información y calcular el precio total con IVA.

- [`Seller.java`](./src/co/edu/sena2/Seller.java)  
  Clase que representa a los vendedores, registra sus datos y permite realizar ventas de artículos.

- [`Stock.java`](./src/co/edu/sena2/Stock.java)  
  Clase encargada de gestionar el inventario, la fecha de registro, las actualizaciones y las ventas descontando el stock disponible.

- [`Main.java`](./src/co/edu/sena2/Main2.java)  
  Programa de demostración que muestra la interacción entre artículos, vendedores y el stock de la tienda.

---

## 🚀 Instrucciones de Ejecución

1. Clonar el repositorio o copiar los archivos en tu proyecto Java.
2. Abrir el proyecto en tu IDE de preferencia (Eclipse, IntelliJ, NetBeans, etc.).
3. Compilar todas las clases del paquete `co.edu.sena1`.
4. Ejecutar la clase `Main.java`.
5. Observar en la consola:
    - Información general de los artículos
    - Precios totales con IVA
    - Registro y ventas realizadas por los vendedores
    - Actualización del stock de los artículos vendidos
