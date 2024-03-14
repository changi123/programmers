import java.util.*;


public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int N =Integer.parseInt(sc.next());
		
		
		int [] arr = new int[N];
		for(int i= 0 ; i< N ; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		
		
		int max  = 0 ;
		for(int i= 0; i< N ; i++) {
			int num = arr[i];
			int cnt = 0 ;
			for(int j = i+1 ; j< N ; j++) {
				if( arr[j] < num) {
					cnt++;
				}else {
					break;
				}
			}
			if( cnt >=max) {
				max = cnt;
			}
			
		
		}
		
		System.out.println(max);
		
		
		
	}

}
