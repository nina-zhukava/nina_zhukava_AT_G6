package src.main.java.homework.day6.strings;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PrintCurrentDateStatic {

    /*1.5 написать метод, который выводит в консоль текущую дату и время в формате:
Сейчас на дворе: 19 сентября, 2020, 3 часа 13 минут*/
    public static void printCurrentDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, yyyy, HH часа mm минут", new Locale("ru"));
        String strDate = formatter.format(date);
        System.out.println("Cейчас на дворе: " + strDate);
    }
}
