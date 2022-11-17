# Proyecto Final Metodologias Avanzadas del desarrollo de Software

_Ejecución de pruebas automatizadas por medio de selenium, utilizando BDD (Behavior Driven Development); es decir un desarrollo orientado por el comportamiento_

## Integrantes:  🚀
_Sebastian Abdul Correa Mendez_

_Juan Sebastian Cruz_

_Andres Felipe Mendez Garcia_

## Herramientas utilizadas y sus versiones:

_Cucumber  cucumber-java_version>7.5.0_

_JUnit version>4.13.2_

_Serenity Serenity Cucumber Integration v 	3.4.2_

_Greadle FrameWork v6.9.3_

_Selenium WebDriver selenium-server version3.141.59_
### ¿Que hace la aplicación?
_Partiendo de la existencia de la pagina web de pruebas  Advantage DEMO, se diseño e implemento a traves de un framework un plan de pruebas de aceptación. estas escritas directamente en lenguaje Gherkin  y la interfaz de usuario que se desea probar, pudiendo así utilizar eso como los pasos de una prueba automatizada._

### Instrucciones para usar el código del repo 📋

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._
 _No sin antes instalar Intellij IDEA -> "https://support.academicsoftware.eu/hc/es/articles/360006978997-C%C3%B3mo-instalar-IntelliJ-IDEA-Community-Edition#:~:text=Paso%201%3A%20Ve%20a%20la,Next%20para%20iniciar%20la%20instalaci%C3%B3n."_
y agregar las dependencias y pluggins descritas en las herramientas mencionadas.
* _Clonar un repositorio_
1. En GitHub.com, navegue a la página principal del repositorio.
2. Encima de la lista de archivos, haga clic en  Código.
3. Haga clic en  Abrir con GitHub Desktop para clonar y abrir el repositorio con GitHub Desktop.
4.  Copie la línea: https://github.com/sebastianAbdul1997/ProyectoMetodologias.git
5. Abra Git Bash
6. Escriba git clone y pegue la dirección URL que ha copiado antes.
```
$ git clone https://github.com/sebastianAbdul1997/ProyectoMetodologias.git
```
7. debe salir lo siguiente:
```
$ git clone https://github.com/sebastianAbdul1997/ProyectoMetodologias.git
> Cloning into `Spoon-Knife`...
> remote: Counting objects: 10, done.
> remote: Compressing objects: 100% (8/8), done.
> remove: Total 10 (delta 1), reused 10 (delta 1)
> Unpacking objects: 100% (10/10), done.
```
8. ya estaría listo...


### Conclusiones

_con el uso del lenguaje gherkin se puede generar documentación de evidencia, hacer uso de este fragmento de código el cual puede ser implementado para realización de una prueba E2E o en una prueba unitaria, ya que podemos realizar el paso a paso de la prueba sobre esa historia de usuario con la ejecución de cada método o si solo se deseamos comprobar el resultado final de la prueba y a su vez Utilizar Gherkin nos va a permitir que automatizamos los tests, haciéndolo además con un lenguaje que puede entender negocio._