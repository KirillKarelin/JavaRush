package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "lll";
        Zerg zerg2 = new Zerg();
        zerg2.name = "qll";
        Zerg zerg3 = new Zerg();
        zerg3.name = "wll";
        Zerg zerg4 = new Zerg();
        zerg4.name = "ell";
        Zerg zerg5 = new Zerg();
        zerg5.name = "rll";
        Zerg zerg6 = new  Zerg();
        zerg6.name = "lqwel";
        Zerg zerg7 = new Zerg();
        zerg7.name = "lwl";
        Zerg zerg8 = new Zerg();
        zerg8.name = "lqqqql";
        Zerg zerg9 = new Zerg();
        zerg9.name = "lweqqweqwel";
        Zerg zerg10 = new Zerg();
        zerg10.name = "qweqweqweqwel";

        Protos protos1 = new Protos();
        protos1.name = "asqwesdc";
        Protos protos2 = new Protos();
        protos2.name = "asdasdasdasd";
        Protos protos3 = new Protos();
        protos3.name = "fjfjjvjvjj";
        Protos protos4 = new Protos();
        protos4.name = " asdasdasdasdcccccccc";
        Protos protos5 = new Protos();
        protos5.name = "asdqwclglllprlv;";

        Terran terran = new Terran();
        terran.name = "32333333333333333333333333333333";
        Terran terran1 = new Terran();
        terran1.name = "123123123123123";
        Terran terran2 = new Terran();
        terran2.name = "4534fsbdbndsdv";
        Terran terran3 = new Terran();
        terran3.name = "gfnghjhkglkjl";
        Terran terran4 = new Terran();
        terran4.name = "sdfvbxvcnvm,bjkhkggf";
        Terran terran5 = new Terran();
        terran5.name = "sdfsdfhdjhnxcvzcxv";
        Terran terran6 = new Terran();
        terran6.name = "sdfafgsfhjfkrtfdcvcxbv";
        Terran terran7 = new Terran();
        terran7.name = "fdsgsdghgjhkdrtgwevcb";
        Terran terran8 = new Terran();
        terran8.name = "dsgafdhstrwevcxbvbm";
        Terran terran9 = new Terran();
        terran9.name = "werwttrurtukghxcvx";
        Terran terran10 = new Terran();
        terran10.name = "werwrgsdv";
        Terran terran11= new Terran();
        terran11.name = "werwerewr";




    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}