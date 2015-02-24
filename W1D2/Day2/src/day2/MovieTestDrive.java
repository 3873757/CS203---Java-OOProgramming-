/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

public class MovieTestDrive {

    public static void main(String[] args) {
        Movie one = new Movie("Gone with the stuck", "  Tragic", 8);
        //one.tiltle ="Gone with the stuck";
        //one.genre = "Tragic";
        //one.rating = 8;
        //one.playIt();
        Movie two = new Movie("Cmedy", "  Lost in cubicle space", 5);
        // two.genre ="Cmedy";
        // two.tiltle="Lost in cubicle space";
        //two.rating= 5;
        //two.playIt();

        Movie three = new Movie("Byte Club", " Byte Club", 127);
        //three.tiltle ="Byte Club";
        //three.genre ="Tragic But ultimately uplifting";
        // three.rating = 127;
        //three.playIt();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}