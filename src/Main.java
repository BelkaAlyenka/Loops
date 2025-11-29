public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        //Задача 2
        System.out.println();//перевожу на новую строку для удобства
        for (int i = 10; i >= 1; i--) {
            System.out.print(i+" ");
        }
        //Задача 3
        System.out.println();
        for (int i = 0; i <= 17; i+=2) {
            System.out.print(i+" ");
        }
        //Задача 4
        System.out.println();
        for (int i = 10; i >= -10; i--) {
            System.out.print(i+" ");
        }
        //Задача 5
        System.out.println();
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i+" год является високосным");
        }
        //Задача 6
        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i+" ");
        }
        //Задача 7
        System.out.println();
        for (int i = 1; i <= 512; i*=2) {
            System.out.print(i+" ");
        }
        //Задача 8
        System.out.println();
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        //Задача 9
        int money = 29000;
        int totalSalary = 0;
        for (int i = 1; i <= 12; i++) {
            totalSalary = totalSalary + totalSalary/100;
            totalSalary = totalSalary + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSalary + " рублей");
        }
        //Задача 10
        int num = 2;
        for (int i = 1; i <= 10; i++) {
            int multiplicationResult = num * i;
            System.out.println(num + "*" + i + " = " + multiplicationResult);
        }
    }
}