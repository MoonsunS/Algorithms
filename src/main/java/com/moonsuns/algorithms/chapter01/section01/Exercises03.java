package com.moonsuns.algorithms.chapter01.section01;

import org.apache.commons.lang3.math.NumberUtils;

public class Exercises03
{
    private static final int count = 3;

    public static void main(String[] args)
    {
        if (args.length != count)
        {
            System.err.println("Length of parameters is required " + count);
            return;
        }

        int[] aa = new int[count];
        for (int i = 0; i < count; i++)
        {
            if (!NumberUtils.isDigits(args[i]))
            {
                System.err.println(args[i] + " is not a digit");
                return;
            }
            aa[i] = Integer.parseInt(args[i]);
        }

        int temp = aa[0];
        for (int i = 1; i < count; i++)
        {
            if (temp != aa[i])
            {
                System.out.println("not equal");
                return;
            }
        }
        System.out.println("equal");
    }
}
