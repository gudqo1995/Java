package ex20.finalvar;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		
		final int SIZE = 5;
		int[] kors = new int[SIZE];
		int total=0;
		float avg;
		int menu;
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;
		
		Scanner scan = new Scanner(System.in);

		
		
		for(int i=0;i<SIZE;i++)
			kors[i] = 0;
		
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
			case MENU_INPUT:
				// 성적 입력 부분----------------------------------
				System.out.println("┌─────────────────────┐");
				System.out.println("│         성적 입력                 │");
				System.out.println("└─────────────────────┘");
				
				
				
				for(int i=0;i<SIZE;i++)
					do {
						System.out.printf("\t국어%d 성적은?", i+1);
						kors[i] = scan.nextInt();
						if(kors[i]<0 || 100<kors[i])
							System.out.println("점수는 0~100 사이의 숫자여야 합니다. 다시쓰랑께");
					}while(kors[i]<0 || 100<kors[i]);
				break;
			
				
			case MENU_PRINT:
				// 성적 출력 부분----------------------------------
				for(int i=0;i<SIZE;i++)
					total += kors[i];
				avg = total / 3.0f;
				
				
				System.out.println("┌─────────────────────┐");
				System.out.println("│         성적 출력                 │");
				System.out.println("└─────────────────────┘");
				
				for(int i=0;i<SIZE;i++) {
					System.out.printf("\t국어%d : %3d\n", i+1, kors[i]);
				}
				
	
				System.out.printf("\t총점 : %3d\n",total);
				System.out.printf("\t평균 : %6.2f\n",avg);
				System.out.println("───────────────────────");
				break;
			
			case MENU_EXIT:
				break 종료;
				
			default:
				System.out.println("눈 사시냐?");
			}
		}
		System.out.print("good bye");
	}
}