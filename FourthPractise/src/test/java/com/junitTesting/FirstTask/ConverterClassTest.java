package com.junitTesting.FirstTask;


import org.junit.*;


import static org.junit.Assert.*;



public class ConverterClassTest {

    private ConverterClass converter;

    @Before
    public  void init() {
        converter = new ConverterClass();
    }

    @Test
    public void convertFtoC() {
        assertEquals(10,converter.convertFtoC(50),0.001);
    }

    @Test
    public void convertCtoF() {
        assertEquals(50,converter.convertCtoF(10),0.001);
    }

    @Test
    public void convertCtoK() {
        assertEquals(283.2,converter.convertCtoK(10),0.001);
    }

    @Test
    public void convertKtoC() {
        assertEquals(-263.2,converter.convertKtoC(10),0.001);
    }

    @Test
    public void convertFtoK() {
        assertEquals(260.94444444444446,converter.convertFtoK(10),0.001);
    }

    @Test
    public void convertKtoF() {
        assertEquals(-441.7,converter.convertKtoF(10),0.001);
    }
}
