/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author jambo
 */
public class TestComparison {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        byte b = 5;
        short s = 5;
        int i = 5;
        long L = 5;
        float f = 5.0f;
        double d = 5.0;
        String s1 = "Mi";
        String s2 = "Mi";
        String s3 = "MiMi";
        String s4 =  s1+s2;
        System.out.println(f == d);
        System.out.println(b == s);
        System.out.println(i == L);
        System.out.println(L == d);
        System.out.println(f == d);
        System.out.println(s == i);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s4 == s3);
        System.out.println(s1+s2 == s3);
        
        
    }
}
