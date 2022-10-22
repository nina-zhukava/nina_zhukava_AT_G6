package src.main.java.homework.day6.strings;

public class FindDuplicatesStatic {

    // метод, который позволяет найти и вывести в консоль все дубликаты слов в строке текста, который принимает на
// вход в виде аргумента.
    public static void findDuplicates(String str) {
        String[] splitString = str.trim().split(" ");

        for (int outerIndex = 0; outerIndex < splitString.length; outerIndex++) {
            String stringInWork = splitString[outerIndex];
            Boolean toPrint = false;
            for (int i = outerIndex + 1; i < splitString.length; i++) {
                if (stringInWork.equalsIgnoreCase(splitString[i])) {
                    splitString[i] = "";
                    toPrint = true;
                }
            }
            if (toPrint) {
                System.out.print(stringInWork + " ");
            }
        }
    }
}