import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class LocalDateTimeMapper {

    public static Map<LocalDate, Set<LocalTime>> getDatesMap(List<LocalDateTime> timeList) {

        return timeList.stream()
                .sorted(Comparator.comparing(LocalDateTime::toLocalDate))
                .collect(Collectors.groupingBy(LocalDateTime::toLocalDate,TreeMap::new,
                         Collectors.mapping(LocalDateTime::toLocalTime, Collectors.toSet())));

    }
}
