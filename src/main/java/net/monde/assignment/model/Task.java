package net.monde.assignment.model;

import java.util.Date;

import net.monde.assignment.model.Project;

public class Task {
	
	private int id;
	private String title;
	private Date dueDate;
	private double estimatedHours;
	private int projectId;
	private Project project;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public double getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(double estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", dueDate=" + dueDate + ", estimatedHours=" + estimatedHours
				+ ", projectId=" + projectId + ", project=" + project + "]";
	}
	
	
	
}
