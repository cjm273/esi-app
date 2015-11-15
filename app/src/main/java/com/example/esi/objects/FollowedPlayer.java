package com.example.esi.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 11/15/2015.
 */
public class FollowedPlayer {
    public Player theOne;
    public List<Match> matches;
    public int cMatch;

    public FollowedPlayer(Player theOne) {
        this.theOne = theOne;
        this.matches = new ArrayList<Match>();
        this.cMatch = -1;
    }

    public void addMatch(List<Match> matches) {
        this.matches = matches;
        this.cMatch = matches.size() - 1;
    }

    public void addMatch(Match match) {
        matches.add(match);
        cMatch++;
    }

    public Match getCurrentMatch() {
        if (cMatch < 0)
            return new Match();
        else {
            Match c = matches.get(cMatch);
            cMatch--;
            return c;
        }
    }
}
