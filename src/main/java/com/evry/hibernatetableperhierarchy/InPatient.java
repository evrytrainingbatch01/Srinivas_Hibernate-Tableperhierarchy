package com.evry.hibernatetableperhierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("inpatient")
public class InPatient extends Patient {

	@Column(name = "inpatid")
	private int inpatid;
	@Column(name = "inpatbills")
	private float inpatbills;
	@Column(name = "inpatamount")
	private float inpatamount;
	@Column(name = "inpatcheckuptype")
	private String inpatcheckuptype;

	public int getInpatid() {
		return inpatid;
	}

	public void setInpatid(int inpatid) {
		this.inpatid = inpatid;
	}

	public float getInpatbills() {
		return inpatbills;
	}

	public void setInpatbills(float inpatbills) {
		this.inpatbills = inpatbills;
	}

	public float getInpatamount() {
		return inpatamount;
	}

	public void setInpatamount(float inpatamount) {
		this.inpatamount = inpatamount;
	}

	public String getInpatcheckuptype() {
		return inpatcheckuptype;
	}

	public void setInpatcheckuptype(String inpatcheckuptype) {
		this.inpatcheckuptype = inpatcheckuptype;
	}

}
