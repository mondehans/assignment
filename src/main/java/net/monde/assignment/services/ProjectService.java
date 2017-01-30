package net.monde.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.monde.assignment.model.Project;
import net.monde.assignment.model.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public List<Project> listProjects(){
		return projectRepository.findAll();
	}
	
	public Project findByID(int id){
		return projectRepository.findById(id);
	}
}
