

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {
        
        //Date :
        Date d = new Date ();
        DateFormat df = new SimpleDateFormat ("dd.MM.YYYY");
        System.out.println("Today's date is : "+df.format(d));
        
        //time :
        LocalTime t = LocalTime.now ();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("Time : "+ t.format(f));
        
    }
    
}
