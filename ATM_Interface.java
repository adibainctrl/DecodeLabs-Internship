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
    System.out.println("Account Holder: " + account.getAccountHolder());
    System.out.println("-----------------------------");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");
    System.out.println("-----------------------------");
    System.out.println("Enter your choice: ");
  }
  public double getAmount(){
    double amount = 0;
    while(!sc.hasNextDouble()){
      System.out.println("Invalid input! Please enter a number.");
      sc.next();
      System.out.print("Enter amount: ");
    }
    amount = sc.nextDouble();
    return amount;
  }
  public void start(){
    int choice = 0;
    boolean running = true;

    while(running){
      showMenu();

      while(!sc.hasNextInt()){
        System.out.println("Please enter a valid option (1-4).");
        sc.next();
        System.out.print("Enter your choice: ");
      }
      choice = sc.nextInt();

      if(choice == 1){
        System.out.println("\n--- Balance Enquiry ---");
        System.out.println("Your current balance is: Rs. " + account.getBalance());
      }
      else if(choice == 2){
        System.out.printn("\n--- Deposit ---");
        System.out.println("Enter amount to deposit: Rs. ");
        double amt getAmount();
        account.deposit(amt);
      }
      else if(choice == 3){
        System.out.println("\n--- Withdraw ---");
        System.out.print("Enter amount to withdraw: Rs. ");
        double amt = getAmount();
        account.withdraw(amt);
      }
      else if(choice == 4){
        System.out.println("\nThank you for using our ATM. Goodbye!");
        running = false;
      }
      else{
        System.out.println("Invalid choice! Please select between 1 to 4.");
      }
    }
    sc.close();
  }
}
public class ATM_Interface{
  public static void main(String[] args){
    BankAccount myAccount = new BankAccount("Adiba Shahab", 5000.0);
    ATM atm = new ATM(myAccount);
    atm.start();
  }
}
        
        



  
