package bankApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ShinhanBankApplication {
	public static void main(String[] args) {
		Map<String, BankClerk> clerkMap = new HashMap<>();
		BankClerk bankClerk = new BankClerk(BankCode.신한, "240101", "이신한");
		clerkMap.put("240101", bankClerk);
		Map<String, Account> accountMap = new HashMap<>();
		Map<Account, List<Transaction>> transactionMap = new HashMap<>();
		Map<String, Client> clientMap = new HashMap<>();
		Client client = null;
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		String randomAccNo = "";
		String clientNo = "";
		String clientName = "";
		String passwd1 = "";
		String passwd2 = "";
		long balance = 0L;
		Account account = null;
		Transaction transaction = null;

		String biz1 = """
				-----------------------------------------------------
				1: 계좌개설, 2:입금, 3:출금, 4:조회, 5: 계좌해지, 0: 종료
				-----------------------------------------------------
				""";
		System.out.print(biz1);
		System.out.print("업무 구분 코드 > ");
		String menu = in.nextLine();
		if (menu.equals("1")) { // 계좌개설
			System.out.println("계좌 개설중 ");
			// ==> 프로그램이 길어지면 메서드로 리팩토링 하면 됨.
			// 신규 고객인 경우와 기존 고객의 경우 처리 달라짐

			// 처리 --> 계좌 개설 / Client, Account
//			while (true) {
//				randomAccNo = String.valueOf(random.nextInt(99999) + 1);
//				// 계좌번호는 랜덤하게 생성
//				
//			}

//			while (true) {
//				System.out.print("계좌개설시 입금하실 금액을 입력하세요 > ");
//				if() {
//					break;
//				}
//			}

//			account = new Account(BankCode.신한, randomAccNo, client, balance);
//			accountMap.put(randomAccNo, account);
//			while (true) { // 비밀번호 입력을 정상적으로 했을 때 빠져나오게 하기, 오류 있으면 다시 입력받기
//				System.out.print("사용하실 비밀번호를 숫자 4자리로 입력해주세요 > ");
//			
//			
//			}
			// 처리 --> 계좌 개설 완료 / Transaction , Account

		} else if (menu.equals("2")) {
			System.out.println("입금 처리 중 ");
		} else if (menu.equals("3")) {
			System.out.println("출금 처리 중 ");
		} else if (menu.equals("0")) {
			System.out.println("은행 업무를 종료합니다.");
			return;
		} // end of menu select
	} // end of method (main)
} // end of class