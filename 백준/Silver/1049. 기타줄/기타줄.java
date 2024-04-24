import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int [] packPrice = new int[m];
		int [] onePrice = new int[m];
		
		int sum = 0 ; 
		for(int i= 0 ; i < m ; i++) {
			packPrice[i] = Integer.parseInt(sc.next());
			onePrice[i] = Integer.parseInt(sc.next());
		}
		
		
		Arrays.sort(packPrice);
		Arrays.sort(onePrice);
		
//		System.out.println(Arrays.toString(packPrice));
//		System.out.println(Arrays.toString(onePrice));

		int cnt = 0 ;
		if( onePrice[0]*6 > packPrice[0]) {
			while( n>6 ) {
				n -= 6; 
				cnt++;
			}
			sum+=packPrice[0]*cnt;
			int min = Math.min(packPrice[0], onePrice[0]*n);
			
			sum+=min;
			System.out.println(sum);
			return ;
			
		}else {
			sum+=n*onePrice[0];
			System.out.println(sum);
			return ;
		}
		
		
	}

}
