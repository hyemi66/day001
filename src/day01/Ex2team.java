package day01;

import java.util.Scanner;

public class Ex2team {
	public static void main(String[] args) {
		// 문제1
//		Scanner sc = new Scanner(System.in);
//		int n1, n2, n3;
//		int sum, sum1;
//		System.out.print("세 가지 정수 입력 : ");
//		n1 = sc.nextInt();
//		n2 = sc.nextInt();
//		n3 = sc.nextInt();
//		sum = n1 + n2 + n3;
//		sum1 = sum / 3;
//		int max = n1; int min = n1;
//		System.out.println("세 가지 정수 : "+n1+" "+n2+" "+n3);
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + sum1);
//		if (max < n2) {
//			if (n2 < n3) max = n3;
//			if (n3 < n2) max = n2;
//		}
//		if (min > n2) {
//			if (n2 > n3) min = n3;
//			if (n3 > n2) min = n2;
//		}
//		System.out.println("최댓값 : " + max);
//		System.out.println("최솟값 : " + min);
		
		// 문제2
		Scanner sc = new Scanner(System.in);
		int age;
		String str="미성년자";
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		if (age >= 20) str = "성인";
		System.out.println("당신의 나이는 "+age+"살이므로 "+str+"입니다.");
	}
	
}
