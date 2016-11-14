package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sum1 = reader.readLine();
        String sum2 = reader.readLine();
        String sum3 = reader.readLine();
        String sum4 = reader.readLine();
        int s1 = Integer.parseInt(sum1);
        int s2 = Integer.parseInt(sum2);
        int s3 = Integer.parseInt(sum3);
        int s4 = Integer.parseInt(sum4);

        int a = s1 > s2 ? s1 : s2;
        int b = s3 > s4 ? s3 : s4;
        System.out.println(a>b?a:b);
        //напишите тут ваш код

    }
}
