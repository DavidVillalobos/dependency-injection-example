# Inyección de dependencias ejemplo

Ejemplo conceptual de inyección de dependencias en kotlin

La inyeccion de dependencias es un patron de diseno 
que debe de utilizarse para que el mantenimiento de 
codigo a futuro sea mas facil de realizar.

Por ejemplo puede notar en el [plane.kt](src/plane.kt) donde no se utiliza 
el patron como esto perjudica la modificacion a futuro de la configuracion ya existiente del avion.

Seguido en el ejemplo  [plane-injection-dependency.kt](src/plane-injection-dependency.kt) se muestra como siguiendo el 
patron de inyeccion de dependencias se permite generar un codigo  
mas abierto a cambios.

Ademas se puede hacer mucho mas extensible utilizando herencia, para ello 
puede consultar el siguiente codigo [code-extension.kt](src/code-extension.kt)

# Autores
* Abigail Urbina
* David Villalobos
