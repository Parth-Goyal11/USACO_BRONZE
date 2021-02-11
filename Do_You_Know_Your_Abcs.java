/*
ID:PG0611
LANG:JAVA
Task: Do You Know your ABCs
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Do_You_Know_Your_Abcs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> IntInput = new ArrayList<Integer>();
        String s[] = input.nextLine().split(" ");
        for(int i = 0; i<7; i++){
            IntInput.add(Integer.parseInt(s[i]));
        }
        Collections.sort(IntInput);
        int A = IntInput.get(0);
        int B = IntInput.get(1);
        int ABC = IntInput.get(6);
        int C = ABC - A - B;
        System.out.println(A + " " + B + " " + C);
    }
}
//Solved