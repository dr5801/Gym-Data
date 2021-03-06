package domain;

import java.util.Date;

/**
 * @author Alec Waddelow
 *
 * Class that holds data relevant to a trip to the gym 
 */
public class GymTrip 
{
	Date date;
	double lengthOfTrip;
	double lengthOfCardio;
	double lengthOfLifting;
	double lengthOfSauna;
	int weight;
	String comment;
	
	/**
	 * Standard Constructor
	 * 
	 * @param date - date of the trip to the gym
	 * @param lengthOfTrip - total number of hours spent in the gym
	 * @param lengthOfCardio - total number of hours spent doing cardio 
	 * @param lengthOfLifting - total number of hours spent lifting weights
	 * @param lengthOfSauna - total number of hours spent in the sauna 
	 * @param weight- weight at the end of the workout
	 * @param comment - additional information about the trip to gym
	 */
	public GymTrip(Date date, double lengthOfTrip, double lengthOfCardio, double lengthOfLifting, double lengthOfSauna,
			int weight, String comment) 
	{
		super();
		this.date = date;
		this.lengthOfTrip = lengthOfTrip;
		this.lengthOfCardio = lengthOfCardio;
		this.lengthOfLifting = lengthOfLifting;
		this.lengthOfSauna = lengthOfSauna;
		this.weight = weight;
		this.comment = comment;
	}
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the lengthOfTrip
	 */
	public double getLengthOfTrip() {
		return lengthOfTrip;
	}
	/**
	 * @param lengthOfTrip the lengthOfTrip to set
	 */
	public void setLengthOfTrip(double lengthOfTrip) {
		this.lengthOfTrip = lengthOfTrip;
	}
	/**
	 * @return the lengthOfCardio
	 */
	public double getLengthOfCardio() {
		return lengthOfCardio;
	}
	/**
	 * @param lengthOfCardio the lengthOfCardio to set
	 */
	public void setLengthOfCardio(double lengthOfCardio) {
		this.lengthOfCardio = lengthOfCardio;
	}
	/**
	 * @return the lengthOfLifting
	 */
	public double getLengthOfLifting() {
		return lengthOfLifting;
	}
	/**
	 * @param lengthOfLifting the lengthOfLifting to set
	 */
	public void setLengthOfLifting(double lengthOfLifting) {
		this.lengthOfLifting = lengthOfLifting;
	}
	/**
	 * @return the lengthOfSauna
	 */
	public double getLengthOfSauna() {
		return lengthOfSauna;
	}
	/**
	 * @param lengthOfSauna the lengthOfSauna to set
	 */
	public void setLengthOfSauna(double lengthOfSauna) {
		this.lengthOfSauna = lengthOfSauna;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GymTrip [date=" + date + ", lengthOfTrip=" + lengthOfTrip + ", lengthOfCardio=" + lengthOfCardio
				+ ", lengthOfLifting=" + lengthOfLifting + ", lengthOfSauna=" + lengthOfSauna + ", weight=" + weight
				+ ", comment=" + comment + "]";
	}
}
