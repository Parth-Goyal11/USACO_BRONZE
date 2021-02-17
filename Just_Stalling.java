/*
ID:PG0611
LANG:JAVA
TASK:Just Stalling
 */
import java.util.*;
public class Just_Stalling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> cows = new ArrayList<>();
        ArrayList<Integer> stalls = new ArrayList<>();
        ArrayList<Integer> permutations = new ArrayList<>();
        ArrayList<Integer> test = new ArrayList<>();
        int N = input.nextInt();
        int[][] CowStalls =  new int[2][N];
        for (int i = 0; i<N; i++){
            CowStalls[0][i] = input.nextInt();
            cows.add(CowStalls[0][i]);

        }
        for(int j = 0; j<N; j++){
            CowStalls[1][j] = input.nextInt();
            stalls.add(CowStalls[1][j]);
        }
        int multiplier = 0;
        Collections.sort(cows);
        Collections.reverse(cows);
        for(int k = 0; k<N; k++){
            multiplier = 0;
            for(int x = 0; x<stalls.size(); x++){
                if(cows.get(k) <= stalls.get(x)){
                    multiplier += 1;


                }

            }
            permutations.add(multiplier);


        }
        long ans = 1;
        int PermutationDone = 0;
        for(int n =0; n<permutations.size(); n++){
            ans *= permutations.get(n) - PermutationDone;
            test.add(permutations.get(n) - PermutationDone);

            PermutationDone++;

        }
        System.out.println(Math.abs(ans));




    }
}