package com.hh.model;

import java.util.Set;

public class User {
	
	private String userPhoneNumber;
	private String userName;
	private String userDisplayName;
	private Set<Group> groups;
	
	public User(){
		
	}
	
	public User(String phoneNumber){
		this.userPhoneNumber = phoneNumber;
	}
	
	
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserDisplayName() {
		return userDisplayName;
	}

	public void setUserDisplayName(String userDisplayName) {
		this.userDisplayName = userDisplayName;
	}

	public Set<Group> getGroups() {
		return groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	public void addGroup(Group group) {  
        if (!this.groups.contains(group)) {  
             this.groups.add(group);  
        }  
    }  
  
     public void removeGroup(Group group) {  
         this.groups.remove(group);  
    } 
}
