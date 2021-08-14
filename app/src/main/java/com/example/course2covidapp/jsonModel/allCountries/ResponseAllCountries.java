package com.example.course2covidapp.jsonModel.allCountries;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseAllCountries{

	@SerializedName("ResponseAllCountries")
	private List<ResponseAllCountriesItem> responseAllCountries;

	public List<ResponseAllCountriesItem> getResponseAllCountries(){
		return responseAllCountries;
	}
}