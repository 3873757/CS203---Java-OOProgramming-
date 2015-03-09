/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w3;

import java.util.Calendar;

/**
 *
 * @author jambo
 */
public class CalanderTestDrive {

    public static void main(String[] args) {
        int month = 0;
        int i = 0;
        Calendar cal = Calendar.getInstance();
        String aChar = new Character((char) i).toString();
        int getdate = cal.get(Calendar.DATE);
        int getmonth = cal.get(Calendar.MONTH);
        System.out.println("The date Marthin Luther King was born: " + (cal.get(Calendar.MONTH) + 7) + "/" + (cal.get(Calendar.MONTH) + 26) + "/" + (cal.getWeekYear() - 86) + "G.C");
    }
}
