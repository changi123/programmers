import java.util.*;


public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int [] arr = new int[n];
		for(int i= 0 ;  i < n ; i ++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
		
		int sum = Integer.parseInt(sc.next());
		int cnt = 0 ;
		for(int i= 0 ;  i < arr.length ; i ++) {
			
			for(int j = i+1 ; j<arr.length;j++) {
				if( arr[i] + arr[j] == sum) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(cnt);
    }
}
