package com.example.vaxapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.vaxapp.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {


    public void backButton(View v){
        Log.i("info:","Back Button Worked");
            }

    public void nextButton(View v){
        Log.i("info:","Next Button Worked");
        Intent intent = new Intent(this, NotificationPage.class);
        startActivity(intent);
    }

    public void onVaccineButtonClick(View view) {
        // TODO - Route to the Vaccine Registration flow landing screen
        /*Intent launchVaccineLandingScreen = new Intent(this,
        // TODO - Add Vaccine Registration flow landing class here
        )
        startActivity(launchVaccineLandingScreen)*/
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void onPopUpClinicButtonClick(View view) {
        // TODO - Route to the Pop-Up Clinic Registration flow landing screen
        /*Intent launchPopUpClinicLandingScreen = new Intent(this,
        // TODO - Add Pop-Up Clinic Registration flow landing class here
        )
        startActivity(launchPopUpClinicLandingScreen)*/
        //Intent intent = new Intent(this, NotificationPage.class);
        //startActivity(intent);
        Intent intent = new Intent(this, Pop_Up_Registration.class);
        startActivity(intent);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}