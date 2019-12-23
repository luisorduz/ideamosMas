# Test Java Ideamos Mas

Este proyecto es una api rest construida con java 8 con el framework Spring Boot y los dos recursos post estan basados en los ejercicios de las siguientes paginas:

1) https://www.hackerrank.com/challenges/java-currency-formatter/problem
2) https://www.hackerrank.com/challenges/java-date-and-time/problem

## Comenzando 🚀

Inicialmente vamos a descargar o clonar el proyecto en nuestro pc.

Breve explicacion de los paquetes de nuestro proyecto:
Por lo general manejo MVC, pero en esta ocasion veremos una arquitectura aprendida en los ultimos meses...

Capas de nuestra aplicación:

 Repositories: Se encarga de conectar y traer datos de la base de datos (No fue necesario utilizarla)
 Services: Coordina las fuentes de datos (Aqui resolvimos nuestras peticiones sin necesidad de usar los repositories..)
 Controllers: Coordina las entradas y salidas de información
 Json - FrontEnd: Es lo que el usuario visualiza, los datos en formato json

Compilamos el proyecto con Maven, para ello:
1) Daremos Click derecho en el proyecto Run As
2) Seleccionamos 6 Maven Build…
3) En la ventana que abra verifica que estes en la pestaña Main
4) En la opción Goals colocaremos clean install
5) Damos click en Run

7) Después corremos el proyecto:
8) Daremos Click derecho en el proyecto Run As
9) Spring Boot App

Mira **Deployment** para conocer como desplegar el proyecto.


### Pre-requisitos 📋
Spring Framework 
Postman The Collaboration Platform for API Development (Hacemos las peticiones a nuestros servicios)

1) Spring Tool Suite™ 3 : https://spring.io/tools3/sts/all
2) Postman : https://www.getpostman.com/

### Instalación 🔧

Apenas tengamos instalado Spring Framework o el IDE de tu preferencia Java, importaremos el proyecto

1) Descargar o clonar el proyecto en nuestro pc
2) Abrimos Spring
3) Vamos a File/import/General/Existing projects into workspace
4) Click derecho en nuestro proeyecto (ideamosMas)
5) Run As
6) Spring Boot App


## Ejecutando las pruebas ⚙️

Para realizar las pruebas utilizaremos el software postman con el que enviaremos las peticiones post.

En la carpeta PostmanPruebas tendreamos un proyecto al que he llamado ideamosMas el cual importaremos en postman siguiendo los pasos:

1) Abrimos postman
2) File
3) Import
4) Import File
5) Choose Files
6) Seleccionamos el proyecto ideamosMas
7) Seleccionamos doble click en la peticion getCurrency
8) http://localhost:8080/v1/getCurrency y damos click en el boton Send 
9) Seleccionamos doble click en la peticion getNameDayDate
10) http://localhost:8080/v1/getDateAndTime y damos click en el boton Send 

Para enviar la peticion http://localhost:8080/v1/getCurrency debemos enviar el request Json:

{
 "date":"17 09 1991"
}

el response sera:

{
    "nombreDia": "TUESDAY",
    "fecha": "17 09 1991",
    "mensaje": "El nombre del dia (17) del mes 9 y año 1991 es: TUESDAY"
}


Para enviar la peticion http://localhost:8080/v1/getDateAndTime debemos enviar el request Json:

{
 "countryName":"US",
 "amount": 123.45
}
 
el response sera:

{
    "currency": "$123.45",
    "countryName": "US",
    "mensaje": "US: $123.45 - India: Rs.123.45 - China: ￥123.45 - France: 123,45 €"
}

el proyecto ideamosMas de postman esta previamente configurado y no necesitamos modificar nada.
si deseamos solo los datos Json .


### Pruebas unitarias con Junit 🔩

Para correr las pruebas unitarias Junit seguimos los siguientes pasos:

1) identificamos la clase (IdeamosMasApplicationTests.java) en la siguiente ruta \IdeamosMas\src\test\java\com\ideamosmas\IdeamosMasApplicationTests.java dentro del proyecto
2) Luego damos Click derecho encima de la clase 
3) Run As
4) Run configurations...
5) Seleccionamos -> Test runner: Junit4
6) Run

## Despliegue 📦

Compilamos el proyecto con Maven, para ello:
Daremos Click derecho en el proyecto Run As
Seleccionamos 6 Maven Build…
En la ventana que abra verifica que estes en la pestaña Main
En la opción Goals colocaremos clean install
Damos click en Run

Después corremos el proyecto:
Daremos Click derecho en el proyecto Run As
Spring Boot App

## Construido con 🛠️

_Menciona las herramientas que utilizaste para crear tu proyecto_

* [Spring](https://spring.io/tools3/sts/all) - El framework web usado
* [Maven](https://maven.apache.org/) - Manejador de dependencias

## Versionado 📌

Usamos [tortoisegit](https://tortoisegit.org/) para el versionado.

## Autores ✒️

* **Luis Andres Orduz** - *Trabajo Inicial* - [ideamosMas](https://github.com/luisorduz/ideamosMas)

## Licencia 📄

El marco del API es un software de código abierto con licencia LGPL.

---
⌨️ con ❤️ por [luisorduz](https://github.com/luisorduz) 😊
