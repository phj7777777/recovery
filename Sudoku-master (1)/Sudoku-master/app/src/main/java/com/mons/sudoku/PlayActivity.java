package com.mons.sudoku;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    ImageButton imageA,imageB,imageC,imageD;
    TextView txtQuetionNumber;
    AlertDialog.Builder builder;
    int count = 0;
    int counter  = 0;

    int[] flags = new int[]{
            R.drawable.human1,
            R.drawable.human,
            R.drawable.human3,
            R.drawable.human4,
            R.drawable.human5,
            R.drawable.human6,
            R.drawable.human7,
            R.drawable.human8,
            R.drawable.human9,
            R.drawable.human10,
            R.drawable.human11,
            R.drawable.human12
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        imageA = (ImageButton) findViewById(R.id.imageA);
        imageB = (ImageButton) findViewById(R.id.imageB);
        imageC = (ImageButton) findViewById(R.id.imageC);
        imageD = (ImageButton) findViewById(R.id.imageD);
        setimageSource();
        builder = new AlertDialog.Builder(this);
        builder.setTitle("Answer Correctly!");
        builder.setCancelable(false);
        builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                count ++;
                if(count == 3){

                    Intent intent = new Intent(PlayActivity.this, ScoreActivity.class);
                    intent.putExtra("counter", counter);
                    PlayActivity.this.startActivity(intent);
                }
                setimageSource();

            }
        });


        imageA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0){
                  builder.show();
                  counter++;

                }
                else{
                    builder.setTitle("Sorry, Wrong Answer");
                    builder.show();
                }
            }
        });
        imageB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 1){
                    builder.show();
                    counter++;

                }
                else{
                    builder.setTitle("Sorry, Wrong Answer");
                    builder.show();
                }
            }
        });
        imageC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    builder.setTitle("Sorry, Wrong Answer");
                    builder.show();



            }
        });
        imageD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 2){
                    builder.show();
                    counter++;

                }
                else{
                    builder.setTitle("Sorry, Wrong Answer");
                    builder.show();
                }
            }
        });

    }

    private void setimageSource(){
        int step =0;

        if(count == 1) step =3;
        else if(count == 2) step = 6;

        imageA.setImageResource(flags[count+step]);
        imageB.setImageResource(flags[count+step+1]);
        imageC.setImageResource(flags[count+step+2]);
        imageD.setImageResource(flags[count+step+3]);

    }

    public void imageAClick(View v){

//



    }

}
