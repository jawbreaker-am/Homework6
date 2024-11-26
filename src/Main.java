//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("\nЗадача 1:");
        for (int i=1; i<=10; i++) {
            System.out.print(i);
            if (i<10) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 2
        System.out.println("\nЗадача 2:");
        for (int i=10; i>0; i--) {
            System.out.print(i);
            if (i>1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 3
        System.out.println("\nЗадача 3:");
        for (int i=0; i<=17; i+=2) {
            System.out.print(i);
            if (i<17-2) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 4
        System.out.println("\nЗадача 4:");
        for (int i=10; i>=-10; i--) {
            System.out.print(i);
            if (i>-10) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 5
        System.out.println("\nЗадача 5:");
        for (int i=1904; i<=2096; i+=4) {
            System.out.println(i + " год является високосным");
        }

        //Задача 6
        System.out.println("\nЗадача 6:");
        for (int i=7; i<=100; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 7
        System.out.println("\nЗадача 7:");
        for (int i=1; i<=512; i*=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 8
        System.out.println("\nЗадача 8:");
        int sumSavings=0;
        int monthlySavings=29000;
        for (int i=1; i<=12; i++) {
            sumSavings+=monthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumSavings + " рублей");
        }
        //Задача 9
        System.out.println("\nЗадача 9:");
        sumSavings=0;
        monthlySavings=29000;
        for (int i=1; i<=12; i++) {
            sumSavings*=1.01;
            sumSavings+=monthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumSavings + " рублей");
        }
        //Задача 10
        System.out.println("\nЗадача 10:");
        for (int i=1; i<=10; i++) {
            System.out.println("2*" + i + "=" + i*2);
        }
    }
}