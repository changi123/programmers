import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T =Integer.parseInt( bf.readLine());
		
//		2
//		I am happy today
//		We want to win the first prize

		for(int i= 0 ; i<T ; i++) {
			String [] arr = bf.readLine().split(" ");
			
			StringBuilder sb = new StringBuilder();
//			sb.append(" ");
			for(int j = 0 ; j< arr.length;j++) {
				
				for(int k = arr[j].length()-1 ; k >=0;k--) {
						

						sb.append(arr[j].charAt(k));
						
					
				}
				sb.append(" ");
				
			}
			System.out.println(sb.toString());
	}
    }
	
}
