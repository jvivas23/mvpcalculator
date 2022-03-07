package com.vivasdev.mvpcalculator.presenters

import com.vivasdev.mvpcalculator.interactor.OperationInteractorImpl
import com.vivasdev.mvpcalculator.interfaces.OperationInteractor
import com.vivasdev.mvpcalculator.interfaces.OperationPresenter
import com.vivasdev.mvpcalculator.interfaces.OperationView

class OperationPresenterImpl(var view: OperationView): OperationPresenter {

    private val interactor: OperationInteractor = OperationInteractorImpl(this)

    override fun showResults(result: String) {
        view.showResult(result)
    }

    override fun invalidOperation() {
        view.invalidOperation()
    }

    override fun add(num1: Double, num2: Double) {
        interactor.add(num1,num2)
    }

    override fun subtract(num1: Double, num2: Double) {
        interactor.subtract(num1,num2)
    }

    override fun multiply(num1: Double, num2: Double) {
        interactor.multiply(num1,num2)
    }

    override fun divide(num1: Double, num2: Double) {
        interactor.divide(num1,num2)
    }
}