import java.io.IOException;
import java.io.File;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IOTasks {
    public static void main(String[] args) throws IOException {
        Task1(new File("number.txt"));
        Task2(new File("for_str.txt"), new String[]{"run", "play", "stay"});
        Task3(new File("file_in.txt"), new File("file_out.txt"));
    }

    public static void Task1(File file) throws IOException {
        Scanner in = new Scanner(file);
        int sum = 0;
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                int s1 = in.nextInt();
                sum = sum + s1;
            } else {
                in.next();
            }
        }
        in.close();
        System.out.println(sum);

    }

    public static void Task2(File file, String[] str) throws IOException {
        try {
            PrintStream ps1 = new PrintStream(file, StandardCharsets.UTF_8);
            for (String line : str) {
                ps1.println(line);
            }
        } catch (IOException e) {
            System.out.print("Error: " + e);
        }
    }

    public static void Task3(File f_in, File f_out) throws IOException {
        try {
            Scanner in = new Scanner(f_in);
            PrintStream ps1 = new PrintStream(f_out, StandardCharsets.UTF_8);
            int k = 0;
            String str_1 = in.next();
            str_1 = str_1.substring(0, 1).toUpperCase() + str_1.substring(1).toLowerCase();
            ps1.print(str_1 + " ");

            while (in.hasNext()) {
                String str = in.next().toLowerCase();
                char c = str.charAt(str.length() - 1);
                if (k == 1) {
                    str = str.substring(0, 1).toUpperCase() + str.substring(1);
                    k = 0;
                }
                if (c == "!".charAt(0) || c == "?".charAt(0) || c == ".".charAt(0))
                    k = 1;
                ps1.print(str + " ");
            }
        } catch (IOException e) {
            System.out.print("Error: " + e);
        }
    }

}


