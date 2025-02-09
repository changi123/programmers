
import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        ArrayList upperList = new ArrayList();
        ArrayList lowerList = new ArrayList();


//      String [] sr = s.split("");

        for(int i= 65; i<=90 ;i++) {
            upperList.add((char) i);
        }


        for(int i = 65; i<=90 ; i++) {
            upperList.add((char) i);
        }

        for(int i= 97; i<=122 ; i++) {
            lowerList.add((char) i);
        }
        for(int i= 97; i<=122 ; i++) {
            lowerList.add((char) i);
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
