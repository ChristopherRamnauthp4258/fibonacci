/**
 * Returns a number that is to be printed on the screen.
 * The url argument must specify an absolute <a href="#{@link}">{@link URL}</a>.
 * The name
 * argument is a specifier that is relative to the url argument.
 * <p>
 * This method returns a fibonacci number immediately,
 * The conditions is executed to determine the fibonacci of n number
 * 
 * @param url an absolute URL giving the base location of the number
 * @return the fibonacci number at the specified URL
 * @see the number
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int y = fibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + y + ".");
    }

    // The fibonacci function to calculate the fibonacci of the 10th number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // The function later returns the fibonacci of a number and prints it on the
        // screen
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}