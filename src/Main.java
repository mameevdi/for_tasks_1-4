public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1"); //С помощью цикла for выведите в консоль все числа от 1 до 10
        for (int i = 0; i < 10; ++i) {
            System.out.println(i+1);
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2"); //С помощью цикла for выведите в консоль все числа от 10 до 1
        for (int i = 10; i > 0; --i) {
            System.out.println(i);
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3"); //Выведите в консоль все четные числа от 0 до 17
        for (int i = 0; i < 17; i=i+2) {
            System.out.println(i);
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4"); //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему
        for (int i = 10; i > -11; --i) {
            System.out.println(i);
        }
    }
}