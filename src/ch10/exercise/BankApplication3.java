package ch10.exercise;

import java.util.Scanner;

public class BankApplication3 {
	// 요구사항 : 1. 계좌 생성할 때 반드시 초기 입금액을 0보다 크게 입력해야 한다
	// 요구사항 : 2. 예금 금액 제한 없음
	// 요구사항 : 입금시 계좌번호만 알면 입금 할 수 있음
	// 요구사항 : 3. 출금은 잔고 보다 큰 금액을 인출할 수 없음
	// 요구사항 : 출금 시 계좌번호와 비밀번호가 일치 해야함
	// 요구사항 : 4. 예금주의 이름, 계좌번호는 계좌 생성 후 변겅할 수 있음;
	// 요구사항 : 비밀번호는 계좌번호, 이름, 기존 비밀번호가 일치하는 경우에만 변경 할 수 있음

	public static void main(String[] args) {
		String msg = """
				-------------------------------------------
				1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
				-------------------------------------------
				선택>
				""";
		String msg1 = """
				-------
				계좌생성
				-------""";
		String msg2 = """
				-------
				계좌목록
				-------""";
		String msg3 = """
				-------
				예금
				-------""";
		String msg4 = """
				-------
				출금
				-------""";
		Scanner in = new Scanner(System.in);
		//
		// Account[] accounts = new Account[100];
		Account[] accounts = new Account[100];
		int index = 0;
		String menu = "";
		String accountNo = "";
		String accountOwner = "";
		long balance = 0;
		String password = "";
		String password1 = "";
		long money = 0;
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("5")) {
				System.out.println("안녕히가세요");
				break;
			}
			switch (menu) {
			case "1" -> { // 계좌생성
				System.out.println(msg1);
				System.out.print("계좌번호 : ");
				accountNo = in.nextLine();
				System.out.print("계좌주 : ");
				accountOwner = in.nextLine();
				System.out.print("비밀번호 : ");
				password = in.nextLine();
				System.out.print("비밀번호 (재입력) : ");
				password1 = in.nextLine();
				System.out.print("초기 입금액 : ");
				System.out.println("계좌를 생성합니다");
				balance = Long.parseLong(in.nextLine());
				// 계좌번호가 유일한지 체크 추가 ??? 어떻게 하는게 더 효율적인지 생각해보기
				if (isDuplicated(accounts, index, accountNo)) {// 계좌번호 중복
					System.out.println("계좌번호가 중복되어 계좌 생성을 할 수 없습니다ㅣ 다시 입력하세요");
				} else if (accountNo.isBlank() || accountOwner.isBlank() || !password.equals(password1)
						|| balance <= 0) {
					System.out.println("계좌 생성을 위한 필수값이 입력되지 않았거나 비밀번호가 서로 다릅니다. 다시 입력하세요");
				} else {
					if (index <= 99) {
						accounts[index] = new Account(accountNo, accountOwner, password, balance);
						System.out.println("계좌가 생성되었습니다.");
						index++;
					} else {
						System.out.println("더 이상 계좌를 생성할 수 없습니다. 관리자에게 연락하세요.");
					}
				}
			}
			case "2" -> { // 목록 출력
				System.out.println(msg2);
				for (int i = 0; i < index; i++) {
					System.out.println(accounts[i]);
					System.out.println("계좌목록을 출력합니다");
					;
				}
			}
			case "3" -> { // 입금
				System.out.println(msg3);
				System.out.print("계좌번호 : ");
				accountNo = in.nextLine();
				System.out.print("입금액 : ");
				money = Long.parseLong(in.nextLine());
				int ind = findAccount(accounts, index, accountNo);
				if (ind >= 0) { // 계좌를 찾은 경우
					accounts[ind].deposit(money);
					System.out.println("입금이 완료되었습니다.");
				} else { // 해당 계좌를 못찾은 경우
					System.out.println("입금할 계좌 정보가 없습니다.");
				}
				System.out.println("예금 처리 중입니다");
			}

			case "4" -> { // 출금
				System.out.println(msg4);
				System.out.print("계좌번호 : ");
				accountNo = in.nextLine();
				int ind = findAccount(accounts, index, accountNo);
				if (ind >= 0) { // 계좌를 찾은 경우
					System.out.print("비밀번호 : ");
					password = in.nextLine();
					if (!password.isBlank() && accounts[ind].getPassword().equals(password)) {
						System.out.print("출금액 : ");
						money = Long.parseLong(in.nextLine());
						accounts[ind].withdraw(money);
					} else {
						System.out.println("비밀번호 불일치로 출금할 수 없습니다.");
					}
				}
				System.out.println("출금 처리 중입니다");
			}
			default -> System.out.println("메뉴 번호를 확인하세요");
			}

		}

	}

	private static boolean isDuplicated(Account[] arr, int size, String accountNo) {
		for (int i = 0; i < size; i++) {
			if (arr[i].getAccountNo().equals(accountNo)) {
				return true;
			}
		}
		return false;
	}

	private static int findAccount(Account[] arr, int size, String accountNo) {
		for (int i = 0; i < size; i++) {
			if (arr[i].getAccountNo().equals(accountNo)) {
				return i;
			}
		}
		return -1;
	}

	private static void createAccount(Scanner in, Account[] arr, int index) {

	}

}
