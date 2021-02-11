/*
ID: PG0611
LANG: JAVA
Task: Uddered But Not Herd
*/



import java.util.*;
import java.util.List;
public class Uddered_But_Not_Herd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        String cowphabet = input.nextLine();
        String lower_string = input.nextLine();
        int iteration = 1;
        int lowerLength = lower_string.length();
        for(int i =0; i<lowerLength; i++ ){
            char charForm = lower_string.charAt(i);
            String stringForm = Character.toString(charForm);
            letters.add(stringForm);
        }

        for (int z=0; z<letters.size(); z++){
            String check = letters.get(z);
            int currentInstance = cowphabet.indexOf(check);
            indexes.add(currentInstance);
        }
        for (int a = 0; a<indexes.size(); a++){
            if(a == 0){

            }else{
                if(indexes.get(a) <= indexes.get(a-1)) {
                    iteration += 1;

                }
            }




        }
        System.out.println(iteration);
    }

}
