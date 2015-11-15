package com.example.esi.objects;

/**
 * Created by David on 11/15/2015.
 */
public class Match {
    public Player p1;
    public Player p2;
    public Tournament tournament;
    public String score;
    public String bestOf;

    public Match(Player p1, Player p2, Tournament tournament, String score, String bestOf) {
        this.p1 = p1;
        this.p2 = p2;
        this.tournament = tournament;
        this.score = score;
        this.bestOf = bestOf;
    }
}
