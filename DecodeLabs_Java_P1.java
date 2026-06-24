import java.util.Random;
import java.util.Scanner;

public class DecodeLabs_Java_P1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Random random= new Random();
    final int MAX_ATTEMPTS=7;
    final int MIN=1;
    final int MAX=100;

    int totalScore=0;
    int roundNumber=0;
    String playAgain;

    System.out.println("#######################################");
    System.out.println("#     DECODELABS - NUMBER GAME 🎯      #");
    System.out.println("########################################");
    System.out.println("Guess the number between " + MIN + " and " + MAX);
    System.out.println("You have " + MAX_ATTEMPTS + " attempts per round. \n");

    do{
      roundNumber++;
      int target=random.nextInt(MAX)+1;
      int attemptsUsed=0;
      boolean won=false; 

      System.out.println("---------------------------------------");
      System.out.println("              ROUND"+ roundNumber);
      System.out.println("---------------------------------------");

      while(!won && attemptsUsed < MAX_ATTEMPTS){
        int remaining = MAX_ATTEMPTS - attemptsUsed;
        System.out.print(" Attempts left: "+ remaining +"  -> Enter guess: ");

        try{
          int guess=sc.nextInt();
          sc.nextLine();
          attemptsUsed++;

          if(guess < MIN || guess > MAX){
            System.out.println("OUT OF RANGE! Enter a number between " + MIN + " and " + MAX + ".\n");
          }
          else if(guess == target){
            won = true;
            int roundScore = (MAX_ATTEMPTS - attemptsUsed +1) * 10;
            totalScore += roundScore;
            System.out.println("\n CORRECT! The number was " + target + ".");
            System.out.println(" Round Score: +" + roundScore + "  |  Total score: " + totalScore + "\n");
          }
          else if(guess > target){
            System.out.println("Too High! Try Lower. \n");
          }
          else{
            System.out.println("Too Low! Try Higher. \n");
          }
        }
        catch(java.util.InputMismatchException e){
          sc.nextLine();
          System.out.println("Invalid input. Please enter a whole number.\n");
        }
      }
      if(!won){
        System.out.println("Out of attempts! the number was " + target + ".");
        System.out.println("    Total score: " + totalScore + "\n");
      }
      System.out.print("Play again? (Y/N): ");
      playAgain = sc.nextLine().trim();
    }
    while(playAgain.equalsIgnoreCase("Y"));
    System.out.println("\n############################################");
    System.out.println("#               GAME OVER                  #");
    System.out.printf("#       Rounds Played : %-18d #%n", roundNumber);
    System.out.printf("#       Final score   : %-18d #%n", totalScore);
    System.out.println("##########################################");
    System.out.println("    Thanks for playing! - DecodeLabs \n");

    sc.close();
  }
}
    

  











                               
