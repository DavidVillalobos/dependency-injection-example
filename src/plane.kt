/*
    file: plane.kt
    authors: Abigail Urbina - Luis Villalobos
*/


class Motor{
	fun start(){
          // motor start ...
     }
}

class Cabina{

}
// La clase avion contiene 2 dependencias
class Avion{ 
     // Las dependencias son creadas dentro de la clase 
     private var motor : Motor =  Motor() 
     private var cabina : Cabina = Cabina()
     fun start() {
          motor.start();
     }
}

fun main() {
     var avion = Avion()
     avion.start()
}