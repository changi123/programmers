import java.util.*;
import java.io.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언		
		Integer t = Integer.parseInt(br.readLine());
		while(t-- > 0 ) {
			StringBuilder sb = new StringBuilder();
			Integer n = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> tm = new TreeMap<>();

			while(n -- > 0 ) {
				String [] input = br.readLine().split(" ");

				if (input[0].equals("I")) {
					Integer num = Integer.parseInt(input[1]);
					if( !tm.containsKey(num)) {
						tm.put(num, 1);
					} else {
						int amount = tm.get(num);
						amount++;
						tm.put(num,amount);
					}
				} else if( input[0].equals("D")) {
					Integer num = Integer.parseInt(input[1]);
					if( tm.isEmpty()) {
						continue;
					}
					if( num < 0 ) {
						Entry<Integer, Integer> FirstEntry = tm.pollFirstEntry();
						Integer val =FirstEntry.getValue() ;
						if( val != 1 ) {
							int key = FirstEntry.getKey();
							val--;
							tm.put(key , val );
						} 
					} else if( num > 0 ){
						Entry<Integer, Integer> LastEntry = tm.pollLastEntry();
						Integer val =LastEntry.getValue() ;
						if( val != 1 ) {
							int key = LastEntry.getKey();
							val--;
							tm.put(key , val );
						} 
					}
				}
				
			}
			if( tm.isEmpty()) {
				System.out.println("EMPTY");
			} else {
				Entry<Integer, Integer> LastEntry = tm.pollLastEntry();
				if( !tm.isEmpty()) {
					Entry<Integer, Integer> FirstEntry = tm.pollFirstEntry();
					System.out.println(LastEntry.getKey()+ " "+ FirstEntry.getKey());
				} else {
				System.out.println(LastEntry.getKey()+ " "+ LastEntry.getKey());
				}

			}
		}
	}

}
