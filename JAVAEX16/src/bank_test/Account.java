package bank_test;

public class Account {
	private String account_num;	// ���¹�ȣ
	private String owner_name;	// ������
	private int balance; 		// �ܾ�
	
	// ������ -> ���¸� �����ϴ� �۾�
	public Account() { 
		// ���ڰ����� �ƹ��͵� ���� �ʾ�����, ���¹�ȣ "", ������"", �ܾ� 0���� �ʱ�ȭ
		this("", "", 0);
	}
	
	public Account(String num, String name, int balance) {
		this.account_num = num;
		this.owner_name = name;
		this.setBalance(balance);	// �ܾ��� 0 �̻��� ���� �Ǿ���մϴ�.
	}

	// setters getters -> �ܰ� �����ϴ� �۾�
	public String getAccount_num() 	{	return account_num;	}
	public String getOwner_name() 	{	return owner_name;	}
	public int getBalance() 		{	return balance;	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	// �ܾ��� ������ 0�̻�
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("setBalance : input value ERROR");
			return;
		} 
		// �����ܰ� > ���ο� �ܰ� -> ���
		if(this.getBalance() > balance) {
			System.out.println("setBalance : withdraw");
			System.out.println(this.getBalance() - balance + "���� ��ݵǾ����ϴ�.");
		} 
		// �����ܰ� < ���ο� �ܰ� -> �Ա�
		if(this.getBalance() < balance) {
			System.out.println("setBalance : deposit");
			System.out.println(balance - this.getBalance()  + "���� �ԱݵǾ����ϴ�.");
		} 
		this.balance = balance;
		System.out.println("���� �ܰ�� " + this.getBalance() + "�� �Դϴ�.");
	}

	public void putMoney(int money) {
		// �Աݾ��� 0�̻��ΰ�
		if(money <= 0) {
			System.out.println("putMoney : input value ERROR");
			System.out.println("�Աݾ��� 0���� �Ѿ�� �մϴ�.");
			return;
		}
		this.setBalance(this.getBalance() + money);
		// ���� ���ο� �ܰ������ setBalance(���ܰ��)
	}
	public void popMoney(int money) {
		// ����Ϸ��� �ݾ��� �ܰ��� ���ų� ������
		if(money <= 0) {
			System.out.println("popMoney : input value ERROR");
			System.out.println("��ݾ��� 0���� �Ѿ�� �մϴ�.");
			return;
		}
		if(this.getBalance() < money) {
			System.out.println("popMoney : balance ERROR");
			System.out.println("�ܰ� �����մϴ�.");
			return;
		}
		this.setBalance(this.getBalance() - money);
		// ���� ���ο� �ܰ������ setBalance(���ܰ��)
	}
	
	// ������ ���� ���¸� ����ϴ� �޼ҵ�
	public void PrintInfo() {
		System.out.println("===================");
		System.out.println("���¹�ȣ : " + this.getAccount_num());
		System.out.println("������ : " + this.getOwner_name());
		System.out.println("�����ܰ� : " + this.getBalance());
		System.out.println("===================");
	}
}
