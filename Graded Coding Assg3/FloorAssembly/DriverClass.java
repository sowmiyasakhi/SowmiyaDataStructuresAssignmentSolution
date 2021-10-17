package com.greatlearning.FloorsAssembly;

import java.util.Scanner;
import java.util.Stack;

public class DriverClass 
{

	public static void main(String[] args) 
	{
		AssembleFloors as= new AssembleFloors();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of floors in the building:");
		int size = sc.nextInt();
		Stack<Integer>floors = new Stack<Integer>();
		Stack<Integer>days = new Stack<Integer>();
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter the floor size on the given day:" + (i+1));
			floors.push(sc.nextInt());
			days.push(i+1);
			
		}
		as.assemble(floors, days, size);
		sc.close();
		

	}

}