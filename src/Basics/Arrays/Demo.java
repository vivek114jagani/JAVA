package Arrays;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // Demo
        int[] arr = new int[] {1,85,4,2,10,9,25,5};
        System.out.println(Arrays.toString(arr));

        // ------------------------------------------------------------------

        // Array as a List.
        // create an array of strings
        String a[] = new String[]{"abc","klm","xyz","pqr"};

        List<String> list = Arrays.asList(a);

        // printing the list
        System.out.println("The list is:" + list);

        // ------------------------------------------------------------------

        // Array Binary Search Method.
        // initializing unsorted byte array
        byte[] byteArr = new byte[] {10,20,15,22,35};

        // sorting array.
        Arrays.sort(byteArr);

        // print all elements available in list.
        System.out.println("sorted array is :- ");
        for (byte num:
             byteArr) {
            System.out.println("Number = " + num);
        }

        // entering value to be searched.
        byte search = 35;
        int retVal = Arrays.binarySearch(byteArr, search);
        System.out.println("Index of Element 35 is :- " + retVal);

        // ------------------------------------------------------------------

        // Array Compare Method.
        // initialize first boolean array
        boolean[] array1 = { false, false, true, true, false};

        // initialize second boolean array
        boolean[] array2 = { false, false, true, true, false};

        int result = Arrays.compare(array1, array2);

        if(result > 0) {
            System.out.println("First array is greater than second array.");
        } else if (result == 0) {
            System.out.println("Arrays are same.");
        } else {
            System.out.println("First array is less than second array.");
        }

        // ------------------------------------------------------------------

        // CopyOf Method.
        boolean[] boolArr = { false, false, true, true};

        System.out.print("Boolean Array: [");
        for (int i = 0; i < boolArr.length; i++) {
            System.out.print(boolArr[i] + " ");
        }

        System.out.print("]\nCopied Array: \n");

        // Create copy of the array of same size
        boolean[] boolArrCopy = Arrays.copyOf(boolArr, boolArr.length);

        System.out.print("Boolean Array: [");
        for (int i = 0; i < boolArrCopy.length; i++) {
            System.out.print(boolArrCopy[i] + " ");
        }
        System.out.print("]");
    }
}
