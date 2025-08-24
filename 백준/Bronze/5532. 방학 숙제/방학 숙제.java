import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		
		int lastC = a % c; 
		c = a / c ;
		if( lastC != 0 ) {
			c+=1;
		}
		int lastD = b % d; 
		d = b / d;
		if( lastD != 0 ) {
			d+=1;
		}
		
		
		
		System.out.println(l - Math.max(c, d));
	}

}
