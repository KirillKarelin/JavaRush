package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {


        ArrayList<String> list=new ArrayList<String>();
        list.add("101");
        list.add("102");
        list.add("103");
        list.add("104");
        list.add("105");
        list.remove(0);
        list.remove(1);
        list.remove(2);


        for (int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        //Напишите тут ваш код

    }
}
