package input;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        
        String answer = myScanner.nextLine();
        
        System.out.println("Hi there, " + answer);
        
        System.out.println("What is your age?");
        
        int answer2 = myScanner.nextInt();
        
        System.out.println("You are " + answer2 + " years old");
        
        if (answer2< 18) {
            System.out.println("You have " + (18-answer2)+ " years left until you can vote.");
        }else{
            System.out.println("You have been able to vote for " + (answer2-18) + " years");
        }
    }
    
}
