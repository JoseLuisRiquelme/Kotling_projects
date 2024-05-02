package com.example.android_project_2.excersises

/*
RESULT:
-you have 51 notifications.
-Your phone is blowing up! You have 99+ notifications.
 */


fun main(){
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages:Int){
    //Fill in the code
    when(numberOfMessages){
        in 1..99-> println("you have $numberOfMessages notifications.")
        !in 1..99 -> println("Your phone is blowing up! You have 99+ notifications.")

    }
}