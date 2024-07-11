package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("상품을 입력해주세요(종료 q)");

		ArrayList<Goods> aArray = new ArrayList<Goods>();

		int sum = 0;

		while (true) {
			String info = sc.nextLine();

			if (info.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("===================");
				for (int i = 0; i < aArray.size(); i++) {
					Goods product = aArray.get(i);
					product.showInfo();
				}
				System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
				break;
			}

			String[] gArray = info.split(",");

			String name = gArray[0];
			int price = Integer.parseInt(gArray[1]);
			int count = Integer.parseInt(gArray[2]);

			Goods goods = new Goods();
			goods.setName(name);
			goods.setPrice(price);
			goods.setCount(count);
			aArray.add(goods);
			sum += count;
		}

		sc.close();

	}

}
