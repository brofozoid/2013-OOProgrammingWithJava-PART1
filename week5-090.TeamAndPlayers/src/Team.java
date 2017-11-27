/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cathal
 */
import java.util.ArrayList;

public class Team {

    private final String name;
    private final ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;

    public Team(String teamName) {
        name = teamName;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (players.size() != maxSize) {
            players.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int newMaxSize) {
        maxSize = newMaxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int total = 0;
        for (Player player : players) {
            total += player.goals();
        }
        return total;
    }
}
