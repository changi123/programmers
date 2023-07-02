class Solution {
   public static String solution(String s) {

      String answer = "";

      int cnt =0 ;


      
      for(int i= s.length()-1; i>=0;i--) { // 문자열 뒤에서부터 공백이 몇 개인지 카운트 for문      


         if(s.charAt(i) == ' ') {
            cnt++;

         } else {
            break;
         }
      }


      String [] sr = s.split(" ");


      for(int i= 0; i<sr.length;i++) {
         String a = sr[i];
         for(int j= 0; j<a.length(); j++) {

            if(j%2==0) {
               answer+= Character.toUpperCase(a.charAt(j)) ;

            } else if(j%2==1){

               answer+= Character.toLowerCase(a.charAt(j)) ;

            }


         }

         if(i==sr.length-1) {
            // 마지막 문자 비교후 위에 공백이 있었다면 cnt 카운트 될테니 cnt만큼 반복해서 공백 추가
            for(int k = 0 ; k<cnt ; k++) { 
               answer+=" ";
            }
            break;
         }
         answer+=" ";

      }

      return answer;
   }
}