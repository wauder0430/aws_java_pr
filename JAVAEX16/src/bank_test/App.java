package bank_test;

import java.util.Scanner;

public class App {
	// �ʵ� : ��ĳ�� ������ ��� ���� ī����
	private static Scanner sc = new Scanner(System.in);
	private static Account[] list = new Account[10];
	private static int counter = 0;
	
	private static void createAccount() {
		// ���»���
		// ȭ�鿡 �޼��� ���/ ���¹�ȣ �Է�/ �������̸�/ ������ �ܰ�� 
		System.out.println("---------------");
		System.out.println("���»����� �����ϼ̽��ϴ�.");
		System.out.println("---------------");
		System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
		String aNo = sc.nextLine();
		System.out.print("������ ������ �Է��ϼ��� : ");
		String oName = sc.nextLine();
		System.out.print("�ʱ� �Աݾ��� �Է��ϼ��� : ");
		int money;
		while(true) {
			try {
				money = sc.nextInt();
				break;
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է��ϼ���");
			}
			
		}
		sc.nextLine();
		// �Է°� Ȯ��
		System.out.println("���¹�ȣ : " + aNo);
		System.out.println("������ : " + oName);
		System.out.println("�ܰ� : " + money);
		if(findAccount(aNo) != null) {
			System.out.println("���¹�ȣ�� �̹� �ֽ��ϴ�.");
			return;
		}
		// counter�� Ȯ���ؼ� ���̻� ���� ������ �ȵǴ� ��� counter == list.length
		if(list.length == (counter)) {
			System.out.println("�� �̻� ���¸� ������ �� �����ϴ�.");
			return;
		}
		list[counter] = new Account(aNo, oName, money);
		counter++;
		System.out.println("���°� �����Ǿ����ϴ�.");
		// counter�� index�� �ؼ� list�� account��ü�� �����ؼ� �Ҵ��Ѵ�.
		// ���� ��������� ȭ�鿡 ���
	}
	private static void deposit() {
		// �Ա�
		System.out.println("---------------");
		System.out.println("�Ա��ϱ⸦ �����ϼ̽��ϴ�.");
		System.out.println("---------------");
		// ���¹�ȣ�� ���
		// ���°� �ִ��� ��ȸ
		// 1. ������ ���°� �����ϴ� ���
		// 2. ������ �Ա��� �ݾ��� �Է¹���
		// �Ա�ó���� �ϰ�, �ܰ� �����
		String aNo = "";
		System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
		aNo = sc.nextLine();
		Account account = findAccount(aNo);
		
		if(account==null) {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
			return;
		}
		int money = 0;
		System.out.print("�Աݾ��� �Է��ϼ��� : ");
		try { 
			money = sc.nextInt();
			
			} catch(Exception e_i) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���");
			return;
		}
		sc.nextLine();
		account.putMoney(money);
	}
	private static void withdraw() {
		// ���
		System.out.println("---------------");
		System.out.println("����ϱ⸦ �����ϼ̽��ϴ�.");
		System.out.println("---------------");
		String aNo = "";
		System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
		aNo = sc.nextLine();
		Account account = findAccount(aNo);
		
		if(account==null) {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
			return;
		}
		int money = 0;
		System.out.print("��ݾ��� �Է��ϼ��� : ");
		try { 
			money = sc.nextInt();
			
			} catch(Exception e_i) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���");
			return;
		}
		sc.nextLine();
		account.popMoney(money);
	}
	private static void accountList() {
		// ���� ��ȸ
		System.out.println("---------------");
		System.out.println("������ȸ�� �����ϼ̽��ϴ�.");
		System.out.println("---------------");
		for(Account item : list) {
			if(item == null) { continue; }
			System.out.println(item.getAccount_num());
		}
		// list -> item.getAccount_Number()
	}
	private static Account findAccount(String accountNum) {
		// �ߺ� ���� Ȯ�� 
		// �ʵ��� list�迭�� Account ��ü�� ����ִ��� Ȯ�� 
		// -> ��ü�� ���¹�ȣ�� ���ڰ����� �Էµ� ���¹�ȣ�� ��ġ�ϴ°� �ִ��� Ȯ���Ѵ�.
		for(Account item : list ) {
			if(item == null) {	continue; }	// ���Ұ� null�� �����ϰ� ������ ���� ���ҷ� �Ѿ
			if(item.getAccount_num().equals(accountNum)==true) {
				return item;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		
		// ���µ��� �����  ������
		// ���¿� �Աݰ�, ��� �۾��� �ϰ�
		// ���ο� ���¸� ����
		// Ŭ������ �迭 -> ���� Ŭ������ ����
		
		// ����ڿ��� ��� �۾��� �Ұ����� Ȯ���� �޴´�
		// 1. ���� ����  2. ���¿��� �Ա�  3. ���¿��� ��� 4. ������ ���Ȯ�� 5. ����
		
		// 1. ���� ���� 
		// ���¹�ȣ �Է� -> �ߺ��� ���°� �����Ǵ°��� ����
		// ->����  �ߺ� Ȯ��
		// ���� �Է�-> ó��
		// ���� �� ���� �ܾ��� -> �Աݾ��� 0���� Ŀ���մϴ�.
		
		// 2. ���¿� �Ա�
		// ���¹�ȣ�� Ȯ�� -> ���� ��Ͽ� �Է¹��� ���¹�ȣ�� �ִ��� ��ȸ
		// ��ȸ ��� ���°� ������, �Ա��� ���� 
		// �Աݾ��� ������ �� �� �����ϴ�.
		
		// 3. ���
		// ���� ��ȸ -> ��ݽõ� / ���� ->�ٽ� �Է��Ͻðڽ��ϱ�?
		// ��ݾ� ������ �� �� �����ϴ�.
		// ��� �� �ܰ�� 0 �̸��� �� �� �����ϴ�.
		
		// 4. ���� ��� ��ȸ
		
		// 5. ���α׷� ����
		while(true) {
			System.out.println("1.���� ����  2.�Ա�  3.��� 4.������ȸ 5.����");
			// ����ڿ��� �Է¹���

			int selectNo = sc.nextInt();
			sc.nextLine();
			if(selectNo == 1) {
				// ���� ���� 
				createAccount();
			} else if(selectNo == 2) {
				// �Ա� deposit()
				 deposit();
			} else if(selectNo == 3) {
				// ��� withdraw()
				withdraw();
			} else if(selectNo == 4) {
				// ���� ��� accountList()
				accountList();
			} else if(selectNo == 5) {
				// ���� 
				System.out.println("����");
				break;
			}
		}
		sc.close();
	}
}
