package com.example.currencyconverter;

/**
 * The Class Currency.
 */
public class Currency {

	/**
	 * Instantiates a new currency.
	 */
	public Currency() { 
	}

	/**
	 * Instantiates a new currency.
	 *
	 * @param country the country
	 * @param rate the rate
	 * @param currency the currency
	 */
	public Currency(String country, double rate, String currency) {
		super();
		Country = country;
		this.rate = rate; this.currency = currency;
	}

	/** The Country. */
	String Country;
	
	/** The rate. */
	double rate;
	
	/** The currency. */
	String currency;

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		Country = country;
	}

	/**
	 * Gets the rate.
	 *
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * Sets the rate.
	 *
	 * @param rate the new rate
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * Gets the currency.
	 *
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the currency.
	 *
	 * @param currency the new currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
