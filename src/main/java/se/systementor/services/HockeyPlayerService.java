package se.systementor.services;

import se.systementor.endpoints.HockeyPlayer;

import java.util.ArrayList;
import java.util.List;

public class HockeyPlayerService {
    private static List<HockeyPlayer> players;

    public List<HockeyPlayer> getAll(){
        return players;
    }
    public HockeyPlayerService() {
        if(players == null){
            players = new ArrayList<>();
            players.add(new HockeyPlayer(21,"Foppa",1));
            players.add(new HockeyPlayer(5,"Lidas",2));
            players.add(new HockeyPlayer(13,"Sudden",13));
        }
    }
}
