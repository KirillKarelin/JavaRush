package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
       Set<Integer> set = new HashSet<Integer>() ;
        set.add(1);
        set.add(1111);
        set.add(111);
        set.add(123324);
        set.add(12342342);
        set.add(13423413);
        set.add(11233214);
        set.add(1333);
        set.add(1444);
        set.add(1555);
        set.add(13);
        set.add(11);
        set.add(6);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(22);
        return (HashSet<Integer>) set;



    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();
while(iterator.hasNext())
{
   int i = iterator.next();
   if (i >10) iterator.remove();
}
        return set;


    }
}
