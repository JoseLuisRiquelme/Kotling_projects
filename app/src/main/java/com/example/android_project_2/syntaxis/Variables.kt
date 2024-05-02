package com.example.android_project_2.syntaxis


/* Variables*/

fun main(){
 variablesNumericas()

    getSemester(25)
    getTrimestre(13)
    result("HOlas")



}

fun variablesNumericas(){

    //Int
    val age:Int = 35
    println("Este es un Int"+" "+ age)

    var age2:Int = 29

//Long

    val example:Long = 1000000

    println("Este es un Long"+" "+example)

    val floatExample:Float =30.5f

    println("Este es un Long"+" "+floatExample)

    /*
    Variables Alfanumeicas
     */

    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    println(charExample1)

    val stringExample:String = "Este es mi string"
    println(stringExample)
    val stringExample2:String = "Jose Luis"

    //Boolean

    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false

    println("Suma")
    println(age+age2)
    println("Resta")
    println(age-age2)
    println("Multiplicar")
    println(age*age2)
    println("Dividir")
    println(age/age2)
    println("Modulo")
    println(age%age2)

    //Concatenar String
    val stringConcatenada:String = "Hola mi nombre es $stringExample2"

    println(stringConcatenada)

}

fun getSemester(month:Int):String{


    val result = when(month){
        in 1..6->   "Primer semestre"
        in 7..12-> "Trimestre no valido"
        else -> "Semester no valido"
    }
    return result
}

fun getTrimestre(month:Int){

    when(month){
        1,2,3 -> println("Primer trimestre")
        4,5,6 -> println("Segundo trimestre")
        7,8,9 -> println("Tercer trimestre")
        else -> println("Trimiestre no valido")
    }
}
fun result(value:Any){
    when(value){
        is Int -> println(value +value)
        is String -> println(value)
        is Boolean -> if(value) println("Holanda")
    }

}