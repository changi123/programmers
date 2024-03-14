import java.util.*;
public class Main {
	public static void main(String[] args) {
					Scanner sc= new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		int cnt = 0;
		if( N % 5 == 0 ) {
			System.out.println(N/5);
		} else {
			while(true) {
				N-=3;
				if( N < 0 ) {
					System.out.println(-1);
					break;
				}
				cnt++;
				if( N%5 == 0) {
					cnt+=N/5;
					System.out.println(cnt);
					break;
				}
			}
		}
	}
}
