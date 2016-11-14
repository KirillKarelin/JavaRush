package com.javarush.test.level14.lesson06.home01;

/**
 * Created by JMD on 07.11.2015.
 */
public class UkrainianHen extends Hen{
    public  int getCountOfEggsPerMonth()
    {

        return 1;
    }

    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.UKRAINE+". Я несу "+ getCountOfEggsPerMonth()+" яиц в месяц.";
    }}
