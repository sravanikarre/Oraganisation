package com.example.oraganisation.service;


import com.example.oraganisation.dao.OrganisationRepository;
import com.example.oraganisation.entity.Organisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrganisationServiceImpl implements  OrganisationService {
    @Autowired
    private OrganisationRepository organisationRepository;

    @Override
    public List<Organisation> getOrganisationDetails() {
        return organisationRepository.findAll();
    }

    @Override
    public List<Organisation> getParticularOrgDetails() {
        List<Organisation> organisations = organisationRepository.findAll();
       return  organisations.stream().
                sorted(Comparator.comparing(Organisation::getOrgDept)
                        .reversed()
                        .thenComparing(Organisation::getOrgName))
               .collect(Collectors.toList());


    }
}