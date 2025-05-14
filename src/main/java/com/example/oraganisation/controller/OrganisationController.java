package com.example.oraganisation.controller;

import com.example.oraganisation.entity.Organisation;
import com.example.oraganisation.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class OrganisationController {

    @Autowired
    private OrganisationService organisationService;

    @GetMapping("getallorgdetails")
    public List<Organisation> getOrganisationDetails(){
        return organisationService.getOrganisationDetails();
    }
}
