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

    public Match() { // Test
        this.p1 = new Player("TEST1", 1);
        this.p2 = new Player("TEST2", 2);
        this.tournament = new Tournament("Shuffle", 31, "www.example.com");
        this.score = "2-1";
        this.bestOf = "BO3";
    }

    public Match(Player p1, Player p2, Tournament tournament, String score, String bestOf) {
        this.p1 = p1;
        this.p2 = p2;
        this.tournament = tournament;
        this.score = score;
        this.bestOf = bestOf;
    }

    public void UpdateScore(String score) {
        this.score = score;
    }
}
