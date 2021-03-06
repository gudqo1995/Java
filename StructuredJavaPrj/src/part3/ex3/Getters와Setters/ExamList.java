package part3.ex3.Getters와Setters;

import java.util.Scanner;

public class ExamList {

	
	private Exam[] exams;
	private int current;
	
	public void printList() {
		printList(current);
	}

	public void printList(int size) {
		// 인스턴스 메소드
		System.out.println("┌───────────────┐");
		System.out.println("│           성적  출력                  │");
		System.out.println("└───────────────┘");
		System.out.println();

		Exam[] exams = this.exams;

		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];
			//int kor = exam.kor, eng = exam.eng, math = exam.math;
			//위에꺼는 다른 캡슐의 데이터를 직접적으로 쓰고있음, 그럼 또 문제가 생김
			//데이터를 직접적으로 쓰는것이 아닌 getkor()라는 함수를 이용해서 간접적으로 사용할수 있게 바꿔줘야됨
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			//int total = kor + eng + math;
			//float avg = total / 3.0f;
			//이렇게 밖에있는 데이터들로만으로 연산하는 데이터들은 역시 해당 클래스에서 연산을 하고 함수로 호출하는게 맞음
			int total = exam.total();
			float avg = exam.avg();
			
			
			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);

			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────");
		}

	}

	public void inputLIst() {
		// 인스턴스 메소드
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────┐");
		System.out.println("│           성적  입력                  │");
		System.out.println("└───────────────┘");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (math < 0 || 100 < math);

		//Exam exam = new Exam();
		//exam.kor = kor;
		//exam.eng = eng;
		//exam.math = math;
		//위에도 똑같이 Exam 데이터를 직접적으로 사용하고 있음 이것도 바꿔줘야됨
		//exam.setKor(kor);
		//exam.setEng(eng);
		//exam.setMath(math);
		//위에처럼 바꿔도 되지만 오버로드 생성자를 사용하면 코드 수를 줄일 수 있음
		Exam exam = new Exam(kor, eng, math);

		Exam[] exams = this.exams;
		int size = current;

		if (exams.length == size) {
			Exam[] temp = new Exam[size+5];
			for(int i =0;i<size;i++)
        		temp[i] = exams[i];
			this.exams = temp;
		}

		this.exams[current] = exam;
		current++;
	}

	
	public ExamList() {
		exams = new Exam[3];
		current = 0;
	} 
	
}
