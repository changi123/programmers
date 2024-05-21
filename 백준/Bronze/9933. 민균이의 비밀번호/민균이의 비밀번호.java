import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		HashSet<String> hs = new HashSet();
		int size = hs.size();
		for(int i= 0 ; i < n ; i++) {
			StringBuilder sb = new StringBuilder(sc.next());
			if( sb.toString().equals(sb.reverse().toString())) {
				System.out.print(sb.length()+" "+sb.charAt(sb.length()/2));
				return ; 
			}
			
			hs.add(sb.toString());
			hs.add(sb.reverse().toString());
			if( size == hs.size()) {
				System.out.print(sb.length()+" "+sb.charAt(sb.length()/2));
				return ; 
			}else {
				size = hs.size();
			}
		}
		
	}

}
