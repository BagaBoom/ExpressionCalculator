package com.radchuk.calculatorlibrary



import net.objecthunter.exp4j.ExpressionBuilder

class ExpressionCalculator {
    fun calculate(expression: String): Double {
        val expr = ExpressionBuilder(expression).build()
        return expr.evaluate()
    }
}

