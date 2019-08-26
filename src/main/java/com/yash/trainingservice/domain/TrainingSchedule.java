package com.yash.trainingservice.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainingSchedules")
public class TrainingSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainingScheduleId", unique = true, nullable = false)
	private long trainingScheduleId;
	
	@Column(name = "technology", nullable = false, length = 100)
	private String technology;
	
	@Column(name = "duration", nullable = false, length = 100)
	private String duration;
	
	@Column(name = "no_of_trinees", nullable = false, length = 100)
	private int no_of_trinees;
	
	@Column(name = "start_date", nullable = false, length = 100)
	private Date start_date;

	@Column(name = "end_date", nullable = false, length = 100)
	private Date end_date;
	
	@Column(name = "comment",length = 200)
	private String comment;
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getTrainingScheduleId() {
		return trainingScheduleId;
	}

	public void setTrainingScheduleId(long trainingScheduleId) {
		this.trainingScheduleId = trainingScheduleId;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getNo_of_trinees() {
		return no_of_trinees;
	}

	public void setNo_of_trinees(int no_of_trinees) {
		this.no_of_trinees = no_of_trinees;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	
}
