/*
ID:PG0611
LANG:JAVA
TASK:Daisy Chains
 */

import java.util.*;
public class Daisy_Chains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> Inputs = new ArrayList<>();
        List<Integer> photo = new ArrayList<>();
        boolean present = false;
        int times = 0;
        int N = input.nextInt();
        for (int i = 0; i < N; i++) { //Creating a list out of the N number of inputs
            int x = input.nextInt();
            Inputs.add(x);
        }
        for (int j = 0; j < N; j++) {//Creation of all the possible photos
            for (int k = j; k <= N; k++) {
                present = false;
                if (k != j) {
                    photo = Inputs.subList(j, k);
                    double sum = 0;
                    for (int x = 0; x < photo.size(); x++) {
                        sum = sum + photo.get(x);

                    }
                    double averageFlower = sum/photo.size();
                    for(int z = 0; z < photo.size(); z++){
                        if(averageFlower == photo.get(z) && !present){
                            times += 1;
                            present = true;
                        }
                    }


                }


            }

        }
        System.out.println(times);
    }
}
