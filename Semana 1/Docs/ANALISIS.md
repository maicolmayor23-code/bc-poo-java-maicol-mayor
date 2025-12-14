# Análisis Orientado a Objetos - Tienda Deportiva "Deporte Total"

## 1. Identificación del Dominio

**Nombre del negocio:** Deporte Total  
**Tipo:** Tienda de artículos deportivos  
**Descripción:** Es una tienda que ofrece gran variedad de productos deportivos, tambien registra clientes y gestiona información sobre compras. Los clientes pueden estar registrados (tener matrícula activa) y tener acceso a beneficios según su estado.

## 2. Objetos Identificados

### Objeto Principal: Customer (Cliente)

**¿Qué es?:** Representa a un cliente o deportista de la tienda, con sus datos personales y estado de inscripción.

**Atributos identificados:**
- `nombre`: String - nombre del cliente
- `email`: String - correo del cliente
- `telefono`: long - número de contacto del cliente
- `edad`: int - edad del cliente
- `registro`: boolean - indica si el cliente esta inscrito o no.

**Métodos identificados:**
- `registrodeDatos()`: imprime en consola toda la información del cliente
- `verificarRegistro()`: devuelve un mensaje indicando si el cliente tiene inscripcion activa
- `activarRegistro()`: cambia el estado de `registro` a `true` y notifica que está activo
- `desactivarRegistro()`: cambia el estado de `registro` a `false` y notifica que está desactivado
- Getters y Setters: permiten obtener y modificar atributos privados del cliente.

### Objeto Secundario: DeporteTotal (Tienda)

**¿Qué es?:** Representa la tienda de artículos deportivos y su estado general.

**Atributos identificados:**
- `nombre`: String - nombre de la tienda
- `ubicacion`: String - dirección o ubicación de la tienda
- `totalVendedores`: int - número de vendedores activos
- `tiendaAbierta`: boolean - indica si la tienda está abierta o cerrada

**Métodos identificados:**
- `informacion()`: imprime en consola los datos generales de la tienda como tal
- `verificarRequsitos(boolean clienteInscrito)`: verifica si un cliente inscrito puede recibir beneficios
- Getters y Setters: permiten obtener y modificar atributos privados de la tienda

## Relación entre Objetos

**Tipo de relación:** Asociación (uno a muchos en concepto, pero implementado de forma simple)

**Descripción:**  
Un **Customer** puede interactuar con la **tienda** (DeporteTotal) verificando si puede recibir beneficios según su estado de registro. La tienda no almacena clientes, pero sus métodos dependen del estado de los clientes para ofrecer beneficios.

Ejemplo: "El cliente Maicol tiene matrícula activa y por eso la tienda le permite acceder a buenos beneficios."

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**
- `Customer`: Es fundamental representar a los clientes con sus datos, compras y estado de registro, ya que son el eje central del negocio.
- `DeporteTotal`: Permite centralizar la información de la tienda, sus vendedores y el estado de apertura, facilitando la gestión y las decisiones de negocio.

**¿Por qué estos atributos son importantes?**
- `nombre`, `telefono`, `edad`: Información básica del cliente para identificarlo.
- `registro`: Define si el cliente puede participar en promociones o realizar compras especiales, etc.
- `nombre`, `ubicacion`, `totalVendedores`, `ingresosTotales`, `tiendaAbierta` en la tienda: Son esenciales para describir su estado operativo.

**¿Por qué estos métodos son necesarios?**
- Permiten encapsular la lógica de negocio: activación/desactivación de registro, verificación de promociones, impresión de información, etc.
- Facilitan la reutilización de código y mantienen la información segura con acceso controlado mediante getters y setters.

## 5. Comparación: POO vs Programación Estructurada

**Sin POO (Estructurado):**
- Se usarían arrays o listas para guardar clientes y variables globales para la tienda.
- Cada operación (verificar matrícula, imprimir información) requeriría funciones independientes pasando todos los datos como parámetros.
- Difícil mantenimiento, duplicación de código y riesgo de inconsistencias.

**Con POO:**
- Cada cliente y la tienda son objetos con su propia información y comportamiento.
- La información está encapsulada y los métodos controlan cómo interactuar con ella.
- Fácil extensión y mantenimiento: se pueden agregar nuevos atributos o métodos sin afectar el resto del sistema.

**Ventajas específicas en mi dominio:**
1. Separación clara entre clientes y tienda, reflejando la realidad del negocio.
2. Permite simular interacciones entre clientes y la tienda de manera natural.
3. Facilita agregar nuevas funcionalidades como promociones, ventas, productos o historial de compras sin reestructurar el código.



