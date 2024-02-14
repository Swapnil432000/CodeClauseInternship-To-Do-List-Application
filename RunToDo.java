package todo.list;

import java.util.Scanner;

public class RunToDo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ToDoList tlist=new ToDoList();
		while(true)
		{
			System.out.println("Enter commond(add/remove/print/exit)");
			String commond=sc.nextLine();
		
			if(commond.equals("add"))
			{
				System.out.println("Enter the task");
				String task=sc.nextLine();
				tlist.addTask(task);
			}
			else if(commond.equals("remove"))
			{
				System.out.println("Enter index");
				int index=sc.nextInt();
				sc.nextLine();
				tlist.removeTask(index);
			}
			else if(commond.equals("print"))
			{
				tlist.printTask();
			}
			else
			{
				break;
			}
		}
		

	}

}
