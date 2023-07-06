package bank_test;

public class Account {
	private String account_num;	// 계좌번호
	private String owner_name;	// 명의자
	private int balance; 		// 잔액
	
	// 생성자 -> 계좌를 개설하는 작업
	public Account() { 
		// 인자값으로 아무것도 받지 않았으면, 계좌번호 "", 명의자"", 잔액 0으로 초기화
		this("", "", 0);
	}
	
	public Account(String num, String name, int balance) {
		this.account_num = num;
		this.owner_name = name;
		this.setBalance(balance);	// 잔액은 0 이상의 값이 되어야합니다.
	}

	// setters getters -> 잔고를 변경하는 작업
	public String getAccount_num() 	{	return account_num;	}
	public String getOwner_name() 	{	return owner_name;	}
	public int getBalance() 		{	return balance;	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	// 잔액은 언제나 0이상
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("setBalance : input value ERROR");
			return;
		} 
		// 기존잔고 > 새로운 잔고 -> 출금
		if(this.getBalance() > balance) {
			System.out.println("setBalance : withdraw");
			System.out.println(this.getBalance() - balance + "원이 출금되었습니다.");
		} 
		// 기존잔고 < 새로운 잔고 -> 입금
		if(this.getBalance() < balance) {
			System.out.println("setBalance : deposit");
			System.out.println(balance - this.getBalance()  + "원이 입금되었습니다.");
		} 
		this.balance = balance;
		System.out.println("계좌 잔고는 " + this.getBalance() + "원 입니다.");
	}

	public void putMoney(int money) {
		// 입금액이 0이상인가
		if(money <= 0) {
			System.out.println("putMoney : input value ERROR");
			System.out.println("입금액은 0원을 넘어야 합니다.");
			return;
		}
		this.setBalance(this.getBalance() + money);
		// 계산된 새로운 잔고액으로 setBalance(새잔고액)
	}
	public void popMoney(int money) {
		// 출금하려는 금액이 잔고보다 같거나 작은가
		if(money <= 0) {
			System.out.println("popMoney : input value ERROR");
			System.out.println("출금액은 0원을 넘어야 합니다.");
			return;
		}
		if(this.getBalance() < money) {
			System.out.println("popMoney : balance ERROR");
			System.out.println("잔고가 부족합니다.");
			return;
		}
		this.setBalance(this.getBalance() - money);
		// 계산된 새로운 잔고액으로 setBalance(새잔고액)
	}
	
	// 계좌의 현재 상태를 출력하는 메소드
	public void PrintInfo() {
		System.out.println("===================");
		System.out.println("계좌번호 : " + this.getAccount_num());
		System.out.println("명의자 : " + this.getOwner_name());
		System.out.println("계좌잔고 : " + this.getBalance());
		System.out.println("===================");
	}
}
