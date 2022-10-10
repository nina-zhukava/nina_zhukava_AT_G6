package src.main.java.homework.day2;

public class CycleTaskRunner {

    public static void main(String[] args) {

        //используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел
        CycleWhile cycleWhile = new CycleWhile();
        cycleWhile.printNumbers(20);

        //используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
        PrintUnevenNumbers printUnevenNumbers = new PrintUnevenNumbers();
        printUnevenNumbers.printUnevenNumbers(3,19);

        //создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)
        FillArray fillArray = new FillArray();
        fillArray.fillArray(7);

        //пройти по массиву и вывести в консоль все элементы
        PrintArray printArray = new PrintArray();
        printArray.printArray();

        //вывести в консоль все элементы массива в обратном порядке
        PrintReversedArray printReversedArray = new PrintReversedArray();
        printReversedArray.printReversedArray();

        //каждый элемент массива умножить на 5 и вывести результат в консоль
        PrintMultipliedByFiveArray printMultipliedByFiveArray = new PrintMultipliedByFiveArray();
        printMultipliedByFiveArray.printMultipliedByFiveArray();

        //каждый элемент массива возвести в квадрат и вывести результат в консоль
        PrintMultipliedByItselfArray printMultipliedByItselfArray = new PrintMultipliedByItselfArray();
        printMultipliedByItselfArray.printMultipliedByItselfArray();

        //найти минимальный элемент массива и вывести результат в консоль
        PrintMinElement printMinElement = new PrintMinElement();
        printMinElement.printMinElement();

        //поменять местами первый и последний элементы и вывести результат в консоль
        ChangeFirstAndLastElements changeFirstAndLastElements = new ChangeFirstAndLastElements();
        changeFirstAndLastElements.changeFirstAndLastElements();

        //отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль
        SortDesc sortDesc = new SortDesc();
        sortDesc.sortDesc();
    }
}