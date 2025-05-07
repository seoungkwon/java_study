package study.practice36;

public class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	Menu[] menus;
	// 생성자
	public Order(int i, Menu[] arr) {
	orderNum = i;
	menus = arr;
	}
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		
		//주문한 메뉴는 menus
		//메뉴당 금액 menus -> Menu -> price
		int sum = 0;
		for(int i=0; i<menus.length; i++) {
			sum += menus[i].price;
		}
			
//		for(Menu menu : menus) {
//			sum += menu.price;
//		}
		
		return sum;
  }
}