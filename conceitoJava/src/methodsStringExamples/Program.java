package methodsStringExamples;

public class Program {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "x");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        String phrase = "potato apple lemon";
        String[] array = phrase.split(" ");

        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(i);
        System.out.println(j);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


    }
}
