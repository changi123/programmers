import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		String [] arr= new String[n];

		for(int i= 0 ; i < arr.length;i++) {
			arr[i] = sc.next();
		}		
		String pattern = "[0-9]";
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if( o1.length() != o2.length()) {
					return o1.length() - o2.length();
				} 
				int sum1 = 0 ; 
				for(int i= 0 ; i < o1.length(); i++) {
					if(   (o1.charAt(i)+"").matches(pattern)) {
						sum1+=Integer.parseInt(o1.charAt(i)+"");
					}
				}

				int sum2 = 0 ;
				for(int i= 0 ; i < o2.length(); i++) {
					if(   (o2.charAt(i)+"").matches(pattern)) {
						sum2+=Integer.parseInt(o2.charAt(i)+"");
					}
				}

				if( sum1 != sum2 ) {
					return sum1 - sum2 ;
				} 					
				return o1.compareTo(o2);
			}

		});

        for(int i= 0 ; i < arr.length; i++) {
				System.out.println(arr[i]);
		}
	}

}
