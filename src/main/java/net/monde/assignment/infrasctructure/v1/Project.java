package net.monde.assignment.infrasctructure.v1;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Project {

	private int pk;
    private String title;
    private String description;
    private Date start_date;
    private Date end_date;
    private boolean is_billable;
    private boolean is_active;
    private List<Task> task_set ;
    private List<Resource> resource_set;
	public int getPk() {
		return pk;
	}
	public void setPk(int pk) {
		this.pk = pk;
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
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public boolean isIs_billable() {
		return is_billable;
	}
	public void setIs_billable(boolean is_billable) {
		this.is_billable = is_billable;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public List<Task> getTask_set() {
		return task_set;
	}
	public void setTask_set(List<Task> task_set) {
		this.task_set = task_set;
	}
	public List<Resource> getResource_set() {
		return resource_set;
	}
	public void setResource_set(List<Resource> resource_set) {
		this.resource_set = resource_set;
	}
	@Override
	public String toString() {
		return "Project [pk=" + pk + ", title=" + title + ", description=" + description + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", is_billable=" + is_billable + ", is_active=" + is_active + ", task_set="
				+ task_set + ", resource_set=" + resource_set + "]";
	}
    
    
}
