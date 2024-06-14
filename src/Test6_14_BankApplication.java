public class Test6_14_BankApplication {
  public static void main(String[] args) {
    Test6_14_BankAccount account = new Test6_14_BankAccount();
    try {
      account.withdraw(10000);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }
  }
}
