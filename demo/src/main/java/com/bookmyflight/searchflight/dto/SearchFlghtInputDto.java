package com.bookmyflight.searchflight.dto;

import java.util.Date;

public class SearchFlghtInputDto {

	private String dateOfJourney;

	private String source;

	private String destination;

	public String getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	/**
	 * @return source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source
	 *            new value of {@link #getSource}.
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            new value of {@link #getDestination}.
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "SearchFlghtInputDto [dateOfJourney=" + dateOfJourney
				+ ", source=" + source + ", destination=" + destination + "]";
	}

	public SearchFlghtInputDto(String dateOfJourney, String source,
			String destination) {
		super();
		this.dateOfJourney = dateOfJourney;
		this.source = source;
		this.destination = destination;
	}

	public SearchFlghtInputDto() {

	}

}