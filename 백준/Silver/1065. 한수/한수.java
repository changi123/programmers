import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		int cnt = 0 ; 
		
		if( n < 100 ) {
			cnt = n ; 
			System.out.println(cnt);
			return ; 
		}
		
		
		cnt = 99 ; 
		for(int i= 100 ; i <= n ; i++) {
			int a = i / 100 ;
			int b = (i / 10) % 10 ;
			int c = i % 10 ; 
			
			if( (c-b) == (b-a)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
