/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w3;

/**
 *
 * @author jambo
 */
public class AsciiTable {
    
    public static void main(String[] args) {
        System.out.println("Dec Hx Oct Char | Dec Hx Oct Char | Dec Hx Oct Char");
        for(int i = 32; i < 129; i++){
            System.out.printf("%d\t%x\t%o\t%c\n", i, i, i, i);
        }
    }
}

