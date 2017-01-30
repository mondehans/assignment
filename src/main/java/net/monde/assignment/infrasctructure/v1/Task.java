package net.monde.assignment.infrasctructure.v1;

import java.util.Date;

public class Task {

	private int id;
	private String title;
	private Date due_date;
	private double estimated_hours;
	private int project;
	private Project project_data;
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
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public double getEstimated_hours() {
		return estimated_hours;
	}
	public void setEstimated_hours(double estimated_hours) {
		this.estimated_hours = estimated_hours;
	}
	public int getProject() {
		return project;
	}
	public void setProject(int project) {
		this.project = project;
	}
	public Project getProject_data() {
		return project_data;
	}
	public void setProject_data(Project project_data) {
		this.project_data = project_data;
	}
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", due_date=" + due_date + ", estimated_hours=" + estimated_hours
				+ ", project=" + project + ", project_data=" + project_data + "]";
	}
	
	
}
