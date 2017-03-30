package com.hendisantika.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by hendisantika on 3/21/17.
 */

@RunWith(value = Parameterized.class)
public class Parameterized2Test {
    //default value = 0
    @Parameterized.Parameter
    public String domainName;

    //Single parameter, use Object[]
    @Parameterized.Parameters(name = "{index}: testDomain - {0}")
    public static Object[] data() {
        return new Object[]{
                "google.com",
                "mkyong.com",
                "twitter.com"
        };
    }

    @Test
    public void test_valid_domain() {
        assertThat(DomainUtils.isValid(domainName), is(true));
    }

}
