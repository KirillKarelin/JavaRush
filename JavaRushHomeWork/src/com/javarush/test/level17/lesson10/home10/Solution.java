package com.javarush.test.level17.lesson10.home10;

/* ���������
1. ������ ���, ����� ��������� ����� ����������� ��� ���� ��������� ������� values �� ��������� Thread.sleep
2. ������� synchronized ���� ���, ����� ������ values ���������� ��������� 1
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();

        for (int i = 1; i <= 100; i++) {
            if (values[i] > 1) {
                System.out.println(String.format("%d ����������� %d ���", i, values[i]));
            } else if (values[i] == 0) {
                System.out.println(String.format("%d �� ���� �� �����������", i));
            }
        }
    }

    public static Integer count = 0;
    public static int[] values = new int[105];

    static {
        for (int i = 0; i < 105; i++) {
            values[i] = 0;
        }
    }

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static class Counter extends Thread {
        @Override
        public void run() {
            synchronized (this) {
                while(getCount() < 100){
                    incrementCount();
                    values[getCount()]++;
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException ignored) {
            }
        }
    }
}