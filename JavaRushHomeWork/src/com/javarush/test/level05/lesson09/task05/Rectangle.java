package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top,left,width,height;
    private String copy;
    public Rectangle (int top,int left,int  width,int height ){
        this.left = 2;
        this.top = 2;
        this.height = 3;
        this.width = 2;

    }
    public Rectangle (int top,int left ){
        this.top = 3;
        this.left = 2;


    }
    public Rectangle (int top ,int left, int width){
        this.top = 3;
        this.left = 5;
        this.width = 3;
        this.height = width;

    }
    public Rectangle (String copy){
        this.left = left;
        this.top = top;
        this.height = height;
        this.width = width;

    } //напишите тут ваш код

}
