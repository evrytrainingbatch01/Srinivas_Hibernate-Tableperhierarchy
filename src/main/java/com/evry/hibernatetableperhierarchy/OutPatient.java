package com.evry.hibernatetableperhierarchy;

import javax.persistence.*;

@Entity
@DiscriminatorValue("outpatient")
public class OutPatient extends Patient {

	@Column(name = "outpatid")
	private int outpatid;
	@Column(name = "outpatbills")
	private float outpatbills;
	@Column(name = "outpatamount")
	private float outpatamount;
	@Column(name = "outpatcheckuptype")
	private String outpatcheckuptype;

	public int getOutpatid() {
		return outpatid;
	}

	public void setOutpatid(int outpatid) {
		this.outpatid = outpatid;
	}

	public float getOutpatbills() {
		return outpatbills;
	}

	public void setOutpatbills(float outpatbills) {
		this.outpatbills = outpatbills;
	}

	public float getOutpatamount() {
		return outpatamount;
	}

	public void setOutpatamount(float outpatamount) {
		this.outpatamount = outpatamount;
	}

	public String getOutpatcheckuptype() {
		return outpatcheckuptype;
	}

	public void setOutpatcheckuptype(String outpatcheckuptype) {
		this.outpatcheckuptype = outpatcheckuptype;
	}

}
