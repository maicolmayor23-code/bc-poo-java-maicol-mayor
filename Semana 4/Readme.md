# Semana 04 - Jerarquía de Clases y Polimorfismo

## 📝 Descripción

Durante esta semana se implementó una **jerarquía de clases basada en herencia y polimorfismo** para el sistema de la tienda deportiva **"Deporte Total"**.  
El objetivo principal fue modelar de forma flexible los **beneficios comerciales** que la tienda ofrece a sus clientes y productos, según reglas del negocio como:

- Clientes inscritos
- Temporadas especiales
- Condiciones definidas por la tienda

La solución se basa en una clase padre (`Benefits`) que define atributos y comportamientos comunes, y clases hijas que especializan su funcionamiento, permitiendo reutilización de código y escalabilidad del sistema.

---

## 🎯 Objetivos Cumplidos

- [x] Implementar herencia mediante una clase padre y clases hijas
- [x] Aplicar polimorfismo con métodos sobrescritos
- [x] Modelar beneficios comerciales según reglas del negocio
- [x] Reutilizar código de forma eficiente
- [x] Cumplir con el principio **Open/Closed** de la Programación Orientada a Objetos

---

## 📂 Archivos Entregados

- [`Benefits.java`](./src/co/edu/sena4/Benefits.java)  
  Clase base que representa un beneficio general, con atributos y métodos comunes.

- [`RegisteredCustomerBenefit.java`](./src/co/edu/sena4/RegisteredCustomerBenefit.java)  
  Clase que representa beneficios exclusivos para clientes inscritos.

- [`SeasonalBenefit.java`](./src/co/edu/sena4/SeasonalBenefit.java)  
  Clase que representa beneficios aplicables únicamente en temporadas especiales.

- [`Main.java`](./src/co/edu/sena4/Main4.java)  
  Programa principal que demuestra el uso de polimorfismo mediante un arreglo de tipo `Benefits`.

- [`Mejoras.md`](./Docs/JERARQUIA.md)  
  Documento que describe lo implementado durante la semana.

---

## 🚀 Instrucciones de Ejecución

1. Clonar el repositorio o copiar los archivos en tu proyecto Java.
2. Abrir el proyecto en tu IDE de preferencia (Eclipse, IntelliJ, NetBeans, etc.).
3. Compilar todas las clases del paquete `co.edu.sena4`.
4. Ejecutar la clase `Main.java`.
5. Observar en la consola cómo se aplican los distintos beneficios, demostrando herencia y polimorfismo.
