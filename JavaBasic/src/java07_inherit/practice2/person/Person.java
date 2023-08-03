package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {

	private String name;
	private int money;
	
	private Product prod;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buy(Product newProduct) {
		
		//잔액(money)이 부족하면 구매 중단
		if( money < newProduct.getPrice() ) {
			System.out.println("[SYSTEM] 잔액이 부족합니다");
			System.out.println("[잔액] " + money + "원");
			
			return;
		}
		
		if( newProduct == null ) {
			System.out.println("[SYSTEM] 수행할 수 없는 작업입니다");
			
			return;
		}
		
		//전달인자로 받은 Product를
		//멤버필드에 저장하고
		prod = newProduct;
		
		//물건 가격만큼 money를 차감한다
		money -= newProduct.getPrice();
		
		//진행상황을 출력한다
		System.out.print( name + "님이 " + newProduct.getPrice() + "원을 지불하고 ");
		System.out.println(newProduct.getModel() + "구매함");
		System.out.println("[잔액] " + money + "원");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}


















