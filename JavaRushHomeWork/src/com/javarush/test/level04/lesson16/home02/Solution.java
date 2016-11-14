package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int l;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String s = reader.readLine();
        String j = reader.readLine();
        String k = reader.readLine();
        int s1= Integer.parseInt(s);
        int j1 = Integer.parseInt(j);
        int k1 = Integer.parseInt(k);

        if (s1>j1)
            l= s1;
        else
            l=j1;
        if (l<k1)
            l= l;
        else
            l= k1;

        System.out.println(l);




    }

}
