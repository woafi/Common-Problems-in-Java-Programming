import java.util.*;
class count_theDigitOfInteger {
  public static void main(String[] args) {
    int num = 2133;
    int count = 0;

    // Handle the case where num is 0
    if (num == 0) {
        count = 1;
    } else {
        // Count the number of digits
        while (num != 0) {
            num = num / 10;
            count++;
        }
    }

    System.out.println("Number of digits: " + count);
}
}