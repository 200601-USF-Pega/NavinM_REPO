package com.revature.factory;

import com.revature.model.Addition;
import com.revature.model.Operator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactoryTest {
    Operator operator;
    @Before
    public void SetDummyData() {

        operator = new Addition();
    }

    @Test
    public void FactoryTest() {
      CalculatorFactory calculatorFactory = new CalculatorFactory();
      Operator producedOperator = calculatorFactory.produceOperator("-");
      assertNotEquals(producedOperator, operator);
    }
}
