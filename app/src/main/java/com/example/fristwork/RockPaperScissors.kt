package com.example.fristwork

fun main() {
    println("Enter Rock, Paper, or Scissors: ")
    val userinput = readln()
    val computerInput = (1..3).random()


    val st = when(computerInput){
        1 -> "Rock"
        2 -> "Paper"
        else -> "Scissors"
    }
    val winner = when{
        userinput == st -> "Tie"
        userinput == "Rock" && st == "Scissors" -> "User"
        userinput == "Paper" && st == "Rock" -> "User"
        userinput == "Scissors" && st == "Paper" -> "User"
        else -> "Computer"
    }

    println("\nThe computer entered $st")
    if(winner == "User"){
        println("The winner is User")
    }
    else if (winner == "Computer")
        println("Winner is Computer")
    else
        println("It is a tie")

}