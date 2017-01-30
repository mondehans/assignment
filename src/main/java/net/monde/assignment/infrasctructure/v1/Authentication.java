package net.monde.assignment.infrasctructure.v1;

public class Authentication {
	private int  id;
    private String service_name;
    private String key;
    private String token;
	
    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getService_name() {
		return service_name;
	}


	public void setService_name(String service_name) {
		this.service_name = service_name;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	@Override
	public String toString() {
		return "Authentication [id=" + id + ", service_name=" + service_name + ", key=" + key + ", token=" + token
				+ "]";
	}
    
    
}
