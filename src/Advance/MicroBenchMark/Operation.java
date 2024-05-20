package Advance.MicroBenchMark;

/**{@code Benchmarking} is a technique to check the performance of the application or of a section of application code in terms of throughput, average time taken, etc.
 * In {@code Java benchmarking}, we check the performance of application code or of a library being used.
 * This {@code benchmarking} helps in identifying any bottleneck in our code in case of heavy load or to identify the performance degradation of the application.
 *
 * <p><h2>{@code Importance of Java Benchmarking}</h2><p>
 * Application performance is a very important attribute of any application.
 * Poorly written code can lead to an unresponsive application, and high memory usage which can lead to poor user experience and even render the application unusable.
 * In order to contain such issues, benchmarking an application is of utmost importance.<p>
 * A Java Developer should be able to find issues in an application and fix them using the benchmarking technique which can help identify the sluggish code.
 *
 * <p><h2>{@code Java Benchmarking Techniques}</h2><p>
 * There are multiple techniques that developers deploy in order to {@code benchmark} the application code, system, library, or any component. Following are a few of the important techniques.
 *
 * <p><h2>{@code Benchmarking Using Start/End Time}</h2><p>
 * This technique is easy and applicable on a small set of code, where we get the start time in nanoseconds before calling a code and then after executing the method, we again get the time.
 * This technique is simple but is not reliable as performance can vary based on many factors like garbage collectors in action, and any system process running during that time.
 * Here is the example of {@code Benchmark}
 *
 * <pre>{@code // get the start time
 * long startTime = System.nanoTime();
 * // execute the code to be benchmarked
 * long result = operations.timeTakingProcess();
 * // get the end time
 * long endTime = System.nanoTime();
 * // compute the time taken
 * long timeElapsed = endTime - startTime;}</pre>
 * */

public class Operation {
    public static void main(String[] args) {
        Operation operation = new Operation();

        // get the start time.
        long startTime = System.nanoTime();
        //execute the code to be benchmarked.
        long result = operation.timeTakingProcess();
        // get the end time.
        long endTime = System.nanoTime();
        // compute the time taken.
        long timeElapsed = endTime - startTime;

        System.out.println("Sum of 10,000 natural numbers:- " + result);
        System.out.println("Elapsed time: " + timeElapsed + " nanoseconds");
    }

    // get the sum of first 100,000 natural numbers
    public long timeTakingProcess() {
        long sum = 0;
        for(int i = 0; i < 100000; i++ ) {
            sum += i;
        }
        return sum;
    }
}
