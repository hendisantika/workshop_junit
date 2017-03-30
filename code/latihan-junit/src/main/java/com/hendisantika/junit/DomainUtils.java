package com.hendisantika.junit;

import java.util.regex.Pattern;

/**
 * Created by hendisantika on 3/21/17.
 */

public class DomainUtils {
    private static final String DOMAIN_NAME_PATTERN = "^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}$";
    private static Pattern pDomainName = Pattern.compile(DOMAIN_NAME_PATTERN);

    public static boolean isValid(String domainName) {
        return pDomainName.matcher(domainName).find();
    }
}
