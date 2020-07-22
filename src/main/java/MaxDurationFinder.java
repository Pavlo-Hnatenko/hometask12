import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class MaxDurationFinder {

    public static Duration getMaxDuration(List<LocalDateTime> timeList){

        return timeList.stream()
                        .map(localDateTime -> Duration.between(
                        timeList.stream().min(LocalDateTime::compareTo).get(),
                        timeList.stream().max(LocalDateTime::compareTo).get()
        )).findFirst().get();
    }
}
