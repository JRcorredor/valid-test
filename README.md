# Prueba Tecnica backend valid Julian ricardo Corredor 

### Ceremonia
Proyecto contruido con gradle

* instalar dependencias : 'gradle build' o './gradlew build'  --tener instalado gradle
* Correr proyecto , tener desocupado puerto 8080 : 'gradle bootrun'

### Aquitectura propuesta

La arquitectura de solucion se basa primordialmente  en un enfoque basado en capas ,
junto al modelo de capas  se usa el modelo basado en microservicios, como provvedor de arquitectura 
se plantea usar aws bajo un modelo de  nube privada ,como patron de diseño se uso el patron DAO para mantener la capa de negocio (capa de negocio de dejo en 
TODO) separada de la persistencia , asi mismo patron de inyeccion de depencia , propio de spring boot consiguendo tener una aplicacion debilmente acoplada

