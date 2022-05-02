package com.greatlearning.java;

import java.util.Scanner;
import java.util.Stack;

public class BalancingExpression {
	
	// function to check if brackets are balanced
	static boolean checkingBracketsBalanced(String bracketExpression) {
		Stack<Character> stack = new Stack<Character>();
		
		for (int i=0; i<bracketExpression.length(); i++)
		{
			char character = bracketExpression.charAt(i);
			
			if(character == '(' || character == '[' || character == '{')
			{
				stack.push(character);
				continue;
			}
			
			if (stack.isEmpty())
				return false;
			
			char c;
			
			switch (character) {
			case '}':
				
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
				
			case ')':
				
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
				
			case ']':
				
				c = stack.pop();
				if(c == '(' || c == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
	
	// Driver code
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.print("Please enter expression to check: ");
			
			String bracketExpression = in.next();
			
			Boolean result;
			
			result = checkingBracketsBalanced(bracketExpression);
			
			if (result)
				System.out.println("The entered String has Balancing Brackets.");
			else
				System.out.println("The entered String do no contain Balancing Brackets.");
		}
	}
}
