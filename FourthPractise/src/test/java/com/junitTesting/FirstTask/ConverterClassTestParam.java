package com.junitTesting.FirstTask;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ConverterClassTestParam {

    @Parameterized.Parameter
    public int firstParameter;
    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters(name="{index}:convert F to C({0}F={1}C")
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {50, 10},
                {40, 4},
                {30, -1}
        });
    }

    @Test
    public void testFtoC() {
        ConverterClass converter = new ConverterClass();
        double result = converter.convertFtoC(firstParameter);
        Assert.assertEquals("Результат(" + result + ") не равен "
                + expectedResult, expectedResult, result, 0.001);

    }

}
