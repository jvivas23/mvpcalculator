package com.vivasdev.mvpcalculator.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.vivasdev.mvpcalculator.R
import com.vivasdev.mvpcalculator.interfaces.OperationPresenter
import com.vivasdev.mvpcalculator.interfaces.OperationView
import com.vivasdev.mvpcalculator.presenters.OperationPresenterImpl
import java.lang.NumberFormatException

class OperationActivityView : AppCompatActivity(), OperationView {

    private var number1: EditText? = null
    private var number2: EditText? = null
    private var txtResult: TextView? = null
    private var presenter: OperationPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1 = findViewById(R.id.txtNumber1)
        number2 = findViewById(R.id.txtNumber2)
        txtResult = findViewById(R.id.txtResult)
        presenter = OperationPresenterImpl(this)
    }

    fun doAdd(view: View){
        try {
            val num1 = number1?.text.toString().toDouble()
            val num2 = number2?.text.toString().toDouble()
            presenter?.add(num1,num2)
        }catch (e: NumberFormatException){
            invalidOperation()
        }
    }

    fun doSubstract(view: View){
        try {
            val num1 = number1?.text.toString().toDouble()
            val num2 = number2?.text.toString().toDouble()
            presenter?.subtract(num1,num2)
        }catch (e: NumberFormatException){
            invalidOperation()
        }
    }

    fun doMultiply(view: View){
        try {
            val num1 = number1?.text.toString().toDouble()
            val num2 = number2?.text.toString().toDouble()
            presenter?.multiply(num1,num2)
        }catch (e: NumberFormatException){
            invalidOperation()
        }
    }

    fun doDivide(view: View){
        try {
            val num1 = number1?.text.toString().toDouble()
            val num2 = number2?.text.toString().toDouble()
            presenter?.divide(num1,num2)
        }catch (e: NumberFormatException){
            invalidOperation()
        }
    }

    override fun showResult(result: String) {
        txtResult?.setText(result)
    }

    override fun invalidOperation() {
        Toast.makeText(this,"Invalid operation",Toast.LENGTH_SHORT).show()
    }
}