/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

//Perdon el codigo esta desordenado
fun main() {
    println("Hola Mundo")
    
    var num: Int

    
    
    var n1 = 2
    var n2 = 3
    
    var suma = n1 + n2
    var resta = n1 - n2
    var division = n1 / n2
    var multi = n1 * n2
    
   	var mensaje = ""
    var persona = Numeros(1,2)
   
    println(persona.saludo("Persona"))
	arrays()
    println(suma)
    println(resta)
    println(division)
    println(multi)
    println(mensaje)
    println(toString(suma))
    bucles()
    
}

fun toString(suma: Int):String{
    
	var mensaje = "El resultado de la suma es: $suma \n ksfd"
    variables()
    
    return mensaje
    
}

fun variables(){
    var algo : String
    algo = "Algo"
    println(algo)
    
    val algoMas : Int
    algoMas = 12
    println(algoMas)
    
    var
    mensajeDeAlgo: String = algo +" " + algoMas
    println(mensajeDeAlgo)
    
    condicionales()
    
    
    

}
fun bucles(){
    for(i in 0..4){
        println(i)
    }
}
fun condicionales(){
    var algoCierto : Int = 1
    var algoFalso : Int = 2
    
    if(algoCierto < algoFalso){
        println("Es cierto")
    }else{
        println("Es Falso")
    }
}
class Numeros(
    n1: Int,
    n2: Int
    
){
    fun saludo(nombre : String): String
    {
        var saludo = "Hola $nombre"
        
        return saludo
    }
}
fun arrays(){
    var arrays = arrayOf("Hola","Mundo",2,1)
    for (i in arrays){
        println(i)
    }
}






