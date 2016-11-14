package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
                InputStream inputStream = System.in;
                Reader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String name = bufferedReader.readLine();
                String b3 = bufferedReader.readLine();
                String b4 = bufferedReader.readLine();
                System.out.print(name +" получает "+ b3 +" через "+ b4 +" лет.");
            }
        //напишите тут ваш код

    }
