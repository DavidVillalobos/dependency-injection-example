/*
    file: code-extension.kt
    authors: Abigail Urbina - Luis Villalobos
 */

interface ServicioPago{
	fun realizarPago(monto : Int)
}

class TarjetaDebito : ServicioPago {
    override fun realizarPago(monto : Int){
        // realizar pago con tarjeta de debito
    }
}

class TarjetaCredito : ServicioPago {
    override fun realizarPago(monto : Int){
        // realizar pago con tarjeta de credito
    }
}

class ServicioInventario{
    fun reducirInventario(cantidad : Int){
        // reduce el inventario
	}
}
class ServicioFacturar{
    private lateinit var pago : ServicioPago
    private lateinit var inventario : ServicioInventario
    constructor(pago : ServicioPago , inventario : ServicioInventario ){
 	    this.pago = pago
 	    this.inventario = inventario
    }
    fun facturar(monto : Int, cantidad : Int) {
 	    pago.realizarPago(monto)
        inventario.reducirInventario(cantidad)
    }
}

fun main() {
    var servicioFacturar = ServicioFacturar(TarjetaDebito(), ServicioInventario())
    servicioFacturar.facturar(4500, 2)
}
