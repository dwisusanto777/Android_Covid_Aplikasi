package com.example.course2covidapp.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.course2covidapp.adapter.AdapterCountries;
import com.example.course2covidapp.databinding.DashboardBinding;
import com.example.course2covidapp.jsonModel.allCountries.ResponseAllCountries;
import com.example.course2covidapp.jsonModel.allCountries.ResponseAllCountriesItem;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import retrofit2.converter.gson.GsonConverterFactory;

public class Dashboard extends Fragment {

    View view;
    DashboardBinding binding;
    RequestQueue requestQueue;
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    List<ResponseAllCountriesItem> countriesItems;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        binding = DashboardBinding.inflate(inflater, container, false);
        view = binding.getRoot();

        recyclerView = binding.recyle;
        countriesItems = new ArrayList<ResponseAllCountriesItem>();

        //contoh menggunakan requestQeueu
        requestQueue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, "https://corona.lmao.ninja/v2/countries?yesterday&sort", null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Gson gson = new Gson();
                Log.d("TAMPIL", response+"");
                Type userListType = new TypeToken<ArrayList<ResponseAllCountriesItem>>(){}.getType();
                countriesItems = gson.fromJson(response+"", userListType);
                for (ResponseAllCountriesItem i : countriesItems){
                    Log.d("TAMPIL", i.getCountry()+" flag="+i.getCountryInfo().getFlag());
                }
                AdapterCountries ac = new AdapterCountries(countriesItems, getActivity());
                gridLayoutManager = new GridLayoutManager(getActivity(), 2);
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.setAdapter(ac);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(request);

        return view;
    }
}
