package com.kh.home.view;
import com.kh.home.controller.Function;
import java.util.Scanner;
/*��Ű�� ���� : com.kh.home.view
Ŭ������ : public class Menu
=> ��µ� �޴��� �޼ҵ�� �ۼ��� : static �޼ҵ���.
   public static void displayMenu(){}
=> ó������
   1. do~while ������ �޴� ȭ���� �ݺ� ��µǰ� ��
   2. ��µ� �޴� ȭ��

      *** ��������/������/��� ���� ���α׷� ***

      1. ���� ����   => calculator() �޼ҵ� ����ǰ� ��
      2. ���������� ū������ �հ豸�ϱ�  => totalCalculator() ����
      3. �Ż����� Ȯ���ϱ� => profile() ����
      4. �л����� Ȯ���ϱ� => sungjuk() ����
      5. ���� ���� ����ϱ� => printStarNumber() ����
      6. ���������� �հ� ���ϱ� => sumRandomNumber() ����
      7. ������ => continueGugudan() ����
      8. �ֻ��� ���� �˾Ƹ��߱� ���� => shutNumber() ����
      9. ���α׷� ����
      �޴� ��ȣ �Է� : 

   3. �޴���ȣ �Է¹޾�, �ش� ��ȣ�� ����� ����ǰ� switch�� �����
   4. �޴� 1 ~ 8 ������ ����� �޼ҵ�� Function Ŭ������ �޼ҵ带
      ȣ����
      => �ٸ� ��Ű���� Ŭ���� non-static �޼ҵ带 ����ϴ� ����...
*/
public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static void displayMenu(){
		do {
			System.out.println("*** ��������/������/��� ���� ���α׷� ***");
			System.out.println("1. ���� ����\n2. ���������� ū������ �հ豸�ϱ�\n3. �Ż����� Ȯ���ϱ�\n4. �л����� Ȯ���ϱ�\n5. ���� ���� ����ϱ�\n6. ���������� �հ� ���ϱ�\n7. ������\n8. �ֻ��� ���� �˾Ƹ��߱� ����\n9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int inputMenu= sc.nextInt();
			switch(inputMenu) {
			case 1 : new Function().calculator();break;
			case 2 : new Function().totalCalculator();break;
			case 3 : System.out.println("3. �Ż����� Ȯ���ϱ�");new Function().profile();break;
			case 4 : System.out.println("4. �л����� Ȯ���ϱ�");new Function().sungjuk();break;
			case 5 : System.out.println("5. ���� ���� ����ϱ�");new Function().printStarNumber();break;
			case 6 : System.out.println("6. ���������� �հ� ���ϱ�");new Function().sumRandomNumber();break;
			case 7 : System.out.println("7. ������");new Function().continueGugudan();break;
			case 8 : System.out.println("8. �ֻ��� ���� �˾Ƹ��߱� ����");new Function().shutNumber();break;
			case 9 : System.out.println("9. ���α׷� ����");break;
			}
			if(inputMenu==9)break;
		}while(true);
	}


}