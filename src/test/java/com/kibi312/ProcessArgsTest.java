package com.kibi312;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class ProcessArgsTest {
   
    @Test
    public void testNullInput() {
        try { 
            String[] args = null;
            ProcessArgs.convertToInt(args);
        } catch (IllegalArgumentException e) {
            assertEquals("Null array detected", e.getMessage());
        }
    }

    @Test
    public void testEmptyInput() {
        try { 
            String[] args = {};
            ProcessArgs.convertToInt(args);
        } catch (IllegalArgumentException e) {
            assertEquals("Number of arguments should be from 1 to 10 inclusively", e.getMessage());
        }
    }

    @Test
    public void testSingleElement() {
            String[] args = {"100"};
            int[] expected = {100};
            assertArrayEquals(expected, ProcessArgs.convertToInt(args));
    }
    
    @Test
    @FileParameters("src/test/resources/processArgs/moreThan10Args.csv")
    public void testMoreThan10Args(String input) {
        try {
            String[] args = input.split(" ");
            ProcessArgs.convertToInt(args);
        } catch (IllegalArgumentException e) {
            assertEquals("Number of arguments should be from 1 to 10 inclusively", e.getMessage());
        }
    }

    @Test
    @FileParameters("src/test/resources/processArgs/nonIntegerArgs.csv")
    public void testNonIntegerArgs(String input) {
        try {
            String[] args = input.split(" ");
            ProcessArgs.convertToInt(args);
        } catch (IllegalArgumentException e) {
            assertEquals("Non integer argument detected", e.getMessage());
        }
    }

    @Test
    @FileParameters("src/test/resources/processArgs/validArgs.csv")
    public void testValidInput(String input, int p0, int p1, int p2, int p3, int p4, 
                                            int p5, int p6, int p7, int p8, int p9) {
            String[] args = input.split(" ");
            int[] actual = ProcessArgs.convertToInt(args);
            int[] expected = {p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
            assertArrayEquals(expected, actual);
    }

}
