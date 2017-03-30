package com.hendisantika.junit;

/**
 * Created by hendisantika on 3/28/17.
 */
public class DatabaseAccess {
    /**
     * memeriksa username dan password dalam database.
     * Method ini akan mencocokkan username dan password yang diberikan
     * dan yang terdaftar di database.
     * Apabila cocok, akan menghasilkan true, dan apabila tidak cocok akan menghasilkan false.
     * @param username
     * @param password
     * @return true kalau cocok, false kalau tidak cocok
     */
    public boolean checkLogin(String username, String password) {
        String sql = "SELECT * FROM user WHERE username=? AND password=?";
        // dst kode akses database
        return true;

    }
}
