package com.example.counterandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamACoutnter=0;
    int teamBCoutnter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void add3PointsTeamA(View view){

        teamACoutnter+=3;
        displayteamACoutnter(teamACoutnter);

    }
    public void add2PointsTeamA(View view){

        teamACoutnter+=2;
        displayteamACoutnter(teamACoutnter);

    }public void add1PointsTeamA(View view){

        teamACoutnter+=1;
        displayteamACoutnter(teamACoutnter);

    }public void add3PointsTeamB(View view){

        teamBCoutnter+=3;
        displayteamBCoutnter(teamBCoutnter);

    }public void add2PointsTeamB(View view){

        teamACoutnter+=2;
        displayteamBCoutnter(teamBCoutnter);

    }
    public void add1PointsTeamB(View view){

        teamBCoutnter+=1;
        displayteamBCoutnter(teamBCoutnter);

    }
    public void displayteamACoutnter(int i){

        TextView teamACoutnter=(TextView)findViewById(R.id.teamACoutnter);
        teamACoutnter.setText(String.valueOf(i));

    }
    public void displayteamBCoutnter(int i){

        TextView teamBCoutnter=(TextView)findViewById(R.id.teamBCoutner);
        teamBCoutnter.setText(String.valueOf(i));

    }
}
