package src.main.java.homework.day6.strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PrintGeneratedDateStatic {

    //    метод, который принимает на вход строку текста и выводит в консоль дату, которая на n дней больше,
//    чем текущая в формате "Сгенерированная гласная дата: 7 мая", где n - это количество гласных буков в получаемой строке
    public static void printGeneratedDate(String str) {
        String[] splitStr = str.trim().replace(" ", "").split("");
        int counter = 0;
        for (String i : splitStr) {
            if (i.toLowerCase().matches("[euiyoaаяуюоеёэиы]")) {
                counter++;
            }
        }
        LocalDate dateL = LocalDate.now().plusDays(counter);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM", new Locale("ru"));
        String strDate = formatter.format(dateL);
        System.out.println("Сгенерированная гласная дата: " + strDate);

    }
}
