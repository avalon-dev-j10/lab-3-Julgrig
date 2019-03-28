package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

import java.util.Random;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 * <p>
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 * <p>
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {

    private int min;
    private int max;

    public RandomInitializer(int min, int max) {
        this.min = min;
        this.max = max;
    }

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */


    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
        
        /*  TODO (Проверка№1 ЛР№3)
            - Перед обращением к массиву следует делать проверку на правильность массива,
            если array = null, возникает ошибка!!!
            - Исправить!
            - Добавить комментарии к полям и методам класса
        */
        
        for (int i = 0; i < array.length; i++) {
            int diff = max - min;
            Random rn = new Random();
            int r = rn.nextInt(diff + 1);
            r += min;
            array[i] = r;
        }
    }
}
