package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name = null,color = null;
    private int height;
    public void initialize(String name){
        this.name = name;

    }
    public void initialize(String name,int age ){
        this.name = name;
        this.height = age;

    }
    public void initialize (String name,int age,int sex){
        this.name = name ;
        this.height = height;
        this.color = color;//напишите тут ваш код
        //
        }

}
