Antes de empezar a crear el proyecto hacemos el diagrama





1. Paso creamos el proyecto desde spring initializr con maven, agregando las dependencias


2. Después de creado el paquete del proyecto exportamos el archivo y lo abrimos en intellij ,cuando ya abre el proyecto en intellij empezamos a crear las clases dentro de los paquetes de modell,repository,service y controller,que hace referencia al MVC.



3. Paso en la primera línea de código la siguiente etiqueta está relacionada con el uso de jpa en el framework spring boot , la línea de código 8 me va permitir ver los diferentes tipos de clase y sus características, las etiquetas de la lineas de codigo 11 y 12 nos sirve para indicarle a JPA que este es el ID por donde debe hacer las búsquedas a estas tablas y además que va usar una estrategia de autoincrementando en esta parte se construirán los constructores de esta clase y cada uno de ellos permitirá crear cada uno de los tipos de naves como objetos,declaramos un constructor vacío porque al recargar varios métodos en el constructor esto me ayudará a que tome en cuenta los atributos del objeto.

Los métodos constructores



4. Paso los atributos de las clases son privados están encapsulados y la única forma de poder acceder a ellos ,para conocer sus valores o modificarlos se debe hacer a través de los métodos getter y setter.





5. Paso buscamos el resources y donde dice application properties escribimos el código que nos permitirá la conexión con la base de datos


6. Paso en la interface nave repository nos permite acceder a los datos de la base de datos, esta clase como es una interface para spring boot no necesaria ser anotada porque tiene todos sus métodos abstractos son todos aquellos que hereda de JPArepository la clase que vaya a usar esta interface.



7. La clase donde se coloca la lógica de la aplicación se le conoce como clases de servicio o clases de negocio y se coloca la anotación con @servicie




8. Paso esta es una interface y aquí solo colocamos los métodos abstractos y como interface no se debe anotar con etiquetas de spring boot



9. Paso usamos postman y spring boot es http entonces debemos hacer uso de los verbos de protocolo que provee,como son get,post,delete,update,put,options,head,etc.
creamos una clase llamada responsableentitiy es propia de spring web, para que desde cualquier cliente como postman o alguna aplicación frontend lleguen a este metodo, asi que es necesario anotar el verbo de protocolo http adecuado en este caso como se trata de guardar usaremos el verbo post





10. Paso al momento de ejecutar el proyecto ingresamos a postgres a validar si la tabla nave está creada con sus respectivos atributos




11. Paso validamos si en postman la petición que mandamos aparece



   Las herramientas que use para probar mi aplicacion a traves de postman,use la base de datos relacional a través de postgres ,utilice el ID de intellij el framework para construir la aplicación java web lo hice con  spring boot,la conexión a la base de datos lo hice a través del la dependencia de driver de maven,las consultas a las bases de datos lo hice a través de JPA.


12. subir código a github
    1 descargar e instalar github en mi maquina
    2 crear una cuenta de github
    3 crear un repositorio
    4 se clona el repositorio de github en una carpeta de mi pc local con el comando git clone,luego me ubico en la carpeta donde clone el proyecto,luego sincronizo el repositorio remoto con el local con el comando git fetch origin
    5 se validan los cambios con el comando git status
    6 se alistan los cambios con el comando git add .
    7 se hace commit de los cambios
    8 y por ultimo envio los cambios al repositorio remoto con el comando git push

GLOSARIO

Postman: es una aplicación que nos permite realizar pruebas API. Es un cliente HTTP que nos da la posibilidad de testear 'HTTP requests' a través de una interfaz gráfica de usuario, por medio de la cual obtendremos diferentes tipos de respuesta que posteriormente deberán ser validado.

JPA:(Java™ Persistence API) proporciona un mecanismo para gestionar la persistencia y la correlación relacional de objetos y funciona desde las especificaciones EJB.

MVC: (Modelo-Vista-Controlador) es un patrón en el diseño de software comúnmente utilizado para implementar interfaces de usuario, datos y lógica de control. Enfatiza una separación entre la lógica de negocios y su visualización.

Spring framework:es un framework Open Source que facilita la creación de aplicaciones de todo tipo en Java, Kotlin y Groovy.

Microservicios:Los microservicios son un enfoque arquitectónico y organizativo para el desarrollo de software donde el software está compuesto por pequeños servicios independientes que se comunican a través de API bien definidas.


