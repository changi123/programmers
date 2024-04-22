import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int len = Math.min(m, n);



		int [][] arr = new int[n][m];

		for(int i= 0 ; i < n ; i++) {
			String s = sc.next();
			String [] sr = s.split("");

			for(int j = 0 ; j < sr.length  ; j++) {
				arr[i][j]= Integer.parseInt(sr[j]);
			}
		}




		while(len > 1) {			
			for(int i= 0 ; i <= arr.length -len ;i++) {

				for(int j = 0 ; j <= arr[i].length - len;j++) {
					int num = arr[i][j];
					if( arr[i][j+len-1] == num && arr[i+len-1][j] ==num && 
							arr[i+len-1][j+len-1]==num) {
						System.out.println(len*len);
						return ;
					}
				}

			}
			len--;
		} 

		
		System.out.println(len*len);
	}

}
