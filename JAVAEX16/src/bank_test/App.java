package bank_test;

import java.util.Scanner;

public class App {
	// 필드 : 스캐너 계좌의 목록 계좌 카운터
	private static Scanner sc = new Scanner(System.in);
	private static Account[] list = new Account[10];
	private static int counter = 0;
	
	private static void createAccount() {
		// 계좌생성
		// 화면에 메세지 출력/ 계좌번호 입력/ 명의자이름/ 개설시 잔고액 
		System.out.println("---------------");
		System.out.println("계좌생성을 선택하셨습니다.");
		System.out.println("---------------");
		System.out.print("계좌번호를 입력하세요 : ");
		String aNo = sc.nextLine();
		System.out.print("계좌주 성명을 입력하세요 : ");
		String oName = sc.nextLine();
		System.out.print("초기 입금액을 입력하세요 : ");
		int money;
		while(true) {
			try {
				money = sc.nextInt();
				break;
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력하세요");
			}
			
		}
		sc.nextLine();
		// 입력값 확인
		System.out.println("계좌번호 : " + aNo);
		System.out.println("명의자 : " + oName);
		System.out.println("잔고 : " + money);
		if(findAccount(aNo) != null) {
			System.out.println("계좌번호가 이미 있습니다.");
			return;
		}
		// counter를 확인해서 더이상 계좌 개설이 안되는 경우 counter == list.length
		if(list.length == (counter)) {
			System.out.println("더 이상 계좌를 개설할 수 없습니다.");
			return;
		}
		list[counter] = new Account(aNo, oName, money);
		counter++;
		System.out.println("계좌가 개설되었습니다.");
		// counter를 index로 해서 list에 account객체를 생성해서 할당한다.
		// 계좌 개설결과를 화면에 출력
	}
	private static void deposit() {
		// 입금
		System.out.println("---------------");
		System.out.println("입금하기를 선택하셨습니다.");
		System.out.println("---------------");
		// 계좌번호를 물어봄
		// 계좌가 있는지 조회
		// 1. 없으면 계좌가 없습니다 출력
		// 2. 있으면 입금할 금액을 입력받음
		// 입금처리를 하고, 잔고를 출력함
		String aNo = "";
		System.out.print("계좌번호를 입력하세요 : ");
		aNo = sc.nextLine();
		Account account = findAccount(aNo);
		
		if(account==null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;
		}
		int money = 0;
		System.out.print("입금액을 입력하세요 : ");
		try { 
			money = sc.nextInt();
			
			} catch(Exception e_i) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요");
			return;
		}
		sc.nextLine();
		account.putMoney(money);
	}
	private static void withdraw() {
		// 출금
		System.out.println("---------------");
		System.out.println("출력하기를 선택하셨습니다.");
		System.out.println("---------------");
		String aNo = "";
		System.out.print("계좌번호를 입력하세요 : ");
		aNo = sc.nextLine();
		Account account = findAccount(aNo);
		
		if(account==null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;
		}
		int money = 0;
		System.out.print("출금액을 입력하세요 : ");
		try { 
			money = sc.nextInt();
			
			} catch(Exception e_i) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요");
			return;
		}
		sc.nextLine();
		account.popMoney(money);
	}
	private static void accountList() {
		// 계좌 조회
		System.out.println("---------------");
		System.out.println("계좌조회를 선택하셨습니다.");
		System.out.println("---------------");
		for(Account item : list) {
			if(item == null) { continue; }
			System.out.println(item.getAccount_num());
		}
		// list -> item.getAccount_Number()
	}
	private static Account findAccount(String accountNum) {
		// 중복 계좌 확인 
		// 필드의 list배열에 Account 객체가 들어있는지 확인 
		// -> 객체의 계좌번호와 인자값으로 입력된 계좌번호가 일치하는게 있는지 확인한다.
		for(Account item : list ) {
			if(item == null) {	continue; }	// 원소가 null을 참조하고 있으면 다음 원소로 넘어감
			if(item.getAccount_num().equals(accountNum)==true) {
				return item;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		
		// 계좌들의 목록을  가지고
		// 계좌에 입금과, 출금 작업을 하고
		// 새로운 계좌를 개설
		// 클래스의 배열 -> 계좌 클래스를 설계
		
		// 사용자에게 어떠한 작업을 할것인지 확인을 받는다
		// 1. 계좌 생성  2. 계좌에서 입금  3. 계좌에서 출력 4. 계좌의 목록확인 5. 종료
		
		// 1. 계좌 생성 
		// 계좌번호 입력 -> 중복된 계좌가 개설되는것은 방지
		// ->계좌  중복 확인
		// 명의 입력-> 처리
		// 개설 시 시작 잔액은 -> 입금액은 0보다 커야합니다.
		
		// 2. 계좌에 입금
		// 계좌번호를 확인 -> 계좌 목록에 입력받은 계좌번호가 있는지 조회
		// 조회 결과 계좌가 있으면, 입금을 받음 
		// 입금액은 음수가 될 수 없습니다.
		
		// 3. 출금
		// 계좌 조회 -> 출금시도 / 종료 ->다시 입력하시겠습니까?
		// 출금액 음수가 될 수 없습니다.
		// 출금 후 잔고는 0 미만이 될 수 없습니다.
		
		// 4. 계좌 목록 조회
		
		// 5. 프로그램 종료
		while(true) {
			System.out.println("1.계좌 생성  2.입금  3.출금 4.계좌조회 5.종료");
			// 사용자에게 입력받음

			int selectNo = sc.nextInt();
			sc.nextLine();
			if(selectNo == 1) {
				// 계좌 생성 
				createAccount();
			} else if(selectNo == 2) {
				// 입금 deposit()
				 deposit();
			} else if(selectNo == 3) {
				// 출금 withdraw()
				withdraw();
			} else if(selectNo == 4) {
				// 계좌 목록 accountList()
				accountList();
			} else if(selectNo == 5) {
				// 종료 
				System.out.println("종료");
				break;
			}
		}
		sc.close();
	}
}
