import java.util.*;


public class Main {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		TreeMap<String,Integer> map = new TreeMap();
		int n = Integer.parseInt(sc.next());
		for(int i= 0 ; i < n ; i++) {
			String s = sc.next();
			
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}else {
				int cnt = map.get(s);
				map.replace(s, ++cnt);
			}
			
		}
		
		ArrayList<Integer> list = new ArrayList();
		
		for(String s : map.keySet()) {
			int val = map.get(s);
			list.add(val);
		}
		
		list.sort(null);
		for(String s : map.keySet()) {
			int val = map.get(s);
			if( val == list.get(list.size()-1)) {
				System.out.println(s);
				break;
			}
		}
	}

}
