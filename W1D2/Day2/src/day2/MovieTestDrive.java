/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

public class MovieTestDrive 
{
    public static void main(String[] args){
     Movie one = new Movie();
     one.tiltle ="Gone with the stuck";
     one.genre = "Tragic";
     one.rating = 8;
     one.playIt();
     
     Movie two =new Movie();
     two.genre ="Cmedy";
     two.tiltle="Lost in cubicle space";
     two.rating= 5;
     two.playIt();
     
     Movie three = new Movie();
     three.tiltle ="Byte Club";
     three.genre ="Tragic But ultimately uplifting";
     three.rating = 127;
     three.playIt();
    }
}
