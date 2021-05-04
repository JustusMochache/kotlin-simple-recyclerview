package com.example.kotlinsimpleapp


// This is a class to  just hold data and has to start with data class name ()
data class Todo (
    val title: String ,
    var isChecked : Boolean = false
)