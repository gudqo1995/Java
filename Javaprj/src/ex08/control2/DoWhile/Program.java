package ex08.control2.DoWhile;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);


		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while(true) {
			// ���� �Է� �κ�----------------------------------
			System.out.println("����������������������������������������������");
			System.out.println("��         ���� �Է�                 ��");
			System.out.println("����������������������������������������������");
			do {
				System.out.print("\t����1 ������?");
				kor1 = scan.nextInt();
				if(kor1<0 || 100<kor1)
					System.out.println("������ 0~100 ������ ���ڿ��� �մϴ�. �ٽþ�����");
			}while(kor1<0 || 100<kor1);
			
			do {
				System.out.print("\t����2 ������?");
				kor2 = scan.nextInt();
				if(kor2<0 || 100<kor2)
					System.out.println("������ 0~100 ������ ���ڿ��� �մϴ�. �ٽþ�����");
			}while(kor2<0 || 100<kor2);
			
			do {
				System.out.print("\t����3 ������?");
				kor3 = scan.nextInt();
				if(kor3<0 || 100<kor3)
					System.out.println("������ 0~100 ������ ���ڿ��� �մϴ�. �ٽþ�����");
			}while(kor3<0 || 100<kor3);
			
	

	
			// ���� ��� �κ�----------------------------------
			total = kor1 + kor2 + kor3;
			avg = total / 3.0f;
			System.out.println("����������������������������������������������");
			System.out.println("��         ���� ���                 ��");
			System.out.println("����������������������������������������������");
			System.out.printf("\t����1 : %3d\n",kor1);
			System.out.printf("\t����2 : %3d\n",kor2);
			System.out.printf("\t����3 : %3d\n",kor3);
			System.out.printf("\t���� : %3d\n",total);
			System.out.printf("\t��� : %6.2f\n",avg);
			System.out.println("����������������������������������������������");
		}
	}
}