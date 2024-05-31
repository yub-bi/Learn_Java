import java.util.Arrays;
import java.util.List;

public class Test5_30 {

  public static void main(String[] args) {

    //    int a = 20, b = 30, c = 50;
    //
    //    System.out.println(a + b + c);

    //    int firstName = 1;

    /* // 정수형 자료형
        int a = 1;
        byte b = 2;
        long c = 3;
        short d = 4;

        // 실수형 자료형
        float e = 0.1f; // float 은 뒤에 f를 붙이지 않으면 에러가 남
        double f = 0.2;
    */
    //    char a = 'a'; // 문자
    //
    //    boolean isTrue = true;
    //    boolean isFalse = false;
    //
    //    String str = "Hello World";

    //    불가능한 정의
    //    int a = 9999999999999;
    //    short b = 9999999999;
    //    byte c = 999;

    //    int a = 1;
    //    int v = a;
    //    System.out.println(a);
    //    System.out.println(v);

    /*      char c1 = 'A';
    char c2 = 65;
    char c3 = '\u0041';

    char c4 = '가';
    char c5 = 44032;
    char c6 = '\uac00';

    int unicode = c1;

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(unicode);*/

    /*    short sVal = 10;
    short result = (short) (sVal + 10); // 형변환
    System.out.println(result);*/

    /*    float myFloat = 9.75f;

    float anotherFloat = myFloat * 2;

    System.out.println("original float value: " + (int) myFloat);*/

    /*boolean isTrue = true;

    if (isTrue) {
      System.out.println("이건 트루 입니다.");
    } else {
      System.out.println("이건 펄스 입니다.");
    }*/

    //배열
    int[] arr = {1, 2, 3, 4, 5};
    int[] arr2 = new int[5]; // { 0, 0, 0, 0, 0 }
    int[] arr3 = new int[10];

    List<Integer> list = Arrays.asList(1);

    System.out.println(list.get(0));
    System.out.println(arr); //참조 = 주소
    System.out.println(arr3[0]);

  }

  /*@Override
  public void test() {

  }*/
}
