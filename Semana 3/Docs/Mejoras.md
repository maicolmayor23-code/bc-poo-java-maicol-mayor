# Mejoras - Semana 03

## 1️⃣ Encapsulación Completa

### Clase: `Customer`
- **Atributos encapsulados:** `nombre`, `email`, `telefono`, `edad`, `registro`
- **Descripción de la mejora:**
  Todos los atributos son `private`. Se accede a ellos únicamente mediante **getters y setters**. Esto evita modificaciones directas desde fuera de la clase y permite controlar los valores asignados.
- **Beneficios:**
    - Protección de datos internos del objeto
    - Evita inconsistencias o asignaciones inválidas
    - Mejora la mantenibilidad del código

### Clase: `DeporteTotal`
- **Atributos encapsulados:** `nombre`, `ubicacion`, `totalVendedores`, `tiendaAbierta`
- **Descripción de la mejora:**
  Todos los atributos son privados. Los getters y setters permiten manipularlos de manera controlada y segura.
- **Beneficios:**
    - Seguridad en la manipulación de los datos
    - Facilita la validación de entradas
    - Cumple con buenas prácticas de POO

---

## 2️⃣ Sobrecarga de Constructores

### Clase: `Customer`
- **Constructor completo:** recibe todos los atributos y llama a los setters para aplicar validaciones.
- **Constructor básico:** recibe solo el nombre y llama al constructor completo con valores predeterminados (`email` genérico, 18 años, teléfono genérico, registro activo).
- **Beneficios:**
    - Flexibilidad para crear objetos con todos los datos o con datos mínimos
    - Centraliza la lógica de inicialización y validación
    - Reduce duplicación de código

### Clase: `DeporteTotal`
- **Constructor completo:** inicializa todos los atributos usando setters para validar valores.
- **Constructor básico:** recibe solo el nombre y llama al constructor completo con valores predeterminados (ubicación genérica, 1 vendedor, tienda cerrada).
- **Beneficios:**
    - Permite inicializar tiendas con datos completos o solo el nombre
    - Facilita la creación rápida de objetos en casos simples
    - Mantiene consistencia en los datos

---

## 3️⃣ Validaciones

### Clase: `Customer`
- **Validaciones implementadas:**
    - `nombre`: no nulo ni vacío
    - `email`: no nulo ni vacío
    - `telefono`: rango válido de 10 dígitos
    - `edad`: entre 1 y 120
- **Beneficios:**
    - Garantiza datos consistentes y realistas
    - Evita errores de ingreso de datos
    - Mejora la confiabilidad del sistema

### Clase: `DeporteTotal`
- **Validaciones implementadas:**
    - `nombre` y `ubicacion`: no nulos ni vacíos
    - `totalVendedores`: >= 0
    - `tiendaAbierta`: booleano, controlado por métodos
- **Beneficios:**
    - Asegura que la información de la tienda sea válida
    - Previene inconsistencias en la gestión de datos
    - Facilita el mantenimiento y la extensión de la clase