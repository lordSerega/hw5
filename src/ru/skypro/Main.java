package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task4();


    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int[] arr = generateRandomArray();


    public static void task1() {
        float summa = 0f;
        float max = arr[0];
        float min = arr[0];

        for (int current : arr) {
            summa += current;
        }

        for (int current : arr) {
            if (min > current) {
                min = current;
            }
            if (max < current) {
                max = current;
            }

        }
        float mid = summa / (arr.length - 1);

        System.out.println("Сумма трат за месяц составила " + summa + " рублей");
        System.out.println("Минимальная сумма трат составила " + min + " рублей");
        System.out.println("Максимальная сумма трат составила " + max + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей");


    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


}
