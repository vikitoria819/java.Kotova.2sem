import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static boolean mail(String s){
        String[] b = s.split(" ");
        for (String m : b) {
            if (m.matches("([a-z]|\\.|-|_)*@([a-z]|\\.|-|_)*\\.[a-z]{2,4}")) {
                return true;
            }
        }
        return false;
    }

    public static String rus(String s) {
        return s.replaceAll("(\\s*)(,)", ",");
    }

    public static String swap(String s) {
        return s.replaceAll("([а-яА-ЯёЁ]+)-([а-яА-ЯёЁ]+)", "$2-$1");
    }

    public static int cat(String s) {
        Pattern p = Pattern.compile("([а-яА-ЯёЁ]*)кот([а-яА-ЯёЁ]*)",
                Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(s);
        int n = 0;
        while (m.find()) {
            n++;
        }
        return n;
    }

    public static void files(String file_1, String file_2) {
        Pattern p = Pattern.compile("\\d+");
        try {
            String s = Files.readString(Paths.get(file_1), StandardCharsets.UTF_8);
            Matcher m = p.matcher(s);
            while (m.find()) {
                int n = Integer.parseInt(m.group(0)) + 1;
                s = s.substring(0, m.start()) + n + s.substring(m.end());
            }
            Files.writeString(Paths.get(file_2), s, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(mail("dfgukdfh dfuhydfih dfughudaifgh vi_@mail.ru"));
        System.out.println(rus("Это строка , у которой зачем-то написаны два пробела перед запятой"));
        System.out.println(swap("Какая-то сине-зеленовая трава"));
        System.out.println(cat("Это строка , у которой зачем-то котнаписаны дКОтва пркотобела перед запятой"));
        files("regular_in.txt", "regular_out.txt");
    }
}
