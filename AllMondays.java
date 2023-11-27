import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AllMondays {
    public static void main(String[] args) {
        String s = "2022-11-27";
        String e = "2020-12-22";
        LocalDate start = LocalDate.parse(s);
        LocalDate end = LocalDate.parse(e);
        List<LocalDate> totalDates = new ArrayList<>();

        LocalDate nextMonday = start;
        int daysToAdvance = 1;
        while (!nextMonday.isAfter(end)) {
            if (nextMonday.getDayOfWeek() == DayOfWeek.MONDAY) {
                daysToAdvance = 7;
                totalDates.add(nextMonday);
            }
            nextMonday = nextMonday.plusDays(daysToAdvance);
        }
        System.out.println(totalDates);
    }
}