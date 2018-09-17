package com.moonsuns.algorithms.chapter01.section01;

public class Exercises14
{
    public static void main(String[] args)
    {
        for(int i = 1; i < Integer.MAX_VALUE; i++)
        {
            int result1 = lg1(i);
            int result2 = lg3(i);

            if(result1 != result2)
            {
                System.out.println(i);
            }
        }
    }

    static int lg1(int N)
    {
        return (int)(Math.log(N) / Math.log(2));
    }

    /***
     * 这个思路不行，当N=1073741824及以上时，*2的操作会使超出整数最大范围而变成负数
     */
    static int lg2(int N)
    {
        if (N <= 0)
        {
            return 0;
        }

        int result = 1;
        int i = 0;
        for(; i < Integer.MAX_VALUE; i++)
        {
            if (result <= N)
            {
                result *= 2;
            }
            else
            {
                break;
            }
        }

        return i - 1;
    }

    static int lg3(int N)
    {
        if (N <= 0)
        {
            return 0;
        }

        int result = 0;
        while(N != 0)
        {
            N >>>= 1;
            result += 1;
        }

        return result - 1;
    }
}
