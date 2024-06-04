import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Test6_04 {
  public static void main(String[] args) {
    /*int i = 1;
    while (i <= 5) {
        System.out.println("현재 i의 값은 = "+ i);
        i++;
    }*/

    /*// while 퀴즈
    int count = 10;

    while (count >= 0) {
      System.out.println("현재 카운트 : " + count);
      count--;
    }
    System.out.println("카운트 종료");*/

    /*// 퀴즈1
    int n = 100;
    int sum = 0;
    while (n > 0) {
      sum = sum + n;
      n--;
    }
    System.out.println(sum);*/

    /*// 퀴즈2
    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    int i = 0;
    int sum = 0;

    while (i < numbers.length) {
      sum += numbers[i];
      i++;
    }
    System.out.println((double) sum / numbers.length);*/

    /*int i = 0;

    while (i <= 300) {
      if (i % 3 == 0) {
        System.out.println(i);
      }
      i++;
    }*/

    /*// 문제1
    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
    int i = 0;
    int max = 0;

    while (i < numbers.length) {
      if (max < numbers[i]) {
        max = numbers[i];
      }
      i++;
    }
    System.out.println(max);*/

    /*// 문제2
    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    int i = 0;
    int sumPlus = 0, sumMinus = 0;

    while (i < numbers.length) {
      if (numbers[i] >= 0) {
        sumPlus += numbers[i];
      } else {
        sumMinus += numbers[i];
      }
      i++;
    }

    System.out.println("양수의 합 : " + sumPlus);
    System.out.println("음수의 합 : " + sumMinus);*/

    /*// for
    for (int i = 1; i <= 5; i++) {
      System.out.println("현재 i의 값은 = " + i);
    }*/

    /*// 문제1
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);*/

    /*// 문제1 IntStream

    int sum = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum();
    System.out.println(sum);*/

    /*// 문제2
    int n = 20;
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);*/

    /*// 문제2 IntStream
    int n = 20;
    int sum = IntStream.rangeClosed(1, n).filter(i -> i % 3 == 0 && i % 5 == 0).sum();
    System.out.println(sum);*/

    /*// 문제3
    int num1 = 1;
    int num2 = 1;*/

    /*// 문제3
    int[] arr = new int[10];

    arr[0] = 1;
    arr[1] = 1;

    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }*/

    /*for (int i = 100; i > 0; i--) {
      System.out.println(i);
    }*/

    /*for (int i = 0; i >= -100; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }*/

    /*// 피보나치 수열
    long[] arr = new long[100];
    arr[0] = 1;
    arr[1] = 1;

    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }

    for (int j = 0; j < arr.length; j++) {
      System.out.println(arr[j]);
    }*/

    /*int[] arr = new int[100];
    arr[0] = 1;
    arr[1] = 1;

    Arrays.parallelSetAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);*/

    /*// 구구단 2단
    for (int i = 1; i <= 9; i++) {
      int result = 2 * i;
      System.out.println("2 X " + i + " = " + result);
    }*/

    /*// 구구단
    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.println(i + " X " + j + " = " + (i * j));
      }
    }*/

    /*// 문제3
    for (int i = 19; i > 0; i--) {
      for (int j = 19; j > 0; j--) {
        System.out.println(i + " X " + j + " = " + (i * j));
      }
    }*/

    /*int number = 0;
    while (number < 10) {
      System.out.println("현재 숫자: "+number);
      if(number == 5) {
        System.out.println("5가 되었습니다.");
        break;
      }
      number++;
    }*/

    /*for (int i = 0; i < 10; i++) {
      System.out.println("현재 i의 값은 : " + i);
      for (int j = 0; j < 10; j++) {
        System.out.println("현재 j의 값은 : " + j);
        if (j == 5) {
          break;
        }
      }
    }*/

    /*// 문제
    for (int i = 1; i <= 100; i++) {
      if (i == 50) break;
      for (int j = 2; j <= 100; j++) {
        if (j == 80) break;
      }
    }*/

    /*int number = 0;

    while (number < 10) {
      number++;
      if (number == 3) {
        continue;
      } else {
        System.out.println("현재 값은 : " + number);
      }
    }*/

    /*for (int i = 1; i <= 10; i++) {
      if (i == 4 || i == 7) continue;
      System.out.println(i);
    }*/

    /* int[] arr = {1, 2, 3, 4, 5};
    for (int i : arr) {
      System.out.println(i);
    }*/

    /*// 문제
    int[] score = {1, 30, 20, 80, 15, 20, 30, 22};
    int sum = 0;
    double average;

    for (int i : score) {
      sum += i;
    }
    average = (double) sum / score.length;
    System.out.println("총합 : " + sum);
    System.out.println("평균 : " + average);*/

    /*// 문제
    String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};

    for (String name : arr) {
      if (name.length() >= 5) {
        System.out.println(name);
      }
    }*/

    /*// daily quiz1
    int count = 1;

    while (true) {
      count++;
      if (count == 10000) break;
    }*/

    // daily quiz2
    for (int i = 9; i >= 2; i--) {
      for (int j = 9; j >= 1; j--) {
        System.out.println(i + " X " + j + " = " + (i * j));
      }
    }
  }
}
