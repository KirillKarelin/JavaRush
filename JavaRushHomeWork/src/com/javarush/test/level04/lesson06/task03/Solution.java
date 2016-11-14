package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int n = 0;
        if (b>a) {n=a;a=b;b=n;}
        if (c>a) {n=c;c=a;a=n;}
        if (c>b) {n=c;c=b;b=n;}
        System.out.print(a+"\n"+b+"\n"+c);

    }
}
