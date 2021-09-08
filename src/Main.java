import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDateTime startLectionMondey = LocalDateTime.of(2021, Month.AUGUST,2, 20, 00);
        LocalDateTime finishLectionSaturday = LocalDateTime.of(2021, Month.AUGUST, 7, 16, 00);

        exercise1(startLectionMondey, finishLectionSaturday);


        LocalDateTime finishLectionMondey = LocalDateTime.of(2021, Month.AUGUST,2, 22, 00);

        exercise2(startLectionMondey, finishLectionMondey);


        String date = "1999/июн./18 07:34:56 PM";

        exercise3(date);

        LocalDateTime localDateTime = LocalDateTime.now();

        exercise4(localDateTime);
    }

    public static void exercise1(LocalDateTime startLectionMondey, LocalDateTime finishLectionSaturday){

        Duration duration = Duration.between(startLectionMondey, finishLectionSaturday);

        System.out.println("Между лекциями прошло " + duration.toDays() + " дней");
        System.out.println("Между лекциями прошло " + duration.toHours() + " часов");
        System.out.println("Между лекциями прошло " + duration.toMinutes() + " минут");
        System.out.println("Между лекциями прошло " + duration.toSeconds() + " секунд");

    }

    public static void exercise2(LocalDateTime startLection, LocalDateTime finishLection){

        Duration duration = Duration.between(startLection, finishLection);

        System.out.println("Количество минут " + duration.toMinutes());
        System.out.println("Количество секунд " + duration.toSeconds());

    }

    public static void exercise3(String str){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd h:mm:ss a");

        LocalDateTime localDateTimeParser = LocalDateTime.parse(str, dateTimeFormatter);

        System.out.println(localDateTimeParser);

    }

    public static void exercise4(LocalDateTime localDateTime){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm yyyy/dd/MM");

        String newDateForm = dateTimeFormatter.format(localDateTime);

        System.out.println(newDateForm);

    }

}
