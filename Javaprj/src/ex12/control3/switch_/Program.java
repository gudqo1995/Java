package ex12.control3.switch_;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;
		
		Scanner scan = new Scanner(System.in);


		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		종료:
		while(true) {
			
			// 메인 메뉴 부분----------------------------------
			System.out.println("┌─────────────────────┐");
			System.out.println("│         메인 메뉴                 │");
			System.out.println("└─────────────────────┘");
			System.out.println("\t1.성적 입력");
			System.out.println("\t2.성적 출력");
			System.out.println("\t3.종료");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				// 성적 입력 부분----------------------------------
				System.out.println("┌─────────────────────┐");
				System.out.println("│         성적 입력                 │");
				System.out.println("└─────────────────────┘");
				
				do {
					System.out.print("\t국어1 성적은?");
					kor1 = scan.nextInt();
					if(kor1<0 || 100<kor1)
						System.out.println("점수는 0~100 사이의 숫자여야 합니다. 다시쓰랑께");
				}while(kor1<0 || 100<kor1);
				
				do {
					System.out.print("\t국어2 성적은?");
					kor2 = scan.nextInt();
					if(kor2<0 || 100<kor2)
						System.out.println("점수는 0~100 사이의 숫자여야 합니다. 다시쓰랑께");
				}while(kor2<0 || 100<kor2);
				
				do {
					System.out.print("\t국어3 성적은?");
					kor3 = scan.nextInt();
					if(kor3<0 || 100<kor3)
						System.out.println("점수는 0~100 사이의 숫자여야 합니다. 다시쓰랑께");
				}while(kor3<0 || 100<kor3);
				break;
			
				
			case 2:
				// 성적 출력 부분----------------------------------
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;
				
				
				System.out.println("┌─────────────────────┐");
				System.out.println("│         성적 출력                 │");
				System.out.println("└─────────────────────┘");
				
				for(int i=0;i<3;i++) {
					System.out.printf("\t국어%d : %3d\n", i+1, kor1);
				}
				
	
				System.out.printf("\t총점 : %3d\n",total);
				System.out.printf("\t평균 : %6.2f\n",avg);
				System.out.println("───────────────────────");
				break;
			
			case 3:
				break 종료;
				
			default:
				System.out.println("눈 사시냐?");
			}
		}
		System.out.print("good bye");
	}
}