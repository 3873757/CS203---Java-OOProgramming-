/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2;

/**
 *
 * @author jambo
 */
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> Nums = new ArrayList<>(100);
        int sum = 0;
        int average;
        for (int i = 0; i < 100; i++) {
            Nums.add((int) (Math.random() * 100));
        }
        for (int j = 0; j < 100; j++) {
            sum += Nums.get(j);
        }
        System.out.println("The Sum is: " + sum);

        average = sum / 100;
        System.out.println("The Average is: " + average);
        for (int k = 0; k < 100; k++) {
            if (average == Nums.get(k)) {
                System.out.println("The index of the average value is:" + k);
            }
        }
    }
}
