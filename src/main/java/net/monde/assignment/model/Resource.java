package net.monde.assignment.model;

import java.util.Date;

import net.monde.assignment.model.Project;

public class Resource {
	private int id;
	private String user;
	private Date startDate;
	private Date endDate;
	private float rate;
	private double agreedHoursPerMonth;
	private Date created;
	private Date updated;
	private Project project;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
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
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public double getAgreedHoursPerMonth() {
		return agreedHoursPerMonth;
	}
	public void setAgreedHoursPerMonth(double agreedHoursPerMonth) {
		this.agreedHoursPerMonth = agreedHoursPerMonth;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Resource [id=" + id + ", user=" + user + ", startDate=" + startDate + ", endDate=" + endDate + ", rate="
				+ rate + ", agreedHoursPerMonth=" + agreedHoursPerMonth + ", created=" + created + ", updated="
				+ updated + ", project=" + project + "]";
	}
	
	
}
