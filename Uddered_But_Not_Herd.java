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
        String cowphabet = input.nextLine(); //Take in the input for the cow alphabet
        String lower_string = input.nextLine();//Take in input for the string Farmer John heard.
        int iteration = 1;                     //Variable iteration to keep track of the number of times through the alphabet.
        int lowerLength = lower_string.length();
        for(int i =0; i<lowerLength; i++ ){    //Add the seperate of letters of the string into a ArrayList so it is easier to work with
            char charForm = lower_string.charAt(i);
            String stringForm = Character.toString(charForm);
            letters.add(stringForm);                  
        }

        for (int z=0; z<letters.size(); z++){   //Get the indexes of each letter of the string in the cowphabet.
            String check = letters.get(z);
            int currentInstance = cowphabet.indexOf(check);
            indexes.add(currentInstance);
        }
        for (int a = 0; a<indexes.size(); a++){ //If a is 0 do nothing because that is the first index.
            if(a == 0){                         

            }else{
                if(indexes.get(a) <= indexes.get(a-1)) { // if a set index is less or equal to the previous index, increase the iteration by one.
                    iteration += 1;

                }
            }




        }
        System.out.println(iteration);
    }

}
