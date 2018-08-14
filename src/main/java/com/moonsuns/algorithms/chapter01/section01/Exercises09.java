package com.moonsuns.algorithms.chapter01.section01;

import java.util.Arrays;
import java.util.List;

public class Exercises09
{
    public static void main(String[] args)
    {
        new Exercises09().run();
    }

    void run()
    {
        int n = 564788907;
        String s = "";
        long begin;

        List<BinaryString> methods = Arrays.asList(new Method1(), new Method2(), new Method3());

        for (BinaryString method : methods)
        {
            begin = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++)
            {
                s = method.toBinaryString(n);
            }
            System.out.println(System.currentTimeMillis() - begin);
            System.out.println(s);
        }
    }

    interface BinaryString
    {
        String toBinaryString(int n);
    }

    class Method1 implements BinaryString
    {
        @Override
        public String toBinaryString(int number)
        {
            String s = "";
            for (int n = number; n > 0; n /= 2)
                s = (n % 2) + s;

            return s;
        }
    }

    class Method2 implements BinaryString
    {
        @Override
        public String toBinaryString(int n)
        {
            return Integer.toBinaryString(n);
        }
    }

    class Method3 implements BinaryString
    {
        @Override
        public String toBinaryString(int number)
        {
            char[] c = new char[Integer.SIZE];
            for (int i = 0; i < Integer.SIZE; i++)
            {
                c[Integer.SIZE - 1 - i] = (char)((number >>> i & 1) + '0');
            }

            int index = 0;
            for(; index < c.length; index++)
            {
                if (c[index] == '1')
                {
                    break;
                }
            }

            return String.valueOf(c, index, c.length - index);
        }
    }
}
