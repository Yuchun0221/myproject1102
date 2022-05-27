package com.yu

import javax.swing.JFrame

class GuessFrame : JFrame(){
    init {
        setSize(600,400)
        setLocation(0,0)
        defaultCloseOperation= DISPOSE_ON_CLOSE
        isVisible=true
    }
}

fun main() {
    val guessFrame=GuessFrame()
//    println("Hello world")
}