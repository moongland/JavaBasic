package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
//		* 구현내용
//		Circle 배열 초기화 : 3개
//		Rectangle 배열 초기화 : 3개
//		각각 draw() 출력 처리
		
		//int형 배열
		int[] arr = new int[5];
		
		//Circle형 배열
		Circle[] circles = new Circle[3];
		circles[0] = new Circle();
		circles[1] = new Circle(1, 2, 3);
		circles[2] = new Circle(11, 22, 33);
		
		for(int i=0; i<circles.length; i++) {
			circles[i].draw();
			System.out.println("---------------");
		}
		
		System.out.println("= = = = = = = = = = = = = = =");
		
		//Rectangle타입 배열
		Rectangle[] rects = new Rectangle[3];
		
		rects[0] = new Rectangle();
		rects[1] = new Rectangle(1, 2, 3, 4);
		rects[2] = new Rectangle(5, 6, 76, 88);
		
		rects[0].draw();
		System.out.println("---------------");
		
		rects[1].draw();
		System.out.println("---------------");
		
		rects[2].draw();
		System.out.println("---------------");
		
	}
}
















