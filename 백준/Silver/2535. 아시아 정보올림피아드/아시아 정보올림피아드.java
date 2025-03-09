import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n  = Integer.parseInt(sc.next());
		int [][] arr = new int [n][3];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i][0] = Integer.parseInt(sc.next());
			arr[i][1] = Integer.parseInt(sc.next());
			arr[i][2] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int [] o1, int[] o2 ) {
				return o2[2] - o1[2];
			}
		});
		
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		int count = 0 ; 
		for(int i = 0 ; i < arr.length;i++) {
			if( count == 3 ) {
				break;
			}
			if( !hm.containsKey(arr[i][0])) {
				hm.put(arr[i][0], 1);
				System.out.println(arr[i][0] + " " + arr[i][1]);
				count++;
			} else {
				if(hm.get(arr[i][0]) == 2 ) {
					continue;
				} else {
					int cnt = hm.get(arr[i][0]);
					cnt+=1;
					hm.put(arr[i][0],cnt );
					System.out.println(arr[i][0] + " " + arr[i][1]);
					count++;
				}
				
			}
			
		}
	}

}
