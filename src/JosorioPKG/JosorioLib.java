package JosorioPKG;

import java.util.Scanner;
import java.util.Random;

public class JosorioLib {
    public static void generator(){
        String name = getName();
        int limit = getDifficulty();
        int ans = getNum(limit);
        Scanner guess = new Scanner (System.in);
        System.out.println("Hello" + name +"! Guess my number! its between 1 and "+limit+".");
        int guessMade = guess.nextInt();
        if(guessMade == ans){
            System.out.println("Ayy you got it right!");
        }
        if(guessMade < ans)
            System.out.println("Too low! My guess is higher!");
        else
            System.out.println("Too high! My guess is lower!");
    }
    public static int getNum(int limit){
        Random rand = new Random();
        int num = rand.nextInt(limit)+1;
        return num;
    }
    public static void ai() {
        int IN_PROGRESS = 0, GAME_OVER = 1;
        int gameStatus = IN_PROGRESS;
        System.out.println("Hello! Now you choose a number I will guess.");
        int range = 100;
        Scanner guesses = new Scanner(System.in);
        String ui = guesses.nextLine();
        int guess = range / 2;
        while (gameStatus == IN_PROGRESS) {
            if (ui.equalsIgnoreCase("correct")) {
                gameStatus = GAME_OVER;
                System.out.println("Yay! I got it");
            }
            if (ui.equalsIgnoreCase("lower")) {
                guess = greaterThan(guess);
            }
            if(ui.equalsIgnoreCase("higher")) {
                guess = lessThan(guess);
            }
        }

    }

    public static int greaterThan(int guess){
        guess = guess / 2;
        return guess;
    }
    public static int lessThan(int guess){
        guess = guess * (guess/2);
        return guess;
    }
    public static int getDifficulty(){
        System.out.println(" Hi! What difficulty do you want?\n" +
                " Type 1 for 1-10 \n " +
                "Type 2 for 1-100\n " +
                "Type 3 for 1-1000 \n" +
                "And 4 for 10000,");
        Scanner dif = new Scanner(System.in);
        int chosen = dif.nextInt();
        if(chosen == 1){
            return 1;
        }
        if(chosen == 2){
            return 2;
        }
        if(chosen == 3){
            return 3;
        }
        if(chosen == 4){
            return 4;
        }
        else{
            System.out.println("Enter a number that is within the given range !");
            return 0;
        }
    }
    public static String getName(){
        System.out.println("Whats your name?");
        Scanner name = new Scanner (System.in);
        return (name.nextLine());
    }
}









