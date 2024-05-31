public class Test5_31 {
  public static void main(String[] args) {

    //    String phoneName = "Galaxy";

    /*
        // 문자열
        String firstName = "Sunghwan";
        String secondName = "Park";
        String phone = "IPhone";
        String status = "Good";

        System.out.println("나는 " + secondName + " " + firstName + "입니다.");
        System.out.println("폰의 기종은 " + phone + "이고 저의 지금 상태는 " + status + "입니다");

        System.out.println(firstName.length());
        System.out.println(firstName.equals(secondName));
    */

    /*//문자열 비교
    String a = "hello";
    String b = new String("hello");

    System.out.println(a.equals(b)); // true, 값을 비교
    System.out.println(a == b); // false, 메모리의 주소 비교*/

    /*String a = "Hello World!";
    System.out.println(a.indexOf("!"));
    System.out.println(a.contains());*/

    /*String b = "ESTSOFT";
    System.out.println(b.contains("SOFT"));

    String findChar = "What is your hobby";
    System.out.println(
        findChar.charAt(13)
            + ""
            + findChar.charAt(14)
            + findChar.charAt(15)
            + findChar.charAt(16)
            + findChar.charAt(17));*/

    /*String a = "Hello World!";
    System.out.println(a.replaceAll("World","Java"));*/

    /*String a = "WEEEE ASKE ;ND";

    System.out.println(
        a.substring(0, 3) + a.substring(8, 9) + " " + a.substring(1, 2) + a.substring(12));*/

    /*    String a = "a:b:c:d";

    String[] split = a.split(":");*/

    /*String name1 = "Tim";
    int age1 = 30;

    String name2 = "Anna";
    int age2 = 45;

    String format = String.format("%s의 나이는 %s세 입니다", name1, age1);
    String format1 = String.format("%s의 나이는 %s세 입니다", name2, age2);*/

    /*String result = "";

    result += "Hello ";
    result += "Java";
    result += "World";

    System.out.println(result);

    StringBuilder sb = new StringBuilder();
    sb.append("Hello ");
    sb.append("Java");
    sb.append("World");

    System.out.println(sb);

    StringBuffer sf = new StringBuffer();
    sf.append("Hello ");
    sf.append("Java");
    sf.append("World");

    System.out.println(sf);*/

    /*// 배열
    int[] arr = new int[100];
    String[] arr1 = new String[1000];

    System.out.println(arr1[0]);*/

    /*//부호 연산자
    int positive = 10;
    int negative = -10;

    System.out.println("양의 부호 연산자 적용: "+ (+positive));
    System.out.println("음의 부호 연산자 적용: "+ (-positive));
    System.out.println("음의 부호 연산자로 부호 반전: "+ (+negative));
    System.out.println("음의 부호 연산자로 다시 부호 반전: "+ (-negative));*/

    /*int x = 5;
    int y = 5;

    System.out.println("전위 증가 연산자: " + (++x));
    System.out.println("후위 증가 연산자: " + (y++));

    System.out.println("================");

    System.out.println("x는" + x);
    System.out.println("y는" + y);*/

    /*int a = 100;
    int b = 100;

    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));*/

    boolean isRainging = true;

    if (isRainging) {
      System.out.println("하늘에서 비가와요");
    }
    if (!isRainging) {
      System.out.println("김태희가 안옵니다.");
    }

    boolean isSunny = false;

    if (!isSunny) {
      System.out.println("날씨가 맑아요");
    } else {
      System.out.println("집에서 쉬어야죠.");
    }
  }
}
