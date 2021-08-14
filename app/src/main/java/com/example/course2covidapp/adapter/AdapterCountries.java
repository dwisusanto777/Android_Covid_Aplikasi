package com.example.course2covidapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.course2covidapp.databinding.ListNegaraBinding;
import com.example.course2covidapp.jsonModel.allCountries.ResponseAllCountriesItem;
import com.example.course2covidapp.modal.Countries;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AdapterCountries extends RecyclerView.Adapter<AdapterCountries.MyViewHolder> {

    private List<ResponseAllCountriesItem> countries;
    private Context context;
    ListNegaraBinding binding;

    public AdapterCountries(List<ResponseAllCountriesItem> countries, Context context) {
        this.countries = countries;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.list_negara, parent, false);
//        return new MyViewHolder(view);
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        return new MyViewHolder(ListNegaraBinding.inflate(layoutInflater));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        ResponseAllCountriesItem c = countries.get(position);
        holder.binding.negara.setText(c.getCountry());
        Picasso.get().load(c.getCountryInfo().getFlag()).into(holder.binding.image);
        holder.binding.cover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ListNegaraBinding binding;
        public MyViewHolder(ListNegaraBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
