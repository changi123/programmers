import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		long [] a = new long[(int) (N-1)];
		long [] b = new long[(int) N];
		
		
		for(int i= 0 ; i <a.length ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		for(int i= 0 ; i <b.length ; i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		long min = b[0] ;
		long sum = 0 ;
		for(int i= 0 ; i < b.length ; i++) {
			if( i == b.length -1) {
				break;
			}
			if( min <=b[i]) {
				sum+=a[i]*min;
			}else {
				min = b[i];
				sum+=a[i]*min;
			}
		}
		
		System.out.println(sum);
	}

}
