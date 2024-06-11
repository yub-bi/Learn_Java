import java.util.Scanner;

public class DailyQuiz1Status {

  String name;
  String gender;
  int age;
  String mbti;

  Scanner scanner = new Scanner(System.in);

  public DailyQuiz1Status(String name, String gender, int age, String mbti) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.mbti = mbti;
  }

  public void gettingOlder() {
    age++;
    System.out.println("현재 나이는 " + age + "살 입니다.");
  }

  public void foreignAge() {
    System.out.println("오늘 날짜를 입력해주세요. ex 6월11일 > 611");
    int today = scanner.nextInt();
    System.out.println("생일을 입력해 주세요. ex 9월 27일 > 927");
    int birthday = scanner.nextInt();

    if (today > birthday) {
      System.out.println("당신의 만나이는 " + (age - 1) + "입니다.");
    } else {
      System.out.println("당신의 만나이는 " + (age - 2) + "입니다.");
    }

    scanner.close();
  }
}
