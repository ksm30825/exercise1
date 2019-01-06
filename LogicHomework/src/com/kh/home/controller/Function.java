package com.kh.home.controller;
import java.util.Scanner;
import java.util.Random;
/*<����3>
��Ű�� ���� : com.kh.home.controller
Ŭ������ : public class Function
=> �޴����� �����ų �޼ҵ���� �ۼ��� : ��� non-static �޼ҵ�� �ۼ��� ��
=> Ű���� �Է��� ���� Scanner Ŭ������ ���� ���۷��� ������ �ʵ�� ������*/
public class Function {
	Scanner sc = new Scanner(System.in);
	public void calculator(){
		System.out.print("ù��° ���� �Է� : ");
		int num1=sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2=sc.nextInt();
		System.out.print("���깮�� �Է� : ");
		char op = sc.next().charAt(0);
		switch(op) {
		case '+' : System.out.println(num1+" + "+num2+" = "+(num1+num2));break;
		case '-' : System.out.println(num1+" - "+num2+" = "+(num1-num2));break; 
		case '*' : System.out.println(num1+" * "+num2+" = "+(num1*num2));break;
		case '/' : 
			if(num2!=0) {
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
			}else{System.out.println("0���� ���� �� �����ϴ�.\n"+num1+" / "+num2+" = "+" 0 ");}break;
		}System.out.println();
	}
	public void totalCalculator(){
		System.out.print("ù ��° �� �Է� : ");
		int num1=sc.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		int num2=sc.nextInt();
		int sum=0;
		if(num1<=num2) {
			for(int i=num1;i<=num2;i++) {
				sum+=i;
			}System.out.println(num1+"���� "+num2+"���� �������� �հ� : "+sum);
		}else {
			for(int i=num2;i<=num1;i++) {
				sum+=i;
			}System.out.println(num2+"���� "+num1+"���� �������� �հ� : "+sum);
		}
	}
	public void profile(){
		String name ="�����";
		int age = 31;
		String gender = "����";
		String character = "������ ��";
		System.out.printf("�̸� : %s\n���� : %d��\n���� : %s\n���� : %s\n",name,age,gender,character);
	}
	public void sungjuk() {
		System.out.print("�̸� �Է� : ");
		String name=sc.nextLine();
		System.out.print("�г� �Է�: ");
		int year = sc.nextInt();
		System.out.print("�� �Է� : ");
		int classNum = sc.nextInt();
		System.out.print("��ȣ �Է� : ");
		int num=sc.nextInt();
		sc.nextLine();
		System.out.print("���� �Է� (M/F) : ");
		String inputGender =sc.nextLine();
		char strGender =inputGender.charAt(0);
		System.out.print("���� �Է� : ");
		double inputGrade = sc.nextDouble();
		int inputGrade1=(int)(inputGrade*10);
		double inputGrade2 = (double)inputGrade1/10;
		String grade ="";
		String gender = (strGender=='f'||strGender=='F')?"���л�":((strGender=='M'||strGender=='m')?"���л�":"�߼�");
		if(inputGrade>=90) {
			grade = "A";
		}else if(inputGrade>=80) {
			grade = "B";
		}else if(inputGrade>=70) {
			grade = "C";
		}else if(inputGrade>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.1f�̰�, %s�����Դϴ�.\n",year,classNum,num,gender,name,inputGrade,grade);
		
	}
	public void printStarNumber(){
		System.out.print("���� �ϳ� �Է� : ");
		int num1=sc.nextInt();
		if(num1>0) {
			for(int r=1;r<=num1;r++) {
				for(int c=1;c<=num1;c++) {
					if(r==c) {
						System.out.print(r);
					}else if(r>c) {
						System.out.print("*");
					}else {
						System.out.print("");
					}
				}System.out.println();
			}
		}else{
			System.out.println("����� �ƴմϴ�.");
		}
	}
	public void sumRandomNumber(){
		/*int random = new Random().nextInt(100)+1;*/
		int random = (int)(Math.random()*100)+1;
		int sum=0;
		for(int i=1;i<=random;i++) {
			sum+=i;
		}System.out.println("1���� "+random+"������ ���� "+sum+"�Դϴ�.");
	}
	public void continueGugudan(){
		System.out.print("���� �ϳ� �Է� : ");
		int num1=sc.nextInt();
		if(num1>0) {
			for(int su=1;su<10;su++) {
				if(su%num1==0)continue; 
					System.out.println(num1+" * "+su+" = "+(num1*su));
					
			}System.out.println("================");
		}else {
			System.out.println("����� �ƴմϴ�.");
		}
	}
	public void shutNumber(){
		/*<���� 11>
        => �޼ҵ�� : public void shutNumber(){}
        => �������� : 
           1. �� ���� �ֻ����� ����� �� �� �ִ� ��� ����� ����(random)
           2. �� �ֻ��� ���� ���� �Էµ� ���� ���� ��� "������ϴ�." ���
           3. �Է°��� �ٸ��� "Ʋ�Ƚ��ϴ�." �����.
           4. do ~ while ������ �ݺ��ǰ� ��
           5. "����Ͻðڽ��ϱ�?(y/n) : " ���� 'n' �Ǵ� 'N' �Է½� �ݺ������
*/
		int dice1 = new Random().nextInt(6)+1;
		int dice2 = new Random().nextInt(6)+1;
		int sum=dice1+dice2;
		do {
			System.out.print("'���� ��'�� �Է� : ");
			int expactation=sc.nextInt();
			if(expactation==sum) {
				System.out.println("������ϴ�.");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�");
				
			}
			System.out.print("����Ͻðڽ��ϱ�? (Y/N) : ");
			char ans = sc.next().charAt(0);
			if(ans=='n'||ans=='N')break;
		}while(true);
	}









}