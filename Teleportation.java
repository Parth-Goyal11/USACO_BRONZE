/*
ID:PG0611
LANG:JAVA
TASK:Teleportation
 */
import java.io.*;
import java.util.*;
public class Teleportation{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("teleport.in"));
        PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
        ArrayList<Integer> inputs = new ArrayList<>();
        ArrayList<Integer> TeleportPoints = new ArrayList<>();
        String s[] = input.nextLine().split(" ");
        for(int i = 0; i<4; i++){
            inputs.add(Integer.parseInt(s[i]));
        }

        TeleportPoints.add(inputs.get(2));
        TeleportPoints.add(inputs.get(3));
        inputs.remove(2);
        inputs.remove(2);
        Collections.sort(TeleportPoints);
        Collections.sort(inputs);
        int StartDist = Math.abs(inputs.get(0) - TeleportPoints.get(0));
        int EndDist = Math.abs(inputs.get(1) - TeleportPoints.get(1));
        int withTeleport = StartDist + EndDist;
        int noTeleport = Math.abs(inputs.get(1) - inputs.get(0));
        print.println(Math.min(withTeleport, noTeleport));
        print.close();
    }
}