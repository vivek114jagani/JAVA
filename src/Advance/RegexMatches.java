package Advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    private static final String regex = "foo";
    private static final String input = "fooooooooooooooooo";
    private static Pattern pattern2;
    private static Matcher matcher;

    private static final String regex1 = "dog";
    private static String input1 = "The dog says meow. " + "All dogs say meow.";
    private static final String replace = "cat";

    private static final String regex2 = "a*b";
    private static final String input2 = "aabfooaabfooabfoob";
    private static final String replace1 = "-";

    public static void main(String[] args) {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(line);

        if (m.find()) {
            System.out.println("Found Value: " + m.group(0));
            System.out.println("Found Value: " + m.group(1));
            System.out.println("Found Value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }

        System.out.println("------------------------------------------------------------------------------");

        Pattern pattern1 = Pattern.compile(REGEX);
        Matcher matcher1 = pattern1.matcher(INPUT);
        int count = 0;

        while (matcher1.find()) {
            count++;
            System.out.println("Matcher Number: " + count);
            System.out.println("start(): " + matcher1.start());
            System.out.println("end(): " + matcher1.end());
        }

        System.out.println("------------------------------------------------------------------------------");

        pattern2 = Pattern.compile(regex);
        matcher = pattern2.matcher(input);

        System.out.println("Current REGEX is: "+ regex);
        System.out.println("Current INPUT is: "+ input);

        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());

        System.out.println("------------------------------------------------------------------------------");

        Pattern pattern3 = Pattern.compile(regex1);
        Matcher matcher2 = pattern3.matcher(input1);
        input1 = matcher2.replaceAll(replace);
        System.out.println(input1);

        System.out.println("------------------------------------------------------------------------------");

        Pattern pattern4 = Pattern.compile(regex2);
        Matcher matcher3 = pattern4.matcher(input2);
        StringBuffer sb = new StringBuffer();

        while (matcher3.find()) {
            matcher3.appendReplacement(sb, replace1);
        }
        matcher3.appendTail(sb);

        System.out.println(sb);
    }
}
