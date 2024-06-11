import java.util.Scanner;

public class Test6_11 {
  public static void main(String[] args) {
    /*Test6_11_2 test = new Test6_11_2();

    System.out.println(test.add(5, 3));
    System.out.println(test.sub(5, 3));*/

    Test6_11_Person person1 = new Test6_11_Person("마크", 01000000000, 600, 40);
    Test6_11_Person person2 = new Test6_11_Person("맥스", 01011111110, 300, 38);
    Test6_11_Person person3 = new Test6_11_Person("쟈크", 01000010002, 800, 35);
    Test6_11_Person person4 = new Test6_11_Person("바드", 01000020004, 900, 33);

    /*person1.sayMoney();
    person2.sayMoney();
    person3.sayMoney();
    person4.sayMoney();*/

    Test6_11_Student student = new Test6_11_Student();

    /*person1.teaching(student);

    person1.cheating(student);*/

    Scanner sc = new Scanner(System.in);

    System.out.println("계좌번호를 입력하세요.");
    String accountNumber = sc.nextLine();
    System.out.println("소유자 이름을 입력하세요.");
    String ownerName = sc.nextLine();
    Test6_11_Bank account = new Test6_11_Bank(accountNumber, ownerName);

    account.deposit(100000);
    account.withdraw(50000);

    account.printBalance();

    sc.close();
  }

  /* // 사칙연산
  int add(int a, int b) {
    return a + b;
  }

  int sub(int a, int b) {
    return a - b;
  }

  int mul(int a, int b) {
    return a * b;
  }

  double sep(int a, int b) {
    return (double) a / b;
  }

  static void login(String email, String password) {}*/
}
