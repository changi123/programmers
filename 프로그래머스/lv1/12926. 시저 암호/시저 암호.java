
import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s, int n) {
		String answer = "";
		ArrayList upperList = new ArrayList();
		ArrayList lowerList = new ArrayList();


		//		String [] sr = s.split("");
		for(int i= 0; i<2; i++) {
			for(int j= 65; j<=90 ;j++) {
				upperList.add((char) j);
			}
		}



		for(int i = 0; i<2; i++) {
			for(int j= 97; j<=122 ; j++) {
				lowerList.add((char) j);
			}
		}



		for(int i= 0; i< s.length();i++) {
			int index =0;
			if(Character.isUpperCase(s.charAt(i))) {
				index = upperList.indexOf(s.charAt(i));
				answer+=upperList.get(index+n);

			} else if(Character.isLowerCase(s.charAt(i))) {
				index = lowerList.indexOf(s.charAt(i));
				answer+=lowerList.get(index+n);
			} else {
				answer+=" ";
			}


		}



		return answer;
    }
}