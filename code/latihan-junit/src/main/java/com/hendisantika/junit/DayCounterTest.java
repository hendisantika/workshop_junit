package com.hendisantika.junit;

import junit.framework.TestCase;

/**
 * Created by hendisantika on 3/29/17.
 */
public class DayCounterTest extends TestCase {
    public void testNumDays() {
        DayCounter d = new DayCounter();
        assertEquals(31, d.numDays(12,2001));
        assertEquals(30, d.numDays(11,2001));
        assertEquals(28, d.numDays(2,2001));
        assertEquals(29, d.numDays(2,2000));
        assertEquals(0, d.numDays(21,2000));
    }
}
