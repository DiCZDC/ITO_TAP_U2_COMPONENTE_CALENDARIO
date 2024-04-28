# ITO_TAP_U2_COMPONENTE_CALENDARIO
Componente visual para Java, el cual permite crear un componente visual para introducir fechas. Se encuentra basado en las librerias `JFRAME` y `JDIALOG`
![image](https://github.com/DiCZDC/ITO_TAP_U2_COMPONENTE_CALENDARIO/assets/168324082/72f49cf5-8c51-48bd-b819-bc5109000f9e)

## Descripción del Proyecto Panel Calendario

El proyecto Panel Calendario es una herramienta de interfaz de usuario (UI) que proporciona a los usuarios la capacidad de seleccionar y manipular fechas de manera intuitiva a través de un panel de calendario interactivo. Desarrollado en Java utilizando componentes de la biblioteca Swing, este proyecto ofrece una solución flexible y fácil de usar para integrar funcionalidades relacionadas con fechas en aplicaciones de escritorio.

## Requisitos para su Uso

- Java Development Kit (JDK) instalado en el sistema.
- Conocimientos básicos de programación en Java y manejo de interfaces de usuario utilizando Swing.
- Entorno de desarrollo integrado (IDE) compatible con Java, como Eclipse, IntelliJ IDEA o NetBeans.

## Usos del Proyecto Panel Calendario

1. **Selección de Fechas**: Permite a los usuarios seleccionar fácilmente una fecha específica utilizando el panel de calendario interactivo.
   
2. **Rango de Fechas**: Facilita la selección de un rango de fechas, ya sea para aplicaciones de reserva, planificación de eventos o análisis de datos.

3. **Cálculo de Diferencias de Fechas**: Ofrece la capacidad de calcular la diferencia en días, meses o años entre dos fechas seleccionadas, útil para aplicaciones de seguimiento de tiempo, gestión de proyectos o análisis temporal.

4. **Integración con Aplicaciones de Gestión**: Puede integrarse en aplicaciones de gestión de tareas, calendarios personales o planificadores para mejorar la experiencia del usuario en la gestión del tiempo.

5. **Visualización de Calendarios**: Proporciona una vista de calendario interactiva para mostrar eventos, citas o actividades planificadas, mejorando la visualización y navegación del calendario.

6. **Registro de Eventos**: Permite a los usuarios registrar eventos o actividades en fechas específicas seleccionadas a través del panel de calendario, facilitando la organización y planificación.

7. **Personalización de la Interfaz de Usuario**: Ofrece la posibilidad de personalizar la apariencia y el comportamiento del panel de calendario según las necesidades específicas de la aplicación o el usuario.

8. **Compatibilidad Multiplataforma**: Al estar desarrollado en Java, el proyecto Panel Calendario es compatible con múltiples plataformas, lo que permite su uso en sistemas Windows, macOS y Linux sin cambios significativos.

El proyecto Panel Calendario proporciona una solución versátil y eficiente para integrar funcionalidades relacionadas con fechas en aplicaciones de escritorio Java, mejorando la experiencia del usuario y la funcionalidad de las aplicaciones que lo utilizan.


# API del proyecto

## Clase: PanelCalendario

La clase panelCalendario representa un panel de interfaz de usuario (UI) que permite seleccionar una fecha a través de un calendario.

| FUNCIÓN | DESCRIPCIÓN |
| --- | --- |
| panelCalendario() | Constructor de la clase. Inicializa el panel de calendario y sus componentes, como los menús desplegables para el año y el mes. |
| iniCbo() | Inicializa el menú desplegable de años, agregando los años desde 50 años antes del año actual hasta 50 años después del año actual. |
| btnStateSwitch() | Cambia el estado y el texto del botón de selección de día, así como su apariencia visual, dependiendo del estado pasado como parámetro. |
| btnDiaActionPerformed() | Método ejecutado cuando se presiona el botón de selección de día. Actualiza la fecha local y muestra un diálogo para seleccionar un día específico. |
| cboMesActionPerformed() | Método ejecutado cuando se selecciona un mes en el menú desplegable de meses. Cambia el estado y el texto del botón de selección de día. |
| cboAnioActionPerformed() | Método ejecutado cuando se selecciona un año en el menú desplegable de años. Cambia el estado y el texto del botón de selección de día. |
| getFechaAct() | Retorna la fecha seleccionada en el panel de calendario. |
| updateData() | Actualiza la fecha seleccionada con los valores seleccionados en los menús desplegables de año y mes. |
| getMes() | Retorna el mes seleccionado. |
| getDia() | Retorna el día seleccionado. |
| getAnio() | Retorna el año seleccionado. |
| getFechacomp() | Retorna la fecha seleccionada como objeto fecha. |


## Clase: fecha  
### Descripción:  
La clase fecha extiende la clase Date y se utiliza para representar una fecha específica con métodos adicionales para obtener una representación de cadena de la fecha en formato legible.
| Función               | Descripción                                                                                                                                                   |
|-----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `fecha()`             | Constructor de la clase. Inicializa el calendario con la fecha actual.                                                                                         |
| `setDate(int date)`   | Establece el día de la fecha.                                                                                                                                 |
| `setMonth(int month)` | Establece el mes de la fecha.                                                                                                                                 |
| `setYear(int year)`   | Establece el año de la fecha.                                                                                                                                 |
| `toString()`          | Retorna una representación en formato legible de la fecha, incluyendo el día de la semana, el día del mes, el mes y el año.                                  |



## Clase: dialogoDia  
### Descripción:  
La clase dialogoDia representa un cuadro de diálogo modal que permite al usuario seleccionar un día específico de la semana.
| Función               | Descripción                                                                                                                                                   |
|-----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `dialogoDia(Frame parent, boolean modal, int lenght, int d)` | Constructor de la clase. Crea un cuadro de diálogo para seleccionar un día específico de la semana.                                                      |
| `btnAceptarAct()`     | Obtiene el día seleccionado por el usuario y cierra el cuadro de diálogo.                                                                                     |
| `getDiaElegido()`     | Retorna el día seleccionado por el usuario.                                                                                                                   |
| `CreacionVentana()`   | Crea la interfaz gráfica del cuadro de diálogo con botones de selección de día y un botón de aceptar.                                                        |



## Clase: ventanaFecha  
### Descripción:  
La clase ventanaFecha representa un cuadro de diálogo modal que muestra un panel de calendario (panelCalendario) y un botón de aceptar.
| Función               | Descripción                                                                                                                                                   |
|-----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `ventanaFecha(Frame parent, boolean modal)` | Constructor de la clase. Crea un nuevo cuadro de diálogo modal.                                                                                                 |
| `btnAceptarActionPerformed()` | Método ejecutado cuando se presiona el botón de aceptar. Cierra el cuadro de diálogo.                                                                         |
| `getMes()`            | Retorna el mes seleccionado en el panel de calendario.                                                                                                         |
| `getDia()`            | Retorna el día seleccionado en el panel de calendario.                                                                                                         |
| `getAnio()`           | Retorna el año seleccionado en el panel de calendario.                                                                                                         |
| `main(String args[])` | Método principal de la clase. Crea una instancia de `ventanaFecha` y la muestra.                                                                               |


### Uso:  
La clase ventanaFecha se utiliza para mostrar un cuadro de diálogo que permite al usuario seleccionar una fecha a través de un panel de calendario (panelCalendario). Una vez que el usuario ha seleccionado una fecha, puede presionar el botón "Aceptar" para cerrar el cuadro de diálogo y realizar alguna acción con la fecha seleccionada.



## Clase: panelTiempoFechas  
### Descripción:  
La clase panelTiempoFechas es un panel de interfaz de usuario (UI) que permite calcular la diferencia en días, meses y años entre dos fechas seleccionadas utilizando dos paneles de calendario (panelCalendario).
| Función               | Descripción                                                                                                                                                   |
|-----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `panelTiempoFechas()` | Constructor de la clase. Inicializa el panel de tiempo de fechas y sus componentes, como los dos paneles de calendario.                                     |
| `diasEntre()`         | Calcula la diferencia en días entre las dos fechas seleccionadas en los paneles de calendario.                                                               |
| `mesesEntre()`        | Calcula la diferencia en meses entre las dos fechas seleccionadas en los paneles de calendario.                                                             |
| `aniosEntre()`        | Calcula la diferencia en años entre las dos fechas seleccionadas en los paneles de calendario.                                                               |


### Uso:  
La clase panelTiempoFechas se utiliza para mostrar un panel que permite al usuario seleccionar dos fechas a través de dos paneles de calendario (panelCalendario). Luego, el usuario puede llamar a los métodos diasEntre(), mesesEntre() o aniosEntre() para calcular la diferencia en días, meses o años entre las dos fechas seleccionadas, respectivamente.


