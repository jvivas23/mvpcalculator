package com.vivasdev.mvpcalculator.interfaces

interface OperationView {
    fun showResult(result: String)
    fun invalidOperation()
}