package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); // вводим число
        if (N > 0)    // если оно строго больше 0 то начинаем программу
        {
            int[] list = new int[N]; // объявляю массив на N положительных чисел.
            for (int i = 0; i < list.length; i++)
            {
                list[i] = Integer.parseInt(reader.readLine());
            }
/* в цикле присваиваю каждому элементу значение, положительное или отрицательное. без ограничений. */
            int maximum = list[0]; // максимуму присваиваю самый первый элемент.
            for (int i = 1; i < list.length; i++)
            {
                if (list[i] > maximum)
                {
                    maximum = list[i];
                }
            }






        System.out.println(maximum);
    }
}
}
