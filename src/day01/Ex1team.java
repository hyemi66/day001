package day01;

import java.util.Scanner;

public class Ex1team {
	public static void main(String[] args) {
		// 문제1
//		Scanner sc = new Scanner(System.in);
//		int n1,n2,n3;
//		System.out.print("국어점수 입력 : ");
//		n1 = sc.nextInt();
//		System.out.print("수학점수 입력 : ");
//		n2 = sc.nextInt();
//		System.out.print("영어점수 입력 : ");
//		n3 = sc.nextInt();
//		System.out.println("알아보고 싶은 점수는?");
//		System.out.println("1. 국어 2. 수학 3. 영어");
//		int a;
//		a = sc.nextInt();
//		if (a == 1) {
//			System.out.println("1. 국어 " + n1);
//		}
//		if (a == 2) {
//			System.out.println("2. 수학 " + n2);
//		}
//		if (a == 3) {
//			System.out.println("3. 영어 " + n3);
//		}
//		if (a != 1 && a != 2 && a != 3) {
//			System.out.println("잘못선택하셨습니다. 다시 선택해주세요");
//		}
		
		// 문제2
		Scanner sc  = new Scanner(System.in);
		String name;
		int n1,n2,n3;
		int sum;
		double sum1;
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print(name + "님의 3과목의 시험 성적 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + n1);
		System.out.println("수학 점수 : " + n2);
		System.out.println("영어 점수 : " + n3);
		sum = n1 + n2 + n3;
		sum1 = (n1+n2+n3) / 3.0f;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum1);
		if (sum1 >= 80) {
			System.out.println("합격여부 : 합격");
		}
		if (sum1 < 80) {
			System.out.println("합격여부 : 불합격");
		}
		
		
		
		
	}
}
