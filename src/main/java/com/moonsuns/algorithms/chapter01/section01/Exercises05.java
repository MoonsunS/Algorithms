package com.moonsuns.algorithms.chapter01.section01;

import java.util.Scanner;

public class Exercises05
{
    public static void main(String[] args)
    {
        System.out.println("请输入两个浮点数：");
        Scanner scanner = new Scanner(System.in);
        double larger = scanner.nextDouble();
        double smaller = scanner.nextDouble();

        if(smaller > larger)
        {
            double temp = larger;
            larger = smaller;
            smaller = temp;
        }

        if (smaller > 0 && larger < 1)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
