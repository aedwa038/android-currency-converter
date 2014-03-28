package com.example.currencyconverter;

/**
 * The Class Currency.
 */
public class Currency {


	

	/** The Country. */
	String Country;
	
	/** The rate. */
	double rate;
	
	/** The currency. */
	String currency;
	
	
	
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Country == null) ? 0 : Country.hashCode());
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Currency)) {
			return false;
		}
		Currency other = (Currency) obj;
		if (Country == null) {
			if (other.Country != null) {
				return false;
			}
		} else if (!Country.equals(other.Country)) {
			return false;
		}
		if (currency == null) {
			if (other.currency != null) {
				return false;
			}
		} else if (!currency.equals(other.currency)) {
			return false;
		}
		return true;
	}

}
