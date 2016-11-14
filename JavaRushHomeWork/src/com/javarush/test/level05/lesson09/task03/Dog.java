package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name = null,color = null;
    private int height;
    public Dog(String name){
        this.name = name;

    }
    public Dog(String name,int age ){
        this.name = name;
        this.height = age;

    }
    public Dog (String name,int age,int sex){
        this.name = name ;
        this.height = height;
        this.color = color;//напишите тут ваш код
        //
    } //напишите тут ваш код

}
