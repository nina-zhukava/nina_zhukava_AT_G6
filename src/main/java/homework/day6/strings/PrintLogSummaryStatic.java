package homework.day6.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintLogSummaryStatic {
    //    1.4 имеется текстовый лог в виде (ниже общий вид, т.е. частный случай):
//access_log.2020.09.07 212.168.101.5 granted
//access_log.2020.09.07 212.168.101.6 denied
//написать метод, который принимает на вход текст лога и выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
//ip 212.168.101.5: ok - 3, failed - 2
    public static void printLogSummary(String log) {
        List<String> list = Arrays.stream(log.trim().split("\n")).collect(Collectors.toList());


        /*Map<String, List<String>> msp =
                list.stream().collect(Collectors.groupingBy(s -> Arrays.stream(s.split(" ")).findFirst()));*/
        String[] splitLogArray = log.trim().split("\n");
        String[] cutLogArray = new String[splitLogArray.length];
        int cutStrIndex = 0;
        for (String str : splitLogArray) {
            cutLogArray[cutStrIndex] = str.substring(22);
            cutStrIndex++;
        }

        String[] ipArray = new String[cutLogArray.length];
        int ipArrayFreeIndex = 0;

        for (int indexInitArray = 0; indexInitArray < cutLogArray.length; indexInitArray++) {
            String stringInWork = cutLogArray[indexInitArray].substring(0, 13);
            boolean toAdd = true;
            for (int i = 0; i < ipArrayFreeIndex; i++) {
                if (stringInWork.equalsIgnoreCase((ipArray[i]).substring(0, 13))) {
                    toAdd = false;
                    break;
                }
            }

            if (toAdd) {
                ipArray[ipArrayFreeIndex++] = stringInWork;
            }
        }
        for (String s : ipArray) {
            if (s != null) {
                int failed = 0;
                int success = 0;
                for (int indexInitArray = 0; indexInitArray < cutLogArray.length; indexInitArray++) {
                    if ((s + " granted").equalsIgnoreCase((cutLogArray[indexInitArray].substring(0)))) {
                        success++;
                    } else if ((s + " denied").equalsIgnoreCase((cutLogArray[indexInitArray].substring(0)))) {
                        failed++;
                    }
                }
                System.out.println("ip " + s + " ok: " + success + " failed: " + failed);
            }
        }
    }
}