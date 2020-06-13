package com.idealoop.busseek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.app.DialogFragment;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class AddNewBus extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    TextView time1, bustype,time1from,time2from,time3from,time4from,time1to,time2to,time3to,time4to;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_bus);

        time1 = findViewById(R.id.editText6);
        bustype = findViewById(R.id.bustype);
        btnShow = findViewById(R.id.btnShow);
        time1from = findViewById(R.id.time1from);
        time1to = findViewById(R.id.time2to);
        time2from = findViewById(R.id.time2from);
        time2to = findViewById(R.id.time1to);
        time3from = findViewById(R.id.time3from);
        time3to = findViewById(R.id.time3to);
        time4from = findViewById(R.id.time4from);
        time4to = findViewById(R.id.time4to);

        time1from.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                Bundle args = new Bundle();
                args.putInt("testStringArgKey", R.id.time1from);
                newFragment.setArguments(args);
                newFragment.show(getFragmentManager(), "TimePicker");
            }
        });
        time2from.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                Bundle args = new Bundle();
                args.putInt("testStringArgKey", R.id.time2from);
                newFragment.setArguments(args);
                newFragment.show(getFragmentManager(), "TimePicker");
            }
        });
        time3from.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                Bundle args = new Bundle();
                args.putInt("testStringArgKey", R.id.time3from);
                newFragment.setArguments(args);
                newFragment.show(getFragmentManager(), "TimePicker");
            }
        });
        time4from.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                Bundle args = new Bundle();
                args.putInt("testStringArgKey", R.id.time4from);
                newFragment.setArguments(args);
                newFragment.show(getFragmentManager(), "TimePicker");
            }
        });
        time1to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                Bundle args = new Bundle();
                args.putInt("testStringArgKey", R.id.time1to);
                newFragment.setArguments(args);
                newFragment.show(getFragmentManager(), "TimePicker");
            }
        });
        time2to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                Bundle args = new Bundle();
                args.putInt("testStringArgKey", R.id.time2to);
                newFragment.setArguments(args);
                newFragment.show(getFragmentManager(), "TimePicker");
            }
        });
        time3to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                Bundle args = new Bundle();
                args.putInt("testStringArgKey", R.id.time3to);
                newFragment.setArguments(args);
                newFragment.show(getFragmentManager(), "TimePicker");
            }
        });
        time4to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                Bundle args = new Bundle();
                args.putInt("testStringArgKey", R.id.time4to);
                newFragment.setArguments(args);
                newFragment.show(getFragmentManager(), "TimePicker");
            }
        });



        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(AddNewBus.this, v);
                popup.setOnMenuItemClickListener(AddNewBus.this);
                popup.inflate(R.menu.menu_bustype);
                popup.show();
            }
        });



    }

  /*
  //Pop up Menu
   public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_bustype, popup.getMenu());
        popup.show();
    }*/

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        bustype.setText(item.getTitle());
        return true;
       // Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
      /*  switch (item.getItemId()) {
            case R.id.ac:
                bustype.setHint("");
                bustype.setText("A/C");
                return true;
            case R.id.semi:
                bustype.setHint("");
                bustype.setText("Semi Luxury");
                return true;
            case R.id.normal:
                bustype.setHint("");
                bustype.setText("Normal");
                return true;
            default:
                return false;
        }*/
    }


}


