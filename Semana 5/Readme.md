# Semana 05 - Polimorfismo en Tienda Deportiva "Deporte Total"

## 📝 Descripción

Durante esta semana se implementaron y demostraron los conceptos de **Polimorfismo, Sobrecarga y Sobrescritura** en el dominio de la tienda deportiva **"Deporte Total"**.  
Se crearon las clases de beneficios (`Benefits`), incluyendo subclases específicas (`RegisteredCustomerBenefit` y `SeasonalBenefit`), así como un sistema de tienda (`SistemaDeTienda`) que permite aplicar descuentos y verificar beneficios según las condiciones de cada cliente y temporada.  
El programa de demostración (`Main5.java`) muestra la ejecución de estos conceptos en tiempo de ejecución mediante **ArrayLists polimórficos** y métodos sobrecargados.

---

## 🎯 Objetivos Cumplidos

- [x] Implementar clase padre `Benefits` y subclases `RegisteredCustomerBenefit` y `SeasonalBenefit`.
- [x] Implementar sobrecarga de métodos para aplicar descuentos de diferentes formas.
- [x] Sobrescribir métodos con `@Override` para personalizar comportamiento de cada subclase.
- [x] Implementar métodos polimórficos en `SistemaDeTienda` que aceptan la clase padre.
- [x] Crear un Main de demostración (`Main5.java`) que evidencie polimorfismo dinámico y sobrecarga.
- [x] Documentar análisis del dominio con enfoque POO.

---

## 📂 Archivos Entregados

- [`Benefits.java`](./src/co/edu/sena5/Benefits.java)  
  Clase padre que representa los beneficios de la tienda. Contiene métodos para aplicar descuentos, verificar aplicabilidad y mostrar información.

- [`RegisteredCustomerBenefit.java`](./src/co/edu/sena5/RegisteredCustomerBenefit.java)  
  Subclase que aplica beneficios exclusivos a clientes registrados, sobrescribiendo métodos de la clase padre.

- [`SeasonalBenefit.java`](./src/co/edu/sena5/SeasonalBenefit.java)  
  Subclase que aplica beneficios de temporada solo si corresponde. Sobrescribe los métodos para mostrar información y aplicar descuentos según la temporada.

- [`SistemaDeTienda.java`](./src/co/edu/sena5/SistemaDeTienda.java)  
  Sistema que administra los beneficios de la tienda. Contiene métodos polimórficos para agregar, mostrar y aplicar beneficios sobre precios de productos.

- [`DeporteTotal.java`](./src/co/edu/sena1/DeporteTotal.java)  
  Clase que representa la tienda física, con atributos de ubicación, cantidad de vendedores y estado de apertura, además de métodos para verificar beneficios aplicables.

- [`Main5.java`](./src/co/edu/sena5/Main5.java)  
  Programa principal que demuestra **polimorfismo**, **sobrecarga** y **sobrescritura** en acción. Muestra cómo se aplican los descuentos según tipo de cliente y temporada.

- [`POLIMORFISMO.md`](./Docs/POLIMORFISMO.md)  
  Documentación teórica y práctica del uso de polimorfismo, sobrecarga y sobrescritura en el dominio de la tienda.

---

## 🚀 Instrucciones de Ejecución

1. Clonar el repositorio o copiar los archivos en tu proyecto Java.
2. Abrir el proyecto en tu IDE de preferencia (Eclipse, IntelliJ, NetBeans, etc.).
3. Compilar todas las clases del paquete `co.edu.sena5`.
4. Ejecutar la clase `Main5.java`.
5. Observar en la consola:
    - Información de la tienda y sus beneficios.
    - Aplicación de descuentos con métodos sobrecargados.
    - Ejecución de métodos sobrescritos según la subclase.
    - Polimorfismo dinámico en acción mediante `ArrayList<Benefits>`.

