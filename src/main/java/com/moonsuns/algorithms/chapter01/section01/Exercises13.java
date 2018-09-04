package com.moonsuns.algorithms.chapter01.section01;

public class Exercises13
{
    public static void main(String[] args)
    {
        int[][] a = {
                {3, 2, 1, 9, 6},
                {5, 6, 7, 8}
        };

        System.out.println("原二维数组为：");
        printMatrix(a);

        System.out.println("转置后为：");
        printMatrix(method1(a));

    }

    static int[][] method1(int[][] a)
    {
        // 找到a的列的最大宽度
        int col = 0;
        for(int[] i : a)
        {
            if(i.length > col)
            {
                col = i.length;
            }
        }

        // 初始化result
        int[][] result = new int[col][a.length];

        // 转置
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                result[j][i] = a[i][j];
            }
        }

        return result;
    }

    static void printMatrix(int[][] matrix)
    {
        for (int[] line : matrix)
        {
            for (int n : line)
            {
                System.out.printf("%d\t", n);
            }
            System.out.println();
        }
    }

}
