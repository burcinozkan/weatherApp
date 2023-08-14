package com.example.geek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geek.databinding.ActivityMainBinding;
import com.example.geek.databinding.CardRvBinding;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class WeatherRVAdapter extends RecyclerView.Adapter<WeatherRVAdapter.ViewHolder> {
    private ArrayList<WeatherRVModel> weatherRVModels;
    Context context;


    public WeatherRVAdapter(Context context, ArrayList<WeatherRVModel> weatherRVModels) {
        this.context = context;
        this.weatherRVModels = weatherRVModels;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view=LayoutInflater.from(context).inflate(R.layout.card_rv,parent,false);
      // cardRvBinding=CardRvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
       return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        WeatherRVModel weatherRVModel = weatherRVModels.get(position);
        holder.RVTemperature.setText(weatherRVModel.getTemperatrue()+"°C");
        holder.RVWindSpeed.setText(weatherRVModel.getWindSpeed()+" km/h");
       // Picasso.get().load("http:".concat(weatherRVModel.getImgid())).into(holder.RVCondition);
       Picasso.get().load(R.drawable.cloudy).into(holder.RVCondition);
        SimpleDateFormat input=new SimpleDateFormat("yyyy-MM-dd hh:mm");
        SimpleDateFormat output=new SimpleDateFormat("hh:mm");

        try {
            Date t=input.parse(weatherRVModel.getTime());
            holder.RVTime.setText(output.format(t));
        }catch (ParseException e){
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return weatherRVModels.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
         TextView RVTime,RVTemperature,RVWindSpeed;
         ImageView RVCondition;


        public ViewHolder(@NonNull View view) {
            super(view);
             RVTime = view.findViewById(R.id.idTVTime);
             RVTemperature=view.findViewById(R.id.idTVTemperature);
             RVWindSpeed=view.findViewById(R.id.idTVWindSpeed);
             RVCondition=view.findViewById(R.id.idIVCondition);

        }


    }
}