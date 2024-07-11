package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");

		ArrayList<Friend> fArray = new ArrayList<Friend>();

		for (int i = 0; i < 3; i++) {

			String info = sc.nextLine();

			String[] iArray = info.split(" "); // 공백 기준으로 자르기

			String name = iArray[0];
			String hp = iArray[1];
			String school = iArray[2];

			Friend friend = new Friend();

			friend.setName(name);
			friend.setHp(hp);
			friend.setSchool(school);

			fArray.add(friend); // Friend 객체를 ArrayList에 담기

		}

		for (int i = 0; i < fArray.size(); i++) {
			Friend friend = fArray.get(i);
			friend.showInfo();
		}

		sc.close();

	}

}
