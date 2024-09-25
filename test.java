// Woafi
import java.io.*;
import java.util.*;

// Typedef-like helpers for common data types
static class Typedefs {
    public static int[] vi(int size) {
        return new int[size];
    }
    public static long[] vl(int size) {
        return new long[size];
    }
    public static Pair<Integer, Integer> pii(int a, int b) {
        return new Pair<>(a, b);
    }
    public static Pair<Double, Double> pdd(double a, double b) {
        return new Pair<>(a, b);
    }
}

// Custom Pair class
static class Pair<A, B> {
    public A first;
    public B second;
    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

// Utility class for optimization and debugging
static class Utils {
    public static void optimize() {
        System.setOut(new PrintWriter(new BufferedOutputStream(System.out)));
    }
    public static void debug(Object x) {
        System.err.println("DEBUG: " + x);
    }
    public static <T> void debugArray(T[] arr) {
        System.err.println("DEBUG: " + Arrays.toString(arr));
    }
}

public class test {
    public static void main(String[] args) throws Exception {
        Utils.optimize();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // Code starts here
        System.out.println("hello world");

        System.out.flush();
    }
}