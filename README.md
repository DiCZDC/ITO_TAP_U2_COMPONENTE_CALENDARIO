# ITO_TAP_U2_COMPONENTE_CALENDARIO
Componente visual para Java, el cual permite crear un componente visual para introducir fechas. Se encuentra basado en las librerias `JFRAME` y `JDIALOG`
![image](https://github.com/DiCZDC/ITO_TAP_U2_COMPONENTE_CALENDARIO/assets/168324082/72f49cf5-8c51-48bd-b819-bc5109000f9e)
# Documentación

## panelCalendario

### Descripción:

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
