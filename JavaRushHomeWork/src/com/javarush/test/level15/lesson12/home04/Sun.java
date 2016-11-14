package com.javarush.test.level15.lesson12.home04;

/**
 * Created by JMD on 09.11.2015.
 */
public class Sun implements Planet{
        private static Sun sun;

    public static Sun getInstance()
    {
        if (sun == null)
            sun = new Sun();
        return sun;
    }

    private Sun()
    {
    }
}


