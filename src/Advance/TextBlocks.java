package Advance;

/**Java made text blocks in {@code Java 15} as a standard feature to handle multiline strings like JSON/XML/HTML etc.
 * It was introduced in {@code Java 13} as a preview feature.<hr>
 *
 * {@systemProperty 1) Text Block allows to write multiline strings easily without using \r\n.}<p>
 * {@systemProperty 2) Text Block string have same methods as string (String class methods) like contains(), indexOf(), and length() functions.}
 *
 * <hr>Purpose of introducing text block is mainly to declare multi-line strings most efficiently.
 * Prior to text block, we can declare multi-line strings using string concatenation, string builder append method, string join method but that approach is quite messy.
 * As we have to use line terminators, delimiters etc to mark a new line.
 * Text block provides a better and alternate approach to define multiline string using a """, 3 double-quotes mark.<hr>
 * <h3>{@code Syntax:-} </h3>
 * <pre>{@code String textBlockJSON = """
 *    {
 *       "name" : "Mahesh",
 *       "RollNO" : "32"
 *    }
 *    """;}</pre>
 * Equivalent String can be written using older syntax as shown below:-
 * <pre>{@code String stringJSON = "{\r\n"
 *          + "   \"Name\" : \"Mahesh\",\r\n"
 *          + "   \"RollNO\" : \"32\"\r\n"
 *          + "}";  }</pre>
 * */

public class TextBlocks {
    public static void main(String[] args) {
        String stringJSON = "{\r\n"
                + "     \"Name\" : \"Mahesh\",\r\n"
                + "     \"rollNo\" : \"32\"\r\n"
                + "}";
        System.out.println("OLD:-");
        System.out.println(stringJSON);

        String textBlockJSON = """
                {
                    "name" : "Mahesh",
                    "rollNo" : "32"
                }
                """;
        System.out.println("NEW:-");
        System.out.println(textBlockJSON);

        System.out.println("-------------------------------------------------------------------");

        String nameJSON = "Vivek";
        String textBlockNameJSON = """
                Vivek""";

        // compare the content
        System.out.println(nameJSON.equals(textBlockNameJSON));
        // compare the objects
        System.out.println(nameJSON==textBlockNameJSON);

        // text block supports all string operations
        System.out.println("Contains: " + textBlockNameJSON.contains("Vivek"));
        System.out.println("indexOf: " + textBlockNameJSON.indexOf("Vivek"));
        System.out.println("Length: " + textBlockNameJSON.length());
    }
}
