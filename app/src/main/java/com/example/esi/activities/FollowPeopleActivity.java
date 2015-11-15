package com.example.esi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.esi.R;
import com.example.esi.activities.ToDoActivity;

public class FollowPeopleActivity extends Activity implements View.OnClickListener{
    ImageButton[] btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_people);
        btn = new ImageButton[8];
        btn[0] = (ImageButton) findViewById(R.id.imageButton1);
        btn[0].setOnClickListener(this);
        btn[1] = (ImageButton) findViewById(R.id.imageButton2);
        btn[1].setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();

        switch(view.getId()){
            case(R.id.imageButton1):
                intent = new Intent(this, ToDoActivity.class);
                //intent.putExtra("category", );
                break;
            case(R.id.imageButton2):
                intent = new Intent(this, FollowTournamentActivity.class);
                //intent.putExtra("category", );
                break;
        }
        startActivity(intent);
    }
}
