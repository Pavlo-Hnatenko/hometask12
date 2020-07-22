import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LocalDateTime date1 = LocalDateTime.of(2020, Month.DECEMBER, 20, 21, 15, 45);
        LocalDateTime date2 = LocalDateTime.of(2020, Month.JULY, 5, 17, 30, 40);
        LocalDateTime date3 = LocalDateTime.of(2020, Month.MARCH, 18, 9, 15, 5);
        LocalDateTime date4 = LocalDateTime.of(2020, Month.SEPTEMBER, 18, 15, 25, 45);
        LocalDateTime date5 = LocalDateTime.of(2020, Month.JULY, 20, 2, 11, 20);
        List<LocalDateTime> list = new ArrayList<>(Arrays.asList(date1, date2, date3, date4, date5));

        System.out.println("The list of sorted dates: " + LocalDateTimeMapper.getDatesMap(list) + "\n");

        System.out.println("The biggest duration between two days from the list is equals to "
                + MaxDurationFinder.getMaxDuration(list).toDays() + " days, "
                + (MaxDurationFinder.getMaxDuration(list).toHours() % 24) + " hours, "
                + (MaxDurationFinder.getMaxDuration(list).toMinutes() % 60) + " minutes and "
                + (MaxDurationFinder.getMaxDuration(list).toSeconds() % 60) + " seconds.");

    }
}
