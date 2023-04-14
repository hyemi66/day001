package day01;

import java.util.Scanner;

public class Ex6team {
	public static void main(String[] args) {
		// 문제1
		Scanner sc = new Scanner(System.in);
		int h,m,t;
		int sumM;
		System.out.print("산책을 몇시 몇분에 나갑니까?");
		h = sc.nextInt();
		m = sc.nextInt();
		System.out.print("산책은 몇분 할겁니까?");
		t = sc.nextInt();
		
		sumM = 60*h + m + t;
		int h1 = sumM / 60;
		int m1 = sumM % 60;
		
		if (h1 >= 24) {
			System.out.println("돌아온 시간은 "+(h1-24)+"시 "+m1+"분입니다.");
		}
		if (h1 < 24) {
			System.out.println("돌아온 시간은 "+h1+"시 "+m1+"분입니다.");
		}
	}
}
