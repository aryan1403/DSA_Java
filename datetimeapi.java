import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class datetimeapi {
    public static void main(String[] args) {
        // Java 8
        /* System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now().getDayOfWeek()); */
        // date ? after 1 month 10 day
        // System.out.println(LocalDate.now().plusDays(10).plusMonths(1).plusWeeks(3));
        // System.out.println(LocalDate.now().minusDays(20));
        // remove saturday and sunday
        LocalDate.now()
            .datesUntil(LocalDate.of(2024, 6, 23))
            .filter(date -> !date.getDayOfWeek().toString().equals("SATURDAY")
                && !date.getDayOfWeek().toString().equals("SUNDAY"))
            .forEach(date -> System.out.println(date + ", " + date.getDayOfWeek()));
    }
}
