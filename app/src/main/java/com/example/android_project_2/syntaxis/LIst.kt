package com.example.android_project_2.syntaxis

fun main(){

//inmutableList()
    mutableList()
}

/*fun inmutableList(){

    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercole","Jueves","Viernes","Sabado","Domingo")

    /*println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    val example = readOnly.filter { it.contains("a")}
    println("este es el example:"+example)*/

    readOnly.forEach{weekDay ->println(weekDay)}
}*/



fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercole","Jueves","Viernes","Sabado","Domingo")



    weekDays.add(0,"JoseluisDay")

    if(weekDays.isEmpty()){

    }else{
        weekDays.forEach { println(it) }
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println("Este es el dia: "+it) }
    }

    //println(weekDays)

}