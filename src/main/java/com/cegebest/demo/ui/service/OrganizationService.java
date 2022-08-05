package com.cegebest.demo.ui.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cegebest.demo.ui.entity.Organization;
import com.cegebest.demo.ui.entity.OrganizationDetails;
import com.cegebest.demo.ui.entity.Team;
import com.cegebest.demo.ui.repository.OrganizationDetailsRepo;
import com.cegebest.demo.ui.repository.OrganizationRepo;

@Service
public class OrganizationService {
	@Autowired
	private OrganizationDetailsRepo organizationDetailsRepo;
	
	@Autowired
	private OrganizationRepo organizationRepo;
	
	public List<OrganizationDetails> getAll(){
		return organizationDetailsRepo.findAll();
	}
	
	public OrganizationDetails getOne(Long id) throws Exception {
		Optional<OrganizationDetails> projectOptional = organizationDetailsRepo.findById(id);
		if(projectOptional.isPresent()) {
			return projectOptional.get();
		}
		throw new Exception("why to do this with me");
	}
	
	public void create(OrganizationDetails organizationDetails) {
		Organization organization = new Organization(organizationDetails.getName());
		organizationRepo.save(organization);
		organizationDetailsRepo.save(organizationDetails);
	}
	
	public void update(OrganizationDetails organizationDetails, Long id) {
		OrganizationDetails organizationDetailsRet = organizationDetailsRepo.findById(id).get();
		organizationDetailsRet.setName(organizationDetails.getName());
		organizationDetailsRepo.save(organizationDetailsRet);
	}
	
	public void delete(Long id) {
		organizationDetailsRepo.deleteById(id);
	}
	
	public void addTeam(Long id, Team team) {
		OrganizationDetails organization = organizationDetailsRepo.findById(id).get();
		organization.addTeam(team);
	}
}
