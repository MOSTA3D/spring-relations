package com.cegebest.demo.ui.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cegebest.demo.ui.entity.Project;
import com.cegebest.demo.ui.entity.Team;
import com.cegebest.demo.ui.repository.ProjectRepo;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepo projectRepo;
	
	public List<Project> getAll(){
		return projectRepo.findAll();
	}
	
	public Project getOne(Long id) throws Exception {
		Optional<Project> projectOptional = projectRepo.findById(id);
		if(projectOptional.isPresent()) {
			return projectOptional.get();
		}
		// don't forget to handle it
		throw new Exception("why to do this with me");
	}
	
	public void create(Project project) {
		projectRepo.save(project);
	}
	
	public void updateProject(Project project, Long id) {
		Project projectRet = projectRepo.findById(id).get();
		projectRet.setName(project.getName());
		projectRepo.save(project);
	}
	
	public void deleteProject(Long id) {
		projectRepo.deleteById(id);
	}
}
