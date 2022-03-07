package com.vivasdev.mvpcalculator.interfaces

interface OperationInteractor {
    fun add(num1: Double, num2: Double)
    fun subtract(num1: Double,num2: Double)
    fun multiply(num1: Double,num2: Double)
    fun divide(num1: Double, num2: Double)
}