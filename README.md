# TutorialDynamicJasper

Tutorial sobre cómo crear un informe dinámico con DynamicJasper

En este tutorial vamos a crear un proyecto que genere un informe dinámico a partir de una fuente de datos en memoria. Podríamos modificar la fuente para que se obtenga la información de una base de datos, un archivo CSV, etc.

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera, como cualquier proyecto Java:

* `src/main/java`: Contiene el código fuente del proyecto.
* `src/main/resources`: Contiene los recursos del proyecto como por ejemplo los archivos de configuración.
* `target`: Contiene el resultado de la compilación del proyecto.

## Ejecutar el Proyecto

Para ejecutar el proyecto, se debe ejecutar la clase `com.github.io.ysegalb.tutorials.dynamicjasper.SampleReport` como clase principal.

El proyecto utiliza la fuente de datos en memoria `com.github.io.ysegalb.tutorials.dynamicjasper.datasource.SampleDatasource` para obtener los datos que se van a incluir en el informe.

El resultado del proyecto es un archivo en formato PDF con la exportación del informe.

## Información Adicional

El proyecto utiliza la librería DynamicJasper para generar el informe dinámico. DynamicJasper es una librería de JasperReports que permite generar informes dinámicos a partir de un modelo de datos. Construye el informe jrxml de forma programática, y luego lo compila y lo ejecuta para generar el informe PDF.

También utilizamos la librería Lombok para reducir el código boilerplate en las clases. Lombok se encarga de generar código automáticamente para las clases como por ejemplo los getters y setters, el constructor, etc.
