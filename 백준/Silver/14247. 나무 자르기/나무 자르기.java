import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int [][] arr = new int [n][2];
		
		for(int i = 0 ; i < 2;i++) {
			for(int j = 0 ; j  < n; j++) {
				arr[j][i] = Integer.parseInt(sc.next());
			}
		}
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int [] o1, int [] o2 ) {
				return o1[1]-o2[1];
			}
		});
		int day = 0 ; 
		long answer = (long) 0 ;
		int index = 0 ; 
		while(n -- > 0 ) {
			answer+=arr[index][0]+(arr[index][1] * day);
			index++;
			day++;
		}
		System.out.println(answer);
	}

}
