/*
ID:PG0611
LANG:JAVA
TASK:Just Stalling
 */
import java.util.*;
public class Just_Stalling {
    public static void main(String[] args) {       //The logic for this problem is pretty easy, use permutations to go through each cow and multiply the possiblilites.
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> cows = new ArrayList<>();
        ArrayList<Integer> stalls = new ArrayList<>();
        ArrayList<Integer> permutations = new ArrayList<>();
        ArrayList<Integer> test = new ArrayList<>();       //This is a unnecessary ArrayList that I used for testing some things out.
        int N = input.nextInt();
        int[][] CowStalls =  new int[2][N];                //Create a 2D array and form to lists of cows and stalls.
        for (int i = 0; i<N; i++){
            CowStalls[0][i] = input.nextInt();
            cows.add(CowStalls[0][i]);

        }
        for(int j = 0; j<N; j++){
            CowStalls[1][j] = input.nextInt();
            stalls.add(CowStalls[1][j]);
        }
        int multiplier = 0;       //You are defining a multiplier variable and sorting and reversing the list so it will be arranged in decreasing order.
        Collections.sort(cows);
        Collections.reverse(cows);
        for(int k = 0; k<N; k++){
            multiplier = 0;         //Resetting the multiplier value each time
            for(int x = 0; x<stalls.size(); x++){ //Here we are finding how many stalls there are available for each cowd.
                if(cows.get(k) <= stalls.get(x)){
                    multiplier += 1;


                }

            }
            permutations.add(multiplier);         //Adding the stalls available for each cow to a list.


        }
        long ans = 1;                             //Create a long for the ans, int gave me problems because of the large outputs.
        int PermutationDone = 0;                  //Creating another variable to subtract each value by a set amount, in order for it to work with permutations.
        for(int n =0; n<permutations.size(); n++){
            ans *= permutations.get(n) - PermutationDone;  //multiplying the answer by the number of stalls the cow can fit in, minus Permutation Done, because that many stalls are already taken up.
            test.add(permutations.get(n) - PermutationDone); //This was a test list to see what was going run in my first piece of code, the problem was using an int instead of long so this is unnecessary.

            PermutationDone++;                                //Add one to the permutation done because that many stalls are taken up.

        }
        System.out.println(Math.abs(ans));                    //Print the answer




    }
}
