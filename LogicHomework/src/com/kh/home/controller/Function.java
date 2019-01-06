package com.kh.home.controller;
import java.util.Scanner;
import java.util.Random;
/*<과제3>
패키지 선언 : com.kh.home.controller
클래스명 : public class Function
=> 메뉴에서 실행시킬 메소드들을 작성함 : 모두 non-static 메소드로 작성할 것
=> 키보드 입력을 위한 Scanner 클래스에 대한 레퍼런스 변수를 필드로 선언함*/
public class Function {
	Scanner sc = new Scanner(System.in);
	public void calculator(){
		System.out.print("첫번째 정수 입력 : ");
		int num1=sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2=sc.nextInt();
		System.out.print("연산문자 입력 : ");
		char op = sc.next().charAt(0);
		switch(op) {
		case '+' : System.out.println(num1+" + "+num2+" = "+(num1+num2));break;
		case '-' : System.out.println(num1+" - "+num2+" = "+(num1-num2));break; 
		case '*' : System.out.println(num1+" * "+num2+" = "+(num1*num2));break;
		case '/' : 
			if(num2!=0) {
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
			}else{System.out.println("0으로 나눌 수 없습니다.\n"+num1+" / "+num2+" = "+" 0 ");}break;
		}System.out.println();
	}
	public void totalCalculator(){
		System.out.print("첫 번째 수 입력 : ");
		int num1=sc.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2=sc.nextInt();
		int sum=0;
		if(num1<=num2) {
			for(int i=num1;i<=num2;i++) {
				sum+=i;
			}System.out.println(num1+"부터 "+num2+"까지 정수들의 합계 : "+sum);
		}else {
			for(int i=num2;i<=num1;i++) {
				sum+=i;
			}System.out.println(num2+"부터 "+num1+"까지 정수들의 합계 : "+sum);
		}
	}
	public void profile(){
		String name ="김수민";
		int age = 31;
		String gender = "여자";
		String character = "열심히 함";
		System.out.printf("이름 : %s\n나이 : %d세\n성별 : %s\n성격 : %s\n",name,age,gender,character);
	}
	public void sungjuk() {
		System.out.print("이름 입력 : ");
		String name=sc.nextLine();
		System.out.print("학년 입력: ");
		int year = sc.nextInt();
		System.out.print("반 입력 : ");
		int classNum = sc.nextInt();
		System.out.print("번호 입력 : ");
		int num=sc.nextInt();
		sc.nextLine();
		System.out.print("성별 입력 (M/F) : ");
		String inputGender =sc.nextLine();
		char strGender =inputGender.charAt(0);
		System.out.print("성적 입력 : ");
		double inputGrade = sc.nextDouble();
		int inputGrade1=(int)(inputGrade*10);
		double inputGrade2 = (double)inputGrade1/10;
		String grade ="";
		String gender = (strGender=='f'||strGender=='F')?"여학생":((strGender=='M'||strGender=='m')?"남학생":"중성");
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
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.1f이고, %s학점입니다.\n",year,classNum,num,gender,name,inputGrade,grade);
		
	}
	public void printStarNumber(){
		System.out.print("정수 하나 입력 : ");
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
			System.out.println("양수가 아닙니다.");
		}
	}
	public void sumRandomNumber(){
		/*int random = new Random().nextInt(100)+1;*/
		int random = (int)(Math.random()*100)+1;
		int sum=0;
		for(int i=1;i<=random;i++) {
			sum+=i;
		}System.out.println("1부터 "+random+"까지의 합은 "+sum+"입니다.");
	}
	public void continueGugudan(){
		System.out.print("정수 하나 입력 : ");
		int num1=sc.nextInt();
		if(num1>0) {
			for(int su=1;su<10;su++) {
				if(su%num1==0)continue; 
					System.out.println(num1+" * "+su+" = "+(num1*su));
					
			}System.out.println("================");
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
	public void shutNumber(){
		/*<과제 11>
        => 메소드명 : public void shutNumber(){}
        => 구현내용 : 
           1. 두 개의 주사위가 만들어 낼 수 있는 모든 경우의 수중(random)
           2. 두 주사위 눈의 합이 입력된 수와 같은 경우 "맞췄습니다." 출력
           3. 입력값과 다르면 "틀렸습니다." 출력함.
           4. do ~ while 문으로 반복되게 함
           5. "계속하시겠습니까?(y/n) : " 에서 'n' 또는 'N' 입력시 반복종료됨
*/
		int dice1 = new Random().nextInt(6)+1;
		int dice2 = new Random().nextInt(6)+1;
		int sum=dice1+dice2;
		do {
			System.out.print("'예측 값'을 입력 : ");
			int expactation=sc.nextInt();
			if(expactation==sum) {
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("틀렸습니다");
				
			}
			System.out.print("계속하시겠습니까? (Y/N) : ");
			char ans = sc.next().charAt(0);
			if(ans=='n'||ans=='N')break;
		}while(true);
	}









}
