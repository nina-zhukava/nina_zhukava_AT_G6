package src.main.java.homework.day6.strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class PrintGeneratedDate {

    //    1.7 написать метод, который принимает на вход строку текста и выводит в консоль дату, которая на n дней больше,
//    чем текущая в формате "Сгенерированная гласная дата: 7 мая", где n - это количество гласных буков в получаемой строке
    public void printGeneratedDate(String str) {
        long counter = Arrays.stream(str.trim().replace(" ", "").split(""))
                .filter(s -> s.toLowerCase().matches("[euiyoaаяуюоеёэиы]")).count();
        LocalDate dateL = LocalDate.now().plusDays(counter);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM", new Locale("ru"));
        String strDate = formatter.format(dateL);
        System.out.println("Сгенерированная гласная дата: " + strDate);
    }
}
