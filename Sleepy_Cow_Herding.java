/*
ID:PG0611
LANG:JAVA
TASK:Sleepy Cow Herding
 */

import java.util.*;
public class Sleepy_Cow_Herding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> IntNums = new ArrayList<Integer>();
        int minMoves = 0;
        int maxMoves = 0;
        String nums[] = input.nextLine().split(" ");
        for(int i =0; i<nums.length; i++){
            IntNums.add(Integer.parseInt(nums[i]));
        }
        Collections.sort(IntNums);
        int I1 = IntNums.get(0);
        int I2 = IntNums.get(1);
        int I3 = IntNums.get(2);
        if(I3 - I2 == 1 && I2 - I1 == 1){
            minMoves = 0;
            maxMoves = 0;
        }else if(I3 - I2 == 2 || I2 - I1 == 2){
            minMoves = 1;
        }else{
            minMoves = 2;
        }
        if(I3 - I2 > I2 - I1){
            I1 = I2 + 1;
            maxMoves = I3 - I1;
        }else{
            I3 = I1 + 1;
            maxMoves = I3 - I2;
        }
        System.out.println(minMoves);
        System.out.println(Math.abs(maxMoves));


        }



    }


