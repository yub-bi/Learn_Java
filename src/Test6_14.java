import java.util.Scanner;

public class Test6_14 {
  public static void main(String[] args) {

    // 예외처리
    /*try {
      int result = 10 / 0;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println("정상적으로 종료되었습니다.");*/

    /* try {
      divide(10, 0);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println("정상적으로 종료되었습니다.");*/

    /* try {
      int result = 10 / 0;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      System.out.println("이건 예외여부와 상관없이 항상 실행됩니다.");
    }*/

    /*try{
      int[] numbers = {1,2,3};
      System.out.println(numbers[5]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("배열의 인덱스를 벗어났습니다.");
    }*/

    /*// Quiz1

    System.out.println("정수를 입력받아 나눗셈을 수행줍니다.");
    System.out.println("첫번째 정수를 입력해주세요.");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    scanner.nextLine();
    System.out.println("두번째 정수를 입력해주세요.");
    int b = scanner.nextInt();
    scanner.nextLine();
    try {
      int result = a / b;
      System.out.println("값은 " + result + "입니다.");
    } catch (ArithmeticException e) {
      System.out.println("0으로는 나눌 수 없습니다.");
    } finally {
      scanner.close();
      System.out.println("프로그램이 종료되었습니다.");*/

    /*// Quiz2

    Scanner scanner = new Scanner(System.in);
    System.out.println("배열을 생성해주는 프로그램입니다.");
    System.out.println("정수 배열의 크기를 입력해주세요");
    int size = scanner.nextInt();
    scanner.nextLine();
    int[] arr = new int[size];
    int n = 1;
    while (true) {
      try {
        System.out.println((n - 1) + "번째 인덱스를 입력해주세요.");
        arr[n] = scanner.nextInt();
        scanner.nextLine();
        n++;
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("작성을 완료하였습니다.");
        scanner.close();
        break;
      }
    }
    System.out.println("프로그램을 종료합니다.");*/

    // 인터페이스

    Test6_14_ZooKeeper zooKeeper = new Test6_14_ZooKeeper();

    Test6_14_Tiger tiger = new Test6_14_Tiger();
    zooKeeper.feed(tiger);

    Test6_14_Lion lion = new Test6_14_Lion();
    zooKeeper.feed(lion);

    Test6_14_Rabbit rabbit = new Test6_14_Rabbit();
    zooKeeper.feed2(rabbit);

    Test6_14_Deer deer = new Test6_14_Deer();
    zooKeeper.feed2(deer);
  }

  /* private static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }*/
}
