package com.vivasdev.mvpcalculator.interactor

import com.vivasdev.mvpcalculator.interfaces.OperationInteractor
import com.vivasdev.mvpcalculator.interfaces.OperationPresenter

class OperationInteractorImpl(var operationPresenter: OperationPresenter):OperationInteractor {
    private var result:Double = 0.0

    override fun add(num1: Double, num2: Double) {
        result = num1 + num2
        operationPresenter.showResults(result.toString())
    }

    override fun subtract(num1: Double, num2: Double) {
        result = num1 - num2
        operationPresenter.showResults(result.toString())
    }

    override fun multiply(num1: Double, num2: Double) {
        result = num1 * num2
        operationPresenter.showResults(result.toString())
    }

    override fun divide(num1: Double, num2: Double) {
        if(num2 != 0.0){
            result = num1 / num2
            operationPresenter.showResults(result.toString())
        }else{
            operationPresenter.invalidOperation()
        }
    }

}