import javax.naming.InsufficientResourcesException;

public class Test6_14_BankAccount {
  private int balance;

  public void withdraw(int amount) throws InsufficientBalanceException {
    if (balance < amount) {
      throw new InsufficientBalanceException("잔액이 부족합니다.");
    }
    balance -= amount;
  }
}
