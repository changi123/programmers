import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s= sc.next();
		
		String [] arr = s.split("");
		
		ArrayList<Integer> list = new ArrayList();
		
		for(int i= 0 ; i < arr.length;i++) {
			list.add(Integer.parseInt(arr[i]));
			
		}
		list.sort(Collections.reverseOrder());
		
		for(int i= 0 ; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		
	}

}
