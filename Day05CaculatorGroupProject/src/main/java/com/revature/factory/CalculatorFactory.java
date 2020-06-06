package com.revature.factory;

import com.revature.model.*;

public class CalculatorFactory {

    public Operator produceOperator(String operatorType) {
        Operator requestedOperatorObject = null;

        switch(operatorType){
            case "+":
                requestedOperatorObject = new Addition();
                break;
            case "-":
                requestedOperatorObject = new Subtraction();
                break;
            case "*":
                requestedOperatorObject = new Multiplication();
                break;
            case "/":
                requestedOperatorObject = new Division();
                break;
            case "%":
                requestedOperatorObject = new Modulo();
                break;
        }
        return requestedOperatorObject;
    }

}
