package com.javarush.test.level15.lesson12.home04;

/**
 * Created by JMD on 09.11.2015.
 */
public class KII
{
    private static KII ourInstance = new KII();

    public static KII getInstance()
    {
        return ourInstance;
    }

    private KII()
    {
    }
}
