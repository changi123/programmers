import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next()); // 마을의 수
		int [] arr = new int[n];
		for(int i= 0 ; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		
		Arrays.sort(arr);
		int sum = 0 ;
		for(int i= 0 ; i < arr.length ; i++) {
			if( i == arr.length-1) {
				break;
			}
			sum+=arr[i];
		}
		
		System.out.println(sum);
	}

}
