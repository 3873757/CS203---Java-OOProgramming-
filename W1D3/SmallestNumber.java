/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author jambo
 */
public class SmallestNumber {

    public static void main(String[] args) {
        double min = 0;
        double[] nums = new double[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random() * 100;
            min = nums[0];
            if (nums[i] < min) {
                min = nums[i];
            }

        }
        System.out.print(min);
    }
}
