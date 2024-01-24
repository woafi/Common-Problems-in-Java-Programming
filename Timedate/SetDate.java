
import java.util.Calendar;  
public class SetDate {  
   public static void main(String[] args) {  
      // create a calendar object mycalobj  
      Calendar mycalobj =  Calendar.getInstance();
      System.out.println("Today  :" + mycalobj.getTime()); 
      System.out.println("Year  :" + mycalobj.get(Calendar.YEAR));
      System.out.println("Month :" + mycalobj.get(Calendar.MONTH));  
      System.out.println("Day  :" + mycalobj.get(Calendar.DAY_OF_WEEK));  
      // set the year,month and day   
      // mycalobj.set(2023, 11, 22, 10, 15, 20);
      mycalobj.set(2022, 12 - 1, 22);
      System.out.println("Now Today  :" + mycalobj.getTime());  
      System.out.println("Now Year  :" + mycalobj.get(Calendar.YEAR));  
      System.out.println("Now Month :" + (mycalobj.get(Calendar.MONTH)+1));
      System.out.println("Now Day  :" + mycalobj.get(Calendar.DAY_OF_WEEK)); 
      System.out.println("DAY: "+ mycalobj.getActualMaximum(Calendar.DAY_OF_MONTH)); 
      System.out.println("Now Week  :" + mycalobj.get(Calendar.DAY_OF_WEEK));
      String[] dayofweek = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
      int p = mycalobj.get(Calendar.DAY_OF_WEEK);
      System.out.println(dayofweek[p-1]);
   }  
   
}  