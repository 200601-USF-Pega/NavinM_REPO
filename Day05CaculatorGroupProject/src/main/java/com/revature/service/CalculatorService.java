package com.revature.service;

import com.revature.factory.CalculatorFactory;
import com.revature.model.Operator;

public class CalculatorService {
    private ValidationService inputValidation = new ValidationService();
    private CalculatorFactory calculatorFactory = new CalculatorFactory();

    public CalculatorService() {
    }

    public int calculate(){
        //get user input
        int firstNumber = inputValidation.getValidInt("Enter the first number: ");
        String validOperator = inputValidation.getValidOperator("Enter operator: ");
        int secondNumber = inputValidation.getValidInt("Enter the second number: ");

        Operator operator = calculatorFactory.produceOperator(validOperator);
        int result = operator.doOperation(firstNumber, secondNumber);
        return result;

    }
}
