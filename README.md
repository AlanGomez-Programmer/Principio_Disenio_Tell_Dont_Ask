# Tell, Don't Ask

## índice

- [ Definición del principio](#definición)
- [ Problema que resuelve](#problema-que-resuelve)
- [ Origen e Historia](#origen-e-historia)
- [ Relación con otros principios](#relación-con-otros-principios)
- [ Referencias](#referencias)
- [ Estructura del repositorio ](#estructura-del-repositorio)
- [ Como compilar y ejecutar](#cómo-compilar-y-ejecutar)
---

## Definición

**¿Qué es el Tell, Don't ask?**

Es la referencia el encapsulamiento donde el objeto restringe sus atributos para que se pueda acceder a ellos por medio de getters y setters en lugar de que el Main tenga acceso a ellos de forma fácil. También el `Tell, Don't Ask` se refiere a que los objetos deben de tener los métodos en la misma clase de la instancia para que los datos se mantengan y permanezcan seguros y que no el main ejecute cambios o haga métodos donde manipula los datos de la instancia, cuando la instancia ya lo puede hacer por si solo al crear un método.

Es como decir:

*"Dile a los objetos lo que quieres que hagan; no les preguntes por su estado para tomar la decisión tú y luego decirles qué hacer."*

si para tomar una decisión necesito sacarle varios datos a un objeto, probablemente esa decisión le pertenece a ese objeto. En vez de *preguntar → decidir → modificar desde afuera*, y la instancia aplica sus propias reglas.

## Problema que resuelve

- **Lógica dispersa y duplicada:** la misma regla (por ejemplo, los descuentos) termina copiada en varias clases "servicio".
- **Encapsulamiento roto:** si cualquiera puede leer y modificar el estado, nadie garantiza las reglas del negocio.
- **Acoplamiento alto:** el código cliente depende de la estructura interna de los objetos; si esta cambia, todos los clientes cambian.
- **Modelo anémico:** clases que solo son "bolsas de datos" con getters/setters y servicios que hacen todo el trabajo.

---

## Origen e historia

| Año | Quién | Dónde | Aporte |
| --- | --- | --- | --- |
| 1998 | Andy hunt | En su blog personal | Menciona      |
| 1999 | Martin Fowler | Libro *Refactoring* | Cataloga los olores de código que delatan la violación (*Feature Envy*, *Data Class*) y las refactorizaciones para corregirla. |
| 2003 | Andy Hunt y Dave Thomas (*The Pragmatic Programmers*) | Columna *"The Art of Enbugging"*, *IEEE Software* | Popularizan el nombre **"Tell, Don't Ask"**. |
| 2013 | Martin Fowler | Artículo *TellDontAsk* en su bliki | Lo explica con ejemplos y advierte contra aplicarlo de forma dogmática. |

**Principios relacionados:** Ley de Demeter, encapsulamiento.

### Técnicas

- Creación de métodos dentro del objeto
- Encapsulación de los atributos
- Validación de datos en el constructor
- Uso de getters y setters
- Uso de toString para mostrar datos

## Relación con otros principios

| Principio | Relación |
| --- | --- |
| **Ley de Demeter** | Complementaria: Tell, Don't Ask evita preguntar; Demeter evita cadenas como `carrito.getArticulos().get(0).getProducto().getPrecio()`. |

**Ventajas:** mejor encapsulamiento, menos duplicación, menor acoplamiento, reglas de negocio protegidas, más fácil de extender y probar.

**Desventajas:** riesgo de entidades con demasiadas responsabilidades;

**Recomendación final:** aplicarlo a las **reglas de negocio** (decisiones que cambian el estado), y permitir getters para **mostrar** información.

## Referencias

## Bibliografía

- Fowler, M. (1999). *Refactoring: Improving the design of existing code*. Addison-Wesley. https://silab.fon.bg.ac.rs/wp-content/uploads/2016/10/Refactoring-Improving-the-Design-of-Existing-Code-Addison-Wesley-Professional-1999.pdf
- Fowler, M. (2013, 5 de septiembre). *TellDontAsk*. martinfowler.com. https://martinfowler.com/bliki/TellDontAsk.html
- Hunt, A. (1998, 1 de julio). *Tell, Don't Ask*. Toolshed Newsletters. https://toolshed.com/articles/1998-07-01-TellDontAsk.html
- Hunt, A., & Thomas, D. (2003). The art of enbugging. *IEEE Software, 20*(1), 10–11. https://media.pragprog.com/articles/jan_03_enbug.pdf
- Rincón, A. (2023, 24 de abril). *El principio "Tell, Don't Ask" y la Ley de Demeter en la programación orientada a objetos*. Medium. https://medium.com/@abel_rincon/el-principio-tell-dont-ask-y-la-ley-de-demeter-en-la-programaci%C3%B3n-orientada-a-objetos-c5eaf4b78f9f
- van der Merwe, W. (2023, 4 de octubre). *Software development principle: Tell, don't ask*. Saratoga Software. https://saratogasoftware.com/software-development-principle-tell-dont-ask/

## Estructura del repositorio

```
Principio_Disenio_Tell_Dont_Ask/
├── pom.xml
├── README.md
├── .gitignore
├── docs/
│   └── Presentacion_Tell_Dont_Ask.pdf       # Presentación usada en la sustentación
└── src/
    ├── main/java/com/alangomez/principio_disenio_tell_dont_ask/
    │   ├── Main.java                        # Ejecuta el ejemplo ANTES (sin el principio)
    │   ├── Main2.java                       # Ejecuta el ejemplo DESPUÉS (con el principio)
    │   ├── SinAplicacionDelPrincipio/       # Antes
    │   │   ├── Producto.java
    │   │   ├── Computadora.java
    │   │   ├── Telefono.java
    │   │   ├── ArticuloCarrito.java
    │   │   └── CarritoCompra.java
    │   ├── AplicacionDelPrincipio/          # DESPUÉS
    │   │   ├── Producto.java                
    │   │   ├── Computadora.java
    │   │   ├── Telefono.java
    │   │   ├── ArticuloCarrito.java         
    │   │   └── CarritoCompra.java         
    │   └── utils/
    │       └── Utilidad.java
    └── test/java/
```

## Cómo compilar y ejecutar

Requisitos: JDK 17 o superior y Maven 3.9+ (NetBeans ya trae Maven integrado) Para este ejemplo se utilizo el `JDK 25.0.4.1`.

**Desde NetBeans:** `File > Open Project`, abrir la carpeta `antes` o `despues`. Luego (Alt+F6) para las pruebas de `Main.java` y `Main2.java`.


---

## 👨 AUTOR

Programador Full-Stack Jr. Alan Gomez

GitHub: [AlanGomez-Programmer](https://github.com/AlanGomez-Programmer)

LinkedIn: alan-gomez-763163320
