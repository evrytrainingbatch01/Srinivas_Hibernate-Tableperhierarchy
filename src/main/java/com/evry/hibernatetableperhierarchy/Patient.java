package com.evry.hibernatetableperhierarchy;

import javax.persistence.*;

@Entity
@Table(name = "patienttable")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "admintedid")
	private int admitedid;
	@Column(name = "patientname")
	private String patientname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdmitedid() {
		return admitedid;
	}

	public void setAdmitedid(int admitedid) {
		this.admitedid = admitedid;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

}
