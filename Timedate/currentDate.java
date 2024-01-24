import java.time.*;
public class currentDate {
    public static void main (String[] args){
        LocalDate obj = LocalDate.now();
        System.out.println(obj);
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
        LocalDateTime myObj1 = LocalDateTime.now();
        System.out.println(myObj1);
        System.out.println(obj.getDayOfWeek().name());
        
    }
    
}
