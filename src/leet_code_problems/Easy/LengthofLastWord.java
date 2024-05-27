package leet_code_problems.Easy;

public class LengthofLastWord {
    public static void main(String[] args) {
        LengthofLastWord lengthofLastWord = new LengthofLastWord();

        // Example 1
        String s1 = "Hello World";
        int result1 = lengthofLastWord.lengthOfLastWord(s1);    // result1 = 5
        System.out.println("Output for Example 1: " + result1); // Expected output: 5

//        // Example 2
//        String s2 = "   fly me   to   the moon  ";
//        int result2 = lengthofLastWord.lengthOfLastWord(s2);
//        System.out.println("Output for Example 2: " + result2); // Expected output: 4
//
//        // Example 3
//        String s3 = "luffy is still joyboy";
//        int result3 = lengthofLastWord.lengthOfLastWord(s3);
//        System.out.println("Output for Example 3: " + result3); // Expected output: 6
    }

    public int lengthOfLastWord(String s) {

        // s = Hello World
        // i = s.length()-1  ==  10
        int i = s.length() - 1;     // 10[d]   //9[l]   // 8[r]   // 7[o]   // 6[W]   // 5[ ]
        int length = 0;     // 0    // 1    // 2    // 3    // 4    // 5

        // 1) i=10[d] >= 0  ==  true  &&  s.charAt(10[d])==' '  ==  false     => false
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 1) i=10[d] >= 0  == true  &&  s.charAt(10[d])!=' '  ==  true       => true
        // 2) i=9[l] >= 0  == true  &&  s.charAt(9[l])!=' '  ==  true       => true
        // 3) i=8[r] >= 0  == true  &&  s.charAt(8[r])!=' '  ==  true       => true
        // 4) i=7[o] >= 0  == true  &&  s.charAt(7[o])!=' '  ==  true       => true
        // 5) i=6[W] >= 0  == true  &&  s.charAt(6[W])!=' '  ==  true       => true
        // 6) i=5[ ] >= 0  == true  &&  s.charAt(5[ ])!=' '  ==  false       => false
        while (i >= 0 && s.charAt(i) != ' ') {

            // 1) length++  ==  0+1=1
            // 2) length++  ==  1+1=2
            // 3) length++  ==  2+1=3
            // 4) length++  ==  3+1=4
            // 5) length++  ==  4+1=5
            length++;

            // 1) i--  ==  10-1=9
            // 2) i--  ==  9-1=8
            // 3) i--  ==  8-1=7
            // 4) i--  ==  7-1=6
            // 5) i--  ==  6-1=5
            i--;
        }

        // length = 5
        return length;
    }
}
