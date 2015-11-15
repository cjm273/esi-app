package com.example.esi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.esi.R;
import com.example.esi.activities.ToDoActivity;
import com.example.esi.adapters.FollowPlayerAdapter;
import com.example.esi.adapters.ToDoItemAdapter;
import com.example.esi.objects.FollowedPlayer;
import com.example.esi.objects.Match;
import com.example.esi.objects.Player;
import com.example.esi.sampledata.SampleMatch;

public class FollowPeopleActivity extends Activity implements View.OnClickListener{
    ImageButton[] btn;
    FollowedPlayer fp;
    FollowPlayerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_people);
        btn = new ImageButton[8];
        btn[0] = (ImageButton) findViewById(R.id.imageButton1);
        btn[0].setOnClickListener(this);
        btn[1] = (ImageButton) findViewById(R.id.imageButton2);
        btn[1].setOnClickListener(this);
        //fp = new FollowedPlayer(new Player("m2k", 9999));
        //loadData();

        //adapter = new FollowPlayerAdapter(this, R.layout.row_list_followed_player);
        //adapter.loadStuff(fp);
        //ListView listViewToDo = (ListView) findViewById(R.id.listView);
        //listViewToDo.setAdapter(adapter);
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

    private void loadData() {
        SampleMatch matches = new SampleMatch();

        //for (Match match : matches.matches) {
            fp.addMatch(matches.matches);
        //}
    }
}
