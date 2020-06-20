import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Transliterator {
    private final char[] in;
    private final String[] out;

    public Transliterator(char[] rus, String[] eng) {
        this.in = rus;
        this.out = eng;
    }

    public static Transliterator createICAO_DOC_9303() {
        char[] rus =  {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r","s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        return new Transliterator(rus, eng);
    }


    public String translateOneSymbol(char c) {
        int k = in.length;
        for (int i = 0; i < k; i++) {
            if ( in[i] == Character.toLowerCase(c)) {
                if (Character.isUpperCase(c)) {
                    if (out[i].length() > 0) {
                        return out[i].substring(0, 1).toUpperCase() + out[i].substring(1);
                    }
                }
                return out[i];
            }
        }
        return String.valueOf(c);
    }

    public String translate(String str) {
        int n = str.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            String tr = translateOneSymbol(ch);
            res = res + tr;
        }
        return res;
    }

    public void translateFile( String s1, String s2) throws IOException {
        try {
            PrintStream ps1 = new PrintStream(new File(s2), "utf8");
            String content = Files.readString(Paths.get(s1));
            ps1.println(translate(content));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
