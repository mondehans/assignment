package net.monde.assignment.model;

import java.util.List;

public interface ProjectRepository {

	public List<Project> findAll();
	public Project findById(int id);
}
