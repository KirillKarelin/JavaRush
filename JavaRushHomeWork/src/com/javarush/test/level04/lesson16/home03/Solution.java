package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    { int a =0, b = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; true; )
        {
            String s = reader.readLine();
            b = Integer.parseInt(s);
            a = a + b;
            if (s.equals("-1"))
                break;
        }


        System.out.println(a);


    }
}
