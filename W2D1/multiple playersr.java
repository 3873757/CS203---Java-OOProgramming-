
package numberof.player;

/**
 *
 * Author jambo
 */
import java.util.*;
public class RandomNumber {   
        public static void main(String[] args) {
         boolean play = true;
        String answer = "y";
        String playAgain;
        Scanner in = new Scanner(System.in);
        int y = 1;        
        while (true){ 
        int [] random ;
        random = new int[10];
 
        boolean [] won ;
        won = new boolean [10];
 
        int counter=0;
        boolean stopPlay = false;
 
        System.out.println ("How Many players are there?");
       
        int player = in.nextInt();
 
        for (int x = 1; x<= player; x++){
            random[x] = getNumber();
}
     while(!stopPlay){
        counter++;
        int[] guesses = new int[player];
        System.out.println("Guess a number between 1 and 10");
        for(int i=1; i<=player; i++){
            guesses[i-1]= getGuess(i);
}
        for(int i=1; i<=player; i++){
            System.out.print("Player " + i + ", your guess is ");
            //System.out.println(random[i]);
            won[i]= compare(guesses[i-1], random[i], counter);
            if (won[i] == true){
            break;
}
}
 
}
    System.out.println ("Play again: (y/n)");
    answer = in.nextLine();
    while (play==true);
    if (answer=="yes" || answer == "y"){
        play = true;
         
    } else if (answer == "no" || answer == "n"){
        play = false;
    }
     
    }        
 
}
     public  static int getNumber (){ 
        Random generator = new Random();
        int a = generator.nextInt(9)+1;
        return a;
}
    public  static int getGuess(int i){
 
        Scanner in = new Scanner(System.in);
        System.out.print("Player " + i + ": ");
        int guess = in.nextInt();
        return guess;
}
    public  static boolean compare(int guess, int random, int count){
         
         if(guess < random){
            System.out.println("missed");
}
        if(guess > random){
            System.out.println("missed");
}
        if (guess == random){
            System.out.println("Correct!");
            System.out.println("The number of guesses: " + count);
             
            System.out.println("You Win!");            
 
        return true;
}
    else return false;
}

    }

