package com.javacodability;

import java.util.Stack;

public class Program10_StackDataStructure {
	
	static void push(Stack<Integer> stack)
	{
		for(int i=0;i< 5;i++)
		{
			stack.push(i);
		}
	}
	static void pop(Stack<Integer> stack)
	{
		for(int i=0;i< 5;i++)
		{
			Integer y = (Integer) stack.pop();
			System.out.println( y);
		}
	}
	
	static void peek(Stack<Integer> stack)
	{
	Integer y = (Integer) stack.peek();
		System.out.println("Element on the top is stack is: " +y);
	}
	
	static void search(Stack<Integer> stack, int element) 
	{
        Integer pos = (Integer) stack.search(element);
        if(pos == 0) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element is found at position: " + pos); 
   } 

public static void main(String[] args) {

			Stack<Integer> s = new Stack<Integer>();
			push(s);
			pop(s);
			//push(s);
			//peek(s);
			search(s,2);
	}
}
