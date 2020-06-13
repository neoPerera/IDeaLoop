package com.idealoop.busseek;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.idealoop.busseek.ui.gallery.GalleryFragment;
import com.squareup.picasso.Picasso;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DatabaseReference RefB;
    DatabaseReference RefP;
    BusOwner busowner;
    Passenger passenger;
    String url,fullname,customertype,email,id,username;
    private AppBarConfiguration mAppBarConfiguration;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    LinearLayout contentView;
    ImageView drawerMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        drawerLayout = findViewById(R.id.busownerDash);
        navigationView = findViewById(R.id.nav_view);

        drawerMenu = findViewById(R.id.menuimg);
       // contentView = findViewById(R.id.contentL);


        final Bundle extras = getIntent().getExtras();
        username = extras.getString("username");
        id = extras.getString("id");
        url = extras.getString("url");
        fullname = extras.getString("fullname");
        email = extras.getString("email");

        NavigationHeaderSetup();

        //FloatingButton
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });
        navigationDrawer();


    }
//################ ON Create Finish

    //Nav Drawer Header
    public void NavigationHeaderSetup(){
        View headView = navigationView.getHeaderView(0);
        ImageView profilepic = headView.findViewById(R.id.profilePicHeader);
        TextView fullnameHeader = headView.findViewById(R.id.fullnameHeader);
        fullnameHeader.setText(fullname);
        TextView emailHeader = headView.findViewById(R.id.emailHeader);
        emailHeader.setText(email);
        Picasso.get().load(url).into(profilepic);
    }

    //Nav Select
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.homeB){
            Intent intent = new Intent(Dashboard.this,Dashboard.class);
            intent.putExtra("username",username);
            intent.putExtra("id",id);
            intent.putExtra("url",url);
            intent.putExtra("fullname",fullname);
            intent.putExtra("email",email);

            startActivity(intent);
        }
        else if(id == R.id.viewmybuses){
            Intent intent = new Intent(Dashboard.this,Dashboard.class);
            intent.putExtra("username",username);
            intent.putExtra("id",id);
            intent.putExtra("url",url);
            intent.putExtra("fullname",fullname);
            intent.putExtra("email",email);

            startActivity(intent);
        }
        else if(id == R.id.addnewbus){
            Intent intent = new Intent(Dashboard.this,AddNewBus.class);
            intent.putExtra("username",username);
            intent.putExtra("id",id);
            intent.putExtra("url",url);
            intent.putExtra("fullname",fullname);
            intent.putExtra("email",email);

            startActivity(intent);
        }
        else if(id == R.id.signout){
            Intent intent = new Intent(Dashboard.this,LoginActivity.class);
            intent.putExtra("username",username);
            intent.putExtra("id",id);
            intent.putExtra("url",url);
            intent.putExtra("fullname",fullname);
            intent.putExtra("email",email);

            startActivity(intent);
        }

        return true;
    }

    private void navigationDrawer() {
        //navigation drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

        drawerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drawerLayout.isDrawerVisible(GravityCompat.START)){
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

    }
}
