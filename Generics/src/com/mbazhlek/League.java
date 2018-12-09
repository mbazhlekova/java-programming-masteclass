package com.mbazhlek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    public String name;
    private List<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            return false;
        }
        teams.add(team);
        return true;
    }

    public void displayRankings() {
        Collections.sort(teams);
        for (T team: teams) {
            System.out.println(team.getName() + " : " + team.getRanking());
        }
    }
}
