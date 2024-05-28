package com.codestates.seb.gugudan;
import java.util.Scanner;

public class gugudan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");
    num = Integer.parseInt(sc.nextLine());

    if (!((num < 2) || (num > 9))) {
      System.out.printf("%d 단 이 입력되었습니다.", num);
      new Calculation().calculation(num);
    } else System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.\n 프로그램을 종료합니다.");

    // 2. 구구단은 2단에서 9단까지만 가능합니다.
    // 조건 1. 입력값이 min_gugudan(2)보다 작다.
    // 조건 2. 입력값이 max_gugudan(9)보다 크다.
    // 두 조건이 모두 참 인 경우를 판단하여 [경고] 문구 출력(OR 연산자 활용)
  }
}
