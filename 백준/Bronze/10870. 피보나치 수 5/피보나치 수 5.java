import java.util.*;


public class Main {
public static int Fibo(int num ) {

		if ( num == 0 ) return 0 ;
		if( num == 1 ) return 1;
		
		return Fibo(num -1) + Fibo(num -2);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		System.out.println( Fibo(n));
	}

}
