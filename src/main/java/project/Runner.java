package src.main.java.project;

import src.main.java.project.bottle.Bottle;
import src.main.java.project.bubble.Bubble;
import src.main.java.project.water.SparklingWater;

public class Runner {

    private static double SMALL_BOTTLE_VOLUME = 0.5;
    private static double MEDIUM_BOTTLE_VOLUME = 1;
    private static double BIG_BOTTLE_VOLUME = 1.5;

    public static void main(String[] args) {

        SparklingWater sparklingWater = new SparklingWater();

        Bubble[] bubblesSmallBottleArray = pumpBottleWithSparklingWater(SMALL_BOTTLE_VOLUME, sparklingWater);
        Bubble[] bubblesMediumBottleArray = pumpBottleWithSparklingWater(MEDIUM_BOTTLE_VOLUME, sparklingWater);
        Bubble[] bubblesBigBottleArray = pumpBottleWithSparklingWater(BIG_BOTTLE_VOLUME, sparklingWater);

        Bottle bottleSmall = new Bottle(SMALL_BOTTLE_VOLUME, sparklingWater);
        Bottle bottleMedium = new Bottle(MEDIUM_BOTTLE_VOLUME, sparklingWater);
        Bottle bottleBig = new Bottle(BIG_BOTTLE_VOLUME, sparklingWater);

        bottleSmall.open(sparklingWater, bubblesSmallBottleArray);
        bottleMedium.open(sparklingWater, bubblesMediumBottleArray);
        bottleBig.open(sparklingWater, bubblesBigBottleArray);
    }
}
/*- создать класс Runner, содержащий main
- в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
- открыть поочередно все бутылки и выпустить из них газ*/

/*BubbleTask (для него создаем отдельный пакет bubbles)
- создать класс Bubble
- у пузырька должен быть обьем, газовый состав
- он должен уметь лопаться с выводом в консоль «Cramp!»
- обьем пузырька постоянный и равен 0.3 мм2, а газовый состав переменный в зависимости от образующего газа и задается в конструкторе класса

- создать абстрактный класс Water
- у воды есть такие характеристики, цвет, прозрачность, запах, температура

- создать класс SparklingWater, являющийся дочерним Water
- у газировки есть пузырьки
- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
- 1 литр воды содержит 10 тыс пузырьков
- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье

- создать класс Bottle
- у него есть обьем
- есть вода
- есть метод open(), который вызывает метод degas() в газировке

- создать класс Runner, содержащий main
- в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
- открыть поочередно все бутылки и выпустить из них газ

3.* SmartBubble (если есть столько пороху, что дошли аж сюда, то добавить к 2 заданию дополнительные условия ниже)
- у газировки есть такое дополнительные свойство, как состояние закрытости (когда она упакована в бутылку или бутылка открыта)
- у газировки есть метод isOpened(), который запускается в отдельном потоке в конструкторе при создании обьекта и раз в 2 секунды
(используем Thread.sleep()) проверяет, состояние закрытости в бутылке и если бутылка открылась, то запускает метод degas(),
 который удаляет пузырьки по одному и вызывает их лопанье
- при температуре = 0 градусов пузырьки газа удаляются по 10 в секунду
- при подьеме температуры на 1 градус скорость удаление пузырьков возрастает на 5 штук
- в Runner создать 2 бутылки, объёмом 1.5 лира с газировкой, одна из холодильника (5 градусов), другая комнатной температуры (22 градуса)
- запустить раннер, который откроет сразу обе бутылки и выпустит весь газ, учитывая, что бутылка из холодильника опущена в теплую воду и ее
температура увеличивается на 0.1 градус в минуту, но не может стать выше 40 градусов
*/