package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name;
    private int age1, weight;
    private int  weights = 3;
    private int age = 0;
    private String name1 = null, adress = null;
    private String color ;

    public void initialize (String name){
        this.name = "Vaska";
    }
    public void initialize (String name ,int age,int weight){
        this.name = "Vaska";
        this.age1 = 3;
        this.weight = 4;
    }
    public void initialize (String name , int age){
        this.name = "Vaska";
        this.age1 = 3;
        this.weight = weights;


    }
    public void initialize (int weight, String color){
        this.weight = 3;
        this.color = "Blue";
        this.age= age;
        this.name = name1;
        this.adress = adress;

    }
    public void initialize (int weight, String color,String adress){
        this.weight = 3;
        this.color = "Green";
        this.adress = "qqq";
    }
}
