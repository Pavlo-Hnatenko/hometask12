import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class MaxDurationFinder {

    public static Duration getMaxDuration(List<LocalDateTime> timeList) {

        return timeList.stream()
                .map(localDateTime -> Duration.between(
                        timeList.stream().min(LocalDateTime::compareTo).orElse(LocalDateTime.MAX),
                        timeList.stream().max(LocalDateTime::compareTo).orElse(LocalDateTime.MAX)
                )).findFirst().orElse(Duration.ZERO);
    }
}
