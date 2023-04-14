package day01;

import java.util.Scanner;

public class Ex3team {
	public static void main(String[] args) {
		// 문제1
		Scanner sc = new Scanner(System.in);
//		int year;
//		int a = 0;
//		System.out.print("연도를 입력하시오 : ");
//		year = sc.nextInt();
//		if (year % 4 == 0 && year % 100 != 0) a = 1;
//		if (year % 400 == 0) a = 1;
//		if (a == 0) {
//			System.out.println("윤년이 아닙니다");
//		}
//		if (a == 1) {
//			System.out.println("윤년입니다");
//		}
		
		// 문제2
		int score;
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		if (score == 100) System.out.println("S");
		if (score != 100 && score >= 90) System.out.println("A");
		if (score != 100 && score < 90 && score >= 80) System.out.println("B");
		if (score != 100 && score >= 70 && score < 80) System.out.println("C");
		if (score < 70) System.out.println("F");
		
		
	}
}
