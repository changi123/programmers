import java.util.*;
public class Main {
public static void main(String[] args){
		
		char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		
		int [] arr = new int [ alphabet.length];
		for(int i= 0; i <s.length();i++) {
			char a= Character.toUpperCase(s.charAt(i));
			for(int j = 0 ; j<arr.length;j++) {
				if (a == Character.toUpperCase(alphabet[j])) {
					arr[j]++;
				}
			}
			
		}
		
		// 숫자 넣을 거 
		List<Integer> list = new ArrayList();
		
		List<Integer> list2 = new ArrayList();
		// 문자 넣을 거 
		List list3 =new ArrayList();
		for(int i= 0; i <arr.length;i++) {
			list.add(arr[i]);
			list2.add(arr[i]);
			list3.add(alphabet[i]);
		}
		
		/// ㅐ내림차순
		list.sort(Collections.reverseOrder());
		int index = (int) list.get(0);
		if( list.get(0).equals(list.get(1))) {
			System.out.println("?");
			return ; 
		}
		
		//
		
		
		
		//
		int index2  =  list2.indexOf(list.get(0));
		
		
		System.out.println(Character.toUpperCase(  (char) list3.get(index2)));
		
}
}