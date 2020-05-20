package strings;

public class main {
    public static void main(String[] args) {
        String text = "The simple text string";

        boolean empty = text.isEmpty(); // false

        String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"

        boolean startsWith = textInUpperCase.startsWith("THE"); // true

        /* replace all whitespaces with empty strings */
        String noWhitespaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"

        String textWithWhitespaces = "\t text with whitespaces   !\n  \t";

        String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"

        String str = "a simple string";

        str = str.replace("a", "A SIMPLE").substring(2, 8);
        System.out.println(str);
    }

}
