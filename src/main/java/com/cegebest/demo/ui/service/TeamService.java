//package com.cegebest.demo.ui.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.cegebest.demo.ui.entity.Project;
//import com.cegebest.demo.ui.entity.Team;
//import com.cegebest.demo.ui.repository.ProjectRepo;
//import com.cegebest.demo.ui.repository.TeamRepo;
//
//@Service
//public class TeamService {
//	@Autowired
//	private TeamRepo teamRepo;
//
//	@Autowired
//	private ProjectRepo projectRepo;
//
//	public Team getTeam(Long id) {
//		return teamRepo.findById(id).get();
//	}
//
//	public void addTeam(Team team) {
//		teamRepo.save(team);
//	}
//
//	public Team assignProject(Long teamId, Long projectId) {
//		Team theTeam = teamRepo.findById(teamId).get();
//		Project theProject = projectRepo.findById(projectId).get();
//		theTeam.assignProject(theProject);
//		return teamRepo.save(theTeam);
//	}
//
//	public List<Project> getAllProjects(Long id) {
//		return teamRepo.findById(id).get().getProjects();
//	}
//}
