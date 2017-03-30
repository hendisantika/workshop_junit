package com.hendisantika.junit;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by hendisantika on 3/21/17.
 */
public class Exception1Test {
    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<>().get(0);
    }
}
