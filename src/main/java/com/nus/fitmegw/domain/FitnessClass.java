package com.nus.fitmegw.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * A FitnessClass.
 */
@Table("fitness_class")
public class FitnessClass implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Column("class_name")
    private String className;

    @Column("duration")
    private Integer duration;

    @Column("level")
    private String level;

    @Column("instructor_name")
    private String instructorName;

    @Transient
    @JsonIgnoreProperties(value = { "schLoc", "schFit" }, allowSetters = true)
    private Set<Schedule> fitSches = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FitnessClass id(Long id) {
        this.id = id;
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public FitnessClass className(String className) {
        this.className = className;
        return this;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public FitnessClass duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getLevel() {
        return this.level;
    }

    public FitnessClass level(String level) {
        this.level = level;
        return this;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getInstructorName() {
        return this.instructorName;
    }

    public FitnessClass instructorName(String instructorName) {
        this.instructorName = instructorName;
        return this;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Set<Schedule> getFitSches() {
        return this.fitSches;
    }

    public FitnessClass fitSches(Set<Schedule> schedules) {
        this.setFitSches(schedules);
        return this;
    }

    public FitnessClass addFitSch(Schedule schedule) {
        this.fitSches.add(schedule);
        schedule.setSchFit(this);
        return this;
    }

    public FitnessClass removeFitSch(Schedule schedule) {
        this.fitSches.remove(schedule);
        schedule.setSchFit(null);
        return this;
    }

    public void setFitSches(Set<Schedule> schedules) {
        if (this.fitSches != null) {
            this.fitSches.forEach(i -> i.setSchFit(null));
        }
        if (schedules != null) {
            schedules.forEach(i -> i.setSchFit(this));
        }
        this.fitSches = schedules;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FitnessClass)) {
            return false;
        }
        return id != null && id.equals(((FitnessClass) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FitnessClass{" +
            "id=" + getId() +
            ", className='" + getClassName() + "'" +
            ", duration=" + getDuration() +
            ", level='" + getLevel() + "'" +
            ", instructorName='" + getInstructorName() + "'" +
            "}";
    }
}
