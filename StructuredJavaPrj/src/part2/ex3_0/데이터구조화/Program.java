package part2.ex3_0.데이터구조화;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//Exam[] exams = new Exam[3];
		//exams[0].kor = 30; // 이렇게만 하면 에러남, exams[0]을 따로 new 해줘야 사용 가능

		/*exams[0] = new Exam();
		exams[0].kor = 30;
		System.out.printf("kor: %d", exams[0].kor);*/
		
		
		Exam[] exams = new Exam[3];
		int menu;
        boolean keepLoop = true;			
		
                
		while(keepLoop)
		{
			menu = inputMenu();
	        switch(menu) {
	        case 1:	        	
				inputLIst(exams);	        	
		        break;
	        case 2:		        
		        printList(exams);	        	
		        break;
	        case 3:
	        	System.out.println("Bye~~");	        	
	        	keepLoop = false;
				break;
	        
	        default:
	        	System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
	       
	        }
		}
		
	}
	
	
	static int inputMenu() {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("┌───────────────┐");
        System.out.println("│           메인 메뉴                   │");
        System.out.println("└───────────────┘");
        System.out.println("\t1. 성적입력 ");
        System.out.println("\t2. 성적출력 ");
        System.out.println("\t3. 종료 ");
        System.out.println("\t선택> ");
         int menu = scan.nextInt();
        return menu;
    }

	private static void printList(Exam[] exams) { //입력받은 국영수 점수 각 3개씩 출력
		System.out.println("┌───────────────┐");
        System.out.println("│           성적  출력                  │");
        System.out.println("└───────────────┘");
        System.out.println();
        
        for(int i=0;i<3;i++) { // exams배열 3번 생성?
	        Exam exam = exams[i]; // 새로운 exam 변수 생성, 근데 exams[0] 는 new할필요 없나?
	        int kor = exam.kor, eng = exam.eng, math = exam.math;
			
	        int total = kor + eng + math;
	    	float avg = total / 3.0f;
	    	
	    	System.out.printf("국어 : %3d\n", kor);	   
	    	System.out.printf("영어 : %3d\n", eng);	
	    	System.out.printf("수학 : %3d\n", math);	
	        
	        System.out.printf("총점 : %3d\n", total);
	        System.out.printf("평균 : %6.2f\n", avg);
	        System.out.println("─────────────────");
        }
		
	}

	private static void inputLIst(Exam[] exams) { //국영수 점수 각 3개씩 입력받기
		
		Scanner scan = new Scanner(System.in);
    	
    	System.out.println("┌───────────────┐");
        System.out.println("│           성적  입력                  │");
        System.out.println("└───────────────┘");
        System.out.println();
		
        for(int i=0;i<exams.length;i++) {  //이땐 exams.length가능.. 왜?
	        int kor, eng, math;
	        
	        do {
		        System.out.printf("국어 : ");
		        kor = scan.nextInt();
	        
		        if(kor < 0 || 100 < kor)
		        	System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
		        
	        }while(kor < 0 || 100 < kor);
	        
	        do {
		        System.out.printf("영어 : ");
		        eng = scan.nextInt();
	        
		        if(eng < 0 || 100 < eng)
		        	System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
		        
	        }while(eng < 0 || 100 < eng);
	        
	        do {
		        System.out.printf("수학 : ");
		        math = scan.nextInt();
	        
		        if(math < 0 || 100 < math)
		        	System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
		        
	        }while(math < 0 || 100 < math);
	        
	        Exam exam = new Exam(); //exam 변수 사용하게 만들기
	        exam.kor = kor;
	        exam.eng = eng;
	        exam.math = math;
	        
	        exams[i] = exam; //각 exam 변수 exams[i] 배열에 삽입
        }
		
	}

	

}
