package com.mbazhlek;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int ranking;

    public Team(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public int compareTo(Team team) {
        return this.ranking - team.getRanking();
    }
}
