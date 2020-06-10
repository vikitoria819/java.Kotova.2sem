import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FastRead {
    public static void Task4(File f) throws IOException, InterruptedException {
        Scanner in = new Scanner(f);
        while (in.hasNext()) {
            String s = in.next();
            System.out.print('\r');
            System.out.print(s);
            System.out.flush();
            char c = s.charAt(s.length()-1);

            if (c == "!".charAt(0) || c == "?".charAt(0) || c == ".".charAt(0) || c == ",".charAt(0))
                Thread.sleep(2000);
            else {
                Thread.sleep(800);
            }

        }
        in.close();
    }

    public static void main(String[] args)  throws IOException, InterruptedException {
        Task4(new File("Task4.txt"));
    }
}

