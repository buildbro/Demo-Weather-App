package com.example.demoweatherapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WeatherAdapter(private val weatherData: Array<String>) :
    RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {

//Implementation of the ViewHolder Class
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val temperatureTextView: TextView
        val cityTextView: TextView
        val dateTextView: TextView

        init {
            temperatureTextView = view.findViewById(R.id.temperature_tv)
            cityTextView = view.findViewById(R.id.city_tv)
            dateTextView = view.findViewById(R.id.date_tv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // create new view with UI of weather item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.weather_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //set element from weather data [using position] to TextView
        holder.temperatureTextView.text = weatherData[position]
    }

    override fun getItemCount(): Int {
        return weatherData.size
    }
}