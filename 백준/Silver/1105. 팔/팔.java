import java.util.*;

public class Main {

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder L = new StringBuilder(sc.next());

        StringBuilder R = new StringBuilder(sc.next());

        

        int answer =0;

        if(L.length() ==R.length ()){

            for(int i =0 ; i < L.length();i++){

                if(L.charAt(i) =='8' && R.charAt(i) =='8' ){

                    answer++;

                } else if (L.charAt(i) ==R.charAt(i) ) {

                    continue;

                } else {

                    break;

                }

                

            }

            System.out.println(answer) ;

            

        } else{

            

           System.out.println(answer) ;

            

        }

        

        

    }

    

}