public class Test {
    public static void main(String[] args) {
        char[] rus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        Transliterator t = new Transliterator(rus, eng);
        System.out.println(t.translateOneSymbol('я'));
        System.out.println(t.translateOneSymbol('$'));
        System.out.println(t.translate("экзамен"));
        System.out.println(t.translate("виктория"));


        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] texts = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        Transliterator d = new Transliterator(nums, texts);
        System.out.println(d.translate("1234"));
        System.out.println(t.translateOneSymbol('9'));
        System.out.println(d.translate("13434344"));

        System.out.println(t.translateOneSymbol('Р')); // R
        System.out.println(t.translateOneSymbol('Я')); // Ia
        System.out.println(t.translateOneSymbol('Ь'));
        System.out.println(t.translate("Виктория"));
        System.out.println(t.translate("Яблоко")); // Iabloko
        System.out.println(t.translate("ПАРАШЮТ")); // PARAShIuT




    }

}
