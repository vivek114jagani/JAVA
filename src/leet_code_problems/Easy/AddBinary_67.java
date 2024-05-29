package leet_code_problems.Easy;

// https://leetcode.com/problems/add-binary/

public class AddBinary_67 {
    public static void main(String[] args) {

        AddBinary_67 addBinary = new AddBinary_67();

        // Example 1 :-
        String a1 = "11";
        String b1 = "1";
        System.out.println(addBinary.addBinary(a1, b1));    // "100"

//        // Example 2 :-
//        String a2 = "1010";
//        String b2 = "1011";
//        System.out.println(addBinary.addBinary(a2, b2));
    }

    public String addBinary(String a, String b) {

        // 1) a = "11"  b = "1"

        StringBuilder result = new StringBuilder();

        // 1) i=a.length()-1 = 1
        int i = a.length() - 1;

        // 1) j=b.length()-1 = 0
        int j = b.length() - 1;

        // 1) carry = 0
        int carry = 0;

        // 1) i=1>=0  ==  true || j=0>=0  ==  true || carry=0>0  == false   == true
        // 2) i=0>=0  ==  true || j=-1>=0  ==  false || carry=1>0  == true   == true
        // 3) i=-1>=0  ==  false || j=-1>=0  ==  false || carry=1>0  == true   == true
        while(i >= 0 || j >= 0 || carry > 0) {

            // 1) sum=carry=0  ==  0
            // 2) sum=carry=1  ==  1
            // 3) sum=carry=1  ==  1
            int sum = carry;

            // 1) i=1 >= 0  ==  true
            // 2) i=0 >= 0  ==  true
            // 3) i=-1 >= 0  ==  false
            if(i >= 0) {

                // 1) sum=0 + a.charAt(1)='1' - '0'  ==  1
                // 2) sum=1 + a.charAt(0)='1' - '0'  ==  2
                sum += a.charAt(i) - '0';

                // 1) i-- = 1-1  ==  i=0
                // 2) i-- = 0-1  ==  i=-1
                i--;
            }

            // 1) j=0 >= 0  ==  true
            // 2) j=-1 >= 0  ==  false
            if(j >= 0) {

                // 1) sum=1 + b.carAt(0)='1' - '0'  ==  2
                sum += b.charAt(j) - '0';

                // 1) j-- = 0-1  ==  j=-1
                j--;
            }

            // 1) sum=2/2 = 1  ==  carry=1
            // 2) sum=2/2 = 1  ==  carry=1
            // 3) sum=1/2 = 1  ==  carry=0
            carry = sum / 2;

            // 1) sum=2 % 2  ==  0  ==  result="0"
            // 2) sum=2 % 2  ==  0  ==  result="00"
            // 3) sum=1 % 2  ==  0  ==  result="001"
            result.append(sum % 2);
        }

        // return "001".reverse()  ==  "100".toString()
        return result.reverse().toString();
    }
}
