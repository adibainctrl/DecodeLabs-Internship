import java.util.Scanner;

public class StudenGradeCalculator{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("========================================");
    System.out.println("       Student Grade Calculator         ");
    System.out.println("========================================");

    System.out.print("Enter student name: ");
    String name= sc.nextLine();

    System.out.print("Enter number of subjects: ");
    int n = Integer.parseInt(sc.nextLine());

    if(n<=0) {
      System.out.println("Number of subjects must be at least 1.");
      sc.close();
      return;
    }
    int[] marks = new int[n];
    int total = 0;

    System.out.println("\nEnter marks out of 100 for each subject:");

    for ( int i=0; i < n; i++){
      int m;
      while(true){
        System.out.print("  Subject " + (i + 1) + ": ");
        m = Integer.parseInt(sc.nextLine());

        if(m<0 || m>100){
          System.out.println("Invalid! Marks must be between 0 and 100. Try again.");
        }
        else{
          break;
        }
      }
      marks[i] = m;
      total += m;
    }
    double average = (double) total / n;

    String grade;
    String status;

    if(average >= 90){
      grade = "A";
    }
    else if(average >= 80){
      grade = "B";
    }
    else if(average >=70){
      grade = "C";
    }
    else if(average >= 60){
      grade = "D";
    }
    else{
      grade = "F";
    }

    if(average >= 40){
      status = "PASS";
    }
    else{
      status = "FAIL";
    }
    System.out.println("\n========================================");
    System.out.println("              RESULT CARD               ");
    System.out.println("========================================");
    System.out.println("Student Name   : " + name);
    System.out.println("Total Subjects : " + n);
    System.out.println("Total Marks    : " + total + " / " + (n * 100));
    System.out.printf("Average        : %.2f%%%n", average);
    System.out.println("Grade          : " + grade);
    System.out.println("Status         : " + status);
    System.out.println("========================================");

    sc.close();
  }
}




    
    
    













          

  
