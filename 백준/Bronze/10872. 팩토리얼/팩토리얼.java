import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		if( n == 0 ) {
			System.out.println(1);
			return;
		}
		System.out.println(fac(n));
	}
	public static int fac(int n ) {
		if( n <=1) {		
			return n ;
		}else {			
			return fac(n-1)*n ;
		}
	}

}
