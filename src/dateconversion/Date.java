package dateconversion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date{
    public static void main(String[] args) {
        String time1 = "2024-02-28";
        String time2 = "02-28-2024";
        String time3 = "2024/02/28";


        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("EEE dd MMM");

        // Convert and print time1
        LocalDate date1 = LocalDate.parse(time1);
        System.out.println("Converted time1: " + date1.format(outputFormat));

        // Convert and print time2
        LocalDate date2 = LocalDate.parse(time2, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Converted time2: " + date2.format(outputFormat));

        // Convert and print time3
        LocalDate date3 = LocalDate.parse(time3, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Converted time3: " + date3.format(outputFormat));
    }
}

