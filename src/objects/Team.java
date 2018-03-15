package objects;

public class Team {
	private String leader;
	private String[] members; 
	
	public Team(String leads, String[] memberList){
		leader = leads;
		members = memberList;
	}
	
	public String getLeader(){
		return leader; 
	}
	public void updateLeader(String newLead){
		leader=newLead;
	}
	public String[] getMembers(){
		return members;
	}
	
	public boolean removeMember(String remove){
		int index = membersListContains(remove);
		if(index == -1){
			return false;
		}
		//Update this to shrink it down in faster code.
		String[] newList = new String[members.length-1];
		int oldMembersPlace = 0;
		for(int newArrayIndex = 0; newArrayIndex<newList.length; newArrayIndex++){
			if(oldMembersPlace == index){
				oldMembersPlace = oldMembersPlace + 1;
				continue;
			}
			newList[newArrayIndex] = members[oldMembersPlace];
			oldMembersPlace = oldMembersPlace + 1;
		}
		return true;
	}

	private int membersListContains(String remove) {
		// Update to faster Search
		
		for(int index = 0; index<members.length; index++)
			if(remove.toLowerCase().compareTo(members[index].toLowerCase())==0)
				return index;
		
		return -1;
	}
}
