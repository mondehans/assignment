package net.monde.assignment.infrasctructure;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.monde.assignment.model.Task;
import net.monde.assignment.model.Project;
import net.monde.assignment.model.ProjectRepository;
import net.monde.assignment.model.Resource;

@Component
public class ProjectRepositoryImpl implements ProjectRepository  {
	
	@Autowired
	private RemoteClient remoteClient;
	
	@Override
	public List<Project> findAll() {
		String token =remoteClient.login();
		List<net.monde.assignment.infrasctructure.v1.Project> projects =remoteClient.getProjects(token);
		return mapProjects(projects);
	}

	@Override
	public Project findById(int id) {
		 String token =remoteClient.login();
		net.monde.assignment.infrasctructure.v1.Project project=remoteClient.getProject(id, token);
		if (null!= project){
			return mapProjetc(project);
		}
		return null;
	}
	
	//Translation layer between the remote Projects services and the local services.
	
	//User Dozer.
	private List<Project> mapProjects(List<net.monde.assignment.infrasctructure.v1.Project> in){
		 return in.stream().map(s ->mapProjetc(s)).collect(Collectors.toList());
	}

	private Project mapProjetc(net.monde.assignment.infrasctructure.v1.Project in){
		Project out = new Project();
		out.setActive(in.isIs_active());
		out.setBillable(in.isIs_billable());
		out.setDescription(in.getDescription());
		out.setEndDate(in.getEnd_date());
		out.setId(in.getPk());
		out.setStartDate(in.getStart_date());
		out.setTitle(in.getTitle());
		List<Task> tasks=in.getTask_set().stream().map(s -> mapTask(s)).collect(Collectors.toList());
		out.setTasks(tasks);
		List<Resource> resources=in.getResource_set().stream().map(s -> mapResource(s)).collect(Collectors.toList());
		out.setResources(resources);
		return out;
		
	}
	
	private Task mapTask(net.monde.assignment.infrasctructure.v1.Task inTask){
		Task task = new Task();
		task.setId(inTask.getId());
		task.setDueDate(inTask.getDue_date());
		task.setEstimatedHours(inTask.getEstimated_hours());
		task.setProjectId(inTask.getProject());
		task.setTitle(inTask.getTitle());
		return task;
	}
	
	private Resource mapResource(net.monde.assignment.infrasctructure.v1.Resource in){
		Resource resource = new Resource();
		resource.setAgreedHoursPerMonth(in.getAgreed_hours_per_month());
		resource.setCreated(in.getCreated());
		resource.setEndDate(in.getEnd_date());
		resource.setId(in.getId());
		resource.setRate(in.getRate());
		resource.setStartDate(in.getStart_date());
		resource.setUpdated(in.getUpdated());
		resource.setUser(in.getUser());
		return resource;
	}
 }
