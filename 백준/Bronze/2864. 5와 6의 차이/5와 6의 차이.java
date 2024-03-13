import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();

		if( A.contains("6")) {
			A = A.replaceAll("6","5");
		}
		
		if( B.contains("6")) {
			B = B.replaceAll("6","5");
		}

		System.out.print(Integer.parseInt(A)+Integer.parseInt(B)+" ");


		if( A.contains("5")) {
			A = A.replaceAll("5","6");
		}
		
		if( B.contains("5")) {
			B = B.replaceAll("5","6");
		}

		System.out.print(Integer.parseInt(A)+Integer.parseInt(B));
		
		
	}

}
