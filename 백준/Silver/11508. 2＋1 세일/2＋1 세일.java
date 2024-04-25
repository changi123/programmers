import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long sum = 0 ; 
		if ( n < 3 ) {
			for(int i= 0 ; i < n ; i++) {
				int price = Integer.parseInt(sc.next());
				sum+=price;
			}
			System.out.println(sum);
			return ; 
		}
		
		Integer [] arr = new Integer[n];
		
		for(int i= 0 ; i <arr.length;i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i = 0 ; i< arr.length;i++) {
			if( (i+1) % 3 ==0 && i !=0) {
				continue;
			}else {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}

}
