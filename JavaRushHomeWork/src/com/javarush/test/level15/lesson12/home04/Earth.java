package com.javarush.test.level15.lesson12.home04;

/**
 * Created by JMD on 09.11.2015.
 */
public class Earth implements Planet{
    private static Earth earth;

    public static Earth getInstance()
    {
        if (earth == null)
            earth = new Earth();
        return earth;
    }

    private Earth()
    {
    }
}
