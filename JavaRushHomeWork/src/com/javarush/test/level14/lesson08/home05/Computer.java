package com.javarush.test.level14.lesson08.home05;


public class Computer
{ private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;


        public Computer() {
        this.monitor = new Monitor();
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
    }


    public Monitor getMonitor()
    {
        return monitor;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }
}
