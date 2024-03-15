import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next()); // 물이 새는 개수
		int L = Integer.parseInt(sc.next()); // 테이프 길이

		int [] arr = new int[N];

		int cnt = 0 ;

		for(int i= 0 ; i <arr.length ; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(arr);
		int start = arr[0];
		
		
		for(int i= 0 ; i< arr.length ; i++) {
			if( arr[i] - start >= L) {
				cnt++;
				start = arr[i];
			}
			
		}
		
		System.out.println(cnt+1);


	}

}
