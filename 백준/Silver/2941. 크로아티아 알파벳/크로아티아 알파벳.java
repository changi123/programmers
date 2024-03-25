import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		
		for(int i= 0 ; i < arr.length; i++) {
			while(true) {				
				if( s.contains(arr[i])) {
					s = s.replaceFirst(arr[i],"+");
				}else {
					break;
				}
			}
		}
		
		System.out.println(s.length());
	}

}
