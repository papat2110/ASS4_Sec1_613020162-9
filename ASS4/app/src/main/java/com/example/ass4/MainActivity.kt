package com.example.ass4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showDetail(view: View){
        var selectID :Int = radioGroup.checkedRadioButtonId
        var radioButtonChecked= findViewById<RadioButton>(selectID)
        text_show.text = "Name:${edit_name.text}\nPassword:${edit_pass.text}\nGender:${radioButtonChecked.text}\nName:${edit_email.text}\nBirthday: ${text_birthday.text}"
    }

    fun showDatePickerDialog(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }

    fun reset(v: View){
        edit_name.text.clear()
        edit_pass.text.clear()
        edit_email.text.clear()
        radioGroup.clearCheck()
    }
}




