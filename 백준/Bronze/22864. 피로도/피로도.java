import java.util.*;


public class Main {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
//		String [] arr = sc.nextLine().split(" ");
		
//		System.out.println(Arrays.toString(arr));
		
		
		int A = Integer.parseInt(sc.next()); // 한 시간당 쌓이는 피로도
		int B = Integer.parseInt(sc.next()); // 처리할 수 있는 일
		int C = Integer.parseInt(sc.next()); // 한 시간당 줄어드는 피로도 
		int M = Integer.parseInt(sc.next()); // 넘지 말아야할 피로도
		
		
		int hour = 0;
		int sum = 0 ;
		int first_A = 0; 
		while(hour < 24) {
			hour++;
			if( first_A+A <=M) {
				sum+=B;
				first_A +=A;
			} else if ( first_A - C >=0){
				first_A-=C;
			} else if( first_A - C <0) {
				first_A = 0;
			}
		}
		System.out.println(sum);
		
	}

}
