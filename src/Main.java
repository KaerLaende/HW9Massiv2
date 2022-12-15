import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Массивы. Часть 2
        task1();
        task2();


    }

    // Объявляем метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    } // такой вариант не знал, но знал Math.random (из книги).

    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int totalForMounth = 0; // для задания 1
        int maxCostDay, minCostDay; //для задания 2
        maxCostDay = minCostDay = arr[0];//для задания 2
        double mediumCostDay = 0; // для задания 3
        int a = 0, b = 0; //для задания "сумасшедший ученик"
        //ниже - для себя делал:
        System.out.println("В этом месяце ежедневные затраты компании составляли:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ":" + arr[i] + "; ");
        } // прикольно, но не информативно, ведь каждый раз генерируется массив заного, но прикольно!=))

        System.out.println();
//        System.out.println(Arrays.toString(arr)); // после того как вспомнил предыдующий урок.....
        for (int i = 0; i < arr.length; i++) {
            totalForMounth += arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей%n", totalForMounth);

        //Задание 2.

        System.out.println("Задание 2");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCostDay) {
                minCostDay = arr[i];
            }
            if (arr[i] > maxCostDay) {
                maxCostDay = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей%n", minCostDay, maxCostDay);

        //Задание 3.

        System.out.println("Задание 3");
        mediumCostDay = (double) totalForMounth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumCostDay + "  рублей");

        // Задание - Сумасшедший ученик
        System.out.println("Сумасшедший ученик");
        // Бухгалтер попросил отсортировать ежедневные расходы в этом месяце.

        // пузырьковая сортировка
        for (int i = 1; i < arr.length; i++) {
            for (a = arr.length - 1; a >= i; a--) {
                if (arr[a - 1] > arr[a]) {
                    b = arr[a - 1];
                    arr[a - 1] = arr[a];
                    arr[a] = b;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task2() {
        //Задание 4.
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


