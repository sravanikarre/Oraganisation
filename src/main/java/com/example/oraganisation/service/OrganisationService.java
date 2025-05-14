package com.example.oraganisation.service;

import com.example.oraganisation.entity.Organisation;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrganisationService {

    public List<Organisation> getOrganisationDetails();
}
