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

}
