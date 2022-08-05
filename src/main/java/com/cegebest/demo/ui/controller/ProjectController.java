//package com.cegebest.demo.ui.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cegebest.demo.ui.entity.Project;
//import com.cegebest.demo.ui.service.ProjectService;
//
//@RestController
//@RequestMapping("/project")
//public class ProjectController {
//	@Autowired
//	private ProjectService projectService;
//	
//	@GetMapping
//	public ResponseEntity<List<Project>> getAllProjects(){
//		return new ResponseEntity<>(projectService.getAll(), HttpStatus.OK);
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<Project> getOneProject(@PathVariable Long id) throws Exception {
//		return new ResponseEntity<>(projectService.getOne(id), HttpStatus.OK);
//	}
//	
//	@PostMapping
//	public ResponseEntity<Object> createProject(@RequestBody Project project){
//		projectService.create(project);
//		return new ResponseEntity<>(HttpStatus.CREATED);
//	}
//	
//	@PutMapping(path="/{id}")
//	public ResponseEntity<Object> updateProject(@PathVariable Long id, @RequestBody Project project){
//		projectService.updateProject(project, id);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//	
//	@DeleteMapping
//	public ResponseEntity<Object> deleteProject(@PathVariable Long id){
//		projectService.deleteProject(id);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//}
