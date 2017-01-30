package net.monde.assignment.model;

import java.util.Date;
import java.util.List;

import net.monde.assignment.model.Resource;
import net.monde.assignment.model.Task;

public class Project {
	private int id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private boolean billable;
    private boolean active;
    private List<Task> tasks;
    private List<Resource> resources;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public boolean isBillable() {
		return billable;
	}
	public void setBillable(boolean billable) {
		this.billable = billable;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", description=" + description + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", billable=" + billable + ", active=" + active + ", tasks=" + tasks
				+ ", resources=" + resources + "]";
	}
    
    
}
