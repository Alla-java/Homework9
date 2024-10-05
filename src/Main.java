public class Main {
    public static void main(String[] args) {


       /* Задание 1. */
        int [ ] payments = {180, 478, 284, 583, 983};
        int total = 0;
        for (int i: payments) {
            total +=i;
        }
        System.out.println("Сумма трат за месяц составила " + total + " руб");



        /* Задание 2. */
        int min = payments [0];
        int max = payments [0];

        for (int i: payments) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        /* Задание 3. */

        double average = total / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        /* Задание 4. */
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }




    }
}