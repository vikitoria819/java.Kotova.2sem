public class Transliterator {
    public static void main(String[] args) {
        char[] rus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        Transliterator t = new Transliterator(rus, eng);

        System.out.println(t.translateOneSymbol('я'));
        System.out.println(t.translateOneSymbol('$'));
        System.out.println(t.translate("экзамен"));
        System.out.println(t.translate("виктория"));
    }

    private final char[] in;
    private final String[] out;

    public Transliterator(char[] rus, String[] eng) {
        this.in = rus;
        this.out = eng;
    }

    public String translateOneSymbol(char c) {
        int k = in.length;
        for (int i = 0; i < k; i++) {
            if (c == in[i]) {
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
            res = res + translateOneSymbol(ch);
        }
        return res;
    }

}
