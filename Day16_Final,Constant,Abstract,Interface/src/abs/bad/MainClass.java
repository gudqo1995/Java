package abs.bad;

public class MainClass {

	public static void main(String[] args) {

		HeadStore s = new Store();
		s.orderApple();
		s.orderBanana();
		s.orderGrape();
		s.orderMelon();
		//자식 클래스에서 잘못 오버라이딩을 하면 오류가 그대로 들어남
		//추상화를 하면 오류를 방지할 수 있음
		
		
	}

}
