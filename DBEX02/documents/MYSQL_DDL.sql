// DDL Data Definition Language
// ������ ���Ǿ��

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

// 9. ���̺� �÷� ����
// - �߰�
alter table ���̺��̸� add �÷��̸� Ÿ��;
// - ����
alter table ���̺��̸� modify �÷��̸� Ÿ��;
// - ����
alter table ���̺��̸� drop �÷��̸�;
