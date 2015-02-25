/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
import java.util.Arrays;
public class SumOfEven {
    public int SumofEven(int[] nums){
       int sum =0;
   for(int i = 0;i < nums.length;i++)
   {
    if(i%2==0){
    sum+= nums[i];
   // }
   //public void sum(){
       System.out.println(sum);
   }
}
