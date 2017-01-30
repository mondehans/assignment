package net.monde.assignment.controllers.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.monde.assignment.model.Project;
import net.monde.assignment.services.ProjectService;

@Controller
@RequestMapping("api/v1/")
public class ProjectsController {

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value = { "/api/v1/", "projects" }, method = RequestMethod.GET)	
	public String listProjects(ModelMap model){
		 List<Project> projects=projectService.listProjects();
		model.addAttribute("projects",projects);
		return "listprojects";
	}
	
	@RequestMapping(value = { "/api/v1/","projects/{id}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable int id, ModelMap model) {
		Project project=projectService.findByID(id);
		model.addAttribute("project", project);
		return "projectdetails";
	}
	
}

