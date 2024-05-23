import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String [] arr= new String[n];
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = sc.next();
		}

		Integer[] alpha = new Integer[26];
		for(int i= 0 ; i < alpha.length;i++) {
			alpha[i] = 0;
		}
		for(int i= 0 ; i < arr.length ; i++) {
			int num = startNum(arr[i].length());
			for(int j = 0 ; j < arr[i].length();j++) {
				char c = arr[i].charAt(j);
				alpha[(int)c-65] += num ;
				num /= 10 ;

			}
		}

		Arrays.sort(alpha,Collections.reverseOrder());
		
		int sum = 0 ;
		int count = 9 ; 
		for(int i= 0 ; i < alpha.length;i++) {
			if( alpha[i] == 0 ) {
				break;
			}
			sum+=alpha[i]*(count--);
			
		}
		System.out.println(sum);
	}
public static int startNum(int len) {
		int num = 1; 
		for(int i= 0 ; i < len-1 ; i++) {
			num = num*10;
		}
		return num;
	}


}
