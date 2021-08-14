package com.example.course2covidapp.jsonModel.allCountries;

import com.google.gson.annotations.SerializedName;

public class ResponseAllCountriesItem{

	@SerializedName("continent")
	private String continent;

	@SerializedName("country")
	private String country;

	@SerializedName("recoveredPerOneMillion")
	private double recoveredPerOneMillion;

	@SerializedName("cases")
	private int cases;

	@SerializedName("critical")
	private int critical;

	@SerializedName("oneCasePerPeople")
	private int oneCasePerPeople;

	@SerializedName("active")
	private int active;

	@SerializedName("testsPerOneMillion")
	private double testsPerOneMillion;

	@SerializedName("population")
	private int population;

	@SerializedName("oneDeathPerPeople")
	private int oneDeathPerPeople;

	@SerializedName("recovered")
	private int recovered;

	@SerializedName("oneTestPerPeople")
	private int oneTestPerPeople;

	@SerializedName("tests")
	private int tests;

	@SerializedName("criticalPerOneMillion")
	private double criticalPerOneMillion;

	@SerializedName("deathsPerOneMillion")
	private double deathsPerOneMillion;

	@SerializedName("todayRecovered")
	private int todayRecovered;

	@SerializedName("casesPerOneMillion")
	private double casesPerOneMillion;

	@SerializedName("countryInfo")
	private CountryInfo countryInfo;

	@SerializedName("updated")
	private long updated;

	@SerializedName("deaths")
	private int deaths;

	@SerializedName("activePerOneMillion")
	private double activePerOneMillion;

	@SerializedName("todayCases")
	private int todayCases;

	@SerializedName("todayDeaths")
	private int todayDeaths;

	public String getContinent(){
		return continent;
	}

	public String getCountry(){
		return country;
	}

	public double getRecoveredPerOneMillion(){
		return recoveredPerOneMillion;
	}

	public int getCases(){
		return cases;
	}

	public int getCritical(){
		return critical;
	}

	public int getOneCasePerPeople(){
		return oneCasePerPeople;
	}

	public int getActive(){
		return active;
	}

	public double getTestsPerOneMillion(){
		return testsPerOneMillion;
	}

	public int getPopulation(){
		return population;
	}

	public int getOneDeathPerPeople(){
		return oneDeathPerPeople;
	}

	public int getRecovered(){
		return recovered;
	}

	public int getOneTestPerPeople(){
		return oneTestPerPeople;
	}

	public int getTests(){
		return tests;
	}

	public double getCriticalPerOneMillion(){
		return criticalPerOneMillion;
	}

	public double getDeathsPerOneMillion(){
		return deathsPerOneMillion;
	}

	public int getTodayRecovered(){
		return todayRecovered;
	}

	public double getCasesPerOneMillion(){
		return casesPerOneMillion;
	}

	public CountryInfo getCountryInfo(){
		return countryInfo;
	}

	public long getUpdated(){
		return updated;
	}

	public int getDeaths(){
		return deaths;
	}

	public double getActivePerOneMillion(){
		return activePerOneMillion;
	}

	public int getTodayCases(){
		return todayCases;
	}

	public int getTodayDeaths(){
		return todayDeaths;
	}
}