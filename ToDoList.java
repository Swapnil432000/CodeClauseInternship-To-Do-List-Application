package todo.list;

import java.util.ArrayList;

public class ToDoList 
{
	private ArrayList <String>todoTasks;
	
	public ToDoList()
	{
		todoTasks=new ArrayList <String>();
	}
	public void addTask(String task) 
	{
		todoTasks.add(task);		
	}
	public void removeTask(int index)
	{
		todoTasks.remove(index);
	}
	public void printTask()
	{
		System.out.println("Tasks");
		for(int i=0; i<todoTasks.size(); i++)
		{
			System.err.println(i+":"+todoTasks.get(i));
		}
		
	}

}
