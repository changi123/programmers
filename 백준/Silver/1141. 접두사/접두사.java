import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String [] arr = new String[n];
		int cnt = 0 ;
		for(int i= 0 ; i < n ; i++ ) {
			arr[i] = sc.next();
		}

		//		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length()- s2.length();
			}
		});

		for(int i = 0 ; i < arr.length; i++) {
			boolean check = false;
			for(int j = i+1 ; j< arr.length ; j++) {				
				String s = arr[i];
				if( arr[j].startsWith(s)) {
					check = true ;
					break;
				}
				
			}
			if( !check ) {
				cnt++;
			}
		}


		System.out.println(cnt);

	}

}
