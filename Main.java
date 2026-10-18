import java.util.Scanner;


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    // Задача 1 Выведите произведение двух чисел, введенных пользователем
    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Первое число");
        int a = sc.nextInt();
            System.out.println("Второе чило");
            int b = sc.nextInt();
            int p = a * b;
        System.out.println("Произведения " + p);
        sc.close();
        }

// Задача 2 Напишите программу, которая присваивает переменной значение 10 и выводит его на экран
public static void task2() {
        int x = 10;
        System.out.println(x);
    }

 // Задача 3 Реализуйте программу для вывода результата выражения ( a + b ), где ( a ) и ( b ) вводятся пользователем
 public static void task3(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Первое");
     int a = sc.nextInt();
     System.out.println("Второе");
     int b = sc.nextInt();
     int s = a + b;
     System.out.println("Произведения " +  s);
     sc.close();
 }

