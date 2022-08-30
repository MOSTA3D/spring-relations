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
//import com.cegebest.demo.ui.entity.OrganizationDetails;
//import com.cegebest.demo.ui.entity.Team;
//import com.cegebest.demo.ui.service.OrganizationService;
//
//@RestController
//@RequestMapping("/organization")
//public class OrganizationController {
//	@Autowired
//	private OrganizationService organizationService;
//
//	@GetMapping
//	public ResponseEntity<List<OrganizationDetails>> getAllOrganizations(){
//		return new ResponseEntity<>(organizationService.getAll(), HttpStatus.OK);
//	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<OrganizationDetails> getOneOrganization(@PathVariable Long id) throws Exception {
//		return new ResponseEntity<>(organizationService.getOne(id), HttpStatus.OK);
//	}
//
//	@PostMapping
//	public ResponseEntity<Object> createOrganization(@RequestBody OrganizationDetails organization){
//		organizationService.create(organization);
//		return new ResponseEntity<>(HttpStatus.CREATED);
//	}
//
//	@PutMapping(path="/{id}")
//	public ResponseEntity<Object> updateOrganization(@PathVariable Long id, @RequestBody OrganizationDetails organization){
//		organizationService.update(organization, id);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//
//	@DeleteMapping
//	public ResponseEntity<Object> deleteProject(@PathVariable Long id){
//		organizationService.delete(id);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//
//	@PostMapping("/{id}/team")
//	public ResponseEntity<Object> addTeam(@PathVariable Long id, @RequestBody Team team){
//		organizationService.addTeam(id, team);
//		return new ResponseEntity<>(HttpStatus.CREATED);
//	}
//}
