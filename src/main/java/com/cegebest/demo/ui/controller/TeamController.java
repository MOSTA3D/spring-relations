//package com.cegebest.demo.ui.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cegebest.demo.ui.entity.Project;
//import com.cegebest.demo.ui.service.TeamService;
//
//@RestController
//@RequestMapping("/team")
//public class TeamController {
//
//	@Autowired
//	private TeamService teamService;
//
//	@GetMapping(path="/{id}/projects")
//	public ResponseEntity<List<Project>>getTeamProjects(@PathVariable Long id){
//		return new ResponseEntity<>(teamService.getAllProjects(id), HttpStatus.OK);
//	}
//
//	@GetMapping(path="/{id}/projects/{projectId}")
//	public ResponseEntity<Object> assignProject(@PathVariable Long id, @PathVariable Long projectId){
//		teamService.assignProject(id, projectId);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//}
