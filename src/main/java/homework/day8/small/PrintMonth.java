package src.main.java.homework.day8.small;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PrintMonth {

    //Написать метод, который выводит следующий месяц от заданного во входном параметре.
    // Входной параметр ввести с клавиатуры.
    public static void printMonth() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите название месяца: ");
        String incoming = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("MMMM", new Locale("ru"));
        Date date = format.parse(incoming);
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        System.out.println();
        calendar.setTime(date);

        if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER) {
            calendar.set(Calendar.MONTH, Calendar.JANUARY);
            calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) + 1);
        } else {
            calendar.roll(Calendar.MONTH, true);
        }
        System.out.println(calendar.get(Calendar.MONTH));
    }
}
