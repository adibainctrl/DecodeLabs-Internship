import java.util.Scanner;
public class CurrencyConverter {
  static double getRate(String from, String to) {
    double usdRate= 1.0;
    if(from.equals("USD")) usdRate = 1.0;
    else if(from.equals("INR")) usdRate = 1.0 / 94.54;
    else if(from.equals("EUR")) usdRate = 1.0 / 0.88;
    else if(from.equals("GBP")) usdRate = 1.0 / 0.76;
    else if(from.equals("JPY")) usdRate = 1.0 /161.69;

    double targetRate = 1.0;

    if(to.equals("USD")) targetRate = 1.0;
    else if(to.equals("INR")) targetRate = 94.54;
    else if(to.equals("EUR")) targetRate = 0.76;
    else if(to.equals("JPY")) targetRate = 161.69;

    return usdRate * targetRate;
  }
  static boolean isValidCurrency(String currency){
    if(currency.equals("USD") || currency.equals("INR") || currency.equals("EUR") || currency.equals("JPY")){
      return true;
    }
    return false;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String choice = "yes";

    while(choice.equals("yes")){
      System.out.println("\n==============================");
      System.out.println("     CURRENCY CONVERTER       ");
      System.out.println("==============================");
      System.out.println("Available Currencies:");
      System.out.println("  USD - US Dollar");
      System.out.println("  INR - Indian Rupee");
      System.out.println("  EUR - Euro");
      System.out.println("  GBP - British Pound");
      System.out.println("  JPY - Japnese Yen");
      System.out.println("------------------------------");

      System.out.print("Enter base currency: ");
      String fromCurrency = sc.next().toUpperCase();

      if(!isValidCurrency(fromCurrency)){
        System.out.println("Invalid currency! Please choose from the list.");
        continue;
      }
      System.out.print("Enter target currency: ");
      String toCurrency = sc.next().toUpperCase();

      if(!isValidCurrency(toCurrency)){
        System.out.println("Invalid Currency! Please choose from the list.");
        continue;
      }
      if(fromCurrency.equals(toCurrency)){
        System.out.println("Base and target currency cannot be the same!");
        continue;
      }
      System.out.print("Enter amount to convert: ");

      while(!sc.hasNextDouble()){
        System.out.println("Please enter a valid number!");
        sc.next();
        System.out.print("Enter amount to convert: ");
      }

      double amount = sc.nextDouble();

      if(amount <= 0){
        System.out.println("Amount must be greater than zero!");
        continue;
      }

      double rate = getRate(fromCurrency,toCurrency);
      double convertedAmount = amount * rate;

      System.out.println("\n------------------------------");
      System.out.println("Conversion Result:");
      System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
      System.out.printf("Exchange Rate: 1 %s = %.4f %s%n", fromCurrency, rate, toCurrency);
      System.out.println("------------------------------");

      System.out.print("\nDo you want to convert again? (yes/no): ");
      choice = sc.next().toLowerCase();
    }
    System.out.println("\nThank you for using Currency Converter. Have a nice day ahead!");
    sc.close();
  }
}

      




      
  
  
