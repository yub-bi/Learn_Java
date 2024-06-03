public class Test6_03 {
  public static void main(String[] args) {
    /*//사칙연산
    int number1 = 10;
    int number2 = 3;

    int sum = number1 + number2;
    int diff1 = number2 - number1;
    int diff2 = number1 - number2;

    int product = number1 * number2;
    int quot = number1 / number2;
    int remainder = number1 % number2;

    System.out.println("덧셈" + sum);
    System.out.println("뺄셈1" + diff1);
    System.out.println("뺄셈2" + diff2);
    System.out.println("곱셈" + product);
    System.out.println("나눗셈" + quot);
    System.out.println("나머지" + remainder);*/

    /*int a = 10;
    int b = 4;
    int c = a / b;
    double d = (double) a / b;

    System.out.println(d);*/

    /*char c1 = 'A' + 1;
    char c2 = 'A';
    char c3 = c2 + 1;*/

    /*//문자열 합치기
    String str1 = "안녕하세요";
    String str2 = "만나서 반갑습니다.";
    String str3 = str1 + str2;

    System.out.println(str3);*/

    /*System.out.println("Hello" + 123 + 456);

    System.out.println(123 + 456 + "Hello");

    StringBuilder sb = new StringBuilder();
    sb.append(123);
    sb.append(456);
    sb.append("Hello");
    System.out.println(sb.toString());*/

    /*//비교연산
    int number1 = 10;
    int number2 = 30;

    System.out.println(number1 > number2);
    System.out.println(number1 >= number2);
    System.out.println(number1 <= number2);
    System.out.println(number1 < number2);

    System.out.println(number1 == number2);
    System.out.println(number1 != number2);

    String a = new String();
    String b = new String();
    System.out.println(a.equals(b));

    System.out.println('A' < 'B');

    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");

    System.out.println(str1 == str2);
    System.out.println(str1 == str3);*/

    /*i % 2 == 0 && i % 3 == 0 ; // i는 2의 배수이면서 3의 배수이다.
    ( x % 30 == 0 ) && (( x % 2 == 0 )||( x % 5 == 0 )) // x는 30의 배수이면서 2의 배수이거나 5의 배수이다*/

    /*int score = 95;
    char grade;

    if (score > 90) {
      grade = 'A';
    } else {
      grade = 'B';
    }
    System.out.println("당신의 학점은 : " + grade);*/

    /*// if 예제
    int number = 8;

    if (number > 10) {
      System.out.println("number는 10보다 큽니다.");
    } else if (number < 10) {
      System.out.println("number는 10보다 작습니다.");
      if (number > 5) {
        System.out.println("number는 5보다 큽니다.");
      }
    } else {
      System.out.println("number는 10입니다.");
    }*/

    /*//퀴즈1
    int a = 5, b = 13;

    if (a > b) {
      System.out.println("a is greater than b");
    } else if (a == b) {
      System.out.println("a and b are equal");
    } else {
      System.out.println("a is less than b");
    }

    String size =
        (a > b) ? "a is greater than b" : (a == b) ? "a and b are equal" : "a is less than b";

    System.out.println(size);*/

    /*// 문제1
    int x = 10;
    // 삼항연산자
    String judge = (x > 0) ? "x는 양수입니다." : (x == 0) ? "x는 0입니다." : "x는 음수입니다.";
    System.out.println(judge);

    // if
    if (x > 0) {
      System.out.println("x는 양수입니다.");
    } else if (x == 0) {
      System.out.println("x는 0입니다.");
    } else {
      System.out.println("x는 음수입니다.");
    }

    // 문제2
    int score = 75;

    if (score >= 90) {
      System.out.println("A학점 입니다");
    } else if (score >= 80) {
      System.out.println("B학점 입니다");
    } else if (score >= 70) {
      System.out.println("C학점 입니다");
    } else if (score >= 60) {
      System.out.println("D학점 입니다");
    } else {
      System.out.println("F학점 입니다");
    }

    // 문제3
    int year = 2023;

    if (year % 4 == 0) {
      if (year % 100 != 0 || year % 400 == 0) {
        System.out.println("윤년입니다.");
      } else {
        System.out.println("윤년이 아닙니다.");
      }
    } else {
      System.out.println("윤년이 아닙니다.");
    }

    // 문제4
    int a = 10, b = 20, c = 30;

    if (a > b) {
      if (a > c) {
        System.out.println("a가 가장 큰 수 입니다.");
      } else if (a < c) {
        System.out.println("c가 가장 큰 수 입니다.");
      } else {
        System.out.println("가장 큰 수는 없습니다.");
      }
    } else if (a < b) {
      if (b > c) {
        System.out.println("b가 가장 큰 수 입니다.");
      } else if (b < c) {
        System.out.println("c가 가장 큰 수 입니다.");
      } else {
        System.out.println("가장 큰 수는 없습니다.");
      }
    } else {
      if (a < c) {
        System.out.println("c가 가장 큰 수 입니다.");
      } else {
        System.out.println("가장 큰 수는 없습니다.");
      }
    }

    // 문제5
    int passScore = 60;
    int myScore = 75;

    if (myScore >= passScore) {
      System.out.println("합격입니다.");
    } else {
      System.out.println("불합격입니다.");
    }*/

    /*// 논리연산자
    int a = 10;
    int b = 5;

    boolean result1 = (a > 5) && (b < 10); // true && true => true
    boolean result2 = (a > 5) || (b > 10); // true || false => true
    boolean result3 = !(a > 5); // !true => false

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);*/

    /*// 퀴즈1
    boolean x = true, y = true, z = true;

    if (x && !y) {
      System.out.println("조건1 충족");
      if (x || y || z) {
        System.out.println("적어도 하나는 참");
      }
    } else if (y && z || !x && !z) {
      System.out.println("조건2 충족");
      if (!x && !y && !z) {
        System.out.println("모두 거짓");
      } else if (x || y || z) {
        System.out.println("적어도 하나는 참");
      }
    } else if (x || y || z) {
      System.out.println("적어도 하나는 참");
    }*/

    /*// switch
    String week = "화요일";

    switch (week) {
      case "월요일":
        System.out.println("운동하기");
        break;
      case "화요일":
        System.out.println("공부하기");
        break;
      case "수요일":
        System.out.println("잠자기");
        break;
      case "목요일":
        System.out.println("숨쉬기");
        break;
      case "금요일":
        System.out.println("물마시기");
        break;
      default:
        System.out.println("알 수 없는 요일");
    }*/

    /*// 문제1
    char grade = 'A';

    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
    }*/

    /*// 문제2
    char operator = '+';
    int num1 = 5, num2 = 7;
    double result;

    switch (operator) {
      case '+':
        result = num1 + num2;
        System.out.println(result);
        break;
      case '-':
        result = num1 - num2;
        System.out.println(result);
        break;
      case '*':
        result = num1 * num2;
        System.out.println(result);
        break;
      case '/':
        result = (double) num1 / num2;
        System.out.println(result);
        break;
    }*/
    /*// 문제 3
    String color = "red";

    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
    }*/

    /*// 문제4
    int score = 50;
    int simScore = (score > 90) ? 9 : (score > 80) ? 8 : (score > 70) ? 7 : (score > 60) ? 6 : 0;

    switch (simScore) {
      case 9:
        System.out.println('A');
        break;
      case 8:
        System.out.println('B');
        break;
      case 7:
        System.out.println('C');
        break;
      case 6:
        System.out.println('D');
        break;
      case 0:
        System.out.println('F');
        break;
    }*/

    /*// 문제5
    String lang = "Java";

    switch (lang) {
      case "Java":
        System.out.println("Java 설명");
        break;
      case "Python":
        System.out.println("Python 설명");
        break;
      case "C++":
        System.out.println("C++ 설명");
        break;
      case "JavaScript":
        System.out.println("JavaScript 설명");
        break;
    }*/


  }
}
