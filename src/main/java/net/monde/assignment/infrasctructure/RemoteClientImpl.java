package net.monde.assignment.infrasctructure;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import net.monde.assignment.infrasctructure.v1.Project;
import net.monde.assignment.infrasctructure.v1.Task;
import net.monde.assignment.infrasctructure.v1.Token;
import net.monde.assignment.infrasctructure.v1.User;

@Service
public class RemoteClientImpl implements RemoteClient{

	private String userURL="http://userservice.staging.tangentmicroservices.com:80/api/v1/users/";
	
	private String usermeURL="http://userservice.staging.tangentmicroservices.com:80/api/v1/users/me/";
	
	private String loginURl="http://userservice.staging.tangentmicroservices.com/api-token-auth/";
	private String projectsUrl="http://projectservice.staging.tangentmicroservices.com:80/api/v1/projects/";
	private Optional<Token> token;
	@Autowired 
	private RestTemplate template;
	
	public String login() {
		// TODO Auto-generated method stub
		MultiValueMap<String, String> uriVariables= new LinkedMultiValueMap<String, String>();
		
		uriVariables.add("username", "admin1");
		uriVariables.add("password", "admin1");
		Token tmp=template.postForObject(loginURl,  uriVariables, Token.class);
		token = Optional.of(tmp);
	
		return tmp.getToken(); 
	}

	public List<User> getUsers(String token) {
	
		HttpEntity<MultiValueMap<String, String>> request = setHeaders(token);

		ResponseEntity<List<User>>response =  template.exchange(userURL, HttpMethod.GET, request, new ParameterizedTypeReference<List<User>>() {
		});
		
		return response.getBody();
	}

	public User getUser(String token) {
		
		HttpEntity<MultiValueMap<String, String>> request = setHeaders(token);

		ResponseEntity<User>response =  template.exchange(usermeURL, HttpMethod.GET, request, User.class);
		return response.getBody();
	}

	
	public User getUser(int id, String token) {
		
		HttpEntity<MultiValueMap<String, String>> request = setHeaders(token);

		ResponseEntity<User>response =  template.exchange(userURL+"/"+id+"/", HttpMethod.GET, request, User.class);
		return response.getBody();
	}

	@Override
	public List<Project> getProjects(String token) {
		HttpEntity<MultiValueMap<String, String>> request = setHeaders(token);
		ResponseEntity<List<Project>>response =  template.exchange(projectsUrl, HttpMethod.GET, request, new ParameterizedTypeReference<List<Project>>() {
		});
		
		return response.getBody();
	}

	@Override
	public Project getProject(int id, String token) {
		HttpEntity<MultiValueMap<String, String>> request = setHeaders(token);
		ResponseEntity <Project> response =  template.exchange(projectsUrl+id+"/", HttpMethod.GET, request, Project.class);
		return response.getBody();
	}

	@Override
	public Task getTask(int id, String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getTasks(String token) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private HttpEntity<MultiValueMap<String, String>> setHeaders(String token) {
		Objects.requireNonNull(token);
		HttpHeaders headers = new HttpHeaders();
		//headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.add("Authorization", "Token "+token);
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
		return request;
	}
	
}

