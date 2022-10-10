package src.main.java.homework.day2;

public class CycleTaskRunner {

    public static void main(String[] args) {

        //используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел
        CycleWhile_1 cycleWhile = new CycleWhile_1();
        cycleWhile.printNumbers(20);

        //используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
        PrintUnevenNumbers_2 printUnevenNumbers = new PrintUnevenNumbers_2();
        printUnevenNumbers.printUnevenNumbers(3,19);

        //создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)
        FillArray_3 fillArray = new FillArray_3();
        fillArray.fillArray(7);

        //пройти по массиву и вывести в консоль все элементы
        PrintArray_4 printArray = new PrintArray_4();
        printArray.printArray();

        //вывести в консоль все элементы массива в обратном порядке
        PrintReversedArray_5 printReversedArray = new PrintReversedArray_5();
        printReversedArray.printReversedArray();

        //каждый элемент массива умножить на 5 и вывести результат в консоль
        PrintMultipliedByFiveArray_6 printMultipliedByFiveArray = new PrintMultipliedByFiveArray_6();
        printMultipliedByFiveArray.printMultipliedByFiveArray();

        //каждый элемент массива возвести в квадрат и вывести результат в консоль
        PrintMultipliedByItselfArray_7 printMultipliedByItselfArray = new PrintMultipliedByItselfArray_7();
        printMultipliedByItselfArray.printMultipliedByItselfArray();

        //найти минимальный элемент массива и вывести результат в консоль
        PrintMinElement_8 printMinElement = new PrintMinElement_8();
        printMinElement.printMinElement();

        //поменять местами первый и последний элементы и вывести результат в консоль
        ChangeFirstAndLastElements_9 changeFirstAndLastElements = new ChangeFirstAndLastElements_9();
        changeFirstAndLastElements.changeFirstAndLastElements();

        //отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль
        SortDesc_10 sortDesc = new SortDesc_10();
        sortDesc.sortDesc();
    }
}