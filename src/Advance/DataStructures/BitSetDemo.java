package Advance.DataStructures;

import java.util.BitSet;

/**The BitSet class implements a group of bits or flags that can be set and cleared individually.
 * <p>This class is very useful in cases where you need to keep up with a set of Boolean values;
 * you just assign a bit to each value and set or clear it as appropriate.
 * <p>The Java BitSet class creates a special type of array that holds bit values. The BitSet array can increase in size as needed.
 * This makes it similar to a vector of bits. This is a legacy class but it has been completely re-engineered in Java 2, version 1.4.
 * <p>The Java BitSet class implements a vector of bits that grows as needed.
 * <p>{@code Following are the important points about BitSet −}
 * <pre> {@code 1) A BitSet is not safe for multithreaded use without external synchronization.
 * 2) All bits in the set initially have the value false.
 * 3) Passing a null parameter to any of the methods in a BitSet will result in a NullPointerException.} </pre>
 * */

public class BitSetDemo {

    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // Set some bits.
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }

        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits.
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1" );
        System.out.println(bits2);

        // OR bits.
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1" );
        System.out.println(bits2);

        // XOR bits.
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1" );
        System.out.println(bits2);
    }
}
