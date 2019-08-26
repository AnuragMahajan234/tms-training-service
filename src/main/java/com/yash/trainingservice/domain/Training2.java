package com.yash.trainingservice.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


public class Training2 {

	@Id
	@Column(name = "trainingId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long trainingId;

	private String domain;

	private String technology;

	private String trainer;

	private String duration;
	
	private String priority;

	private int no_of_trinees;

	private String type;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private TrainingStatus status;
 
	private static enum TrainingStatus {
		ON_HOLD, IN_PROGRESS, NOT_STARTED, COMPLETED;
	}
 
	private Date start_date;

	private Date end_date;



	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getNo_of_trinees() {
		return no_of_trinees;
	}

	public void setNo_of_trinees(int no_of_trinees) {
		this.no_of_trinees = no_of_trinees;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}

	public TrainingStatus getStatus() {
		return status;
	}

	public void setStatus(TrainingStatus status) {
		this.status = status;
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
