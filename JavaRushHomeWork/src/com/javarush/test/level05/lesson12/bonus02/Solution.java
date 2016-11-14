package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min3(d,min2(min1(c,d),min2(min1(c,d),min(a,b))));


        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
    public static int min1(int c, int d){ return c<d?c:d;}
    public static int min2(int min1,int min){return min1<min?min1:min;}
    public static int min3 (int d,int min2){return d<min2?d:min2;}

}
