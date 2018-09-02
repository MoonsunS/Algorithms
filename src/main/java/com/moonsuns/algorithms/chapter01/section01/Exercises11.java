package com.moonsuns.algorithms.chapter01.section01;

public class Exercises11
{
    private static final boolean[][] boolArray = {
            {true, false, false, true, true},
            {false, true, true, false, true}};

    public static void main(String[] args)
    {
        System.out.print("\t\t");
        for(int j = 0; j < boolArray[0].length; j++)
        {
            System.out.printf("Col %d\t", (j + 1));
        }
        System.out.println();

        for(int i = 0; i < boolArray.length; i++)
        {
            System.out.printf("Line %d\t", (i + 1));
            for(int j = 0; j < boolArray[i].length; j++)
            {
                System.out.print(boolArray[i][j] ? "  *\t\t" : "   \t\t");
            }
            System.out.println();
        }
    }
}
