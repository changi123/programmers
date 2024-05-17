import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int [][] arr = new int[n][2];
		
		for(int i= 0 ; i < n ; i++) {
			
			for(int j = 0 ; j < 2 ; j++) {
				arr[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		Arrays.sort(arr,new Comparator<int[]>() {
			public int compare(int[] o1 , int[] o2) {
				if( o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0]-o2[0];
				}
			}
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(arr[0][1]);
		
		for(int i= 1 ; i < n ;i++ ) {
			if( pq.peek() <= arr[i][0] ) {
				pq.poll();
			}
			
			pq.add(arr[i][1]);
		}
		System.out.println(pq.size());
		
		
		
		
//		System.out.println(Arrays.deepToString(arr));
		
	}

}
