// DML Data Manipulation Language
// ������ ���۾�

// 1. ���̺� �ڷ� ���
insert into ���̺��( �÷��� ���� ) values( �� ����);

insert
    into MEMO ( mTitle, mNote )
    values ( "1���޸�", "ù DB �������Դϴ�.");
    
insert
    into MEMO ( mTitle, mNote )
    values ( "1���޸�", "ù DB �������Դϴ�.");

insert
    into MEMO ( mTitle, mNote )
    values ( "2���޸�", "2�� �޸� �����Դϴ�.");

insert
    into MEMO ( mTitle, mNote )
    values ( "3���޸�", "3�� �޸� �����Դϴ�.");
    
insert
    into MEMO ( mTitle, mNote )
    values ("4","����"),("5","����"),("6","����"),("7","����");

// 2. ���̺� �ڷ� ��ȸ
select
    �÷�, �÷� [���]
    from ���̺��̸�
    [where ��������]
    [group by �÷���]	// �׷����� ����
    [order by �÷���]	// ��� �÷� �����ͷ� ����
    [desc]	// Descending ��������
    [asc]	// Ascending  �������� -> �⺻����
    [limit] // ��ȸ�� �������� ������ ����
    
// 3. ���̺��� ��� �ڷ� ��ȸ
select * from ���̺��;

// 4. ���̺� �ڷ� ����
update ���̺��̸�
    set
    �÷��̸� = �ٲ� ��
    where ���ǽ�;
    
update MEMO
    set mNote = "�ٲ� ����"
    where mNo = 3;

update MEMO
    set mNote = "�ϰ��� �ٲ� ����"
    where mNote = "����";
    
// 5. ���̺� �ڷ� ����
delete from ���̺��̸� [where];

delete from MEMO;
    where mTitle = "4";
    
insert
    into MEMO ( mTitle, mNote )
    values ( "new", "note");
