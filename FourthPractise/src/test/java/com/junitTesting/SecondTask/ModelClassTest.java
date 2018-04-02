package com.junitTesting.SecondTask;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class ModelClassTest {

    private ModelClass modelClass;

    @Before
    public void init(){
        modelClass = new ModelClass();
    }

    @Test
    public void sumArea() {
        assertEquals(234.93804002589985,modelClass.sumArea(),0.001);
    }

    @Test
    public void sumArea1() {
        assertEquals(2,modelClass.sumArea("Circle"),0.001);
    }

    @Test
    public void sortByArea() {
        assertArrayEquals(ShapeCreator.createShapes(),modelClass.sortByArea());
    }

    @Test
    public void getAll() {
        assertNotNull(modelClass.getAll());
    }
}
