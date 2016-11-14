package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        ArrayList<String> fileList = new ArrayList<String>();
        String input;
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while ((input = fileReader.readLine()) != null)
            fileList.add(input);
        fileReader.close();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> values = new ArrayList<Double>();
        String[] stringArray;
        for (String aFileList : fileList)
        {
            stringArray = aFileList.split(" ");
            names.add(stringArray[0]);
            values.add(Double.parseDouble(stringArray[1]));
        }

        Map<String, Double> map = new TreeMap<String, Double>();
        for (int i = 0; i < names.size(); i++)
            map.put(names.get(i), values.get(i));

        ArrayList<String> ignoredNames = new ArrayList<String>();
        for (int i = 0; i<names.size()-1; i++) {
            for (int j = i+1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j)) && !ignoredNames.contains(names.get(i)))
                {
                    double tmp = values.get(i) + values.get(j);
                    map.put(names.get(i), tmp);
                    ignoredNames.add(names.get(i));
                }
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
