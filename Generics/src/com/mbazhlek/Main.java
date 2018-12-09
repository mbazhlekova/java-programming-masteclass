package com.mbazhlek;

public class Main {

    public static void main(String[] args) {
        SoccerTeam manU = new SoccerTeam("Man U", 50);
        SoccerTeam barca = new SoccerTeam("FC Barcelona", 1);

        League<SoccerTeam> championsLeague = new League<>("Champions League");
        championsLeague.addTeam(manU);
        championsLeague.addTeam(barca);
        championsLeague.displayRankings();

        SoccerTeam madrid = new SoccerTeam("Real Madrid", 30);
        championsLeague.addTeam(madrid);
        championsLeague.displayRankings();
    }
}
