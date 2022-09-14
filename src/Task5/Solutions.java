package Task5;

//29%17 + 1 = 13 вариант

import java.util.Scanner;

public class Solutions {
    static Scanner sc = new Scanner(System.in);

    /* Задание 13
    Дана последовательность натуральных чисел (одно число в строке),
    завершающаяся числом 0. Выведите первое, третье, пятое и т.д. из введенных
    чисел. Завершающий ноль выводить не надо.*/
    static void oddSequence(){
        int value = sc.nextInt();
        if (value != 0){
            System.out.println(value);
            value = sc.nextInt();
            if (value != 0)
                oddSequence();
        }
    }

    /* Задание 14
    Дано натуральное число N. Выведите все его цифры по одной, в обычном
    порядке, разделяя их пробелами или новыми строками.*/
    static void digitsLeftToRight(int num){
        if (num/10 > 9){
            digitsLeftToRight(num/10);
            System.out.print(num%10 + " ");
        } else
            System.out.print(num/10 + " " + num%10 + " ");
    }

    /* Задание 15
    Дано натуральное число N. Выведите все его цифры по одной, в обратном
    порядке, разделяя их пробелами или новыми строками.*/
    static void digitsRightToLeft(int num){
        if (num/10 > 9){
            System.out.print(num%10 + " ");
            digitsRightToLeft(num/10);
        } else
            System.out.print(num%10 + " " + num/10);
    }

    /* Задание 16
    Дана последовательность натуральных чисел (одно число в строке),
    завершающаяся числом 0. Определите, какое количество элементов этой
    последовательности, равны ее наибольшему элементу.*/
    static int equalToMax(int max, int cnt){
        int num = sc.nextInt();
        if (num != 0){
            if (num == max)
                cnt++;
            else if (num > max) {
                max = num;
                cnt = 1;
            }
            cnt = equalToMax(max, cnt);
        }
        return cnt;
    }

    /* Задание 17
    Дана последовательность натуральных чисел (одно число в строке),
    завершающаяся числом 0. Определите наибольшее значение числа в этой
    последовательности.*/
    static int maxInSequence(){
        int num = sc.nextInt();
        if (num != 0){
            int result = maxInSequence();
            if (num > result)
                return num;
            else
                return result;
        }
        return 0;
    }

    public static void main(String[] args) {
        //oddSequence();

        //int num = sc.nextInt();
        //digitsLeftToRight(num);
        //digitsRightToLeft(num);

        //System.out.println(equalToMax(0, 0));

        System.out.println(maxInSequence());
    }
}
