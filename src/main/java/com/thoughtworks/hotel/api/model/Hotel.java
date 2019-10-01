package com.thoughtworks.hotel.api.model;

public class Hotel {

	private String name;
	private int classification;
	private Double weekdaysRegularPrice;
	private Double weekendsRegularPrice;
	private Double weekdaysRewardPrice;
	private Double weekendsRewardPrice;
	
	public Hotel(String name, int classification, Double weekdaysRegularPrice, Double weekendsRegularPrice,
			Double weekdaysRewardPrice, Double weekendsRewardPrice) {
		super();
		this.name = name;
		this.classification = classification;
		this.weekdaysRegularPrice = weekdaysRegularPrice;
		this.weekendsRegularPrice = weekendsRegularPrice;
		this.weekdaysRewardPrice = weekdaysRewardPrice;
		this.weekendsRewardPrice = weekendsRewardPrice;
	}

	public String getName() {
		return name;
	}

	public int getClassification() {
		return classification;
	}

	public Double getWeekdaysRegularPrice() {
		return weekdaysRegularPrice;
	}

	public Double getWeekendsRegularPrice() {
		return weekendsRegularPrice;
	}

	public Double getWeekdaysRewardPrice() {
		return weekdaysRewardPrice;
	}

	public Double getWeekendsRewardPrice() {
		return weekendsRewardPrice;
	}	
}
