public class Transliterator {
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
