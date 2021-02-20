import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class Word_Processor {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("word.in"));
        PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));
        String[] s = input.nextLine().split(" "); //Store all the inputs in an array.
        ArrayList<String> tes = new ArrayList<>();
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        String[] X = input.nextLine().split(" " );
        int sumLengths = 0;
        int iterations = 0;


        for (int i = 0; i < N; i++) {
            sumLengths += X[i].length();    //Add together the length of each index of the array.
            iterations += 1;
            if (sumLengths <= K && iterations == 1) { //If the length is <= K, and it is the first word in the line, print the word but replace the space at the beginning with nothing.
                String printing = "  " + X[i];
                print.print(printing.replaceFirst("  ", "" ));

            }else if(sumLengths > K){        //If the sum of the lengths is greater than K, than reset the sumLengths variable to 0, go to a new line, decrement i by 1
                sumLengths = 0;              //If you dont decrement i by 1 it wont print the word that made it go over K.
                print.println("");           //Set iterations to 0, so you can print the first word in that line without a space again.
                i = i - 1;
                iterations = 0;

            }else if(sumLengths <=K && iterations != 1){     //If the sum of the lengths is <= K, but the iterations is no equal to 1, meaning it is not the first word in the line,
                String printing = " " + X[i];                //print it with a space before
                print.print(printing);
            }


        }
        print.close();

    }
}
