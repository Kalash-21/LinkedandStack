package Uni_ds;

import java.util.Arrays;

public class two_one {

    int size;
    int[] stack;
    int top1;
    int top2;

    public two_one(int arraysize)
    {
        size = arraysize;
        stack = new int[size];
        top1 = -1;
        top2 = size;        
    }

    public void push1(int x)
    {
        if(top1 < top2-1)
        {
        top1++;
        stack[top1] = x;        
        }else{
            System.out.println("overflow");
        }
    }

    public void push2(int y)
    {
        if(top1 < top2-1)
        {
            top2--;
            stack[top2] = y;
        }else{
            System.out.println("overflow");
        }
    }

    public void pop1()
    {
        if(top1 >= 0)
        {
            top1--;
            System.out.println("Popped "+" "+stack[top1+1]);
        }else{
            System.out.println("underflow");
        }
    }

    public void pop2()
    {
        if(top2 < size)
        {
            top2++;
            System.out.println("Popped"+" "+stack[top2+1]);
        }else{
            System.out.println("underflow");
        }
    }

    public void show()
    {
        System.out.println(Arrays.toString(stack));
    }

    public static void main(String[] args)
    {
        two_one list = new two_one(10);
        list.push1(4);
        list.push1(5);
        list.push1(3);
        list.push1(2);
        list.push2(6);
        list.push2(4);
   
        list.push2(8);
        list.push1(2);
        list.push2(6);
        list.push2(4);
        list.push2(8);
        list.show();
    }
}