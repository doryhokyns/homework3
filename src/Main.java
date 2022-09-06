public class Main {
    public static void main(String[] args) {

        //задание 1

        int number = 0;

        while (number < 10) {
            System.out.print(++number + " ");
        }

        System.out.println();


        for (; number > 0; number--) {
            System.out.print(number + " ");
        }



        //задание 2

        int firstFriday = 5;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday +=7) {
            System.out.println(" Сегодня пятница " + currentFriday + " -е число. Необходимо сдать еженедельный отчет");
        }

        //задание 3

        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;

        for (int year = start; year <= end; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }


    }

}