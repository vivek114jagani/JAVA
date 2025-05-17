package Basics;

public class Linearsearch {
    public static void main(String[] args) {


        int[] arr = new int[]{2, 4, 6, 8, 9};
        int item = 25;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println("item is presented");
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("item not presented");
        }
    }

//    public static void main(String[] args) {
//        int[] arr = new int[]{2, 5, 7, 6, 8, 9};
//        int item = 7;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == item) {
//                System.out.println(arr[i]);
//            }
//        }
//    }
}



