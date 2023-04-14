package day01;

import java.util.Scanner;

public class Ex5team {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("정수 입력 : ");
		n1 = sc.nextInt();
		if (n1 % 15 == 0) {
			System.out.println(n1 + " : 15의 배수입니다");
		}
		if (n1 % 15 != 0 && n1 % 5 == 0) {
			System.out.println(n1 + " : 5의 배수입니다");
		}
		if (n1 % 15 != 0 && n1 % 3 == 0) {
			System.out.println(n1 + " : 3의 배수입니다");
		}
		if (n1 % 15 != 0 && n1 % 5 != 0 && n1 % 3 != 0) {
			System.out.println(n1+" : 아무것도 아닙니다");
		}
	}
}
