package com.example.oraganisation.service;


import com.example.oraganisation.dao.OrganisationRepository;
import com.example.oraganisation.entity.Organisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisationServiceImpl implements  OrganisationService{
    @Autowired
    private OrganisationRepository organisationRepository;

    @Override
    public List<Organisation> getOrganisationDetails() {
        return organisationRepository.findAll();
    }
}
