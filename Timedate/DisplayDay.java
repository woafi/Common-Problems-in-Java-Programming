import java.time.*;

public class DisplayDay {
    public static void main(String[] args) {

        String dateString = "2024-01-26";
        LocalDate myDate = LocalDate.parse(dateString);
        System.out.println("My date: " + myDate);
        System.out.println(myDate.getDayOfWeek().name());

        String day="01", month = "05", year = "2024";
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        LocalDate obj = LocalDate.of(y,m,d);
        System.out.println(obj.getDayOfWeek().name());

        
    }    
}
