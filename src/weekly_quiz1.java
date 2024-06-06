import java.util.Scanner;

public class weekly_quiz1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("원하는 기능을 선택하세요");
      System.out.println("1.덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
      String choice = sc.nextLine();

      if (choice.equals("1") || choice.equals("덧셈")) {
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        double firstNum = sc.nextDouble();
        sc.nextLine();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요");
        double secondNum = sc.nextDouble();
        sc.nextLine();
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
      } else if (choice.equals("2") || choice.equals("뺄셈")) {
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        double firstNum = sc.nextDouble();
        sc.nextLine();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요");
        double secondNum = sc.nextDouble();
        sc.nextLine();
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
      } else if (choice.equals("3") || choice.equals("곱셈")) {
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        double firstNum = sc.nextDouble();
        sc.nextLine();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요");
        double secondNum = sc.nextDouble();
        sc.nextLine();
        System.out.println(firstNum + " X " + secondNum + " = " + (firstNum * secondNum));
      } else if (choice.equals("4") || choice.equals("나눗셈")) {
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        double firstNum = sc.nextDouble();
        sc.nextLine();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요");
        double secondNum = sc.nextDouble();
        sc.nextLine();
        System.out.println(firstNum + " % " + secondNum + " = " + (firstNum / secondNum));
      } else if (choice.equals("0") || choice.equals("종료")) {
        break;
      } else {
        System.out.println("올바른 입력이 아닙니다. 다시 입력해주세요.");
      }
    }
  }
}
