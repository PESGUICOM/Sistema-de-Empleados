# Java JSPs y Spring Boot
## Dependencias a instalar (necesarias)
<!--Dependencias para manejar JSPs-->
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
		</dependency>
		<!--Dependencias deJSTL-->
		<dependency>
			<groupId>jakarta.servlet.jsp.jstl</groupId>
			<artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
		</dependency>
		<dependency>
			<groupId>org.glassfish.web</groupId>
			<artifactId>jakarta.servlet.jsp.jstl</artifactId>
			<version>2.0.0</version>
		</dependency>
	</dependencies>
# Error
Tuve que instalar la versión 2.0.0 porque no levantaba el servidor de Tomcat
Modifica y agrega lo siguiente para asegurar compatibilidad con Jakarta EE 10 (Spring Boot 3 usa Jakarta EE 10)
 # Datos
 createDatabaseIfNotExist=true → Esto permite que la base de datos se cree automáticamente si no existe.
spring.jpa.hibernate.ddl-auto=update → Esto permite que Hibernate actualice automáticamente la estructura de la base
 de datos (pero no es recomendable en producción porque puede causar problemas con datos existentes).

# Configuración para jsp
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp 
(NO olvidarse del punto antes de .jsp)

# Cambiar el context path de la app
server.servlet.context-path=/empleados
localhost:8080/empleados
Cambiar el puerto
server.port=8081
# Paquetes (Package)
* Modelo - Clase Entidad (Entity)
* Repositorio- Clase Interface EmpleadoRepositorio (Repository)
* Servicio - Clase Interface IEmpleadoServicio y Clase EmpleadoServicio Servicio (Service)
* Controlador - Clase IndexControlador (Controller)

## El método iniciar
ModelMap con el atributo modelo para compartir información según la información que recuperamos de la base de datos a través del servicio.
Para procesar la url inicial y posteriormente el método de tipo http el RequestMethod es Get.
@RequestMapping(value = "/", method = RequestMethod.GET)
