package Date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo {

    public static void datePractice() {

        // Return The Current Date Only : 2024-08-12
        LocalDate today = LocalDate.now();
//        System.out.println(today);

        // Return Time Without date or Timezone
        LocalTime l1 = LocalTime.now();
//        System.out.println(l1);

        // return and combine the date and time without timezone Information
        LocalDateTime l2 = LocalDateTime.now();
//        System.out.println(l2);

        // return date-time with the timezone information

        ZonedDateTime z1 = ZonedDateTime.now();
//        System.out.println(z1);

        // return the Current timeline or timestamps
        Instant i1 = Instant.now();
//        System.out.println(i1);
    }

    public static void MostusedDate() {

        // creating a Specific Date
        LocalDate dob = LocalDate.of(2024, 05, 22);
//        System.out.println(dob);

        //Creating a Specific Time

        LocalTime time = LocalTime.of(12, 34);
//        System.out.println(l4);

        // ** Manupulating Dates And Times** //

        //Adding 5 Days to a Date
//        LocalDate fiveDaysLater = dob.plusDays(5);
//        System.out.println(fiveDaysLater);

        // Moving a Meeting time by 2 hours
//        LocalTime l2 = l4.minusHours(3);
//        System.out.println(l2);

        // ** Querying LocalDate and LocalTime

        // dob
//        System.out.println(dob.getYear()); // getyear
//        System.out.println(dob.getMonth()); // getmonth
//        System.out.println(dob.getDayOfMonth()); // Day of Month
//        System.out.println(dob.getDayOfWeek()); // Day of week

        // time
//        System.out.println(time.getHour());
//        System.out.println(time.getMinute());


        // ** Querying LocalDate and LocalTime **


        // Finding the Date Diffrence
        Period getMyDObUpdate = Period.between(LocalDate.now(), dob);
        // diffrence output
//        System.out.println(getMyDObUpdate.getMonths());
//        System.out.println(getMyDObUpdate.getYears());
//        System.out.println(getMyDObUpdate.getDays());
//

        // Findingf the Time Diffrece using Duration

        Duration d1 = Duration.between(LocalTime.now(), time);
        // Diffrece Output between time
//        System.out.println(d1);
//        System.out.println(d1.getSeconds());
//        System.out.println(d1.getNano());

    }

    public static void customDateFormating() {

        // Predefined Formatter
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println("Current Date [Short Format] : " + LocalDate.now().format(shortDateTime));

        // custom Formatter

        DateTimeFormatter customtimeFormat = DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm:ss");
//        System.out.println("Formatted with Custom Pattern : " + LocalDateTime.now().format(customtimeFormat));
    }

    public static void timeZone() {

        Calendar c1 = Calendar.getInstance();
        TimeZone tz = c1.getTimeZone();
        System.out.println(tz.getDisplayName());
        System.out.println(tz);

    }


    public static void main(String[] args) {

//        MostusedDate();
//        datePractice();
//        customDateFormating();
        timeZone();

    }
}
