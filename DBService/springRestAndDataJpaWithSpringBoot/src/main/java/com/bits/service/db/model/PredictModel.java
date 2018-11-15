package com.bits.service.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="PREDICT")
public class PredictModel {
	 

	 
	 @Column(name="TEAM1")
	 private String team1;
	 
	 @Column(name="TEAM2")
	 private String team2;
	 
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long position;
	 
	 @Temporal(TemporalType.DATE)
	 @Column(name="Date")
	 private Date date;
	 
	 @Column(name="RESULT")
	 private String result;
	

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	
}
