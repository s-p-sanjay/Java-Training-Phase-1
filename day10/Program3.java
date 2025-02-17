package com.celcom.day10;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Task {
	private int taskId;
	private String taskName;
	private boolean completed;

	public Task(int taskId, String taskName) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
	}

	public int getTaskId() {
		return taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}

class TaskManager {

	static List<Task> taskList = new LinkedList<>();

	void addTask(Task task) {
		for(Task t : taskList){
			if(t.getTaskId() == task.getTaskId()) {
				System.out.println("Task id already exist..");
				return;
			}
		}
			taskList.add(task);
			System.out.println("Task Added Successfully - " + task.getTaskName());
	}

	void deleteTask(int taskId) {
		boolean deleted = false;
		for (Task task : taskList) {
			if (task.getTaskId() == taskId) {
				System.out.println(task.getTaskName() + " deleted successfully");
				taskList.remove(task);
				deleted = true;
				break;
			}
		}
		if (!deleted) {
			System.out.println("Given Task " + taskId + " not exist");
		}
	}

	void viewTasks() {
		System.out.println("All task in a TaskList : ");
		System.out.println("Id\tName\tstatus");
		for (Task mytask : taskList) {
			String status = mytask.isCompleted() ? "completed" : "pending";
			System.out.println(mytask.getTaskId() + "\t" + mytask.getTaskName() + "\t " + status);
		}
	}

	void searchTask(String taskName) {
		boolean found = false;
		for (Task mytask : taskList) {
			if (mytask.getTaskName().equalsIgnoreCase(taskName)) {
				System.out.println("Task found");
				found = true;
				System.out.println("Id\tName\tstatus");
				String status = mytask.isCompleted() ? "completed" : "pending";
				System.out.println(mytask.getTaskId() + "\t" + mytask.getTaskName() + "\t" + status);
				break;
			}
		}
		if (!found) {
			System.out.println("Task " + taskName + " not found");
		}
	}

	void markComplete(String taskName) {
		boolean found = false;
		for (Task mytask : taskList) {
			if (mytask.getTaskName().equalsIgnoreCase(taskName)) {
				mytask.setCompleted(true);
				System.out.println("Task updated as complete");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Task " + taskName + " not found");
		}
	}
}

public class Program3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		TaskManager taskManager = new TaskManager();
		System.out.println("TASK MANAGER");
		System.out.println("============");
		int choice;
		do {
			System.out.println("\n1.Add Task\n2.Remove Task\n3.View All Tasks\n4.Search Task\n5.Mark Task\n6.Exit");
			System.out.println("choose ----> ");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter task id , task name :");
				Task newTask = new Task(s.nextInt(), s.next());
				taskManager.addTask(newTask);
				break;
			case 2:
				if (TaskManager.taskList.isEmpty()) {
					System.out.println("Task List is empty");
					break;
				}
				System.out.println("Enter task id to remove : ");
				int id = s.nextInt();
				taskManager.deleteTask(id);
				break;
			case 3:
				if (TaskManager.taskList.isEmpty()) {
					System.out.println("Task List is empty");
					break;
				}
				taskManager.viewTasks();
				break;
			case 4:
				if (TaskManager.taskList.isEmpty()) {
					System.out.println("Task List is empty");
					break;
				}
				System.out.println("Enter the task name : ");
				taskManager.searchTask(s.next());
				break;
			case 5:
				if (TaskManager.taskList.isEmpty()) {
					System.out.println("Task List is empty");
					break;
				}
				System.out.println("Enter the task name to mark as complete : ");
				taskManager.markComplete(s.next());
				break;
			case 6:
				System.out.println("Thank you !");
				break;
			default:
				System.out.println("Invalid option");
			}

		} while (choice != 6);

		s.close();
	}

}
