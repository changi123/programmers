import java.util.*;


public class Main {

	public static void main(String[] args) {
		//		첫 줄에 문제의 개수 N, 현정이의 역량 L,
		//		현정이가 대회중에 풀 수 있는 문제의 최대 개수 K가 주어진다.
		//		둘째 줄부터 N개의 줄에 걸쳐 1 ~ N번째 문제의 쉬운 버전의 난이도 sub1, 
		//		어려운 버전의 난이도 sub2 가 순서대로 주어진다.

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next()); // 문제 개수
		int L = Integer.parseInt(sc.next()); // 현정이의 역량
		int K = Integer.parseInt(sc.next()); // 풀 수 있는 문제 최대 수

		int [] arr =new int[N];
		int [] arr2 =new int[N];
		for(int i = 0 ; i <N ; i++) {

			arr[i] = Integer.parseInt(sc.next());
			arr2[i] = Integer.parseInt(sc.next());

		}
		
		int cnt = 0 ;
		int sum = 0; 
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		for(int i= 0 ; i<arr2.length ; i++) {
			if ( arr2[i] <=L) {
				cnt++;
				sum+=140;
				if( cnt == K) {
					break;
				}
				continue;
			} 
			
			if( arr[i] <=L) {
				cnt++;
				sum+=100;
				if( cnt == K) {
					break;
				}
			}
			
		}
		
		
		

		System.out.println(sum);





	

	}

}
