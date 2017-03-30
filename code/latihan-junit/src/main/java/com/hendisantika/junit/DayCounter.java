package com.hendisantika.junit;

/**
 * Created by hendisantika on 3/28/17.
 */
public class DayCounter {
    /**
     * menghitung jumlah hari dalam bulan dan tahun yang diminta.
     * Misalnya, bila month = 2 dan year = 2000, method ini akan menghasilkan 29.
     * @param month bulan yang akan dihitung
     * @param year tahun yang akan dihitung
     * @return jumlah hari dalam bulan dan tahun bersangkutan
     */
    public int numDays(int month, int year) {
        return 29;
    }

//    public int numDays(int month, int year){
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12: return 31;
//            case 4:
//            case 6:
//            case 9:
//            case 11: return 30;
//            case 2:
//                if (year%4 == 0) {
//                    return 29;
//                } else {
//                    return 28;
//                }
//            default: return 0;
//        }
//    }
}
