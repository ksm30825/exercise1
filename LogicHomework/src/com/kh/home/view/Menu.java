package com.kh.home.view;
import com.kh.home.controller.Function;
import java.util.Scanner;
/*패키지 선언 : com.kh.home.view
클래스명 : public class Menu
=> 출력될 메뉴를 메소드로 작성함 : static 메소드임.
   public static void displayMenu(){}
=> 처리내용
   1. do~while 문으로 메뉴 화면이 반복 출력되게 함
   2. 출력될 메뉴 화면

      *** 지역변수/연산자/제어문 연습 프로그램 ***

      1. 간단 계산기   => calculator() 메소드 실행되게 함
      2. 작은수에서 큰수까지 합계구하기  => totalCalculator() 실행
      3. 신상정보 확인하기 => profile() 실행
      4. 학생정보 확인하기 => sungjuk() 실행
      5. 별과 숫자 출력하기 => printStarNumber() 실행
      6. 난수까지의 합게 구하기 => sumRandomNumber() 실행
      7. 구구단 => continueGugudan() 실행
      8. 주사위 숫자 알아맞추기 게임 => shutNumber() 실행
      9. 프로그램 종료
      메뉴 번호 입력 : 

   3. 메뉴번호 입력받아, 해당 번호의 기능이 실행되게 switch문 사용함
   4. 메뉴 1 ~ 8 까지의 실행용 메소드는 Function 클래스의 메소드를
      호출함
      => 다른 패키지의 클래스 non-static 메소드를 사용하는 것임...
*/
public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static void displayMenu(){
		do {
			System.out.println("*** 지역변수/연산자/제어문 연습 프로그램 ***");
			System.out.println("1. 간단 계산기\n2. 작은수에서 큰수까지 합계구하기\n3. 신상정보 확인하기\n4. 학생정보 확인하기\n5. 별과 숫자 출력하기\n6. 난수까지의 합게 구하기\n7. 구구단\n8. 주사위 숫자 알아맞추기 게임\n9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int inputMenu= sc.nextInt();
			switch(inputMenu) {
			case 1 : new Function().calculator();break;
			case 2 : new Function().totalCalculator();break;
			case 3 : System.out.println("3. 신상정보 확인하기");new Function().profile();break;
			case 4 : System.out.println("4. 학생정보 확인하기");new Function().sungjuk();break;
			case 5 : System.out.println("5. 별과 숫자 출력하기");new Function().printStarNumber();break;
			case 6 : System.out.println("6. 난수까지의 합계 구하기");new Function().sumRandomNumber();break;
			case 7 : System.out.println("7. 구구단");new Function().continueGugudan();break;
			case 8 : System.out.println("8. 주사위 숫자 알아맞추기 게임");new Function().shutNumber();break;
			case 9 : System.out.println("9. 프로그램 종료");break;
			}
			if(inputMenu==9)break;
		}while(true);
	}


}
