package part3.ex4.UI코드분리하기;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//ExamList list = new ExamList(); 이제 더이상 ExamList에서 함수들을 가져오지 않음
		ExamConsole list = new ExamConsole();
		
		int menu;
        boolean keepLoop = true;			
		
                
		while(keepLoop)
		{
			menu = inputMenu();
	        switch(menu) {
	        case 1:	        	
	        	list.inputLIst(); // 인스턴스 메소드
		        break;
	        case 2:		      
	        	list.printList();
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

	

}
