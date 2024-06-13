package exercise;

public class Test {
  public static void main(String[] args) {
    InheritQ2 inheritQ2 = new InheritQ2();

    inheritQ2.saveMoney();
    inheritQ2.investMoney();
    inheritQ2.investMoney();
    inheritQ2.investMoney();

    System.out.println(inheritQ2.money);
  }
}
