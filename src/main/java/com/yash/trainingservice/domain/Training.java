package com.yash.trainingservice.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Table(name = "trainings")
public class Training {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainingId", unique = true, nullable = false)
	private Long trainingId;

	@Column(name = "domain", nullable = false, length = 100)
	private String domain;

	@Column(name = "priority", nullable = false, length = 100)
	private String priority;

	@Column(name = "type", nullable = false, length = 100)
	private String type;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private TrainingStatus status;

	private static enum TrainingStatus {
		ON_HOLD, IN_PROGRESS, NOT_STARTED, COMPLETED;
	}

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="trainingId")
	private List<Trainer> trainer;
	
	@OneToOne
	private TrainingSchedule trainingSchedule;
	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
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
}
