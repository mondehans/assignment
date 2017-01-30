package net.monde.assignment.infrasctructure;

import java.util.List;

import net.monde.assignment.infrasctructure.v1.Project;
import net.monde.assignment.infrasctructure.v1.Task;
import net.monde.assignment.infrasctructure.v1.User;

public interface RemoteClient {
	public String login();
	public List<User> getUsers(String token);
	public User getUser(String token);
	public User getUser(int id,String token);
	public List<Project> getProjects(String token);
	public Project getProject(int id, String token);
	public Task getTask(int id, String token);

	public List<Task> getTasks(String token);
}
