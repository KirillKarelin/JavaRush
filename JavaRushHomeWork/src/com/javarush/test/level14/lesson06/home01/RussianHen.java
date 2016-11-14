package com.javarush.test.level14.lesson06.home01;

/**
 * Created by JMD on 07.11.2015.
 */

public class RussianHen extends Hen implements Country{

    public  int getCountOfEggsPerMonth()
    {

        return 12;
    }

    @Override

    String getDescription()
    { return super.getDescription()+" Моя страна - "+Country.RUSSIA+". Я несу "+ getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
