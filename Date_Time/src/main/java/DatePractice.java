import org.omg.CORBA.LongLongSeqHelper;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DatePractice {

    public static void main(String... args) throws InterruptedException{


        Instant instant = Instant.now();
        System.out.println("instant is "+instant);

        LocalDate date = LocalDate.now();
        System.out.println("localdate is "+date);

        LocalTime time = LocalTime.now();
        System.out.println("time is "+time);

        List list = Arrays.asList(ZoneId.getAvailableZoneIds().toArray());
        //list.sort(e -> String::length);

        ZoneId zoneId = ZoneId.of("GMT");
        LocalDateTime localDateTime = LocalDateTime.now(zoneId);
        System.out.println("localdatatime is "+localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println("zoned date time is "+zonedDateTime);

        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(1990,07,05);

        Period p = Period.between(birth,today);
        System.out.println("now my age is "+p.getYears());




       // Thread.sleep(2000);

        Instant elapsed = Instant.now();

        Duration duration = Duration.between(instant,elapsed) ;
                                   duration.abs().getSeconds();
        System.out.println("elapsed time is "+duration.getSeconds());


        /*Formatting
         *
          *    LocalDate     <--    parse   <-- String
          *    LocalDate     -->    format  --> String
          *
          *
          * */





        LocalDate localDate1 = LocalDate.parse("2019-08-11");
        System.out.println("localdate1 = "+ localDate1);

        String dateString = localDate1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("dateString = "+ dateString);




        
/*
        LocalDate localDate = LocalDate.parse("2013-08-22");

        System.out.println("localDate is :- "+localDate);

        Date date = new Date();
        System.out.println("instant is :- "+date);

        LocalDateTime localDate1 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        LocalDateTime dateTimeZone = LocalDateTime.ofInstant(date.toInstant(),ZoneId.of("Europe/Paris"));

        System.out.println("locatedate1 "+localDate1);
        System.out.println("dateTImeZone "+dateTimeZone);

*/


    }
}
