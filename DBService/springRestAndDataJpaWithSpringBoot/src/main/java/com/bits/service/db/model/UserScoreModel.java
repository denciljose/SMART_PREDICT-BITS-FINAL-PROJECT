package com.bits.service.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_SCORE")
public class UserScoreModel {
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long Id;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name="SCORE")
	private Long score;
	
	@Column(name="HVPSCORE")
	private Long hvpscore;
	
	@Column(name="RANK")
	private Long rank;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getHvpscore() {
		return hvpscore;
	}

	public void setHvpscore(Long hvpscore) {
		this.hvpscore = hvpscore;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}
	


	
	
	 
}
