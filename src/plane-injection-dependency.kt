/*
    file: plane-injection-dependency.kt
    authors: Abigail Urbina - Luis Villalobos
*/

class Motor{
     fun start(){
          // motor start
     }
}

class Cabina{
     
}

class Avion{
     private lateinit var motor : Motor
     private lateinit var cabina : Cabina
     constructor(motor : Motor , cabina : Cabina ){
          this.motor = motor
          this.cabina = cabina
     }
     fun start() {
        motor.start()
     }
}

fun main() {
     // Las dependencias son creadas fuera de la clase
     var avion = Avion(Motor(), Cabina())
     // por ello son 'inyectadas'
     avion.start()
}