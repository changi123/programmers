import java.util.*;


public class Main {

	public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
		
		Long N = Long.parseLong(sc.next());
		int cnt = 0 ;
		int sum = 0 ;
		int i = 0;
		while(true) {
			if( N - i <= i) {
				break;
			}
			N -=i;
			i++;
			cnt++;
			
		}
		System.out.println(cnt);
	}

}
