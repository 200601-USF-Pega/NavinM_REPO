package com.revature.model;

public class Division implements Operator  {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 / num2;
    }
}

