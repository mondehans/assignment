package net.monde.assignment.services;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import net.monde.assignment.configuration.AppConfig;
import net.monde.assignment.model.Project;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@WebAppConfiguration
public class ProjectServiceTestCase {

	@Autowired
	private ProjectService projectService;
	
	@Test
	public void shouldListProjects() {
		try{
			List<Project> projects=projectService.listProjects();
			assertNotNull(projects);
		}catch(Exception ec){
			fail();
		}
	}

	@Test
	public void shouldGetProjectById() {
		try{
			Project project=projectService.findByID(2);
			assertNotNull(project);
		}catch(Exception ec){
			fail();
		}
	}
}
