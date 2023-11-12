package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    //    @Id
    //    @GeneratedValue
    //    private int id;
    //
    //    private String name;
    //    private String employer;
    //    private String skills;



    @ManyToOne
        private Employer employer;

        @ManyToMany
        private List<Skill> skills = new ArrayList<>();


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer employer) {
        super();
        this.employer = employer;

    }

    // Getters and setters.
    
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }




    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

//    public String getEmployer() {
//        return employer;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }


    //    public void setEmployer(String employer) {
//        this.employer = employer;
//    }

//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }



//    public List<Job> getJobs() {
//        return jobs;
//    }
//
//    public void setJobs(List<Job> jobs) {
//        this.jobs = jobs;
//    }
}
