import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		
		
		for(int z = 0 ; z < T ; z++) {
			
		
			
			int N = Integer.parseInt(sc.next());
			
			long [] arr = new long[N];
			for(int i= 0 ; i < N ; i++) {
				arr[i] = Integer.parseInt(sc.next());
			}
			

			long max = 0;
			long sum = 0 ;
			for(int i = arr.length-1 ; i>=0 ; i--) {
				if(i == arr.length-1) {
					max = arr[i];
					continue;
				}
				
				if( arr[i] > max ) {
					max = arr[i];
					continue;
				}else {					
					sum+= max - arr[i];
				}
				
			}
			System.out.println(sum);
		}
		
	}

}
