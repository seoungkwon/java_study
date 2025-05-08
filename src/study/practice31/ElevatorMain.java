package study.practice31;

public class ElevatorMain {
		public static void main(String[] args) {
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
		}
		public static String guide(int floor) {
		/* 메소드를 완성하시오. */
			
		/*첫번째 방법	
		if (floor >= 1 && floor <=10) {
			return "저";
		}
		if (floor >= 11 && floor <=20) {
			return "고";
		} else {		
			return null;		
		}	
		*/
		
		//두번째 방법
		if(floor <= 10)
			return "저층";
		else
			return "고층";
	}
}