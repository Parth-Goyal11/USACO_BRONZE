/*
ID:PG0611
LANG:JAVA
TASK: Even More Odd Photos
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class EvenMoreOddPhotos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> test = new ArrayList<String>();
        int n = input.nextInt();
        int evens = 0;
        int odds = 0;
        int groups = 0;
        for (int i = 0; i < n; i++) {
            String B = input.next();
            test.add(B);

        }
        Collections.sort(test);
        for (int x = 0; x < test.size(); x++) {
            int testInt = Integer.parseInt(test.get(x));
            if (testInt % 2 == 0) {
                evens += 1;
            } else {
                odds += 1;
            }
        }
        int extraEvens = evens - odds;
        int extraOdds = odds - evens;
        if (evens > odds + 1) {
            groups += test.size() - extraEvens;
        } else if (odds > evens) {
            if (extraOdds % 2 == 0) {
                groups += test.size() - extraOdds / 2;
            } else if(extraOdds == n){
                extraOdds += 1;
                groups += Math.round(test.size() - extraOdds/2);
            }else{
                groups += Math.round(test.size() - extraOdds/2);
            }

        } else {
            groups += test.size();
        }
        System.out.println(groups);

    }
}