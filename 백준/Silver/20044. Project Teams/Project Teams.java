import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Integer [] arr = new Integer[n*2];
		Integer [] arr1 = new Integer[n];
		Integer [] arr2 = new Integer[n];
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		int index1 = 0 ;
		int index2 = 0 ;
		for(int i= 0 ; i < n*2 ; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(arr);
		for(int i= 0 ; i < n*2 ; i++) {
			if( i < n ) {
				arr1[index1++] =  arr[i];
			} else {
				arr2[index2++] = arr[i];
			}
		}
		Arrays.sort(arr2,Collections.reverseOrder());
		for(int i= 0 ; i < arr1.length;i++) {
			pq.offer(arr1[i]+arr2[i]);
		}
		System.out.println(pq.poll());
	}

}
