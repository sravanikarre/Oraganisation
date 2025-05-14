package com.example.oraganisation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "organization")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orgId")
    private Integer orgId;

    @Column(name = "orgName")
    private String orgName;

    @Column(name = "orgDept")
    private String orgDept;

    @Column(name = "orgRole")
    private String orgRole;

    @Column(name = "orgLastUpdated")
    private LocalDateTime orgLastUpdated;

    @Column(name = "orgUpdateBy")
    private String orgUpdateBy;

    @Column(name = "orgCreated")
    private LocalDateTime orgCreated;

    @Column(name = "orgRanking")
    private Integer orgRanking;

    @Column(name = "orgLocation")
    private String orgLocation;

    @Column(name = "orgBranch")
    private String orgBranch;
}

