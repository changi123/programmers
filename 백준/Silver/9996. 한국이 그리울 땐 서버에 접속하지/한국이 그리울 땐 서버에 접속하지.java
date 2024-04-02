import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		String s = sc.next();
//		s = s .replace("*", "-");
		String [] arr = s.split("\\*");
		
		while(n>0) {
			String sr = sc.next();
			
			if( sr.length()  <arr[0].length()+arr[1].length()) {
				n--;
				System.out.println("NE");
				continue;
			}
		
			if( s.substring(0, arr[0].length()).equals(sr.substring(0,arr[0].length())) &&
					
					s.substring(s.length()-arr[1].length() ).equals(sr.substring(sr.length()-arr[1].length()))
					) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
			
			n--;
		}
		
	}

}
