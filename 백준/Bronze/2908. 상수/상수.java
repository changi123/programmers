import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		StringBuilder a = new StringBuilder(sc.next());
		StringBuilder b = new StringBuilder(sc.next());
		
		
		int A = Integer.parseInt(a.reverse().toString());
		int B = Integer.parseInt(b.reverse().toString());
		
		System.out.println(Math.max(A, B));
	}

}
