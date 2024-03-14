import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= Integer.parseInt(sc.next());
		int five =5;
		int two = 2;
		int cnt = 0 ;
		if( n % five ==0) {
			System.out.println(n/five);
		} else {
			while(true) {
				n-=two;
				if( n<0) {
					System.out.println(-1);
					break;
				}
				cnt++;
				if(n % five ==0) {
					cnt+=n/five;
					System.out.println(cnt);
					break;
				}
			}
		}
	}

}
