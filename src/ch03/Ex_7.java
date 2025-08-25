package ch03;

import java.util.Scanner;

public class Ex_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String msg = """
				-----------------------------------------
				 1. 예금  | 2. 출금  | 3. 잔고조회  | 4. 종료
				-----------------------------------------
				""";
		String menu = "";
		long balance = 0;
		long money = 0;
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("4")) {
				break;
			}else if(menu.equals("3")){
				System.out.println("잔고> " + balance);
			}else if(menu.equals("2")){
				System.out.printf("출금액>");
				money = Long.parseLong(in.nextLine());
				if (balance >= money) {
					balance -= money;
					
				} else {
					System.out.println("잔액이 부족합니다");
				}
			}else if(menu.equals("1")){
				System.out.println("예금액>");
				money = Long.parseLong(in.nextLine());
				balance += money;
			}else {
				System.out.println("메뉴번호를 확인하세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}
