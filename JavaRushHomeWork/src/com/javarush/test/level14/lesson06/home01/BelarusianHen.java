package com.javarush.test.level14.lesson06.home01;

/**
 * Created by JMD on 07.11.2015.
 */
public class BelarusianHen extends Hen{
    public  int getCountOfEggsPerMonth()
    {

        return 3;
    }

    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.BELARUS+". Я несу "+ getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}