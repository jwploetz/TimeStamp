package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calendar = Calendar.getInstance()
        calendarView.setOnDateChangeListener {
            calendar.set(year,month,dayOfMonth)
            calendarView.date = calendar.timeInMillis
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            textView.text = "Date changed\n"
            textView.append(dateFormatter.format(calendar.time))
            textView.setTextColor(Color.BLUE)
        }
        button.setOnClickListener {
            val selectedDate:Long = calendarView.date
            calendar.timeInMillis = selectedDate
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            textView.text = "Selected date\n"
            textView.append(dateFormatter.format(calendar.time))
            textView.setTextColor(Color.DKGRAY)
        }
    }
}