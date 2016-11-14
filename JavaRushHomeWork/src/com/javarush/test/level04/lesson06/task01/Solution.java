package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sum1 = reader.readLine();
        String sum2 = reader.readLine();
        int s1 = Integer.parseInt(sum1);
        int s2 = Integer.parseInt(sum2);
        System.out.println(s1 < s2 ? s1 : s2);

    }
}