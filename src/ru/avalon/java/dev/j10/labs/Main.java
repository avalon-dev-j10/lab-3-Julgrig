package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

import static sun.misc.OSEnvironment.initialize;

public class Main {

    public static void main(String[] args) {
        int[] array;


	    /*
         * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
         *
         *
	     */

        // 0. создание массива из 20 целых чисел


        array = new int[20];
        RandomInitializer randomInitializer = new RandomInitializer(-50, 50);

        // 1.инициализация массива значениями последовательности чисел Фибоначчи
        new FibonacciInitializer().initialize(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
                
        /*  TODO (Проверка№1 ЛР№3)
            - Некоректный вывод информации! Где какой массив начинается и что оно делает?
            - Сделать вывод массива в одну строчку, для  этого используй либо 
            System.out.print(array[i] + разделитель); или Arrays.toString(masiv)
            - Сначала выведи твой сгененрированный массив, потом что ты с ним будешь делать,
            а дальше уже отсортированный массив.
        */

        // 2. Сумма элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("Сумма элементов массив равна " + sum);


        // 3. Инициализация  массива последовательностью случайных чисел в диапазоне от -50 до 50.

        randomInitializer.initialize(array);
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }

        // 4. Отсортировать массив с использованием пузырьковой сортировки

        new BubbleSort().sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 5. Инициализация  массива последовательностью случайных чисел в диапазоне от -50 до 50.

        randomInitializer.initialize(array);
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }

        // 6. Отсортировать массив с использованием сортировки выбором

        new SelectionSort().sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        // 7. Инициализация  массива последовательностью случайных чисел в диапазоне от -50 до 50.

        randomInitializer.initialize(array);
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }

        // 8. Отсортировать массив с использование сортировки Шелла.
        new ShellSort().sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}


