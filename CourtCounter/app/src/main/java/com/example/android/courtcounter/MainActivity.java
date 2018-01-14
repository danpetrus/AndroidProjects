package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(teamAScore));
    }
    public void incrementScoreBy3(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }
    public void incrementScoreBy2(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }
    public void incrementScoreBy1(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(teamBScore));
    }
    public void ft_incrementScoreBy3(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }
    public void ft_incrementScoreBy2(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }
    public void ft_incrementScoreBy1(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }
    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamB(teamBScore);
        displayForTeamA(teamAScore);
    }

}
