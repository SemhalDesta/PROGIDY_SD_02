import java.util.Scanner;
public class Task02{
    public static boolean guessChecker(String num){
        int count=0;
        for(int i=0; i<num.length(); i++){
            char eachDigit=num.charAt(i);
            if(Character.isDigit(eachDigit)){
            count++;
        }
        }
        return (count==num.length());
    }
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int number=(int)(Math.random()*101);
        System.out.print("Welcome to the guessing Game!\nGuess a number between 0 and 100: ");
        String guess1=input.next();
        while(guessChecker(guess1)==false){
            System.out.print("Enter a number only: ");
            guess1=input.next();
        }
        int guess=Integer.parseInt(guess1);
        boolean continuation=true;
        int count=0;
        while(continuation){
            if(guess>number){
                System.out.print("Too high. Enter a new one: ");
                guess=input.nextInt();
                count++;
            }
            else if(guess<number){
                System.out.print("Too low. Enter a new one: ");
                guess=input.nextInt();
                count++;
            }
            else{
                System.out.println("You got the number!");
                continuation=false;
            }
        }
        count++;
        System.out.println("You found the number in your "+count+"th guess.");
    }
}
