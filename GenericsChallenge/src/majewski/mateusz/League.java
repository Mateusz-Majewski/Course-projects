package majewski.mateusz;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;

    private ArrayList<T> teamsInLeague = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if(teamsInLeague.contains(team)) {
            System.out.println("Team already exists");
            return false;
        } else {
            teamsInLeague.add(team);
            System.out.println(team.getName() + " has been added to the league");
            return true;
        }
    }

    public void showTeams() {
        Collections.sort(teamsInLeague);

        for (T t : teamsInLeague) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
