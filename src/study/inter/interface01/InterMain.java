package study.inter.interface01;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Interface01.CODE);
		
		int topp = Interface01.FISHBREAD_TOPPING_PIZZA;
		//Interface01.FISHBREAD_TOPPING_KIMCHI
		//FishBreadCode
		//CommonCode
		
		ImpleClass c = new ImpleClass();
		c.method1();
		c.method2();
		
		//Interface01 i1 = new Interface01();	인터페이스 생성 불가 (추상 클래스와 유사)
		
		
	}

}
