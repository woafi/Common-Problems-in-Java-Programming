import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        int uspayment = (int)payment;
        String us = "$"+Integer.toString(uspayment);
        
        System.out.println("US: " + us);
        /*System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);*/
    }
}