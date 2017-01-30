package net.monde.assignment.infrasctructure.v1;

public class Profile {

     private String contact_number;
     private String status_message;
     private String bio;
	
     
     public String getContact_number() {
		return contact_number;
	}


	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}


	public String getStatus_message() {
		return status_message;
	}


	public void setStatus_message(String status_message) {
		this.status_message = status_message;
	}


	public String getBio() {
		return bio;
	}


	public void setBio(String bio) {
		this.bio = bio;
	}


	@Override
	public String toString() {
		return "Profile [contact_number=" + contact_number + ", status_message=" + status_message + ", bio=" + bio
				+ "]";
	}
 
}
