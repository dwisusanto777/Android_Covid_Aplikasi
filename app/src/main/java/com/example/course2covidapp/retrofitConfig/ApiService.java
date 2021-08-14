package com.example.course2covidapp.retrofitConfig;

import com.example.course2covidapp.jsonModel.allCountries.ResponseAllCountries;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("v2/countries?yesterday&sort")
    Call<ResponseAllCountries> getAllCountry(
    );

}
