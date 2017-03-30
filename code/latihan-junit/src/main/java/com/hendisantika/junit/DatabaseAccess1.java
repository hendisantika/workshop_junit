package com.hendisantika.junit;

import junit.framework.TestCase;

/**
 * Created by hendisantika on 3/28/17.
 */
public class DatabaseAccess1 extends TestCase {
    public void testCheckLogin() {
        DatabaseAccess db = new DatabaseAccess();

        // asumsikan ada username endy dan password secret di database
        assertTrue(db.checkLogin("hendisantika", "secret"));

        // coba dengan user sembarang, harusnya akan menghasilkan false
        assertFalse(db.checkLogin("nobody", "gakada"));
    }
}
