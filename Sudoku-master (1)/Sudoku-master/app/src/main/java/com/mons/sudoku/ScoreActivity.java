package com.mons.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
TextView scoreView;
    int score;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        score = intent.getIntExtra("counter",0);
        scoreView = (TextView)findViewById(R.id.score);
        btn1 = (Button)findViewById(R.id.btn1);
        if(score <2){
            scoreView.setText("You score " + score +"/3 ! Please Try again");
        }
        else{
            scoreView.setText("Congratulations! You score " + score +"/3 !");
        }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this, MenuActivity.class);
                ScoreActivity.this.startActivity(intent);
            }
        });
    }
}
