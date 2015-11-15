package com.example.esi.sampledata;

import com.example.esi.objects.Tournament;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 11/15/2015.
 */
public class SampleTournament {
    public List<Tournament> tournaments;

    public SampleTournament() {
        this.tournaments = new ArrayList<Tournament>();
        createData();
    }

    private void createData() {
        tournaments.add(new Tournament("Shuffle V", 5678, "www.shuffleV.gg"));
        tournaments.add(new Tournament("Smash Clash", 5678, "www.smashclash.com"));
        tournaments.add(new Tournament("OHI/O", 5678, "hack.osu.edu"));
    }
}
