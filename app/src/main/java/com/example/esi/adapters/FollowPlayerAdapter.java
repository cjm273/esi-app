package com.example.esi.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.esi.R;
import com.example.esi.objects.FollowedPlayer;
import com.example.esi.objects.Match;

import java.util.List;

/**
 * Created by David on 11/15/2015.
 */
public class FollowPlayerAdapter extends ArrayAdapter<FollowedPlayer> {

    /**
     * Adapter context
     */
    Context mContext;

    FollowedPlayer fp;

    /**
     * Adapter View layout
     */
    int mLayoutResourceId;

    public FollowPlayerAdapter(Context context, int layoutResourceId) {
        super(context, layoutResourceId);

        mContext = context;
        mLayoutResourceId = layoutResourceId;
    }

    public void loadStuff(FollowedPlayer fp) {
        this.fp = fp;
    }

    /**
     * Returns the view for a specific item on the list
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        //final FollowedPlayer cp = fp.(position); // CurrentPlayer
//        final Match cMatch = fp.getCurrentMatch();
//
//        if (row == null) {
//            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
//            row = inflater.inflate(mLayoutResourceId, parent, false);
//        }
//
//        row.setTag(fp);
//        final TextView player = (TextView) row.findViewById(R.id.player);
//        final TextView tournament = (TextView) row.findViewById(R.id.tournament);
//        final TextView matchType = (TextView) row.findViewById(R.id.matchType);
//        final TextView score = (TextView) row.findViewById(R.id.score);
//        final TextView opponent = (TextView) row.findViewById(R.id.opponent);
//
//        player.setText(cMatch.p1.name);
//        tournament.setText(cMatch.tournament.name);
//        matchType.setText(cMatch.bestOf);
//        score.setText(cMatch.score);
//        opponent.setText(cMatch.p2.name);

        return row;
    }

}