package com.revature.model;

import java.util.Objects;

public class Addition implements Operator  {
    //this is done so i can have a field for the equals.
    public String operator = "+";

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Addition addition = (Addition) o;
        // field comparison
        return o.hashCode() == this.hashCode();
    }


}
