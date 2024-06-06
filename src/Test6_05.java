import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test6_05 {
  public static void main(String[] args) {
    /*// 문제1
    String[] words = {"apple", "banana", "cherry", "durian"};

    // for
    for (int i = 0; i < words.length - 1; i++) {
      for (int j = i + 1; j < words.length; j++) {
        System.out.println(words[i] + " " + words[j]);
      }
    }

    // foreach
    int index = 0;
    for (String word : words) {
      for (int i = index + 1; i < word.length(); i++) {
        String word2 = words[i];
        System.out.println(word + " " + word2);
      }
      index++;
    }*/

    /*// Scanner
    Scanner sc = new Scanner(System.in);

    System.out.println("정수를 입력해주세요.");
    int a = sc.nextInt();

    System.out.println("제가 입력한 값은 " + a + "입니다.");

    sc.close();*/

    /*Scanner sc = new Scanner(System.in);

    System.out.println("정수를 입력하세요.");
    int number = sc.nextInt();
    sc.nextLine();

    System.out.println("문자열을 입력하세요.");
    String line = sc.nextLine();

    System.out.println("정수는 " + number);
    System.out.println("문자열은 " + line);
    sc.close();*/

    // 문제1
    /*Scanner sc = new Scanner(System.in);

    System.out.println("1~4 중 아무 숫자를 입력해주세요.");
    int season = sc.nextInt();
    sc.nextLine();

    switch (season){
      case 1:
        System.out.println("봄");
        break;
      case 2:
        System.out.println("여름");
        break;
      case 3:
        System.out.println("가을");
        break;
      case 4:
        System.out.println("겨울");
        break;
      default:
        System.out.println("잘못된 입력입니다!");
    }*/

    /*// library
    Random random = new Random();

    int i = random.nextInt(6) + 1; // 0부터 넣은 숫자미만

    System.out.println(i);*/

    /*// 퀴즈
    Random random = new Random();

    int[] arr = new int[6];
    int i = 0;
    //    while ( i < arr.length)
    for (int j = 0; j < arr.length; j++) {
      int num = random.nextInt(45) + 1;

      if (num != arr[0]
          && num != arr[1]
          && num != arr[2]
          && num != arr[3]
          && num != arr[4]
          && num != arr[5]) {
        arr[j] = num;
      } else {
        continue;
      }
    }
    for (int number : arr) {
      System.out.println(number);
    }*/

    /*// List
    Random random = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>(); // int만 들어갈 수 있는 ArrayList

    while (list.size() < 6) {
      int num = random.nextInt(45) + 1;

      if (!list.contains(num)) {
        list.add(num);
      }
    }
    for (int data : list) {
      System.out.println(data);
    }*/

    /*// 숫자맞추기
    Random random = new Random();
    int targetNumber = random.nextInt(100) + 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("1에서 100사이의 숫자를 입력해주세요.");

    while (true) {
      int answer = sc.nextInt();
      sc.nextLine();
      if (answer == targetNumber) {
        sc.close();
        break;
      } else if (answer > targetNumber) {
        System.out.println("입력하신 수보다 낮은 수입니다. 다시 입력해주세요.");
      } else {
        System.out.println("입력하신 수보다 높은 수입니다. 다시 입력해주세요.");
      }
    }
    System.out.println("정답입니다!");*/

    /*// 영화 티켓 예매
    Scanner sc = new Scanner(System.in);

    System.out.println("영화 제목을 입력해주세요.");
    String title = sc.nextLine();
    System.out.println("인원을 입력해주세요.");
    int people = sc.nextInt();
    sc.nextLine();
    System.out.println("예매자 이름을 입력해주세요.");
    String name = sc.nextLine();
    System.out.println("전화번호를 입력해주세요.");
    String phoneNum = sc.nextLine();
    sc.close();

    System.out.println("====영화 티켓 예매 정보====");
    System.out.println("영화 제목 : " + title);
    System.out.println("관람 인원 : " + people + "명");
    System.out.println("예매자 이름 : " + name);
    System.out.println("예매자 전화번호 : " + phoneNum);

    System.out.println("총 결제 금액 : " + (people * 10000) + "원");*/

  }
}
