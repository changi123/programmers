import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc.nextLine();
		
		for(int i = 0 ; i < n; i ++) {
			StringBuilder sb= new StringBuilder("Case #"+(i+1)+": ");
			String s = sc.nextLine();
			String[] arr = s.split(" ");
			for(int j = arr.length-1 ;  j >= 0 ; j--) {
				sb.append(arr[j]+ " ");
			}
			System.out.println(sb.toString());
		}
	}

}
