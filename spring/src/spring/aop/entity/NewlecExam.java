package spring.aop.entity;

public class NewlecExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public NewlecExam() {
	}
	
	
	
	public NewlecExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}



	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		//사용자 관점이 아닌 개발자 관점에서 필요한 로직을 넣을 때가 있음
//		long start = System.currentTimeMillis();
		
		int result = kor+eng+math+com;
		
		if(kor>100)
			throw new IllegalArgumentException("유효하지 않은 국어 점수");
		
		try {
			Thread.sleep(200); //일부러 시간끌기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		long end = System.currentTimeMillis();
//		
//		String message = (end-start) + "ms 시간 소요";
//		System.out.println(message);
		
		
		return result;
	}

	@Override
	public double avg() {
		
		double result = total()/4.0;
		
		return result;
	}



	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

}
