// 1. �����ͺ��̽� ��ȸ
show databases;

// 2. �����ͺ��̽� ����
create database DB�̸�;

// 3. �����ͺ��̽� ����
use DB�̸�;

// 4. �����ͺ��̽� ����
drop database DB�̸�;

// 5. ���̺� ����
create table ���̺��̸�
(
   �÷��̸� �÷�Ÿ�� [�ɼǵ�] [primary key],
   �÷�2 Ÿ��,
   �÷�3 Ÿ�� [comment '�ڸ�Ʈ']
);

// 6. ���̺� ��� ��ȸ
show tables;

// 7. ���̺� ���� ��ȸ
desc ���̺��̸�;

// 8. ���̺� ����
drop table ���̺��̸�;

// 9. ���̺� �ڷ� ���
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

// 10. ���̺� �ڷ� ��ȸ
select
    �÷�, �÷� [���]
    from ���̺��̸�
    [where ��������]
    [group by �÷���]	// �׷����� ����
    [order by �÷���]	// ��� �÷� �����ͷ� ����
    [desc]	// Descending ��������
    [asc]	// Ascending  �������� -> �⺻����
    [limit] // ��ȸ�� �������� ������ ����
    
// ���̺��� ��� �ڷ� ��ȸ
select * from ���̺��;

// 11. ���̺� �ڷ� ����
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
    
// 12. ���̺� �ڷ� ����
delete from ���̺��̸� [where];

delete from MEMO;
    where mTitle = "4";
    
insert
    into MEMO ( mTitle, mNote )
    values ( "new", "note");
    
    
    
    
    
    

