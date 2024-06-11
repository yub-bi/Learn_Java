public class Test6_11_Bank {
  private String accountNumber;
  private String ownerName;
  private double balance;

  public Test6_11_Bank(String accountNumber, String ownerName) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = 0.0;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println(amount + "원이 입금되었습니다.");
    } else {
      System.out.println("유효하지 않은 금액입니다.");
    }
  }

  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      System.out.println(amount + "원이 출금되었습니다.");
    } else {
      System.out.println("잔액이 부족합니다.");
    }
  }

  public void printBalance() {
    System.out.println("현재 잔액: " + balance + "원");
  }
}
