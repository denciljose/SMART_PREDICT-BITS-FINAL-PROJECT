package com.bits.service.db.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USER_PREDICT_MODEL")
public class UserPredictModel {
	 
	@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID")
	private String userPredictId;
	
	@Column(name = "USERID")
	private String userId;
	
	@Column(name="GAMEID")
	private Long gameId;
	
	@Column(name="PREDICTION")
	private String prediction;
	
	
	@Column(name="DATE")
    private String date;
	
	@Column(name="RESULT")
	private String result;
	
	@Column(name="TEAM1")
	private String team1;
	
	@Column(name="TEAM2")
	private String team2;

	public String getUserPredictId() {
		return userPredictId;
	}

	public void setUserPredictId(String userPredictId) {
		this.userPredictId = userPredictId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public String getPrediction() {
		return prediction;
	}

	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	

	 
}
