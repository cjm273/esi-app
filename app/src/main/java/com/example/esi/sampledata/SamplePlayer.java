package com.example.esi.sampledata;

import com.example.esi.objects.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 11/15/2015.
 */
public class SamplePlayer {
    public List<Player> players;

    public SamplePlayer() {
        this.players = new ArrayList<Player>();
        createData();
    }

    private void createData() {
        players.add(new Player("David Soller", 1234));
        players.add(new Player("Chris McManamon", 4321));
        players.add(new Player("Albert Maah", 1212));
        players.add(new Player("DaKing", 1111));
        players.add(new Player("m2k", 9999));
        players.add(new Player("hungrybox", 7000));
        players.add(new Player("yoYoyo", 8976));
        players.add(new Player("Coooooolin", 6969));
        players.add(new Player("hekdn", 8753));
    }
}
