import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[8];
		int [] arr2 =new int[8]; 
		int [] arr3 = new int[5];
		
		
		for(int i= 0 ; i <arr.length; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);

		
//		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr);
		System.arraycopy(arr, 3, arr3, 0, 5);
		int sum  = 0; 
		
		ArrayList<Integer> list = new ArrayList();
		for(int i= 0 ; i < arr3.length;i++) {
			sum+=arr3[i];
			for(int j = 0 ; j < arr2.length ; j++) {
				if( arr2[j] == arr3[i]) {
					list.add(j+1);
					break;
				}
			}
		}
		System.out.println(sum);
		list.sort(null);
		StringBuilder sb = new StringBuilder();
		for(int i= 0 ; i <list.size(); i++) {
			sb.append(list.get(i)+ " ");
		}
		System.out.println(sb.toString());
	}

}
