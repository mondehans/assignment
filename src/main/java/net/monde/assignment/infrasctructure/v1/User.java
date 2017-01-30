package net.monde.assignment.infrasctructure.v1;

import java.util.List;

public class User {
	  private int id;
	  private String first_name;
	  private String last_name;
	  private String username;
	  
	  private String email;
	  private boolean is_staff;
	  private boolean is_superuser;
	  private Profile profile;
	  private List<Authentication> authentications;
	  private List<String> roles;
	  
	  
	  
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public boolean isIs_staff() {
		return is_staff;
	}



	public void setIs_staff(boolean is_staff) {
		this.is_staff = is_staff;
	}



	public boolean isIs_superuser() {
		return is_superuser;
	}



	public void setIs_superuser(boolean is_superuser) {
		this.is_superuser = is_superuser;
	}



	public Profile getProfile() {
		return profile;
	}



	public void setProfile(Profile profile) {
		this.profile = profile;
	}



	public List<Authentication> getAuthentications() {
		return authentications;
	}



	public void setAuthentications(List<Authentication> authentications) {
		this.authentications = authentications;
	}



	public List<String> getRoles() {
		return roles;
	}



	public void setRoles(List<String> roles) {
		this.roles = roles;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", username=" + username
				+ ", email=" + email + ", is_staff=" + is_staff + ", is_superuser=" + is_superuser + ", profile="
				+ profile + ", authentications=" + authentications + ", roles=" + roles + "]";
	}
	  
}
