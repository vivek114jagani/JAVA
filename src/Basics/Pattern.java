package Basics;

public class Pattern {
    public static void main(String[] args) {
        p13(5);
    }

    /*P1.
    * 1
    * 1 2
    * 1 2 3
    * 1 2 3 4
    * 1 2 3 4 5
    */
    public static void p1(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    /*P2.
    *  * * * * *
    *  * * * *
    *  * * *
    *  * *
    *  *
    */
    public static void p2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    /*P3.
    *  * * * * *
    *  *       *
    *  *       *
    *  *       *
    *  * * * * *
    */
    public static void p3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    /*P4.
    * 1 2 3 4 5
    * 1 2 3 4
    * 1 2 3
    * 1 2
    * 1
    */
    public static void p4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    /*P5.
    *      *
    *     * *
    *    * * *
    *   * * * *
    *  * * * * *
    */
    public static void p5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    /*P6.
    * 5 4 3 2 1
    * 4 3 2 1
    * 3 2 1
    * 2 1
    * 1
    */
    public static void p6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*P7.
    *  * * * * *
    *    * * * *
    *      * * *
    *        * *
    *          *
    */
    public static void p7(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    /*P8.
    *  * * * * *
    *   * * * *
    *    * * *
    *     * *
    *      *
    */
    public static void p8(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
/*P9.
*  * * * * *
*   * * * * *
*    * * * * *
*     * * * * *
*      * * * * *
*/
    public static void p9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s <= n - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    /*P10.
    *  * * * * *
    *   * * * *
    *    * * *
    *     * *
    *      *
    *     * *
    *    * * *
    *   * * * *
    *  * * * * *
    */
    public static void p10(int n) {
        for (int i = 1, c = 1; i <= (2 * n) - 1; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - c + 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
            if (i >= n) {
                c--;
            } else {
                c++;
            }
        }

    }

    /*P11.
     *  * * * * *
     *   *       *
     *    *       *
     *     *       *
     *      * * * * *
     */
    public static void p11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*P12.
     *      *
     *     * *
     *    *   *
     *   *     *
     *  * * * * *
     */
    public static void p12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || i == n || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*P13.
    * 1
    * 0 1
    * 1 0 1
    * 0 1 0 1
    * 1 0 1 0 1
    */
    public static void p13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");

                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
