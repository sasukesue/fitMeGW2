package com.nus.fitmegw.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * A Schedule.
 */
@Table("schedule")
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Column("date_time")
    private LocalDate dateTime;

    @Column("available_slots")
    private Integer availableSlots;

    @JsonIgnoreProperties(value = { "locSches" }, allowSetters = true)
    @Transient
    private Location schLoc;

    @Column("sch_loc_id")
    private Long schLocId;

    @JsonIgnoreProperties(value = { "fitSches" }, allowSetters = true)
    @Transient
    private FitnessClass schFit;

    @Column("sch_fit_id")
    private Long schFitId;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Schedule id(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getDateTime() {
        return this.dateTime;
    }

    public Schedule dateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getAvailableSlots() {
        return this.availableSlots;
    }

    public Schedule availableSlots(Integer availableSlots) {
        this.availableSlots = availableSlots;
        return this;
    }

    public void setAvailableSlots(Integer availableSlots) {
        this.availableSlots = availableSlots;
    }

    public Location getSchLoc() {
        return this.schLoc;
    }

    public Schedule schLoc(Location location) {
        this.setSchLoc(location);
        this.schLocId = location != null ? location.getId() : null;
        return this;
    }

    public void setSchLoc(Location location) {
        this.schLoc = location;
        this.schLocId = location != null ? location.getId() : null;
    }

    public Long getSchLocId() {
        return this.schLocId;
    }

    public void setSchLocId(Long location) {
        this.schLocId = location;
    }

    public FitnessClass getSchFit() {
        return this.schFit;
    }

    public Schedule schFit(FitnessClass fitnessClass) {
        this.setSchFit(fitnessClass);
        this.schFitId = fitnessClass != null ? fitnessClass.getId() : null;
        return this;
    }

    public void setSchFit(FitnessClass fitnessClass) {
        this.schFit = fitnessClass;
        this.schFitId = fitnessClass != null ? fitnessClass.getId() : null;
    }

    public Long getSchFitId() {
        return this.schFitId;
    }

    public void setSchFitId(Long fitnessClass) {
        this.schFitId = fitnessClass;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Schedule)) {
            return false;
        }
        return id != null && id.equals(((Schedule) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Schedule{" +
            "id=" + getId() +
            ", dateTime='" + getDateTime() + "'" +
            ", availableSlots=" + getAvailableSlots() +
            "}";
    }
}
