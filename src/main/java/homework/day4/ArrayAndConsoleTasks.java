package src.main.java.homework.day4;

public class ArrayAndConsoleTasks {

    // метод, который принимает на вход целочисленном массив и считает сумму каждого n-ого элемента в нем,
    // где n - целое число, передаваемое в сигнатуру этого метода
    public void countElementSum(int[] array, int n) {
        int sum = 0;
        for (int i = n - 1; i < array.length; i += n) {
            sum += array[i];
        }
        System.out.println(sum);
    }

//    метод, который вернет целочисленный массив, состоящий только из тех элементов исходного целочисленного
// массива (подается на вход этого метода), которые больше, чем число n, где n - целое число, передаваемое в сигнатуру
// этого метода, элементы в результирующем массиве должны быть расположены в обратном порядке

    public int[] getModifiedArray(int[] initialArray, int n) {
        int newArraySize = 0;
        for (int j : initialArray) {
            if (j > n) {
                newArraySize++;
            }
        }

        int[] newArray = new int[newArraySize];
        int newArrayIndex = newArraySize - 1;
        for (int j : initialArray) {
            if (j > n) {
                newArray[newArrayIndex] = j;
                newArrayIndex--;
            }
        }
        return newArray;
    }

    public void drawCow() {
        System.out.println();
        System.out.println("\t  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");
        System.out.println();
    }
}
/*-- написать метод, который вернет сумму тех элементов целочисленного массива, которые кратны числу текущего месяца
(массив подается в сигнатуру метода)
-- написать метод, который "нарисует" в консоли следующий рисунок:

	  ^__^
	  (oo)\\_______
	 (__)\ ) \/\  \
	      ||----w |\
	      ||     ||

(при копировании текста из скайпа в блокнот оно выравняется и станет более понятным, и не мудрите,
 это простая последовательность из .println())*/