import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
			//		쿼터(Quarter, $0.25)의 개수, 
		//		다임(Dime, $0.10)의 개수,
		//		니켈(Nickel, $0.05)의 개수,
		//		페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오.
		//		거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다.
		//		예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.
		
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.next());
	
//		int cnt = s / 25;
//		s = s % 25 ;
//		cnt = s / 10 ;
//		s = s % 10;
//		cnt = s / 1 ;
//		s = s % 1;
		int cnt = 0 ;
		for(int i = 0; i < T ; i++) {
			int caseNum = Integer.parseInt(sc.next());
			cnt = caseNum / 25 ;
			caseNum = caseNum%25;
			System.out.print(cnt);
			System.out.print(" ");
			cnt = caseNum / 10 ;
			caseNum = caseNum % 10;
			System.out.print(cnt);
			System.out.print(" ");
			cnt = caseNum / 5 ;
			caseNum = caseNum % 5;
			System.out.print(cnt);
			System.out.print(" ");
			cnt = caseNum / 1 ;
			caseNum = caseNum % 1;
			System.out.println(cnt);
			
		}
		
		
		
		
		
		
	
	}

}