import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
		int caseNum = Integer.parseInt(sc.next());
		
		if( caseNum % 10 !=0) {
			System.out.println(-1);
		}else {
			int cnt = 0; 
//			if( caseNum >=300) {
//				cnt = caseNum / 300;
//				System.out.print(cnt+" ");
//				caseNum = caseNum % 300;
//				cnt = caseNum / 60;
//				System.out.print(cnt + " ");
//				caseNum = caseNum % 60;
//				cnt = caseNum / 10;
//				System.out.print(cnt + " ");
//			} else if( caseNum>= 60 ) {
//				System.out.print(0 + " ");
//				cnt = caseNum / 60;
//				System.out.print(cnt + " ");
//				caseNum = caseNum % 60;
//				cnt = caseNum / 10;
//				System.out.print(cnt + " ");
//			} else {
//				System.out.print(0 + " ");
//				System.out.print(0 + " ");
//				caseNum = caseNum % 60;
//				cnt = caseNum / 10;
//				System.out.print(cnt + " ");
//			}
			cnt = caseNum / 300;
			System.out.print(cnt+" ");
			caseNum = caseNum % 300;
			cnt = caseNum / 60;
			System.out.print(cnt + " ");
			caseNum = caseNum % 60;
			cnt = caseNum / 10;
			System.out.print(cnt + " ");
		}
	}

}
