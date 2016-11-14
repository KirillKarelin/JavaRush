package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String sname;
        String tname;
        int age;
        int height;
        int fat;

        public Human(String name, String sname, String tname)
        {
            this.name = name;
            this.sname = sname;
            this.tname = tname;
        }

        public Human(String name, String sname, String tname, int age, int height, int fat)
        {
            this.name = name;
            this.sname = sname;
            this.tname = tname;
            this.age = age;
            this.height = height;
            this.fat = fat;
        }

        public Human(String name, String sname, String tname, int age, int height)
        {
            this.name = name;
            this.sname = sname;
            this.tname = tname;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String sname, String tname, int age)
        {
            this.name = name;
            this.sname = sname;
            this.tname = tname;
            this.age = age;
        }

        public Human(String name, String sname)
        {
            this.name = name;
            this.sname = sname;
        }

        public Human(String sname, String tname, int age, int height, int fat)
        {
            this.sname = sname;
            this.tname = tname;
            this.age = age;
            this.height = height;
            this.fat = fat;
        }

        public Human(String tname, int age, int height, int fat)
        {
            this.tname = tname;
            this.age = age;
            this.height = height;
            this.fat = fat;
        }

        public Human(int age, int height, int fat)
        {
            this.age = age;
            this.height = height;
            this.fat = fat;
        }

        public Human(int height, int fat)
        {
            this.height = height;
            this.fat = fat;
        }

        public Human(String name, int height, int fat)
        {
            this.name = name;
            this.height = height;
            this.fat = fat;
        }
    }
}
