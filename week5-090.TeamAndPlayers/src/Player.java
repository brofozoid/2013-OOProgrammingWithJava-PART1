/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cathal
 */
public class Player {
    
    private final String name;
    private int goals;
    
    public Player(String teamName) {
        name = teamName;
    }
    
    public Player(String teamName, int numGoals) {
        name = teamName;
        goals = numGoals;
    }
    
    public String getName() {
        return name;
    }
    
    public int goals() {
        return goals;
    }
    
    public String toString() {
        return name + ", goals " + goals;
    }
}
