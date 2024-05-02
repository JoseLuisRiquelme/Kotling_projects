package com.example.android_project_2.excersises

fun main(){
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)} ")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)} ")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)} ")
}
/*
Las entradas de cine suelen tener un precio diferente segun la edad de los espectadores.

En el codigo inicial que se proporciona en el siguiente fragmaneto de codigo, escribe un programa que calcule los precios de estas entrads basados en la edad.
-un precio de entrada infantil de 15usd para personas de 12 anhos o menor.

-Un  precio de entrada estandar de 30USD para personas de entre 13-60 anhos lo Lunes, un precio estandar con descuento de 25usd para el mismo grupo estario.

-Un precio para adultos mayores  de 20usd para personas de 61 anos o ms (asuminos que la edad maxima dde un espectador es de 100 anos)

-Un valor de -1  ara indicar que el precio no es valido cuando un usuario ingresa una edad fuera de las especificaciones.
 */

fun ticketPrice(age: Int, isMonday: Boolean): Int {
   /* return if (age <= 12) {
        if (isMonday) 15 else 25
    } else if (age in 13..60) {
        if (isMonday) 25 else 30
    } else if (age in 61..100) {
        20
    } else {
        -1
    }*/

    return when(age){
        in 0..12->15
        in 12..60->if(isMonday) 25 else 30
        in 61..100-> 20
        else->-1
    }
}
