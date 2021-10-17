package com.greatlearning.FloorsAssembly;
import java.util.Stack;

public class AssembleFloors 
{
    public void assemble(Stack<Integer>floors, Stack<Integer>days, int size)
    {
    	Stack<Integer>revfloor = new Stack<Integer>();
    	for(int i=size; i>0; i--)
    	{
    		int rev = floors.pop();
    		revfloor.push(rev);
    	}
    	
    	int day = 1;
    	int position = 0;
    	
    	for(int i=size; i>0; i--)
    	{
    		int fl = revfloor.search(i);
    		if(fl<position)
    		{
    			System.out.println(i);
    		}
    		else
    		{
    			position = fl;
    			while(day <= fl)
    			{
    				System.out.println("Day:"+ day);
    				day++;
    			}
    			System.out.print(i);
    		}
    	}
    }
	

}