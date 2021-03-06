package com.nus.fitmegw.service.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.nus.fitmegw.domain.Schedule} entity.
 */
public class ScheduleDTO implements Serializable {

    private Long id;

    private LocalDate dateTime;

    private Integer availableSlots;

    private LocationDTO schLoc;

    private FitnessClassDTO schFit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(Integer availableSlots) {
        this.availableSlots = availableSlots;
    }

    public LocationDTO getSchLoc() {
        return schLoc;
    }

    public void setSchLoc(LocationDTO schLoc) {
        this.schLoc = schLoc;
    }

    public FitnessClassDTO getSchFit() {
        return schFit;
    }

    public void setSchFit(FitnessClassDTO schFit) {
        this.schFit = schFit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleDTO)) {
            return false;
        }

        ScheduleDTO scheduleDTO = (ScheduleDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, scheduleDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ScheduleDTO{" +
            "id=" + getId() +
            ", dateTime='" + getDateTime() + "'" +
            ", availableSlots=" + getAvailableSlots() +
            ", schLoc=" + getSchLoc() +
            ", schFit=" + getSchFit() +
            "}";
    }
}
