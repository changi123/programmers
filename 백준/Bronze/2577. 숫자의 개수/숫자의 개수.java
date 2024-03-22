import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			int a= Integer.parseInt(sc.next());
			int b= Integer.parseInt(sc.next());
			int c= Integer.parseInt(sc.next());
			
			int mul = a*b*c;
			
			String[] arr = Integer.toString(mul).split("");
			
			Arrays.sort(arr);
			
			
			
			int [] arrNum = new int[10];
			
			for(int i= 0 ; i < arr.length;i++) {
				arrNum[Integer.parseInt( arr[i] )]++;
			}
			
			
			for(int i= 0 ; i < arrNum.length;i++) {
				System.out.println(arrNum[i]);
			}
			
			break;
			
			
		}
	}

}
