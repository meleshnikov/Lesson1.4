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
    }
}