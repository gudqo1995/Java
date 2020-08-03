package poly.player;



public class Player {

	String name;
	int level;
	int atk;
	int hp;
	String job;
	
	public Player() {
		level = 1;
		atk = 3;
		hp = 50;
	}
	
	Player(String name){
		this();
		this.name = name;
	}
	
	Player(String name, int hp){
		this(name);
		this.hp = hp;
		
	}
	
	
	void characterInfo() {
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
		
	}
	
}
