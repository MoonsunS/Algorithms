package com.moonsuns.algorithms.chapter01.section01;

public class Exercises15
{
    public static void main(String[] args)
    {
        int[] a = {1, 1, 0, 2, 4, 6, 12, 16, 10, 3, 3, 2, 3, 1};
        int[] b = histogram(a, 17);

        for(int n : b)
        {
            System.out.print(n + "\t");
        }
    }

    static int[] histogram(int[] a, int M)
    {
        int[] result = new int[M];

        for(int i : a)
        {
            if (i < M && i >= 0)
            {
                result[i]++;
            }
        }

        return result;
    }
}
