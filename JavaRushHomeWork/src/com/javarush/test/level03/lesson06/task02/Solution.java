package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 1, b = 1;
        while (a <= 10){
            while (b <= 10){
                System.out.print(a * b + " ");
                ++b;}
            System.out.println();
            ++a;
            b=1;} //напишите тут ваш код

    }
}