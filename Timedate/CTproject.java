import java.util.Calendar;
import java.util.*;
public class CTproject {
    public static int date(int year, int month, int date) {
        Calendar calendar= Calendar.getInstance(); 
        calendar.set(year, month - 1, date);
        int daysInMonth  = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //checking mon-wed
        int mon=0;
        int tues=0;
        int wed=0;
        for (int day = date; day <= daysInMonth; day++) {
            calendar.set(year, month - 1, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.MONDAY) {
                mon++;
            }
            if (dayOfWeek == Calendar.TUESDAY) {
                tues++;
            }
            if (dayOfWeek == Calendar.WEDNESDAY) {
                wed++;
            }
        }
        int sumOfCT=mon+tues+wed;
        return sumOfCT;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("Year: ");
            int year=sc.nextInt();
            System.out.print("Month: ");
            int month=sc.nextInt();
            System.out.print("Date: ");
            int date=sc.nextInt();
            //function call
            System.out.println("The Number of CT: "+ date(year, month, date));
    
    }
}
