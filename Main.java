import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int value = randomNumber.nextInt((10 - 1) + 1) + 1;
        System.out.println(value);
        
        Scanner userGuess = new Scanner(System.in);
        
        System.out.println("Guess a number between 1 and 10: ");
        int inputNumber = userGuess.nextInt();
        System.out.println("User's First Guess is: " + inputNumber);
        
        int attempts = 1;
        int newNumber = 0;
        while (inputNumber != value) {
            if (inputNumber > value){
                System.out.println(inputNumber + " Is too high, guess a new number: ");
                newNumber = userGuess.nextInt();
                if (newNumber == inputNumber){
                    System.out.println(newNumber + " Is a duplicate number, select a different number.");                   
                }else {
                    inputNumber = newNumber;
                    System.out.println("User's New Guess is: " + inputNumber);
                    attempts++;               
                }
            }else {               
                System.out.println(inputNumber + " Is too low, guess a new number: ");
                newNumber = userGuess.nextInt();
                if (newNumber == inputNumber){
                    System.out.println(newNumber + " Is a duplicate number, select a different number.");                   
                }else{
                    inputNumber = newNumber;
                    System.out.println("User's New Guess is: " + inputNumber);
                    attempts++;
                }   
            
        }  
    }
        System.out.println("Congrats! You win!");
        System.out.println("It only took you " + attempts + " guesses!");
    
}

}
