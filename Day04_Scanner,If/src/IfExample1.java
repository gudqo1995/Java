import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int point = sc.nextInt();
		System.out.printf("�� ����: %d��\n", point);
		System.out.println("--------------------------------------");
		
		if(point >= 70) {
			System.out.println("70�� �̻��Դϴ�.");
			System.out.println("�հ��Դϴ�!");
		}
		else {	
			System.out.println("70�� �̸��Դϴ�.");
			System.out.println("Ż���Դϴ�");
		}
		
		System.out.println("���� ġ����� �����ϼ̽��ϴ�.");
		
		sc.close();
		
		
	}

}