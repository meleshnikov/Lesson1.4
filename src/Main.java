public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task 1");
        int i = 1;
        while (i <= 10)
            System.out.print(i++ + " ");
        System.out.println();
        for (i = 10; i >= 1; i--)
            System.out.print(i + " ");

        //task2
        System.out.println("\n\nTask 2");
        int fridayDate = 3;
        while (fridayDate <= 31) {
            System.out.println("Сегодня пятница, " + fridayDate + "-е число. Необходимо подготовить отчет.");
            fridayDate += 7;
        }

        //task3
        System.out.println("\n\nTask 3");
        int currentYear = 2022;
        int lowerYear = currentYear - 200;
        int upperYear = currentYear + 100;
        for (int year = lowerYear; year <= upperYear; year++) {
            if ((year % 79) == 0)
                System.out.println(year);
        }
    }
}