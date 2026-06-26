import java.util.Scanner;
class BankAccount{
  private double balance;
  private String accountHolder;
  public BankAccount(String name, double initialBalance){
    this.accountHolder = name;
    this.balance = initialBalance;
  }
  public double getBalance(){
    return balance;
  }
  public String getAccountHolder(){
    return accountHolder;
  }
  public void deposit(double amount){
    if(amount <= 0) {
      System.out.println("ERROR: Please enter a valid amount!");
    }
    else{
      balance = balance + amount;
      System.out.println("Rs. " + amount + " deposited successfully.");
      System.out.println("New Balance: Rs. " + balance);
    }
  }
  public void withdraw(double amount){
    if(amount <= 0){
      System.out.println("ERROR: Please enter a valid amount!");
    }
    else if(amount > balance){
      System.out.println("ERROR: Insufficient funds! Your balance is Rs. " + balance);
    }
    else{
      balance = balance - amount; 
      System.out.println("Rs. " + amount + " withdrawn successfully.");
      System.out.println("Remaining Balance: Rs. " + balance);
    }
  }
}
class ATM{
  private BankAccount account;
  private Scanner sc;
  public ATM(BankAccount account){
    this.account = account;
    this.sc = new Scanner(System.in);
  }
  public void showMenu(){
    System.out.println("\n=============================");
    System.out.println("       WELCOME TO ATM        ");
    System.out.println("=============================");
    System.out.println(

  
