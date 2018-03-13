package objects;

public class Task {

	private String taskName;
	private String objective;
	private int priority; 
	private Team[] teams;
	
	public Task(String name, String objecSum, int assignedPriority, Team[] assignedTeams){
		
		taskName = name;
		objective = objecSum;
		priority = assignedPriority;
		teams = assignedTeams;
		
	}
	
}
