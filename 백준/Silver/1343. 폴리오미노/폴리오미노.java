import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
	Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		
		//XXXX
		//XXXX.XX.XXXX
		
		String A = "AAAA";
		String B = "BB";
		
		s= s.replaceAll("XXXX", A);
		s= s.replaceAll("XX", B);
		
		if( s.contains("X")) {
			System.out.println("-1");
		} else {
			System.out.println(s);
		}
		
	
	}

}