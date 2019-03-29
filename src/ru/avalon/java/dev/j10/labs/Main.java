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
        System.out.println("Последовательность чисел Фибоначчи:");
        new FibonacciInitializer().initialize(array);
        print(array);

        /*  TODO (Проверка№1 ЛР№3)
            - Некоректный вывод информации! Где какой массив начинается и что оно делает?
            - Сделать вывод массива в одну строчку, для  этого используй либо
            System.out.print(array[i] + разделитель); или Arrays.toString(masiv)
            - Сначала выведи твой сгененрированный массив, потом что ты с ним будешь делать,
            а дальше уже отсортированный массив.   ВЫПОЛНЕНО
        */

        // 2. Сумма элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("Сумма элементов массива равна: " + sum);
        System.out.println("---------------------------------------------------------------");

        // 3. Инициализация  массива последовательностью случайных чисел в диапазоне от -50 до 50.

        System.out.println("Последовательность случайных чисел в диапазоне от -50 до 50:");
        randomInitializer.initialize(array);
        print(array);

        // 4. Сортировка массива с использованием пузырьковой сортировки
        System.out.println("Сортировка массива с использованием пузырьковой сортировки: ");
        new BubbleSort().sort(array);
        print(array);
        System.out.println("---------------------------------------------------------------");
        
        // 5. Инициализация  массива последовательностью случайных чисел в диапазоне от -50 до 50.
        System.out.println("Последовательность случайных чисел в диапазоне от -50 до 50:");
        randomInitializer.initialize(array);
        print(array);

        // 6. Отсортировать массив с использованием сортировки выбором
        System.out.println("Сортировка массива с использованием сортировки выбором: ");
        new SelectionSort().sort(array);
        print(array);
        System.out.println("---------------------------------------------------------------");

        // 7. Инициализация  массива последовательностью случайных чисел в диапазоне от -50 до 50.
        System.out.println("Последовательность случайных чисел в диапазоне от -50 до 50:");
        randomInitializer.initialize(array);
        print(array);

        // 8. Отсортировать массив с использование сортировки Шелла.
        System.out.println("Сортировка массива с использованием сортировки Шелла: ");
        new ShellSort().sort(array);
        print(array);
    }

        public static void print(int[] array){
            for(int i: array){
                System.out.print(i + " ");
            }
            System.out.println("");

            /*  TODO (Замечания №2, ЛР№3)
                - В метод System.out.println() можно ничего не передавать, он может 
                быть пустым и просто делать перевод каретки, а в метод
                System.out.print(i + " ") обязательно надо передать хотя бы 1 параметр!
            */
        }

    }




