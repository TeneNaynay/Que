package objects;

import java.util.Date;
import java.util.LinkedList;

public class Task {

	private String taskName;
	private String objective;
	private int priority; 
	private Date dueDate;
	private LinkedList<Team> teams;
	
	public Task(String name, String objecSum, int assignedPriority, LinkedList<Team> assignedTeams, Date due){
		
		taskName = name;
		objective = objecSum;
		priority = assignedPriority;
		teams = assignedTeams;
		dueDate = due;	
	}
	
	public LinkedList<Team> getTeams(){
		return teams;
	}
	public Date getDueDate(){
		return dueDate;
	}
	public int getPriority(){
		return priority;
	}
	public String getObjective(){
		return objective;
	}
	
	public void updateObjective(String newObjective){
		objective = newObjective;
	}
	
	public void removeTeam(String teamName){
		
	}
	
}
