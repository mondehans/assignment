package net.monde.assignment.infrasctructure;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import net.monde.assignment.configuration.AppConfig;
import net.monde.assignment.infrasctructure.v1.Project;
import net.monde.assignment.infrasctructure.v1.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@WebAppConfiguration
public class RemoteClientTestCase{

	@Autowired
	private RemoteClient remoteClient;
	@Test
	public void shouldLogin(){
		try{
			String token=remoteClient.login();
			assertNotNull(token);
		}catch(Exception exc){
			exc.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void shouldListUsers(){
		try{
			String token=remoteClient.login();
			assertNotNull(token);
			
			
			List<User> users=remoteClient.getUsers(token);
			assertNotNull(users);
		
		}catch(Exception exc){
			exc.printStackTrace();
			fail();
		}
		
	}
	@Test
	public void shouldGetUser(){
		try{
			String token=remoteClient.login();
			assertNotNull(token);
			
			User user=remoteClient.getUser(token);
			assertNotNull(user);
		
		}catch(Exception exc){
			exc.printStackTrace();
			fail();
		}
		
	}
	
	@Test
	public void shouldGetSpecificUser(){
		try{
			String token=remoteClient.login();
			assertNotNull(token);
	
			User user=remoteClient.getUser(12,token);
			assertNotNull(user);
			
		}catch(Exception exc){
			exc.printStackTrace();
			fail();
		}
		
	}
	
	@Test
	public void shouldListProjects(){
		try{
			String token=remoteClient.login();
			assertNotNull(token);
	
			List<Project> projects =remoteClient.getProjects(token);
			assertNotNull(projects);
			
		}catch(Exception exc){
			exc.printStackTrace();
			fail();
		}
		
	}
	
	@Test
	public void shouldGetSpecificProject(){
		try{
			String token=remoteClient.login();
			assertNotNull(token);
			
			Project project =remoteClient.getProject(2,token);
			assertNotNull(project);
		}catch(Exception exc){
			exc.printStackTrace();
			fail();
		}
		
	}
}

