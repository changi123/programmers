import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.nextLine();
		int cnt = 0 ;
		while(true) {
			if( ( B - 1) % 10 == 0) { 
				B = ( B - 1) /10;
				cnt++;
			} else if( B % 2 ==0 ){
				B = B / 2;
				cnt++;
			} else {
				cnt = -1;
				break;
			}
			
			if( B == A ) {
				cnt++;
				break;
			} else if (B<=A) {
				cnt = -1;
				break;
			}
		}
		
		System.out.println(cnt);
		
	}

}
