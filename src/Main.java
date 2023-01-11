public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    /*
        Задача 1
        С помощью цикла for выведите в консоль все числа от 1 до 10.
    */

    public static void task1() {
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

        System.out.println();
    }

    /*
        Задача 2
        С помощью цикла for выведите в консоль все числа от 10 до 1.
    */

    public static void task2() {
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
        Задача 3
        Выведите в консоль все четные числа от 0 до 17
    */

    public static void task3() {
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
        Задача 4
        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
    */

    public static void task4() {
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
        Задача 5
        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате: «… год является високосным».
    */

    public static void task5() {
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i++) {
            if ((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0)) {
                System.out.println(i + " год является высокосным");
            }
        }

        System.out.println();
    }

    /*
        Задача 6
        Напишите программу, которая выводит в консоль последовательность чисел:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98
    */

    public static void task6() {
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
        Задача 7
        Напишите программу, которая выводит в консоль последовательность чисел:
        1 2 4 8 16 32 64 128 256 512

    */

    public static void task7() {
        System.out.println("Задача 7");

        for (int i = 0; i <= 9; i = i + 1) {
            System.out.print((int)Math.pow(2,i) + " ");
        }

        System.out.println();

        for (int i = 1; i <= 512; i = i*2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    /*
        Задача 8
        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
    */

    public static void task8() {
        System.out.println("Задача 8");

        int total = 0;
        int contribution = 29000;

        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println();
    }

    /*
        Задача 9
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
    */

    public static void task9() {
        System.out.println("Задача 9");

        int total = 0;
        int contribution = 29000;

        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println();
    }

    /*
        Задача 10
        Напишите программу, которая выводит в консоль таблицу умножения на 2
    */

    public static void task10() {
        System.out.println("Задача 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + i*2);
        }

        System.out.println();
    }
}

