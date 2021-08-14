package com.example.course2covidapp.retrofitConfig;

public class RetrofitConfigToJson {
    public static String URL_API = "https://corona.lmao.ninja/v2/";

    public static ApiService getResponse(){
        return RetrofitInstance.getInstance(URL_API).create(ApiService.class);
    }

}
