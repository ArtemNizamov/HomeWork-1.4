public class Main {
    public static void main(String[] args) {
        // Задание №1

        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // задание №2

        System.out.println();

        int firstFridayOfMonth = 5;
        for (int friday = firstFridayOfMonth; friday <= 31; friday += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.%n", friday);
        }

        System.out.println();

        // Задание №3

        int period = 79;
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int startYear = 0;

        for (int year = startYear; year <= end; year += period) {
            if (year >= start) {
                System.out.println(year);
            }
        }

        // задание №4

        System.out.println();

        for (int j = 1; j <= 30; j++) {
            System.out.print(j + ": ");
            if (j % 3 == 0) {
                System.out.print(j + "ping ");
            }
            if (j % 5 == 0) {
                System.out.print(j + "pong");
            }
            System.out.println();
        }

        System.out.println();
        // задание №5

        int prevFibonacci1 = 0;
        int prevFibonacci2 = 1;
        System.out.println(prevFibonacci1);
        System.out.println(prevFibonacci2);
        for (int j = 3; j <= 10; j++) {
            int currentFibonacci = prevFibonacci1 + prevFibonacci2;
            System.out.println(currentFibonacci);
            prevFibonacci1 = prevFibonacci2;
            prevFibonacci2 = currentFibonacci;
        }

    }
}