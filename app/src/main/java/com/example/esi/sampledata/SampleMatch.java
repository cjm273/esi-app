package com.example.esi.sampledata;

import com.example.esi.objects.Match;
import com.example.esi.objects.Player;
import com.example.esi.objects.Tournament;

import java.util.List;

/**
 * Created by Chris on 11/15/2015.
 */
public class SampleMatch {
    public List<Tournament> tournaments;
    public List<Player> players;
    public List<Match> matches;

    public SampleMatch() {
        players = new SamplePlayer().players;
        tournaments = new SampleTournament().tournaments;
        matches.add(new Match(players.remove(0),players.remove(0),tournaments.remove(0),"3-2","B05"));
        matches.add(new Match(players.remove(0),players.remove(0),tournaments.remove(0),"2-0","B03"));
        matches.add(new Match(players.remove(0),players.remove(0),tournaments.remove(0),"3-1","B05"));
    }

}
