package com.mons.sudoku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FamilyDetails extends AppCompatActivity {

    Button btnPlay, btnAdmin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_details);
        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnAdmin = (Button)findViewById(R.id.btnQuestion);
        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FamilyDetails.this, AdminActivity.class);
                FamilyDetails.this.startActivity(intent);
            }
        });
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FamilyDetails.this, PlayActivity.class);
                FamilyDetails.this.startActivity(intent);
            }
        });


    }
}
