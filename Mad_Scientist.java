/*
ID:PG0611
LANG:JAVA
TASK:Mad Scientist
 */
import java.io.*;
import java.util.*;
public class Mad_Scientist {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("breedflip.in"));
        PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));
        ArrayList<Character> expectedOrder = new ArrayList<>();
        ArrayList<Character> receivedOrder = new ArrayList<>();
        int moves = 0;
        boolean missed = false;
        int N = input.nextInt();
        String expected = input.next();
        String received = input.next();
        if (expected != received) {
            for (int i = 0; i < N; i++) {
                expectedOrder.add(expected.charAt(i));
                receivedOrder.add(received.charAt(i));
            }


        }
        for (int j = 0; j < N; j++) {
            if (expectedOrder.get(j) != receivedOrder.get(j)) {
                if (!missed) {
                    missed = true;
                    moves += 1;
                }


            }else{
                missed = false;
            }
        }
        print.println(moves);
        print.close();
    }
}





