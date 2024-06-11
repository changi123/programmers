import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		while(m<=n) {
			int cnt = 0 ;
			if( m == 1) {
				m++;
				continue;
			}
			for(int i= 1; i*i<=m ;i++) {
				if( cnt >= 2 ) {
					break;
				}
				if( m % i == 0 ) {
					cnt++;
				}
			}
			if( cnt == 1) {
				System.out.println(m);
			}
			m++;
			
		}
	}

}
