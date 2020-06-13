package com.idealoop.busseek;


import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.app.Fragment;
import android.text.format.DateFormat;
import android.widget.TextView;
import android.app.DialogFragment;
import android.app.Dialog;
import java.util.Calendar;
import android.widget.TimePicker;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    String textname;
    int testStringArgValue;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        //Use the current time as the default values for the time picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        @SuppressLint("WrongConstant") int am = c.get(Calendar.AM);
        System.out.println(am);

        testStringArgValue = getArguments().getInt("testStringArgKey");

        //Create and return a new instance of TimePickerDialog
        return new TimePickerDialog(getActivity(),this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    //onTimeSet() callback method
    public void onTimeSet(TimePicker view, int hourOfDay, int minute){
        //Do something with the user chosen time
        //Get reference of host activity (XML Layout File) TextView widget
        TextView tv = (TextView) getActivity().findViewById(testStringArgValue);
        //Set a message for user
        //tv.setText("Your chosen time is...\n\n");
        //Display the user changed time on TextView
       // tv.setText(tv.getText()+ "Hour : " + String.valueOf(hourOfDay)
        //        + "\nMinute : " + String.valueOf(minute) + "\n");
        //Make the 24 hour time format to 12 hour time format

        String aMpM = "AM";
        if(hourOfDay >11)
        {
            aMpM = "PM";
        }

        String currentHour;
        if(hourOfDay<10)
        {
            currentHour = "0"+ hourOfDay;
        }
        else
        {
            currentHour = String.valueOf(hourOfDay);
        }

        String currentMinute;
        if(minute<10)
        {
            currentMinute = "0"+ minute;
        }
        else
        {
            currentMinute = String.valueOf(minute);
        }

        //tv.setText(String.valueOf(hourOfDay)+":"+String.valueOf(minute));
        tv.setText(String.valueOf(currentHour)+":"+String.valueOf(currentMinute));
    }
}