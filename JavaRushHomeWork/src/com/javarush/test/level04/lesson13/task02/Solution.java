package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String NAge = reader.readLine();
        int m = Integer.parseInt(NAge);

        String sAge = reader.readLine();
        int n = Integer.parseInt(sAge);

        int a =0;
        int b =0;
        n = n - 1 ;
        for (a=m; a > 0;  a--) {
            for (b=n; b > 0;  b--) {
                System.out.print(8);
            }
            System.out.println(8);
        }

    }
}
