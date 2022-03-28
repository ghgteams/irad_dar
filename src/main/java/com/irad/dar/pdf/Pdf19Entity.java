package com.irad.dar.pdf;

public class Pdf19Entity {

	private String currentDate;
	private String accidentId;
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public String getAccidentId() {
		return accidentId;
	}
	public void setAccidentId(String accidentId) {
		this.accidentId = accidentId;
	}
	@Override
	public String toString() {
		return "Pdf19Entity [currentDate=" + currentDate + ", accidentId=" + accidentId + "]";
	}
	public Pdf19Entity(String currentDate, String accidentId) {
		super();
		this.currentDate = currentDate;
		this.accidentId = accidentId;
	}
	public Pdf19Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
