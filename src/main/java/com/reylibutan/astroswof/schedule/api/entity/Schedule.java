package com.reylibutan.astroswof.schedule.api.entity;

import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 255)
	private String name;

	private Date fromDate;

	private Date toDate;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "schedule_engineer", joinColumns = { @JoinColumn(name = "schedule_id") }, inverseJoinColumns = {
			@JoinColumn(name = "engineer_id") })
	private List<Engineer> assignedEngineers;

}
