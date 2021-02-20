import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class Word_Processor {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("word.in"));
        PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));
        String[] s = input.nextLine().split(" ");
        ArrayList<String> tes = new ArrayList<>();
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        String[] X = input.nextLine().split(" " );
        int sumLengths = 0;
        int iterations = 0;


        for (int i = 0; i < N; i++) {
            sumLengths += X[i].length();
            iterations += 1;
            if (sumLengths <= K && iterations == 1) {
                String printing = "  " + X[i];
                print.print(printing.replaceFirst("  ", "" ));

            }else if(sumLengths > K){
                sumLengths = 0;
                print.println("");
                i = i - 1;
                iterations = 0;

            }else if(sumLengths <=K && iterations != 1){
                String printing = " " + X[i];
                print.print(printing);
            }


        }
        print.close();

    }
}