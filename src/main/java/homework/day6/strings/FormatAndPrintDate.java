package homework.day6.strings;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatAndPrintDate {

    /* метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020" и
выводит в консоль в формате "September, 7, 2020 22:00"*/
    public void formatAndPrintDate(String receivedDate) {
        Date date = new SimpleDateFormat("hh.mm dd.MM.yyyy").parse(receivedDate, new ParsePosition(0));
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM, dd, yyyy, HH:mm");
        String strDate = formatter.format(date);
        System.out.println(strDate);
    }
}
